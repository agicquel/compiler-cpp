package esir.comp.cpp.generator.ir;

import com.google.common.base.Objects;
import esir.comp.cpp.generator.ir.Env;
import esir.comp.cpp.generator.ir.FunctionImpl;
import esir.comp.cpp.generator.ir.IR;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class WhileDslIRGenerator {
  public static FunctionImpl compileIR(final Function function) {
    WhileDslIRGenerator generator = new WhileDslIRGenerator();
    Env env = new Env(null);
    ArrayList<Quad> quads = CollectionLiterals.<Quad>newArrayList();
    ArrayList<Quad> intputs = CollectionLiterals.<Quad>newArrayList();
    ArrayList<Quad> outputs = CollectionLiterals.<Quad>newArrayList();
    FunctionImpl functionImpl = new FunctionImpl(env, quads, intputs, outputs, function);
    generator.compile(function, functionImpl);
    return functionImpl;
  }
  
  public void compile(final Function function, final FunctionImpl functionImpl) {
    this.compile(function.getFunctionDefinition(), functionImpl);
  }
  
  public void compile(final Definition definition, final FunctionImpl functionImpl) {
    EList<String> _variables = definition.getIntput().getVariables();
    for (final String in : _variables) {
      {
        IR e = new IR();
        e.setPlace(functionImpl.getEnv().newInput(in));
        String _place = e.getPlace();
        Quad _quad = new Quad("read", _place, "", "");
        e.getCode().add(_quad);
        functionImpl.getInputs().addAll(e.getCode());
      }
    }
    EList<Command> _commands = definition.getBody().getCommands();
    for (final Command com : _commands) {
      {
        IR e = this.compileCommand(com, functionImpl);
        functionImpl.getQuads().addAll(e.getCode());
      }
    }
    EList<String> _variables_1 = definition.getOutput().getVariables();
    for (final String out : _variables_1) {
      {
        IR e = new IR();
        e.setPlace(functionImpl.getEnv().retrieve(out));
        String _place = e.getPlace();
        Quad _quad = new Quad("write", "", _place, "");
        e.getCode().add(_quad);
        Env _env = functionImpl.getEnv();
        int _outputCounter = functionImpl.getEnv().getOutputCounter();
        int _plus = (_outputCounter + 1);
        _env.setOutputCounter(_plus);
        functionImpl.getOutputs().addAll(e.getCode());
      }
    }
  }
  
  public boolean compileIfBooleanExpr(final EObject cond, final IR e, final String labelTrue, final String labelFalse) {
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
  
  protected IR _compileCommand(final WhileCommand whileCommand, final FunctionImpl functionImpl) {
    String ifFalse = functionImpl.getEnv().newLabel();
    String body = functionImpl.getEnv().newLabel();
    IR e = new IR();
    IR e1 = this.compileExpression(whileCommand.getCond(), functionImpl, body, ifFalse);
    this.compileIfBooleanExpr(whileCommand.getCond().getExpression(), e1, body, ifFalse);
    Quad _quad = new Quad(("label " + body), "", "", "");
    e.getCode().add(_quad);
    e.getCode().addAll(e1.getCode());
    EList<Command> _commands = whileCommand.getBody().getCommands();
    for (final Command com : _commands) {
      e.getCode().addAll(this.compileCommand(com, functionImpl).getCode());
    }
    Quad _quad_1 = new Quad(("label " + ifFalse), "", "", "");
    e.getCode().add(_quad_1);
    return e;
  }
  
  protected IR _compileCommand(final NopCommand nopCommand, final FunctionImpl functionImpl) {
    IR e = new IR();
    Quad _quad = new Quad("nop", "", "", "");
    e.getCode().add(_quad);
    return e;
  }
  
  protected IR _compileCommand(final ForCommand forCommand, final FunctionImpl functionImpl) {
    return new IR();
  }
  
  protected IR _compileCommand(final IfCommand ifCommand, final FunctionImpl functionImpl) {
    IR e = new IR();
    String labelTrue = functionImpl.getEnv().newLabel();
    String labelFalse = functionImpl.getEnv().newLabel();
    String labelEnd = functionImpl.getEnv().newLabel();
    IR e1 = this.compileExpression(ifCommand.getCond(), functionImpl, labelTrue, labelFalse);
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
  
  protected IR _compileCommand(final ForeachCommand foreachCommand, final FunctionImpl functionImpl) {
    return new IR();
  }
  
  protected IR _compileCommand(final VarsCommand varsCommand, final FunctionImpl functionImpl) {
    try {
      int _size = varsCommand.getVariables().getVariables().size();
      int _size_1 = varsCommand.getValues().getExpressions().size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        throw new Exception("Variables and values are not equal.");
      }
      IR e = new IR();
      ArrayList<Quad> variables = CollectionLiterals.<Quad>newArrayList();
      for (int i = 0; (i < varsCommand.getValues().getExpressions().size()); i++) {
        {
          final IR exp = this.compileExpression(varsCommand.getValues().getExpressions().get(i), functionImpl, "", "");
          e.getCode().addAll(exp.getCode());
          String _place = exp.getPlace();
          Quad _quad = new Quad("write", "", _place, "");
          e.getCode().add(_quad);
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected IR _compileExpression(final Expr expr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    return this.compileExpression(expr.getExpression(), functionImpl, labelTrue, labelFalse);
  }
  
  protected IR _compileExpression(final Exprs exprs, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    return new IR();
  }
  
  protected IR _compileExpression(final LExpr lExpr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    return new IR();
  }
  
  protected IR _compileExpression(final ExprAnd exprAnd, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    int _size = exprAnd.getExpressionsOr().size();
    boolean _equals = (_size == 1);
    if (_equals) {
      return this.compileExpression(exprAnd.getExpressionsOr().get(0), functionImpl, labelTrue, labelFalse);
    }
    IR e = new IR();
    EList<ExprOr> _expressionsOr = exprAnd.getExpressionsOr();
    for (final ExprOr exp : _expressionsOr) {
      {
        IR expComp = this.compileExpression(exp, functionImpl, labelTrue, labelFalse);
        e.getCode().addAll(expComp.getCode());
        String _place = expComp.getPlace();
        Quad _quad = new Quad(("iff " + labelFalse), "", _place, "");
        e.getCode().add(_quad);
      }
    }
    Quad _quad = new Quad(("goto " + labelTrue), "", "", "");
    e.getCode().add(_quad);
    return e;
  }
  
  protected IR _compileExpression(final ExprOr exprOr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    int _size = exprOr.getExpressionsNot().size();
    boolean _equals = (_size == 1);
    if (_equals) {
      IR e = this.compileExpression(exprOr.getExpressionsNot().get(0), functionImpl, labelTrue, labelFalse);
      String _place = e.getPlace();
      Quad _quad = new Quad(("ift " + labelTrue), "", _place, "");
      e.getCode().add(_quad);
      Quad _quad_1 = new Quad(("goto " + labelFalse), "", "", "");
      e.getCode().add(_quad_1);
      return e;
    }
    IR e_1 = new IR();
    e_1.setPlace(functionImpl.getEnv().newVariable(""));
    String labelIfTrue = functionImpl.getEnv().newLabel();
    String labelIfFalse = functionImpl.getEnv().newLabel();
    EList<ExprNot> _expressionsNot = exprOr.getExpressionsNot();
    for (final ExprNot exp : _expressionsNot) {
      {
        IR expComp = this.compileExpression(exp, functionImpl, labelTrue, labelFalse);
        e_1.getCode().addAll(expComp.getCode());
        String _place_1 = expComp.getPlace();
        Quad _quad_2 = new Quad(("ift " + labelIfTrue), "", _place_1, "");
        e_1.getCode().add(_quad_2);
      }
    }
    Quad _quad_2 = new Quad(("goto " + labelIfFalse), "", "", "");
    e_1.getCode().add(_quad_2);
    Quad _quad_3 = new Quad(("label " + labelIfTrue), "", "", "");
    e_1.getCode().add(_quad_3);
    String _place_1 = e_1.getPlace();
    Quad _quad_4 = new Quad("true", _place_1, "", "");
    e_1.getCode().add(_quad_4);
    Quad _quad_5 = new Quad(("goto " + labelTrue), "", "", "");
    e_1.getCode().add(_quad_5);
    Quad _quad_6 = new Quad(("label " + labelIfFalse), "", "", "");
    e_1.getCode().add(_quad_6);
    String _place_2 = e_1.getPlace();
    Quad _quad_7 = new Quad("false", _place_2, "", "");
    e_1.getCode().add(_quad_7);
    Quad _quad_8 = new Quad(("goto " + labelFalse), "", "", "");
    e_1.getCode().add(_quad_8);
    return e_1;
  }
  
  protected IR _compileExpression(final ExprNot exprNot, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    boolean _isNegation = exprNot.isNegation();
    if (_isNegation) {
      return this.compileExpression(exprNot.getExpressionEq(), functionImpl, labelFalse, labelTrue);
    } else {
      return this.compileExpression(exprNot.getExpressionEq(), functionImpl, labelTrue, labelFalse);
    }
  }
  
  protected IR _compileExpression(final ExprEq exprEq, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    IR e = new IR();
    IR e1 = this.compileExpression(exprEq.getExprL(), functionImpl, labelTrue, labelFalse);
    EObject _xifexpression = null;
    ExprSimple _exprRSimple = exprEq.getExprRSimple();
    boolean _tripleEquals = (_exprRSimple == null);
    if (_tripleEquals) {
      _xifexpression = exprEq.getExprRExpr();
    } else {
      _xifexpression = exprEq.getExprRSimple();
    }
    EObject exp2 = _xifexpression;
    IR e2 = this.compileExpression(exp2, functionImpl, labelTrue, labelFalse);
    String labelEnd = functionImpl.getEnv().newLabel();
    String labelEqual = functionImpl.getEnv().newLabel();
    e.getCode().addAll(e1.getCode());
    e.getCode().addAll(e2.getCode());
    e.setPlace(functionImpl.getEnv().newVariable(""));
    String _place = e1.getPlace();
    String _place_1 = e2.getPlace();
    Quad _quad = new Quad(("ifeq " + labelEqual), "", _place, _place_1);
    e.getCode().add(_quad);
    String _place_2 = e.getPlace();
    Quad _quad_1 = new Quad("false", _place_2, "", "");
    e.getCode().add(_quad_1);
    Quad _quad_2 = new Quad(("goto " + labelEnd), "", "", "");
    e.getCode().add(_quad_2);
    Quad _quad_3 = new Quad(("label " + labelEqual), "", "", "");
    e.getCode().add(_quad_3);
    String _place_3 = e.getPlace();
    Quad _quad_4 = new Quad("true", _place_3, "", "");
    e.getCode().add(_quad_4);
    Quad _quad_5 = new Quad(("label " + labelEnd), "", "", "");
    e.getCode().add(_quad_5);
    return e;
  }
  
  protected IR _compileExpression(final ExprSimple exprSimple, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    String _term = exprSimple.getTerm();
    boolean _tripleNotEquals = (_term != null);
    if (_tripleNotEquals) {
      IR e = new IR();
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
  
  protected IR _compileExpression(final ExprSimpleWithLExpr exprSimpleWithLExpr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    String _operation = exprSimpleWithLExpr.getOperation();
    boolean _equals = Objects.equal(_operation, "cons");
    if (_equals) {
      IR e = new IR();
      IR e1 = this.compileExpression(exprSimpleWithLExpr.getLexpr().getExpressions().get(0), functionImpl, labelTrue, labelFalse);
      IR e2 = this.compileExpression(exprSimpleWithLExpr.getLexpr().getExpressions().get(1), functionImpl, labelTrue, labelFalse);
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
        return new IR();
      }
    }
    return null;
  }
  
  protected IR _compileExpression(final ExprSimpleWithExpr exprSimpleWithExpr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    IR e = new IR();
    IR e1 = this.compileExpression(exprSimpleWithExpr.getExpr(), functionImpl, labelTrue, labelFalse);
    e.setPlace(functionImpl.getEnv().newVariable(""));
    e.getCode().addAll(e1.getCode());
    String _operation = exprSimpleWithExpr.getOperation();
    String _place = e.getPlace();
    String _place_1 = e1.getPlace();
    Quad _quad = new Quad(_operation, _place, _place_1, "");
    e.getCode().add(_quad);
    return e;
  }
  
  protected IR _compileExpression(final ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    return new IR();
  }
  
  public IR compileCommand(final Command forCommand, final FunctionImpl functionImpl) {
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
  
  public IR compileExpression(final EObject expr, final FunctionImpl functionImpl, final String labelTrue, final String labelFalse) {
    if (expr instanceof Expr) {
      return _compileExpression((Expr)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof ExprAnd) {
      return _compileExpression((ExprAnd)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof ExprEq) {
      return _compileExpression((ExprEq)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof ExprNot) {
      return _compileExpression((ExprNot)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof ExprOr) {
      return _compileExpression((ExprOr)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof ExprSimple) {
      return _compileExpression((ExprSimple)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof ExprSimpleWithExpr) {
      return _compileExpression((ExprSimpleWithExpr)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof ExprSimpleWithLExpr) {
      return _compileExpression((ExprSimpleWithLExpr)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof ExprSimpleWithSymbolLExpr) {
      return _compileExpression((ExprSimpleWithSymbolLExpr)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof Exprs) {
      return _compileExpression((Exprs)expr, functionImpl, labelTrue, labelFalse);
    } else if (expr instanceof LExpr) {
      return _compileExpression((LExpr)expr, functionImpl, labelTrue, labelFalse);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr, functionImpl, labelTrue, labelFalse).toString());
    }
  }
}
