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
import esir.comp.cpp.whileDsl.Exprs
import esir.comp.cpp.whileDsl.ExprAnd
import esir.comp.cpp.whileDsl.ExprSimple
import esir.comp.cpp.whileDsl.ExprOr
import esir.comp.cpp.whileDsl.ExprNot
import esir.comp.cpp.whileDsl.ExprEq
import esir.comp.cpp.whileDsl.ExprSimpleWithLExpr
import esir.comp.cpp.whileDsl.ExprSimpleWithExpr
import esir.comp.cpp.whileDsl.ExprSimpleWithSymbolLExpr
import esir.comp.cpp.whileDsl.LExpr
import org.eclipse.emf.ecore.EObject

class WhileDslIRGenerator {
	
	def static FunctionImpl compileIR(Function function) {
		var generator = new WhileDslIRGenerator()
		var env = new Env(null)
		var quads = newArrayList()
		var intputs = newArrayList()
		var outputs = newArrayList()
		var functionImpl = new FunctionImpl(env, quads, intputs, outputs, function)
		generator.compile(function, functionImpl)
		return functionImpl
	}
	
	// STRUCTURES
	
	def compile(Function function, FunctionImpl functionImpl) {
		// faut gerer le functionName aussi
		function.functionDefinition.compile(functionImpl)
	}
	
	def compile(Definition definition, FunctionImpl functionImpl) {
		for(in : definition.intput.variables) {
			var e = new IR()
			e.place = functionImpl.env.newInput(in)
			e.code.add(new Quad("read", e.place, "", ""))
			functionImpl.inputs.addAll(e.code)
		}

		for(com : definition.body.commands) {
			var e = com.compileCommand(functionImpl)
			functionImpl.quads.addAll(e.code)
		}
		
		for(out : definition.output.variables) {
			var e = new IR()
			e.place = functionImpl.env.retrieve(out)
			e.code.add(new Quad("write", "", e.place, ""))
			functionImpl.env.outputCounter = functionImpl.env.outputCounter + 1
			functionImpl.outputs.addAll(e.code)
		}
	}
	
	
	// COMMANDS
	
	def compileIfBooleanExpr(EObject cond, IR e, String labelTrue, String labelFalse) {
		if(cond instanceof ExprSimple && !e.place.isNullOrEmpty()) {
			e.code.add(new Quad("ift " + labelTrue, "", e.place, ""))
			e.code.add(new Quad("goto " + labelFalse, "", "", ""))
		}
	}
	
	def dispatch IR compileCommand(WhileCommand whileCommand, FunctionImpl functionImpl) {
		var ifFalse = functionImpl.env.newLabel()
		var body = functionImpl.env.newLabel()
		var e = new IR()
		var e1 = whileCommand.cond.compileExpression(functionImpl, body, ifFalse)
		compileIfBooleanExpr(whileCommand.cond.expression, e1, body, ifFalse)
		
		e.code.add(new Quad("label " + body, "", "", ""))
		e.code.addAll(e1.code)
		for(com : whileCommand.body.commands) {
			e.code.addAll(com.compileCommand(functionImpl).code)
		}
		//e.code.add(new Quad("goto " + body, "", "", ""))
		e.code.add(new Quad("label " + ifFalse, "", "", ""))
		
		return e
	}
	
	def dispatch IR compileCommand(NopCommand nopCommand, FunctionImpl functionImpl) {
		var e = new IR()
		e.code.add(new Quad("nop", "", "", ""))
		return e
	}
	
	def dispatch IR compileCommand(ForCommand forCommand, FunctionImpl functionImpl) {
		return new IR()
	}
	
	def dispatch IR compileCommand(IfCommand ifCommand, FunctionImpl functionImpl) {
		var e = new IR()
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
	
	def dispatch IR compileCommand(ForeachCommand foreachCommand, FunctionImpl functionImpl) {
		return new IR()
	}
	
	def dispatch IR compileCommand(VarsCommand varsCommand, FunctionImpl functionImpl) {
		if(varsCommand.variables.variables.size() != varsCommand.values.expressions.size()) {
			throw new Exception("Variables and values are not equal.")
		}
		
		var e = new IR()
		var variables = newArrayList()
		
		for(var i = 0; i < varsCommand.values.expressions.size(); i++) {
			val exp = varsCommand.values.expressions.get(i).compileExpression(functionImpl, "", "")
			e.code.addAll(exp.code)
			e.code.add(new Quad("write", "", exp.place, ""))
			
			val varToken = varsCommand.variables.variables.get(i)
			var varKey = functionImpl.env.retrieve(varToken)
			if(varKey === null) varKey = functionImpl.env.newVariable(varToken)
			variables.add(new Quad("read" , varKey, "", ""))
		}
		e.code.addAll(variables)
		
		return e
	}
	
	// EXPRESSIONS
	
	def dispatch IR compileExpression(Expr expr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		return expr.expression.compileExpression(functionImpl, labelTrue, labelFalse)
	}
	
	def dispatch IR compileExpression(Exprs exprs, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		return new IR()
		
	}
	
	def dispatch IR compileExpression(LExpr lExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		return new IR()
	}
	
	def dispatch IR compileExpression(ExprAnd exprAnd, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(exprAnd.expressionsOr.size() == 1) {
			return exprAnd.expressionsOr.get(0).compileExpression(functionImpl, labelTrue, labelFalse)
		}
		
		var e = new IR()
		for(exp : exprAnd.expressionsOr) {
			var expComp = exp.compileExpression(functionImpl, labelTrue, labelFalse)
			e.code.addAll(expComp.code)
			e.code.add(new Quad("iff " + labelFalse, "", expComp.place, ""))
		}
		e.code.add(new Quad("goto " + labelTrue, "", "", ""))
		
		return e
	}
	
	def dispatch IR compileExpression(ExprOr exprOr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(exprOr.expressionsNot.size() == 1) {
			var e = exprOr.expressionsNot.get(0).compileExpression(functionImpl, labelTrue, labelFalse)
			e.code.add(new Quad("ift " + labelTrue, "", e.place, ""))
			e.code.add(new Quad("goto " + labelFalse, "", "", ""))
			return e
		}
		
		var e = new IR()
		e.place = functionImpl.env.newVariable("")
		var labelIfTrue = functionImpl.env.newLabel()
		var labelIfFalse = functionImpl.env.newLabel()
		
		for(exp : exprOr.expressionsNot) {
			var expComp = exp.compileExpression(functionImpl, labelTrue, labelFalse)
			e.code.addAll(expComp.code)
			e.code.add(new Quad("ift " + labelIfTrue, "", expComp.place, ""))
		}
		
		e.code.add(new Quad("goto " + labelIfFalse, "", "", ""))
		e.code.add(new Quad("label " + labelIfTrue, "", "", ""))
		e.code.add(new Quad("true", e.place, "", ""))
		e.code.add(new Quad("goto " + labelTrue, "", "", ""))
		e.code.add(new Quad("label " + labelIfFalse, "", "", ""))
		e.code.add(new Quad("false", e.place, "", ""))
		e.code.add(new Quad("goto " + labelFalse, "", "", ""))
		
		return e
	}
	
	def dispatch IR compileExpression(ExprNot exprNot, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(exprNot.negation) {
			return exprNot.expressionEq.compileExpression(functionImpl, labelFalse, labelTrue)
		}
		else {
			return exprNot.expressionEq.compileExpression(functionImpl, labelTrue, labelFalse)
		}
	}
	
	def dispatch IR compileExpression(ExprEq exprEq, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new IR()
		var e1 = exprEq.exprL.compileExpression(functionImpl, labelTrue, labelFalse)
		var exp2 = exprEq.exprRSimple === null ? exprEq.exprRExpr : exprEq.exprRSimple
		var e2 = exp2.compileExpression(functionImpl, labelTrue, labelFalse)
		
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
		
		return e
	}
	
	def dispatch IR compileExpression(ExprSimple exprSimple, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(exprSimple.term !== null) {
			var e = new IR()
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
	
	def dispatch IR compileExpression(ExprSimpleWithLExpr exprSimpleWithLExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		if(exprSimpleWithLExpr.operation == "cons") {
			// TODO : fonctionne seulement pour cons E' E''
			var e = new IR()
			var e1 = exprSimpleWithLExpr.lexpr.expressions.get(0).compileExpression(functionImpl, labelTrue, labelFalse)
			var e2 = exprSimpleWithLExpr.lexpr.expressions.get(1).compileExpression(functionImpl, labelTrue, labelFalse)
			
			e.place = functionImpl.env.newVariable("")
			e.code.addAll(e1.code)
			e.code.addAll(e2.code)
			e.code.add(new Quad("cons", e.place, e1.place, e2.place))
			
			return e
		}
		else if(exprSimpleWithLExpr.operation == "list") {
			return new IR()
		}
	}
	
	def dispatch IR compileExpression(ExprSimpleWithExpr exprSimpleWithExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		var e = new IR()
		var e1 = exprSimpleWithExpr.expr.compileExpression(functionImpl, labelTrue, labelFalse)
		
		e.place = functionImpl.env.newVariable("")
		e.code.addAll(e1.code)
		e.code.add(new Quad(exprSimpleWithExpr.operation, e.place, e1.place, ""))
		
		return e
	}
	
	def dispatch IR compileExpression(ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
		return new IR()
	}	
	
}