package esir.comp.cpp.generator.ir;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import esir.comp.cpp.generator.ir.Env;
import esir.comp.cpp.generator.ir.FunctionImpl;
import esir.comp.cpp.generator.ir.Instr;
import esir.comp.cpp.generator.ir.Quad;
import esir.comp.cpp.whileDsl.Command;
import esir.comp.cpp.whileDsl.Commands;
import esir.comp.cpp.whileDsl.Definition;
import esir.comp.cpp.whileDsl.Expr;
import esir.comp.cpp.whileDsl.ExprAnd;
import esir.comp.cpp.whileDsl.ExprEq;
import esir.comp.cpp.whileDsl.ExprNot;
import esir.comp.cpp.whileDsl.ExprOr;
import esir.comp.cpp.whileDsl.ExprSimple;
import esir.comp.cpp.whileDsl.ExprSimpleWithExpr;
import esir.comp.cpp.whileDsl.ExprSimpleWithLExpr;
import esir.comp.cpp.whileDsl.ExprSimpleWithSymbolLExpr;
import esir.comp.cpp.whileDsl.Exprs;
import esir.comp.cpp.whileDsl.ForCommand;
import esir.comp.cpp.whileDsl.ForeachCommand;
import esir.comp.cpp.whileDsl.Function;
import esir.comp.cpp.whileDsl.IfCommand;
import esir.comp.cpp.whileDsl.LExpr;
import esir.comp.cpp.whileDsl.NopCommand;
import esir.comp.cpp.whileDsl.VarsCommand;
import esir.comp.cpp.whileDsl.WhileCommand;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class WhileDslIRGenerator {
  private HashMap<String, FunctionImpl> functions;
  
  private int functionCounter;
  
  private Resource res;
  
  public List<FunctionImpl> compileIR(final Resource resource) {
    this.functions = CollectionLiterals.<String, FunctionImpl>newHashMap();
    this.functionCounter = 0;
    this.res = resource;
    Iterable<Function> _filter = Iterables.<Function>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Function.class);
    for (final Function function : _filter) {
      {
        Env env = new Env(null);
        ArrayList<Quad> quads = CollectionLiterals.<Quad>newArrayList();
        ArrayList<Quad> intputs = CollectionLiterals.<Quad>newArrayList();
        ArrayList<Quad> outputs = CollectionLiterals.<Quad>newArrayList();
        FunctionImpl functionImpl = new FunctionImpl(env, quads, intputs, outputs, ("F" + Integer.valueOf(this.functionCounter)), function);
        this.compile(function, functionImpl);
        this.functions.put(function.getFunctionName(), functionImpl);
        this.functionCounter++;
      }
    }
    return CollectionLiterals.<FunctionImpl>newArrayList(((FunctionImpl[])Conversions.unwrapArray(this.functions.values(), FunctionImpl.class)));
  }
  
  private void compile(final Function function, final FunctionImpl functionImpl) {
    this.compile(function.getFunctionDefinition(), functionImpl);
  }
  
  private void compile(final Definition definition, final FunctionImpl functionImpl) {
    EList<String> _variables = definition.getIntput().getVariables();
    for (final String in : _variables) {
      {
        Instr e = new Instr();
        e.setPlace(functionImpl.getEnv().newInput(in));
        String _place = e.getPlace();
        Quad _quad = new Quad("read", _place, "", "");
        e.getCode().add(_quad);
        functionImpl.getQuads().addAll(e.getCode());
      }
    }
    EList<Command> _commands = definition.getBody().getCommands();
    for (final Command com : _commands) {
      {
        Instr e = this.compileCommand(com, functionImpl);
        functionImpl.getQuads().addAll(e.getCode());
      }
    }
    EList<String> _variables_1 = definition.getOutput().getVariables();
    for (final String out : _variables_1) {
      {
        Instr e = new Instr();
        e.setPlace(functionImpl.getEnv().retrieve(out));
        String _place = e.getPlace();
        Quad _quad = new Quad("write", "", _place, "");
        e.getCode().add(_quad);
        Env _env = functionImpl.getEnv();
        int _outputCounter = functionImpl.getEnv().getOutputCounter();
        int _plus = (_outputCounter + 1);
        _env.setOutputCounter(_plus);
        functionImpl.getQuads().addAll(e.getCode());
      }
    }
  }
  
  private boolean compileIfBooleanExpr(final EObject cond, final Instr e, final String labelTrue, final String labelFalse) {
    boolean _xifexpression = false;
    if (((cond instanceof ExprSimple) && (!StringExtensions.isNullOrEmpty(e.getPlace())))) {
      boolean _xblockexpression = false;
      {
        String _place = e.getPlace();
        Quad _quad = new Quad(("ift " + labelTrue), "", _place, "");
        e.getCode().add(_quad);
        Quad _quad_1 = new Quad(("goto " + labelFalse), "", "", "");
        _xblockexpression = e.getCode().add(_quad_1);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  private Instr _compileCommand(final WhileCommand whileCommand, final FunctionImpl functionImpl) {
    String ifFalse = functionImpl.getEnv().newLabel();
    String body = functionImpl.getEnv().newLabel();
    String condLab = functionImpl.getEnv().newLabel();
    Instr e = new Instr();
    Instr e1 = this.compileExpression(whileCommand.getCond(), functionImpl, body, ifFalse);
    this.compileIfBooleanExpr(whileCommand.getCond().getExpression(), e1, body, ifFalse);
    Quad _quad = new Quad(("label " + condLab), "", "", "");
    e.getCode().add(_quad);
    e.getCode().addAll(e1.getCode());
    Quad _quad_1 = new Quad(("label " + body), "", "", "");
    e.getCode().add(_quad_1);
    EList<Command> _commands = whileCommand.getBody().getCommands();
    for (final Command com : _commands) {
      e.getCode().addAll(this.compileCommand(com, functionImpl).getCode());
    }
    Quad _quad_2 = new Quad(("goto " + condLab), "", "", "");
    e.getCode().add(_quad_2);
    Quad _quad_3 = new Quad(("label " + ifFalse), "", "", "");
    e.getCode().add(_quad_3);
    return e;
  }
  
  private Instr _compileCommand(final NopCommand nopCommand, final FunctionImpl functionImpl) {
    Instr e = new Instr();
    Quad _quad = new Quad("nop", "", "", "");
    e.getCode().add(_quad);
    return e;
  }
  
  private Instr _compileCommand(final ForCommand forCommand, final FunctionImpl functionImpl) {
    Instr e = new Instr();
    e.setPlace(functionImpl.getEnv().newVariable(""));
    String bodyLabel = functionImpl.getEnv().newLabel();
    String endLabel = functionImpl.getEnv().newLabel();
    Instr e1 = this.compileExpression(forCommand.getCond(), functionImpl, "", "");
    Instr e2 = this.compileExpression(forCommand.getBody(), functionImpl, "", "");
    String _place = e1.getPlace();
    Quad _quad = new Quad("write", "", _place, "");
    e.getCode().add(_quad);
    String _place_1 = e.getPlace();
    Quad _quad_1 = new Quad("read", _place_1, "", "");
    e.getCode().add(_quad_1);
    e.getCode().addAll(e1.getCode());
    Quad _quad_2 = new Quad(("label " + bodyLabel), "", "", "");
    e.getCode().add(_quad_2);
    String _place_2 = e.getPlace();
    Quad _quad_3 = new Quad(("iff " + endLabel), "", _place_2, "");
    e.getCode().add(_quad_3);
    e.getCode().addAll(e2.getCode());
    String _place_3 = e.getPlace();
    String _place_4 = e.getPlace();
    Quad _quad_4 = new Quad("tl", _place_3, _place_4, "");
    e.getCode().add(_quad_4);
    Quad _quad_5 = new Quad(("goto " + bodyLabel), "", "", "");
    e.getCode().add(_quad_5);
    Quad _quad_6 = new Quad(("label " + endLabel), "", "", "");
    e.getCode().add(_quad_6);
    return e;
  }
  
  private Instr _compileCommand(final IfCommand ifCommand, final FunctionImpl functionImpl) {
    Instr e = new Instr();
    String labelTrue = functionImpl.getEnv().newLabel();
    String labelFalse = functionImpl.getEnv().newLabel();
    String labelEnd = functionImpl.getEnv().newLabel();
    Instr e1 = this.compileExpression(ifCommand.getCond(), functionImpl, labelTrue, labelFalse);
    this.compileIfBooleanExpr(ifCommand.getCond().getExpression(), e1, labelTrue, labelFalse);
    e.getCode().addAll(e1.getCode());
    Quad _quad = new Quad(("label " + labelTrue), "", "", "");
    e.getCode().add(_quad);
    EList<Command> _commands = ifCommand.getThenBody().getCommands();
    for (final Command com : _commands) {
      e.getCode().addAll(this.compileCommand(com, functionImpl).getCode());
    }
    Quad _quad_1 = new Quad(("goto " + labelEnd), "", "", "");
    e.getCode().add(_quad_1);
    Quad _quad_2 = new Quad(("label " + labelFalse), "", "", "");
    e.getCode().add(_quad_2);
    Commands _elseBody = ifCommand.getElseBody();
    boolean _tripleNotEquals = (_elseBody != null);
    if (_tripleNotEquals) {
      EList<Command> _commands_1 = ifCommand.getElseBody().getCommands();
      for (final Command com_1 : _commands_1) {
        e.getCode().addAll(this.compileCommand(com_1, functionImpl).getCode());
      }
    }
    Quad _quad_3 = new Quad(("label " + labelEnd), "", "", "");
    e.getCode().add(_quad_3);
    return e;
  }
  
  private Instr _compileCommand(final ForeachCommand foreachCommand, final FunctionImpl functionImpl) {
    Instr e = new Instr();
    e.setPlace(functionImpl.getEnv().newVariable(""));
    String expElement = functionImpl.getEnv().newVariable(foreachCommand.getExpElement());
    String bodyLabel = functionImpl.getEnv().newLabel();
    String endLabel = functionImpl.getEnv().newLabel();
    Instr e1 = this.compileExpression(foreachCommand.getExpList(), functionImpl, "", "");
    Instr e2 = this.compileExpression(foreachCommand.getBody(), functionImpl, "", "");
    String _place = e1.getPlace();
    Quad _quad = new Quad("write", "", _place, "");
    e.getCode().add(_quad);
    Quad _quad_1 = new Quad("read", expElement, "", "");
    e.getCode().add(_quad_1);
    e.getCode().addAll(e1.getCode());
    Quad _quad_2 = new Quad(("label " + bodyLabel), "", "", "");
    e.getCode().add(_quad_2);
    Quad _quad_3 = new Quad(("iff " + endLabel), "", expElement, "");
    e.getCode().add(_quad_3);
    e.getCode().addAll(e2.getCode());
    String _place_1 = e.getPlace();
    Quad _quad_4 = new Quad("hd", _place_1, expElement, "");
    e.getCode().add(_quad_4);
    Quad _quad_5 = new Quad("tl ", expElement, expElement, "");
    e.getCode().add(_quad_5);
    Quad _quad_6 = new Quad(("goto " + bodyLabel), "", "", "");
    e.getCode().add(_quad_6);
    Quad _quad_7 = new Quad(("label " + endLabel), "", "", "");
    e.getCode().add(_quad_7);
    return e;
  }
  
  private Instr _compileCommand(final VarsCommand varsCommand, final FunctionImpl functionImpl) {
    Instr e = new Instr();
    ArrayList<Quad> variables = CollectionLiterals.<Quad>newArrayList();
    for (int i = 0; (i < varsCommand.getValues().getExpressions().size()); i++) {
      {
        final Instr exp = this.compileExpression(varsCommand.getValues().getExpressions().get(i).getExpression(), functionImpl, "", "");
        e.getCode().addAll(exp.getCode());
        Expr _get = varsCommand.getValues().getExpressions().get(i);
        if ((_get instanceof ExprSimpleWithSymbolLExpr)) {
          Expr _get_1 = varsCommand.getValues().getExpressions().get(i);
          ExprSimpleWithSymbolLExpr callFunc = ((ExprSimpleWithSymbolLExpr) _get_1);
          int nbOut = this.getFunctionFromResource(callFunc.getSymbol()).getFunctionDefinition().getOutput().getVariables().size();
          if ((nbOut > 1)) {
            int _i = i;
            i = (_i + nbOut);
            for (int j = 1; (j < nbOut); j++) {
              {
                String varKeyF = functionImpl.getEnv().newVariable("");
                Quad _quad = new Quad("read", varKeyF, "", "");
                variables.add(_quad);
              }
            }
          }
        } else {
          String _place = exp.getPlace();
          Quad _quad = new Quad("write", "", _place, "");
          e.getCode().add(_quad);
        }
        final String varToken = varsCommand.getVariables().getVariables().get(i);
        String varKey = functionImpl.getEnv().retrieve(varToken);
        if ((varKey == null)) {
          varKey = functionImpl.getEnv().newVariable(varToken);
        }
        Quad _quad_1 = new Quad("read", varKey, "", "");
        variables.add(_quad_1);
      }
    }
    e.getCode().addAll(variables);
    return e;
  }
  
  /**
   * def private dispatch Instr compileCommand(VarsCommand varsCommand, FunctionImpl functionImpl) {
   * if(varsCommand.variables.variables.size() != varsCommand.values.expressions.size()) {
   * throw new Exception("Variables and values are not equal.")
   * }
   * 
   * var e = new Instr()
   * var variables = newArrayList()
   * 
   * for(var i = 0; i < varsCommand.values.expressions.size(); i++) {
   * println("type of exp = " + varsCommand.values.expressions.get(i).class.toString())
   * val exp = varsCommand.values.expressions.get(i).compileExpression(functionImpl, "", "")
   * e.code.addAll(exp.code)
   * println("\n\ncode of exp : " + exp.toString() + "\n\n")
   * e.code.add(new Quad("write", "", exp.place, ""))
   * 
   * val varToken = varsCommand.variables.variables.get(i)
   * var varKey = functionImpl.env.retrieve(varToken)
   * if(varKey === null) varKey = functionImpl.env.newVariable(varToken)
   * variables.add(new Quad("read" , varKey, "", ""))
   * }
   * e.code.addAll(variables)
   * 
   * return e
   * }
   */
  private Instr _compileExpression(final Commands commands, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    Instr e = new Instr();
    EList<Command> _commands = commands.getCommands();
    for (final Command command : _commands) {
      e.getCode().addAll(this.compileCommand(command, functionImpl).getCode());
    }
    return e;
  }
  
  private Instr _compileExpression(final Expr expr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    InputOutput.<String>println("Expr called !");
    String _string = expr.eClass().toString();
    String _plus = ("Expr class = " + _string);
    InputOutput.<String>println(_plus);
    String _string_1 = expr.getExpression().eClass().toString();
    String _plus_1 = ("Expr expression class = " + _string_1);
    InputOutput.<String>println(_plus_1);
    return this.compileExpression(expr.getExpression(), functionImpl, labelTrue, labelFalse);
  }
  
  private Instr _compileExpression(final Exprs exprs, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    InputOutput.<String>println("Exprs called !");
    return new Instr();
  }
  
  private Instr _compileExpression(final LExpr lExpr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    InputOutput.<String>println("LExpr called !");
    return new Instr();
  }
  
  private Instr _compileExpression(final ExprAnd exprAnd, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    Instr e = new Instr();
    if ((StringExtensions.isNullOrEmpty(labelTrue) && StringExtensions.isNullOrEmpty(labelFalse))) {
      InputOutput.<String>println("exprAnd -> labels null");
      int _size = exprAnd.getExpressionsOr().size();
      boolean _equals = (_size == 1);
      if (_equals) {
        return this.compileExpression(exprAnd.getExpressionsOr().get(0), functionImpl, "", "");
      } else {
        EList<ExprOr> _expressionsOr = exprAnd.getExpressionsOr();
        for (final ExprOr exp : _expressionsOr) {
          e.getCode().addAll(this.compileExpression(exp, functionImpl, "", "").getCode());
        }
      }
    } else {
      e.setPlace(functionImpl.getEnv().newVariable(""));
      String labelIfTrue = functionImpl.getEnv().newLabel();
      String labelIfFalse = functionImpl.getEnv().newLabel();
      int _size_1 = exprAnd.getExpressionsOr().size();
      String _plus = ("exprAnd.expressionsOr size = " + Integer.valueOf(_size_1));
      InputOutput.<String>println(_plus);
      EList<ExprOr> _expressionsOr_1 = exprAnd.getExpressionsOr();
      for (final ExprOr exp_1 : _expressionsOr_1) {
        {
          Instr expComp = this.compileExpression(exp_1, functionImpl, labelIfTrue, labelIfFalse);
          String _string = expComp.toString();
          String _plus_1 = ("\nexpComp = " + _string);
          String _plus_2 = (_plus_1 + "\n");
          InputOutput.<String>println(_plus_2);
          e.getCode().addAll(expComp.getCode());
          String _place = expComp.getPlace();
          Quad _quad = new Quad(("iff " + labelIfFalse), "", _place, "");
          e.getCode().add(_quad);
        }
      }
      Quad _quad = new Quad(("label " + labelIfTrue), "", "", "");
      e.getCode().add(_quad);
      String _place = e.getPlace();
      Quad _quad_1 = new Quad("true", _place, "", "");
      e.getCode().add(_quad_1);
      Quad _quad_2 = new Quad(("goto " + labelTrue), "", "", "");
      e.getCode().add(_quad_2);
      Quad _quad_3 = new Quad(("label " + labelIfFalse), "", "", "");
      e.getCode().add(_quad_3);
      String _place_1 = e.getPlace();
      Quad _quad_4 = new Quad("false", _place_1, "", "");
      e.getCode().add(_quad_4);
      Quad _quad_5 = new Quad(("goto " + labelFalse), "", "", "");
      e.getCode().add(_quad_5);
    }
    return e;
  }
  
  private Instr _compileExpression(final ExprOr exprOr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    Instr e = new Instr();
    if ((StringExtensions.isNullOrEmpty(labelTrue) && StringExtensions.isNullOrEmpty(labelFalse))) {
      InputOutput.<String>println("ExprOr -> labels null");
      int _size = exprOr.getExpressionsNot().size();
      boolean _equals = (_size == 1);
      if (_equals) {
        return this.compileExpression(exprOr.getExpressionsNot().get(0), functionImpl, "", "");
      } else {
        EList<ExprNot> _expressionsNot = exprOr.getExpressionsNot();
        for (final ExprNot exp : _expressionsNot) {
          e.getCode().addAll(this.compileExpression(exp, functionImpl, "", "").getCode());
        }
      }
    } else {
      e.setPlace(functionImpl.getEnv().newVariable(""));
      String labelIfTrue = functionImpl.getEnv().newLabel();
      String labelIfFalse = functionImpl.getEnv().newLabel();
      String labelEnd = functionImpl.getEnv().newLabel();
      EList<ExprNot> _expressionsNot_1 = exprOr.getExpressionsNot();
      for (final ExprNot exp_1 : _expressionsNot_1) {
        {
          Instr expComp = this.compileExpression(exp_1, functionImpl, labelIfTrue, labelIfFalse);
          e.getCode().addAll(expComp.getCode());
          String _place = expComp.getPlace();
          Quad _quad = new Quad(("ift " + labelIfTrue), "", _place, "");
          e.getCode().add(_quad);
        }
      }
      Quad _quad = new Quad(("goto " + labelIfFalse), "", "", "");
      e.getCode().add(_quad);
      Quad _quad_1 = new Quad(("label " + labelIfTrue), "", "", "");
      e.getCode().add(_quad_1);
      String _place = e.getPlace();
      Quad _quad_2 = new Quad("true", _place, "", "");
      e.getCode().add(_quad_2);
      Quad _quad_3 = new Quad(("goto " + labelEnd), "", "", "");
      e.getCode().add(_quad_3);
      Quad _quad_4 = new Quad(("label " + labelIfFalse), "", "", "");
      e.getCode().add(_quad_4);
      String _place_1 = e.getPlace();
      Quad _quad_5 = new Quad("false", _place_1, "", "");
      e.getCode().add(_quad_5);
      Quad _quad_6 = new Quad(("label " + labelEnd), "", "", "");
      e.getCode().add(_quad_6);
    }
    return e;
  }
  
  private Instr _compileExpression(final ExprNot exprNot, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    if ((StringExtensions.isNullOrEmpty(labelTrue) && StringExtensions.isNullOrEmpty(labelFalse))) {
      return this.compileExpression(exprNot.getExpressionEq(), functionImpl, "", "");
    } else {
      boolean _isNegation = exprNot.isNegation();
      if (_isNegation) {
        Instr e = this.compileExpression(exprNot.getExpressionEq(), functionImpl, labelTrue, labelFalse);
        String labelIfTrue = functionImpl.getEnv().newLabel();
        String labelEnd = functionImpl.getEnv().newLabel();
        String _place = e.getPlace();
        Quad _quad = new Quad(("ift " + labelIfTrue), "", _place, "");
        e.getCode().add(_quad);
        String _place_1 = e.getPlace();
        Quad _quad_1 = new Quad("true", _place_1, "", "");
        e.getCode().add(_quad_1);
        Quad _quad_2 = new Quad(("goto " + labelEnd), "", "", "");
        e.getCode().add(_quad_2);
        Quad _quad_3 = new Quad(("label " + labelIfTrue), "", "", "");
        e.getCode().add(_quad_3);
        String _place_2 = e.getPlace();
        Quad _quad_4 = new Quad("false", _place_2, "", "");
        e.getCode().add(_quad_4);
        Quad _quad_5 = new Quad(("label " + labelEnd), "", "", "");
        e.getCode().add(_quad_5);
        return e;
      } else {
        return this.compileExpression(exprNot.getExpressionEq(), functionImpl, labelTrue, labelFalse);
      }
    }
  }
  
  private Instr _compileExpression(final ExprEq exprEq, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    Instr e = new Instr();
    Expr _expr = exprEq.getExpr();
    boolean _tripleNotEquals = (_expr != null);
    if (_tripleNotEquals) {
      String labelIfTrue = functionImpl.getEnv().newLabel();
      String labelIfFalse = functionImpl.getEnv().newLabel();
      String labelEnd = functionImpl.getEnv().newLabel();
      e.setPlace(functionImpl.getEnv().newVariable(""));
      Instr e1 = this.compileExpression(exprEq.getExpr().getExpression(), functionImpl, labelIfTrue, labelIfFalse);
      this.compileIfBooleanExpr(exprEq.getExpr().getExpression(), e1, labelIfTrue, labelIfFalse);
      e.getCode().addAll(e1.getCode());
      Quad _quad = new Quad(("label " + labelIfTrue), "", "", "");
      e.getCode().add(_quad);
      String _place = e.getPlace();
      Quad _quad_1 = new Quad("true", _place, "", "");
      e.getCode().add(_quad_1);
      Quad _quad_2 = new Quad(("goto " + labelEnd), "", "", "");
      e.getCode().add(_quad_2);
      Quad _quad_3 = new Quad(("label " + labelIfFalse), "", "", "");
      e.getCode().add(_quad_3);
      String _place_1 = e.getPlace();
      Quad _quad_4 = new Quad("false", _place_1, "", "");
      e.getCode().add(_quad_4);
      Quad _quad_5 = new Quad(("label " + labelEnd), "", "", "");
      e.getCode().add(_quad_5);
      String _string = e.toString();
      String _plus = ("var e pour eq = " + _string);
      InputOutput.<String>println(_plus);
    } else {
      if (((exprEq.getExprLSimple() != null) && (exprEq.getExprRSimple() != null))) {
        Instr e1_1 = this.compileExpression(exprEq.getExprLSimple(), functionImpl, labelTrue, labelFalse);
        Instr e2 = this.compileExpression(exprEq.getExprRSimple(), functionImpl, labelTrue, labelFalse);
        String labelEnd_1 = functionImpl.getEnv().newLabel();
        String labelEqual = functionImpl.getEnv().newLabel();
        e.getCode().addAll(e1_1.getCode());
        e.getCode().addAll(e2.getCode());
        e.setPlace(functionImpl.getEnv().newVariable(""));
        String _place_2 = e1_1.getPlace();
        String _place_3 = e2.getPlace();
        Quad _quad_6 = new Quad(("ifeq " + labelEqual), "", _place_2, _place_3);
        e.getCode().add(_quad_6);
        String _place_4 = e.getPlace();
        Quad _quad_7 = new Quad("false", _place_4, "", "");
        e.getCode().add(_quad_7);
        Quad _quad_8 = new Quad(("goto " + labelEnd_1), "", "", "");
        e.getCode().add(_quad_8);
        Quad _quad_9 = new Quad(("label " + labelEqual), "", "", "");
        e.getCode().add(_quad_9);
        String _place_5 = e.getPlace();
        Quad _quad_10 = new Quad("true", _place_5, "", "");
        e.getCode().add(_quad_10);
        Quad _quad_11 = new Quad(("label " + labelEnd_1), "", "", "");
        e.getCode().add(_quad_11);
      } else {
        if (((exprEq.getExprLSimple() != null) && (exprEq.getExprRSimple() == null))) {
          e = this.compileExpression(exprEq.getExprLSimple(), functionImpl, labelTrue, labelFalse);
        }
      }
    }
    return e;
  }
  
  private Instr _compileExpression(final ExprSimple exprSimple, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    String _term = exprSimple.getTerm();
    boolean _tripleNotEquals = (_term != null);
    if (_tripleNotEquals) {
      Instr e = new Instr();
      String _term_1 = exprSimple.getTerm();
      boolean _equals = Objects.equal(_term_1, "nil");
      if (_equals) {
        e.setPlace(functionImpl.getEnv().newVariable(""));
        String _place = e.getPlace();
        Quad _quad = new Quad("nil", _place, "", "");
        e.getCode().add(_quad);
      } else {
        boolean _isUpperCase = Character.isUpperCase(exprSimple.getTerm().charAt(0));
        if (_isUpperCase) {
          e.setPlace(functionImpl.getEnv().retrieve(exprSimple.getTerm()));
          String _place_1 = e.getPlace();
          boolean _tripleEquals = (_place_1 == null);
          if (_tripleEquals) {
            e.setPlace(functionImpl.getEnv().newVariable(exprSimple.getTerm()));
          }
        } else {
          boolean _isLowerCase = Character.isLowerCase(exprSimple.getTerm().charAt(0));
          if (_isLowerCase) {
            e.setPlace(functionImpl.getEnv().retrieve(exprSimple.getTerm()));
            String _place_2 = e.getPlace();
            boolean _tripleEquals_1 = (_place_2 == null);
            if (_tripleEquals_1) {
              String idSymb = functionImpl.getEnv().newSymbol(exprSimple.getTerm());
              e.setPlace(functionImpl.getEnv().newVariable(""));
              String _place_3 = e.getPlace();
              Quad _quad_1 = new Quad(("symb" + idSymb), _place_3, "", "");
              e.getCode().add(_quad_1);
            }
          }
        }
      }
      return e;
    } else {
      EObject _expression = exprSimple.getExpression();
      boolean _tripleNotEquals_1 = (_expression != null);
      if (_tripleNotEquals_1) {
        return this.compileExpression(exprSimple.getExpression(), functionImpl, labelTrue, labelFalse);
      }
    }
    return null;
  }
  
  private Instr _compileExpression(final ExprSimpleWithLExpr exprSimpleWithLExpr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    String _operation = exprSimpleWithLExpr.getOperation();
    boolean _equals = Objects.equal(_operation, "cons");
    if (_equals) {
      Instr e = new Instr();
      Instr e1 = this.compileExpression(exprSimpleWithLExpr.getLexpr().getExpressions().get(0), functionImpl, "", "");
      Instr e2 = this.compileExpression(exprSimpleWithLExpr.getLexpr().getExpressions().get(1), functionImpl, "", "");
      e.setPlace(functionImpl.getEnv().newVariable(""));
      e.getCode().addAll(e1.getCode());
      e.getCode().addAll(e2.getCode());
      String _place = e.getPlace();
      String _place_1 = e1.getPlace();
      String _place_2 = e2.getPlace();
      Quad _quad = new Quad("cons", _place, _place_1, _place_2);
      e.getCode().add(_quad);
      return e;
    } else {
      String _operation_1 = exprSimpleWithLExpr.getOperation();
      boolean _equals_1 = Objects.equal(_operation_1, "list");
      if (_equals_1) {
        return new Instr();
      }
    }
    return null;
  }
  
  private Instr _compileExpression(final ExprSimpleWithExpr exprSimpleWithExpr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    Instr e = new Instr();
    Instr e1 = this.compileExpression(exprSimpleWithExpr.getExpr(), functionImpl, "", "");
    e.setPlace(functionImpl.getEnv().newVariable(""));
    e.getCode().addAll(e1.getCode());
    String _operation = exprSimpleWithExpr.getOperation();
    String _place = e.getPlace();
    String _place_1 = e1.getPlace();
    Quad _quad = new Quad(_operation, _place, _place_1, "");
    e.getCode().add(_quad);
    return e;
  }
  
  private Instr _compileExpression(final ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    try {
      Instr e = new Instr();
      e.setPlace(functionImpl.getEnv().newVariable(""));
      /* Iterables.<Function>filter(IteratorExtensions.<EObject>toIterable(this.res.getAllContents()), Function.class); */
      int nbIn = this.getFunctionFromResource(exprSimpleWithSymbolLExpr.getSymbol()).getFunctionDefinition().getIntput().getVariables().size();
      int _size = exprSimpleWithSymbolLExpr.getLexpr().getExpressions().size();
      boolean _notEquals = (nbIn != _size);
      if (_notEquals) {
        throw new Exception("Incorrect number of parameters.");
      }
      ArrayList<String> params = CollectionLiterals.<String>newArrayList();
      EList<Expr> _expressions = exprSimpleWithSymbolLExpr.getLexpr().getExpressions();
      for (final Expr exp : _expressions) {
        {
          Instr expIr = this.compileExpression(exp, functionImpl, "", "");
          e.getCode().addAll(expIr.getCode());
          params.add(expIr.getPlace());
        }
      }
      List<String> _reverse = ListExtensions.<String>reverse(params);
      for (final String param : _reverse) {
        Quad _quad = new Quad("write", "", param, "");
        e.getCode().add(_quad);
      }
      String _functionName = this.getFunctionFromResource(exprSimpleWithSymbolLExpr.getSymbol()).getFunctionName();
      String _plus = ("call " + _functionName);
      Quad _quad_1 = new Quad(_plus, "", "", "");
      e.getCode().add(_quad_1);
      String _place = e.getPlace();
      Quad _quad_2 = new Quad("read", _place, "", "");
      e.getCode().add(_quad_2);
      return e;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * def private  dispatch Instr compileExpression(ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr, FunctionImpl functionImpl, String labelTrue, String labelFalse) {
   * return new Instr()
   * }
   */
  private Function getFunctionFromResource(final String functionName) {
    Iterable<Function> _filter = Iterables.<Function>filter(IteratorExtensions.<EObject>toIterable(this.res.getAllContents()), Function.class);
    for (final Function function : _filter) {
      boolean _equals = function.getFunctionName().equals(functionName);
      if (_equals) {
        return function;
      }
    }
    return null;
  }
  
  private Instr compileCommand(final Command forCommand, final FunctionImpl functionImpl) {
    if (forCommand instanceof ForCommand) {
      return _compileCommand((ForCommand)forCommand, functionImpl);
    } else if (forCommand instanceof ForeachCommand) {
      return _compileCommand((ForeachCommand)forCommand, functionImpl);
    } else if (forCommand instanceof IfCommand) {
      return _compileCommand((IfCommand)forCommand, functionImpl);
    } else if (forCommand instanceof NopCommand) {
      return _compileCommand((NopCommand)forCommand, functionImpl);
    } else if (forCommand instanceof VarsCommand) {
      return _compileCommand((VarsCommand)forCommand, functionImpl);
    } else if (forCommand instanceof WhileCommand) {
      return _compileCommand((WhileCommand)forCommand, functionImpl);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(forCommand, functionImpl).toString());
    }
  }
  
  private Instr compileExpression(final EObject commands, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    if (commands instanceof Commands) {
      return _compileExpression((Commands)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof Expr) {
      return _compileExpression((Expr)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof ExprAnd) {
      return _compileExpression((ExprAnd)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof ExprEq) {
      return _compileExpression((ExprEq)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof ExprNot) {
      return _compileExpression((ExprNot)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof ExprOr) {
      return _compileExpression((ExprOr)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof ExprSimple) {
      return _compileExpression((ExprSimple)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof ExprSimpleWithExpr) {
      return _compileExpression((ExprSimpleWithExpr)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof ExprSimpleWithLExpr) {
      return _compileExpression((ExprSimpleWithLExpr)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof ExprSimpleWithSymbolLExpr) {
      return _compileExpression((ExprSimpleWithSymbolLExpr)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof Exprs) {
      return _compileExpression((Exprs)commands, functionImpl, labelTrue, labelFalse);
    } else if (commands instanceof LExpr) {
      return _compileExpression((LExpr)commands, functionImpl, labelTrue, labelFalse);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(commands, functionImpl, labelTrue, labelFalse).toString());
    }
  }
}
