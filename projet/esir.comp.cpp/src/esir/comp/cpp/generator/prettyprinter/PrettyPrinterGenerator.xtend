package esir.comp.cpp.generator.prettyprinter

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import esir.comp.cpp.whileDsl.Model
import esir.comp.cpp.whileDsl.Definition
import esir.comp.cpp.whileDsl.WhileCommand
import esir.comp.cpp.whileDsl.NopCommand
import esir.comp.cpp.whileDsl.ForCommand
import esir.comp.cpp.whileDsl.IfCommand
import esir.comp.cpp.whileDsl.ForeachCommand
import esir.comp.cpp.whileDsl.VarsCommand
import esir.comp.cpp.whileDsl.Expr
import org.eclipse.emf.common.util.EList
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
import esir.comp.cpp.whileDsl.Command

class PrettyPrinterGenerator extends AbstractGenerator {
	PrettyPrinterGeneratorParameters parameters;
	static var INDENT_DEFAULT = "	"

	new (PrettyPrinterGeneratorParameters parameters) {
		this.parameters = parameters;
	}
	
	new () {
		this(new PrettyPrinterGeneratorParameters(INDENT_DEFAULT, INDENT_DEFAULT, INDENT_DEFAULT, INDENT_DEFAULT));
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {		
		var test = "";
		for(m : resource.allContents.toIterable.filter(Model)) {
			test += m.indent();
		}
		fsa.generateFile(
			"test-pp.wh",
			test);
	}
	
	// STRUCTURES
	
	def indent(Model model) {
		'''
		«FOR function : model.program»
			function «function.functionName»:
			«function.functionDefinition.indent() + '\n'»
		«ENDFOR»
		'''
	}
	
	def indent(Definition definition) {
		'''
		read «definition.intput.variables.indentList()»
		%
		«definition.body.commands.indentCommands.addTabulation(INDENT_DEFAULT)»
		%
		write «definition.output.variables.indentList()»
		'''
	}
	
	// COMMANDS
	
	def indentCommands(EList<Command> commands) {
		var text = "";
		for(var i = 0; i < commands.size(); i++) {
			text+= commands.get(i).indentCommand();
			if((i+1) < commands.size()) {
				text+=";"
			}
			text += "\n"
		}
		return text;
	}
	
	def dispatch CharSequence indentCommand(WhileCommand whileCommand) {
		'''
		while «whileCommand.cond.indentExpression()» do
		«whileCommand.body.commands.indentCommands.addTabulation(parameters.indentationWhile)»
		od'''
	}
	
	def dispatch CharSequence indentCommand(NopCommand nopCommand) {
		return "nop"
	}
	
	def dispatch CharSequence indentCommand(ForCommand forCommand) {
		'''
		for «forCommand.cond.indentExpression()» do
		«forCommand.body.commands.indentCommands.addTabulation(parameters.indentationFor)»
		od'''
	}
	
	def dispatch CharSequence indentCommand(IfCommand ifCommand) {
		'''
		if «ifCommand.cond.indentExpression()» then
		«ifCommand.thenBody.commands.indentCommands.addTabulation(parameters.indentationIf)»
		«IF ifCommand.elseBody.commands.size > 0»
		else
		«ifCommand.elseBody.commands.indentCommands.addTabulation(parameters.indentationIf)»
		«ENDIF»
		fi'''
	}
	
	def dispatch CharSequence indentCommand(ForeachCommand foreachCommand) {
		'''
		foreach «foreachCommand.expElement.indentExpression()» in «foreachCommand.expList.indentExpression()» do
		«foreachCommand.body.commands.indentCommands.addTabulation(parameters.indentationForEach)»
		od'''
	}
	
	def dispatch CharSequence indentCommand(VarsCommand varsCommand) {
		'''
		«varsCommand.variables.variables.indentList()» := «varsCommand.values.indentExpression()»'''
	}
	
	// EXPRESSIONS
	
	def dispatch CharSequence indentExpression(Expr expr) {
		return expr.expression.indentExpression();
	}
	
	def dispatch CharSequence indentExpression(Exprs exprs) {
		var text = "";
		for(var i = 0; i < exprs.expressions.size(); i++) {
			text+= exprs.expressions.get(i).indentExpression();
			if((i+1) < exprs.expressions.size()) {
				text+=","
			}
		}
		return text;
	}
	
	def dispatch CharSequence indentExpression(LExpr lExpr) {
		var text = "";
		for(var i = 0; i < lExpr.expressions.size(); i++) {
			text+= lExpr.expressions.get(i).indentExpression();
			if((i+1) < lExpr.expressions.size()) {
				text+=" "
			}
		}
		return text;
	}
	
	def dispatch CharSequence indentExpression(ExprAnd exprAnd) {
		var text = "";
		for(var i = 0; i < exprAnd.expressionsOr.size(); i++) {
			text+= exprAnd.expressionsOr.get(i).indentExpression();
			if((i+1) < exprAnd.expressionsOr.size()) {
				text+=" and "
			}
		}
		return text;
	}
	
	def dispatch CharSequence indentExpression(ExprOr exprOr) {
		var text = "";
		for(var i = 0; i < exprOr.expressionsNot.size(); i++) {
			text+= exprOr.expressionsNot.get(i).indentExpression();
			if((i+1) < exprOr.expressionsNot.size()) {
				text+=" or "
			}
		}
		return text;
	}
	
	def dispatch CharSequence indentExpression(ExprNot exprNot) {
		var text = "";
		if(exprNot.negation) {
			text += "not "
		}
		text += exprNot.expressionEq.indentExpression();
		return text;
	}
	
	def dispatch CharSequence indentExpression(ExprEq exprEq) {
		var text = exprEq.exprL.indentExpression() + " =? ";
		if(exprEq.exprRSimple !== null) {
			text += exprEq.exprRSimple.indentExpression();
		}
		else if (exprEq.exprRExpr !== null) {
			text += "(" + exprEq.exprRSimple.indentExpression() + ")";
		}
		return text;
	}
	
	def dispatch CharSequence indentExpression(ExprSimple exprSimple) {
		if(exprSimple.term !== null) {
			return exprSimple.term;
		}
		else {
			return exprSimple.expression.indentExpression();
		}
	}
	
	def dispatch CharSequence indentExpression(ExprSimpleWithLExpr exprSimpleWithLExpr) {
		return "(" + exprSimpleWithLExpr.operation + " " + exprSimpleWithLExpr.lexpr.indentExpression() + ")";
	}
	
	def dispatch CharSequence indentExpression(ExprSimpleWithExpr exprSimpleWithExpr) {
		return "(" + exprSimpleWithExpr.operation + " " + exprSimpleWithExpr.expr.indentExpression() + ")";
	}
	
	def dispatch CharSequence indentExpression(ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr) {
		return "(" + exprSimpleWithSymbolLExpr.symbol + 
			(exprSimpleWithSymbolLExpr.lexpr.expressions.size() > 0 ? " " : "") + 
			exprSimpleWithSymbolLExpr.lexpr.indentExpression() + ")"
		;
	}	
	
	// UTILS
	
	def addTabulation(CharSequence charSequence, String tab) {
		var text = "";
		for(String s : charSequence.toString.split(System.getProperty("line.separator"))) {
			text += tab + s + "\n";
		}
		return text;
	}
	
	def indentList(EList<String> list) {
		var text = '';
		for(String s : list) {
			text += s + ','
		}
		text = text.substring(0, text.length-1) // remove last comma
		return text;
	}
}
