package esir.comp.cpp.generator.ir

import esir.comp.cpp.whileDsl.Definition
import esir.comp.cpp.whileDsl.Function
import esir.comp.cpp.whileDsl.WhileCommand
import esir.comp.cpp.whileDsl.NopCommand
import esir.comp.cpp.whileDsl.ForCommand
import esir.comp.cpp.whileDsl.IfCommand
import esir.comp.cpp.whileDsl.ForeachCommand
import esir.comp.cpp.whileDsl.VarsCommand
import esir.comp.cpp.whileDsl.Expr
import esir.comp.cpp.whileDsl.ExprAnd
import esir.comp.cpp.whileDsl.ExprSimple
import esir.comp.cpp.whileDsl.ExprOr
import esir.comp.cpp.whileDsl.ExprNot
import esir.comp.cpp.whileDsl.ExprEq
import esir.comp.cpp.whileDsl.ExprSimpleWithLExpr
import esir.comp.cpp.whileDsl.ExprSimpleWithExpr
import esir.comp.cpp.whileDsl.ExprSimpleWithSymbolLExpr
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import java.util.HashMap
import java.util.List
import esir.comp.cpp.whileDsl.Commands
import esir.comp.cpp.whileDsl.Exprs
import esir.comp.cpp.whileDsl.LExpr

class WhileDslIRGenerator {
	
	HashMap<String, FunctionImpl> functions
	int functionCounter
	Resource res
	
	def List<FunctionImpl> compileIR(Resource resource) {
		this.functions = newHashMap()
		this.functionCounter = 0
		this.res = resource
		
		for(function : resource.allContents.toIterable.filter(Function)) {
			var env = new Env(null)
			var quads = newArrayList()
			var intputs = newArrayList()
			var outputs = newArrayList()
			var functionImpl = new FunctionImpl(env, quads, intputs, outputs, "F" + this.functionCounter)
			function.compile(functionImpl)
			this.functions.put(function.functionName, functionImpl)
			this.functionCounter++
		}
		
		return newArrayList(functions.values)
	}
	
	// STRUCTURES
	
	private def compile(Function function, FunctionImpl functionImpl) {
		// faut gerer le functionName aussi
		function.functionDefinition.compile(functionImpl)
	}
	
	private def compile(Definition definition, FunctionImpl functionImpl) {
		for(in : definition.intput.variables) {
			var e = new Instr()
			e.place = functionImpl.env.newInput(in)
			e.code.add(new Quad("read", e.place, "", ""))
			functionImpl.inputs.addAll(e.code)
		}

		for(com : definition.body.commands) {
			var e = com.compileCommand(functionImpl)
			functionImpl.quads.addAll(e.code)
		}
		
		for(out : definition.output.variables) {
			var e = new Instr()
			e.place = functionImpl.env.retrieve(out)
			e.code.add(new Quad("write", "", e.place, ""))
			functionImpl.env.outputCounter = functionImpl.env.outputCounter + 1
			functionImpl.outputs.addAll(e.code)
		}
	}
	
	
	// COMMANDS
	
	private def compileIfBooleanExpr(EObject cond, Instr e, String labelTrue, String labelFalse) {
		if(cond instanceof ExprSimple && !e.place.isNullOrEmpty()) {
			e.code.add(new Quad("ift " + labelTrue, "", e.place, ""))
			e.code.add(new Quad("goto " + labelFalse, "", "", ""))
		}
	}
	
	private def dispatch Instr compileCommand(WhileCommand whileCommand, FunctionImpl functionImpl) {
		var ifFalse = functionImpl.env.newLabel()
		var body = functionImpl.env.newLabel()
		var condLab = functionImpl.env.newLabel()
		var e = new Instr()
		var e1 = whileCommand.cond.compileExpression(functionImpl, body, ifFalse)
		compileIfBooleanExpr(whileCommand.cond.expression, e1, body, ifFalse)
		
		e.code.add(new Quad("label " + condLab, "", "", ""))
		e.code.addAll(e1.code)		
		e.code.add(new Quad("label " + body, "", "", ""))
		for(com : whileCommand.body.commands) {
			e.code.addAll(com.compileCommand(functionImpl).code)
		}
		e.code.add(new Quad("goto " + condLab, "", "", ""))
		e.code.add(new Quad("label " + ifFalse, "", "", ""))
		
		return e
	}
	
	private def dispatch Instr compileCommand(NopCommand nopCommand, FunctionImpl functionImpl) {
		var e = new Instr()
		e.code.add(new Quad("nop", "", "", ""))
		return e
	}
	
	private def dispatch Instr compileCommand(ForCommand forCommand, FunctionImpl functionImpl) {
		var e = new Instr()
		e.place = functionImpl.env.newVariable("")
		var bodyLabel = functionImpl.env.newLabel()
		var endLabel = functionImpl.env.newLabel()
		
		var e1 = forCommand.cond.compileExpression(functionImpl, bodyLabel, endLabel)
		var e2 = forCommand.body.compileExpression(functionImpl, "", "")
		
		e.code.addAll(e1.code)
		e.code.add(new Quad("write", "", e1.place, ""))
		e.code.add(new Quad("read", e.place, "" , ""))
		e.code.add(new Quad("label " + bodyLabel, "", "", ""))
		e.code.add(new Quad("iff " + endLabel, "", e.place, ""))
		e.code.addAll(e2.code)
		e.code.add(new Quad("tl", e.place, e.place, ""))
		e.code.add(new Quad("goto " + bodyLabel, "", "", ""))
		e.code.add(new Quad("label " + endLabel, "", "", ""))
		
		return e
	}
	
	private def dispatch Instr compileCommand(IfCommand ifCommand, FunctionImpl functionImpl) {
		var e = new Instr()
		var labelTrue = functionImpl.env.newLabel()
		var labelFalse = functionImpl.env.newLabel()
		var labelEnd = functionImpl.env.newLabel()
		
		var e1 = ifCommand.cond.compileExpression(functionImpl, labelTrue, labelFalse)
		compileIfBooleanExpr(ifCommand.cond.expression, e1, labelTrue, labelFalse)	
		
		e.code.addAll(e1.code)
		e.code.add(new Quad("label " + labelTrue, "", "", ""))
		for(com : ifCommand.thenBody.commands) {
			e.code.addAll(com.compileCommand(functionImpl).code)
		}
		e.code.add(new Quad("goto " + labelEnd, "", "", ""))

		e.code.add(new Quad("label " + labelFalse, "", "", ""))
		if(ifCommand.elseBody !== null) {
			for(com : ifCommand.elseBody.commands) {
				e.code.addAll(com.compileCommand(functionImpl).code)
			}
		}
		e.code.add(new Quad("label " + labelEnd, "", "", ""))
		
		return e
	}
	
	private def dispatch Instr compileCommand(ForeachCommand foreachCommand, FunctionImpl functionImpl) {
		var e = new Instr()
		e.place = functionImpl.env.newVariable("")
		var expElement = functionImpl.env.newVariable(foreachCommand.expElement)
		var bodyLabel = functionImpl.env.newLabel()
		var endLabel = functionImpl.env.newLabel()
		var e1 = foreachCommand.expList.compileExpression(functionImpl, bodyLabel, endLabel)
		var e2 = foreachCommand.body.compileExpression(functionImpl, "", "")
		
		e.code.addAll(e1.code)
		e.code.add(new Quad("write", "", e1.place, ""))
		e.code.add(new Quad("read", expElement, "" , ""))
		
		e.code.add(new Quad("label " + bodyLabel, "", "", ""))
		e.code.add(new Quad("iff " + endLabel, "", expElement, ""))
		e.code.addAll(e2.code)
		e.code.add(new Quad("hd", e.place, expElement, ""))
		e.code.add(new Quad("tl ", expElement, expElement, ""))
		e.code.add(new Quad("goto " + bodyLabel, "", "", ""))
		e.code.add(new Quad("label " + endLabel, "", "", ""))
		
		return e	
	}
	
	private def dispatch Instr compileCommand(VarsCommand varsCommand, FunctionImpl functionImpl) {
		var e = new Instr()
		var variables = newArrayList()
		
		for(var i = 0; i < varsCommand.values.expressions.size(); i++) {
			//println("code = " + varsCommand.values)
			//var expSimple = varsCommand.values.expressions.get(i).expression as ExprSimple
			val exp = varsCommand.values.expressions.get(i).expression.compileExpression(functionImpl, "", "")
			e.code.addAll(exp.code)
				
			if(varsCommand.values.expressions.get(i) instanceof ExprSimpleWithSymbolLExpr) {
				var callFunc = varsCommand.values.expressions.get(i) as ExprSimpleWithSymbolLExpr
				var nbOut = getFunctionFromResource(callFunc.symbol).functionDefinition.output.variables.size()
				if(nbOut > 1) {
					i += nbOut
					for(var j = 1; j < nbOut; j++) {
						var varKeyF = functionImpl.env.newVariable("")
						variables.add(new Quad("read" , varKeyF, "", ""))
					}
				}
			}
			else {
				e.code.add(new Quad("write", "", exp.place, ""))
			}
			
			val varToken = varsCommand.variables.variables.get(i)
			var varKey = functionImpl.env.retrieve(varToken)
			if(varKey === null) varKey = functionImpl.env.newVariable(varToken)
			variables.add(new Quad("read" , varKey, "", ""))
		}
		
		e.code.addAll(variables)
		
		return e
	}
	
	/*def private dispatch Instr compileCommand(VarsCommand varsCommand, FunctionImpl functionImpl) {
		if(varsCommand.variables.variables.size() != varsCommand.values.expressions.size()) {
			throw new Exception("Variables and values are not equal.")
		}
		
		var e = new Instr()
		var variables = newArrayList()
		
		for(var i = 0; i < varsCommand.values.expressions.size(); i++) {
			println("type of exp = " + varsCommand.values.expressions.get(i).class.toString())
			val exp = varsCommand.values.expressions.get(i).compileExpression(functionImpl, "", "")
			e.code.addAll(exp.code)
			println("\n\ncode of exp : " + exp.toString() + "\n\n")
			e.code.add(new Quad("write", "", exp.place, ""))
			
			val varToken = varsCommand.variables.variables.get(i)
			var varKey = functionImpl.env.retrieve(varToken)
			if(varKey === null) varKey = functionImpl.env.newVariable(varToken)
			variables.add(new Quad("read" , varKey, "", ""))
		}
		e.code.addAll(variables)
		
		return e
	}*/
	
	// EXPRESSIONS
	
	private def dispatch Instr compileExpression(Commands commands, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		for(command : commands.commands) {
			e.code.addAll(command.compileCommand(functionImpl).code)
		}
		return e
	}
	
	private def dispatch Instr compileExpression(Expr expr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		println("Expr called !")
		println("Expr class = " + expr.eClass.toString)
		println("Expr expression class = " + expr.expression.eClass.toString)
		return expr.expression.compileExpression(functionImpl, labelTrue, labelFalse)
	}
	
	private def dispatch Instr compileExpression(Exprs exprs, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		println("Exprs called !")
		return new Instr()
		
	}
	
	private def dispatch Instr compileExpression(LExpr lExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		println("LExpr called !")
		return new Instr()
	}
	
	private def dispatch Instr compileExpression(ExprAnd exprAnd, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(exprAnd.expressionsOr.size() == 1) {
			return exprAnd.expressionsOr.get(0).compileExpression(functionImpl, labelTrue, labelFalse)
		}
		
		var e = new Instr()
		
		if(labelTrue.isNullOrEmpty() && labelFalse.isNullOrEmpty()) {
			for(exp : exprAnd.expressionsOr) {
				e.code.addAll(exp.compileExpression(functionImpl, "", "").code)
			}
		}
		/*else if(exprAnd.expressionsOr.size() == 1) {
			return exprAnd.expressionsOr.get(0).compileExpression(functionImpl, labelTrue, labelFalse)
		}*/
		else {
			e.place = functionImpl.env.newVariable("")
			var labelIfTrue = functionImpl.env.newLabel()
			var labelIfFalse = functionImpl.env.newLabel()			
			
			for(exp : exprAnd.expressionsOr) {
				var expComp = exp.compileExpression(functionImpl, labelIfTrue, labelIfFalse)
				e.code.addAll(expComp.code)
				e.code.add(new Quad("iff " + labelIfFalse, "", expComp.place, ""))
			}
			e.code.add(new Quad("label " + labelIfTrue, "", "", ""))
			e.code.add(new Quad("true", e.place, "", ""))
			e.code.add(new Quad("goto " + labelTrue, "", "", ""))
			
			e.code.add(new Quad("label " + labelIfFalse, "", "", ""))
			e.code.add(new Quad("false", e.place, "", ""))
			e.code.add(new Quad("goto " + labelFalse, "", "", ""))
			
		}
		
		return e
	}
	
	private def dispatch Instr compileExpression(ExprOr exprOr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		
		if(labelTrue.isNullOrEmpty() && labelFalse.isNullOrEmpty()) {
			for(exp : exprOr.expressionsNot) {
				e.code.addAll(exp.compileExpression(functionImpl, "", "").code)
			}
		}
		/*else if(exprOr.expressionsNot.size() == 1) {
			return exprOr.expressionsNot.get(0).compileExpression(functionImpl, labelTrue, labelFalse)
		}*/
		else {
			e.place = functionImpl.env.newVariable("")
			var labelIfTrue = functionImpl.env.newLabel()
			var labelIfFalse = functionImpl.env.newLabel()
			var labelEnd = functionImpl.env.newLabel()
			
			for(exp : exprOr.expressionsNot) {
				var expComp = exp.compileExpression(functionImpl, labelIfTrue, labelIfFalse)
				e.code.addAll(expComp.code)
				e.code.add(new Quad("ift " + labelIfTrue, "", expComp.place, ""))
			}
			
			e.code.add(new Quad("goto " + labelIfFalse, "", "", ""))
			e.code.add(new Quad("label " + labelIfTrue, "", "", ""))
			e.code.add(new Quad("true", e.place, "", ""))
			e.code.add(new Quad("goto " + labelEnd, "", "", ""))
			e.code.add(new Quad("label " + labelIfFalse, "", "", ""))
			e.code.add(new Quad("false", e.place, "", ""))
			e.code.add(new Quad("label " + labelEnd, "", "", ""))	
		}
				
		return e
	}
	
	private def dispatch Instr compileExpression(ExprNot exprNot, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(labelTrue.isNullOrEmpty() && labelFalse.isNullOrEmpty()) {
			return exprNot.expressionEq.compileExpression(functionImpl, "", "")
		}
		else if(exprNot.negation) {
			var e = exprNot.expressionEq.compileExpression(functionImpl, labelTrue, labelFalse)
			var labelIfTrue = functionImpl.env.newLabel()
			var labelEnd = functionImpl.env.newLabel()
			e.code.add(new Quad("ift " + labelIfTrue, "", e.place, ""))
			e.code.add(new Quad("true", e.place, "", ""))
			e.code.add(new Quad("goto " + labelEnd, "", "", ""))
			e.code.add(new Quad("label " + labelIfTrue, "", "", ""))
			e.code.add(new Quad("false", e.place, "", ""))
			e.code.add(new Quad("label " + labelEnd, "", "", ""))
			return e
		}
		else {
			return exprNot.expressionEq.compileExpression(functionImpl, labelTrue, labelFalse)
		}
	}
	
	private def dispatch Instr compileExpression(ExprEq exprEq, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		
		if(exprEq.expr !== null) {
			var labelEnd = functionImpl.env.newLabel()
			var e1 = exprEq.expr.compileExpression(functionImpl, labelEnd, labelEnd)
			e.code.addAll(e1.code)
			e.code.add(new Quad("label " + labelEnd, "", "", ""))
			e.place = e1.place
		}
		else if(exprEq.exprLSimple !== null && exprEq.exprRSimple !== null) {
			var e1 = exprEq.exprLSimple.compileExpression(functionImpl, labelTrue, labelFalse)		
			var e2 = exprEq.exprRSimple.compileExpression(functionImpl, labelTrue, labelFalse)
			var labelEnd = functionImpl.env.newLabel()
			var labelEqual = functionImpl.env.newLabel()
			
			e.code.addAll(e1.code)
			e.code.addAll(e2.code)
			e.place = functionImpl.env.newVariable("")
			e.code.add(new Quad("ifeq " + labelEqual, "", e1.place, e2.place))
			e.code.add(new Quad("false", e.place, "", ""))
			e.code.add(new Quad("goto " + labelEnd, "", "", ""))
			e.code.add(new Quad("label " + labelEqual, "", "", ""))
			e.code.add(new Quad("true", e.place, "", ""))
			e.code.add(new Quad("label " + labelEnd, "", "", ""))			
		}
		else if(exprEq.exprLSimple !== null && exprEq.exprRSimple === null) {
			e = exprEq.exprLSimple.compileExpression(functionImpl, labelTrue, labelFalse)
		}
		
		return e
	}
	
	private def dispatch Instr compileExpression(ExprSimple exprSimple, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(exprSimple.term !== null) {
			var e = new Instr()
			if(exprSimple.term == "nil") {
				e.place = functionImpl.env.newVariable("")
				e.code.add(new Quad("nil", e.place, "", ""))
			}
			else if(Character.isUpperCase(exprSimple.term.charAt(0))) { // VARIABLE
				e.place = functionImpl.env.retrieve(exprSimple.term)
				if(e.place === null) {
					e.place = functionImpl.env.newVariable(exprSimple.term)
				}
			}
			else if(Character.isLowerCase(exprSimple.term.charAt(0))) { // SYMBOL
				e.place = functionImpl.env.retrieve(exprSimple.term)
				if(e.place === null) {
					var idSymb = functionImpl.env.newSymbol(exprSimple.term)
					e.place = functionImpl.env.newVariable("")
					e.code.add(new Quad("symb" + idSymb, e.place, "", ""))
				}
			}
			return e
		}
		else if(exprSimple.expression !== null) {
			return exprSimple.expression.compileExpression(functionImpl, labelTrue, labelFalse)
		}
	}
	
	private def dispatch Instr compileExpression(ExprSimpleWithLExpr exprSimpleWithLExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(exprSimpleWithLExpr.operation == "cons") {
			// TODO : fonctionne seulement pour cons E' E''
			var e = new Instr()
			var e1 = exprSimpleWithLExpr.lexpr.expressions.get(0).compileExpression(functionImpl, labelTrue, labelFalse)
			var e2 = exprSimpleWithLExpr.lexpr.expressions.get(1).compileExpression(functionImpl, labelTrue, labelFalse)
			
			e.place = functionImpl.env.newVariable("")
			e.code.addAll(e1.code)
			e.code.addAll(e2.code)
			e.code.add(new Quad("cons", e.place, e1.place, e2.place))
			
			return e
		}
		else if(exprSimpleWithLExpr.operation == "list") {
			return new Instr()
		}
	}
	
	private def dispatch Instr compileExpression(ExprSimpleWithExpr exprSimpleWithExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		var e1 = exprSimpleWithExpr.expr.compileExpression(functionImpl, labelTrue, labelFalse)
		
		e.place = functionImpl.env.newVariable("")
		e.code.addAll(e1.code)
		// operation = hd | tl
		e.code.add(new Quad(exprSimpleWithExpr.operation, e.place, e1.place, ""))
		
		return e
	}
	
	private def dispatch Instr compileExpression(ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		e.place = functionImpl.env.newVariable("")
		
		this.res.allContents.toIterable.filter(Function)
		
		var nbIn = getFunctionFromResource(exprSimpleWithSymbolLExpr.symbol).functionDefinition.intput.variables.size()		
		if(nbIn != exprSimpleWithSymbolLExpr.lexpr.expressions.size) {
			throw new Exception("Incorrect number of parameters.")
		}
		
		var params = newArrayList();
		
		for(exp : exprSimpleWithSymbolLExpr.lexpr.expressions) {
			var expIr = exp.compileExpression(functionImpl, labelTrue, labelFalse)
			e.code.addAll(expIr.code)
			params.add(expIr.place)
		}
		
		for(param : params) {
			e.code.add(new Quad("arg", "", param, ""))
		}
		
		e.code.add(new Quad("call " + getFunctionFromResource(exprSimpleWithSymbolLExpr.symbol).functionName, "", "", ""))
		e.code.add(new Quad("read", e.place, "", ""))
		
		return e
	}
	
	/*def private  dispatch Instr compileExpression(ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		return new Instr()
	}*/
	
	private def Function getFunctionFromResource(String functionName) {
		for(function : this.res.allContents.toIterable.filter(Function)) {
			if(function.functionName.equals(functionName)) {
				return function
			}
		}
		return null
	}
	
}