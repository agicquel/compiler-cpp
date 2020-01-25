package esir.comp.cpp.generator.ir

import esir.comp.cpp.whileDsl.Definition
import esir.comp.cpp.whileDsl.Function
import esir.comp.cpp.whileDsl.WhileCommand
import esir.comp.cpp.whileDsl.NopCommand
import esir.comp.cpp.whileDsl.ForCommand
import esir.comp.cpp.whileDsl.IfCommand
import esir.comp.cpp.whileDsl.ForeachCommand
import esir.comp.cpp.whileDsl.VarsCommand
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
import esir.comp.cpp.whileDsl.Expr

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
			var fGenName = ""
			if(function.functionName.equals("main")) {
				fGenName = "M"
			}
			else {
				fGenName = "F" + this.functionCounter
			}
			var functionImpl = new FunctionImpl(env, quads, fGenName, function)
			function.compile(functionImpl)
			this.functions.put(function.functionName, functionImpl)
			this.functionCounter++
		}
		
		return newArrayList(functions.values)
	}
	
	// STRUCTURES
	
	private def compile(Function function, FunctionImpl functionImpl) {
		function.functionDefinition.compile(functionImpl)
	}
	
	private def compile(Definition definition, FunctionImpl functionImpl) {
		for(in : definition.intput.variables) {
			var e = new Instr()
			e.place = functionImpl.env.newInput(in)
			e.code.add(new Quad("read", e.place, "", ""))
			functionImpl.quads.addAll(e.code)
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
			functionImpl.quads.addAll(e.code)
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
		
		var e1 = forCommand.cond.compileExpression(functionImpl, "", "")
		var e2 = forCommand.body.compileExpression(functionImpl, "", "")
		
		e.code.add(new Quad("write", "", e1.place, ""))
		e.code.add(new Quad("read", e.place, "" , ""))
		e.code.addAll(e1.code)
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
		var e1 = foreachCommand.expList.compileExpression(functionImpl, "", "")
		var e2 = foreachCommand.body.compileExpression(functionImpl, "", "")
		
		
		e.code.add(new Quad("write", "", e1.place, ""))
		e.code.add(new Quad("read", expElement, "" , ""))
		e.code.addAll(e1.code)
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
		
		e.code.addAll(variables.reverse())
		
		return e
	}
	
	
	// EXPRESSIONS
	
	private def dispatch Instr compileExpression(Expr expr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		return expr.expression.compileExpression(functionImpl, labelTrue, labelFalse)
	}
	
	private def dispatch Instr compileExpression(Commands commands, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		for(command : commands.commands) {
			e.code.addAll(command.compileCommand(functionImpl).code)
		}
		return e
	}
	
	private def dispatch Instr compileExpression(ExprAnd exprAnd, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		
		if(labelTrue.isNullOrEmpty() && labelFalse.isNullOrEmpty()) {
			if(exprAnd.expressionsOr.size() == 1) {
				return exprAnd.expressionsOr.get(0).compileExpression(functionImpl, "", "")
			}
			else {
				for(exp : exprAnd.expressionsOr) {
					e.code.addAll(exp.compileExpression(functionImpl, "", "").code)
				}	
			}
		}
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
			if(exprOr.expressionsNot.size() == 1 ) {
				return exprOr.expressionsNot.get(0).compileExpression(functionImpl, "", "")
			}
			else {
				for(exp : exprOr.expressionsNot) {
					e.code.addAll(exp.compileExpression(functionImpl, "", "").code)
				}
			}
		}
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
			var labelIfTrue = functionImpl.env.newLabel()
			var labelIfFalse = functionImpl.env.newLabel()
			var labelEnd = functionImpl.env.newLabel()
			e.place = functionImpl.env.newVariable("")
			
			var e1 = exprEq.expr.expression.compileExpression(functionImpl, labelIfTrue, labelIfFalse)
			compileIfBooleanExpr(exprEq.expr.expression, e1, labelIfTrue, labelIfFalse)
			e.code.addAll(e1.code)
			
			e.code.add(new Quad("label " + labelIfTrue, "", "", ""))
			e.code.add(new Quad("true", e.place, "", ""))
			e.code.add(new Quad("goto " + labelEnd, "", "", ""))
			e.code.add(new Quad("label " + labelIfFalse, "", "", ""))
			e.code.add(new Quad("false", e.place, "", ""))
			e.code.add(new Quad("label " + labelEnd, "", "", ""))			
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
					e.place = functionImpl.env.newVariable("")
					e.code.add(new Quad("symb " + exprSimple.term, e.place, "", ""))
				}
			}
			return e
		}
		else if(exprSimple.expression !== null) {
			return exprSimple.expression.compileExpression(functionImpl, labelTrue, labelFalse)
		}
	}
	
	private def dispatch Instr compileExpression(ExprSimpleWithLExpr exprSimpleWithLExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		var exprsSize = exprSimpleWithLExpr.lexpr.expressions.size()
		var exprs = exprSimpleWithLExpr.lexpr.expressions.reverseView()
				
		if(exprSimpleWithLExpr.operation == "cons") {
			if(exprsSize == 1) {				
				var e1 = exprs.get(0).compileExpression(functionImpl, "", "")
				//var nilPlace = functionImpl.env.newVariable("")
				e.code.addAll(e1.code)
				e.place = e1.place
			}
			else {
				
				e.place = functionImpl.env.newVariable("")
				var e1 = exprs.get(1).compileExpression(functionImpl, "", "")
				var e2 = exprs.get(0).compileExpression(functionImpl, "", "")
				e.code.addAll(e1.code)
				e.code.addAll(e2.code)
				
				e.code.add(new Quad("cons", e.place, e1.place, e2.place))
				for(var i = 2; i < exprsSize; i++) {
					var e3 = exprs.get(i).compileExpression(functionImpl, "", "")
					e.code.addAll(e3.code)
					e.code.add(new Quad("cons", e.place, e3.place, e.place))
				}
			}
		}
		else if(exprSimpleWithLExpr.operation == "list") {
			e.place = functionImpl.env.newVariable("")
			var nilPlace = functionImpl.env.newVariable("")
			e.code.add(new Quad("nil", nilPlace, "", ""))
			var e1 = exprs.get(0).compileExpression(functionImpl, "", "")
			e.code.addAll(e1.code)
			e.code.add(new Quad("cons", e.place, e1.place, nilPlace))
			if(exprsSize > 1) {				
				for(var i = 1; i < exprsSize; i++) {
					var e2 = exprs.get(i).compileExpression(functionImpl, "", "")
					e.code.addAll(e2.code)
					e.code.add(new Quad("cons", e.place, e2.place, e.place))
				}
			}
		}
		return e
	}
	
	private def dispatch Instr compileExpression(ExprSimpleWithExpr exprSimpleWithExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new Instr()
		var e1 = exprSimpleWithExpr.expr.compileExpression(functionImpl, "", "")
		
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
			var expIr = exp.compileExpression(functionImpl, "", "")
			e.code.addAll(expIr.code)
			params.add(expIr.place)
		}
		
		for(param : params.reverse()) {
			e.code.add(new Quad("write", "", param, ""))
		}
		
		e.code.add(new Quad("call " + getFunctionFromResource(exprSimpleWithSymbolLExpr.symbol).functionName, "", "", ""))
		e.code.add(new Quad("read", e.place, "", ""))
		
		return e
	}
	
	private def Function getFunctionFromResource(String functionName) {
		for(function : this.res.allContents.toIterable.filter(Function)) {
			if(function.functionName.equals(functionName)) {
				return function
			}
		}
		return null
	}
	
}