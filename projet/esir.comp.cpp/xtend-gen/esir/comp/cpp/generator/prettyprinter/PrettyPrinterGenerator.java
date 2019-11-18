package esir.comp.cpp.generator.prettyprinter;

import com.google.common.collect.Iterables;
import esir.comp.cpp.generator.prettyprinter.PrettyPrinterGeneratorParameters;
import esir.comp.cpp.whileDsl.Command;
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
import esir.comp.cpp.whileDsl.Model;
import esir.comp.cpp.whileDsl.NopCommand;
import esir.comp.cpp.whileDsl.VarsCommand;
import esir.comp.cpp.whileDsl.WhileCommand;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class PrettyPrinterGenerator extends AbstractGenerator {
  private PrettyPrinterGeneratorParameters parameters;
  
  private static String INDENT_DEFAULT = "\t";
  
  public PrettyPrinterGenerator(final PrettyPrinterGeneratorParameters parameters) {
    this.parameters = parameters;
  }
  
  public PrettyPrinterGenerator() {
    this(new PrettyPrinterGeneratorParameters(PrettyPrinterGenerator.INDENT_DEFAULT, PrettyPrinterGenerator.INDENT_DEFAULT, PrettyPrinterGenerator.INDENT_DEFAULT, PrettyPrinterGenerator.INDENT_DEFAULT));
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String test = "";
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model m : _filter) {
      String _test = test;
      CharSequence _indent = this.indent(m);
      test = (_test + _indent);
    }
    fsa.generateFile(
      "test-pp.wh", test);
  }
  
  public CharSequence indent(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Function> _program = model.getProgram();
      for(final Function function : _program) {
        _builder.append("function ");
        String _functionName = function.getFunctionName();
        _builder.append(_functionName);
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        CharSequence _indent = this.indent(function.getFunctionDefinition());
        String _plus = (_indent + "\n");
        _builder.append(_plus);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence indent(final Definition definition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("read ");
    String _indentList = this.indentList(definition.getIntput().getVariables());
    _builder.append(_indentList);
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    {
      EList<Command> _commands = definition.getBody().getCommands();
      for(final Command command : _commands) {
        String _addTabulation = this.addTabulation(this.indentCommand(command), PrettyPrinterGenerator.INDENT_DEFAULT);
        _builder.append(_addTabulation);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("%");
    _builder.newLine();
    _builder.append("write ");
    String _indentList_1 = this.indentList(definition.getOutput().getVariables());
    _builder.append(_indentList_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _indentCommand(final WhileCommand whileCommand) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while ");
    CharSequence _indentExpression = this.indentExpression(whileCommand.getCond());
    _builder.append(_indentExpression);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = whileCommand.getBody().getCommands();
      for(final Command command : _commands) {
        String _addTabulation = this.addTabulation(this.indentCommand(command), this.parameters.getIndentationWhile());
        _builder.append(_addTabulation);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("od;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _indentCommand(final NopCommand nopCommand) {
    return "nop;";
  }
  
  protected CharSequence _indentCommand(final ForCommand forCommand) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for ");
    CharSequence _indentExpression = this.indentExpression(forCommand.getCond());
    _builder.append(_indentExpression);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = forCommand.getBody().getCommands();
      for(final Command command : _commands) {
        String _addTabulation = this.addTabulation(this.indentCommand(command), this.parameters.getIndentationFor());
        _builder.append(_addTabulation);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("od;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _indentCommand(final IfCommand ifCommand) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ");
    CharSequence _indentExpression = this.indentExpression(ifCommand.getCond());
    _builder.append(_indentExpression);
    _builder.append(" then");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = ifCommand.getThenBody().getCommands();
      for(final Command command : _commands) {
        String _addTabulation = this.addTabulation(this.indentCommand(command), this.parameters.getIndentationIf());
        _builder.append(_addTabulation);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      int _size = ifCommand.getElseBody().getCommands().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("else");
        _builder.newLine();
        {
          EList<Command> _commands_1 = ifCommand.getElseBody().getCommands();
          for(final Command command_1 : _commands_1) {
            String _addTabulation_1 = this.addTabulation(this.indentCommand(command_1), this.parameters.getIndentationIf());
            _builder.append(_addTabulation_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("fi;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _indentCommand(final ForeachCommand foreachCommand) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("foreach ");
    CharSequence _indentExpression = this.indentExpression(foreachCommand.getExpElement());
    _builder.append(_indentExpression);
    _builder.append(" in ");
    CharSequence _indentExpression_1 = this.indentExpression(foreachCommand.getExpList());
    _builder.append(_indentExpression_1);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    {
      EList<Command> _commands = foreachCommand.getBody().getCommands();
      for(final Command command : _commands) {
        String _addTabulation = this.addTabulation(this.indentCommand(command), this.parameters.getIndentationForEach());
        _builder.append(_addTabulation);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("od;");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _indentCommand(final VarsCommand varsCommand) {
    StringConcatenation _builder = new StringConcatenation();
    String _indentList = this.indentList(varsCommand.getVariables().getVariables());
    _builder.append(_indentList);
    _builder.append(" := ");
    CharSequence _indentExpression = this.indentExpression(varsCommand.getValues());
    _builder.append(_indentExpression);
    _builder.append(" ;");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _indentExpression(final Expr expr) {
    return this.indentExpression(expr.getExpression());
  }
  
  protected CharSequence _indentExpression(final Exprs exprs) {
    String text = "";
    for (int i = 0; (i < exprs.getExpressions().size()); i++) {
      {
        String _text = text;
        CharSequence _indentExpression = this.indentExpression(exprs.getExpressions().get(i));
        text = (_text + _indentExpression);
        int _size = exprs.getExpressions().size();
        boolean _lessThan = ((i + 1) < _size);
        if (_lessThan) {
          String _text_1 = text;
          text = (_text_1 + ",");
        }
      }
    }
    return text;
  }
  
  protected CharSequence _indentExpression(final LExpr lExpr) {
    String text = "";
    for (int i = 0; (i < lExpr.getExpressions().size()); i++) {
      {
        String _text = text;
        CharSequence _indentExpression = this.indentExpression(lExpr.getExpressions().get(i));
        text = (_text + _indentExpression);
        int _size = lExpr.getExpressions().size();
        boolean _lessThan = ((i + 1) < _size);
        if (_lessThan) {
          String _text_1 = text;
          text = (_text_1 + " ");
        }
      }
    }
    return text;
  }
  
  protected CharSequence _indentExpression(final ExprAnd exprAnd) {
    String text = "";
    for (int i = 0; (i < exprAnd.getExpressionsOr().size()); i++) {
      {
        String _text = text;
        CharSequence _indentExpression = this.indentExpression(exprAnd.getExpressionsOr().get(i));
        text = (_text + _indentExpression);
        int _size = exprAnd.getExpressionsOr().size();
        boolean _lessThan = ((i + 1) < _size);
        if (_lessThan) {
          String _text_1 = text;
          text = (_text_1 + " and ");
        }
      }
    }
    return text;
  }
  
  protected CharSequence _indentExpression(final ExprOr exprOr) {
    String text = "";
    for (int i = 0; (i < exprOr.getExpressionsNot().size()); i++) {
      {
        String _text = text;
        CharSequence _indentExpression = this.indentExpression(exprOr.getExpressionsNot().get(i));
        text = (_text + _indentExpression);
        int _size = exprOr.getExpressionsNot().size();
        boolean _lessThan = ((i + 1) < _size);
        if (_lessThan) {
          String _text_1 = text;
          text = (_text_1 + " or ");
        }
      }
    }
    return text;
  }
  
  protected CharSequence _indentExpression(final ExprNot exprNot) {
    String text = "";
    boolean _isNegation = exprNot.isNegation();
    if (_isNegation) {
      String _text = text;
      text = (_text + "not ");
    }
    String _text_1 = text;
    CharSequence _indentExpression = this.indentExpression(exprNot.getExpressionEq());
    text = (_text_1 + _indentExpression);
    return text;
  }
  
  protected CharSequence _indentExpression(final ExprEq exprEq) {
    CharSequence _indentExpression = this.indentExpression(exprEq.getExprL());
    String text = (_indentExpression + " =? ");
    ExprSimple _exprRSimple = exprEq.getExprRSimple();
    boolean _tripleNotEquals = (_exprRSimple != null);
    if (_tripleNotEquals) {
      String _text = text;
      CharSequence _indentExpression_1 = this.indentExpression(exprEq.getExprRSimple());
      text = (_text + _indentExpression_1);
    } else {
      Expr _exprRExpr = exprEq.getExprRExpr();
      boolean _tripleNotEquals_1 = (_exprRExpr != null);
      if (_tripleNotEquals_1) {
        String _text_1 = text;
        CharSequence _indentExpression_2 = this.indentExpression(exprEq.getExprRSimple());
        String _plus = ("( " + _indentExpression_2);
        String _plus_1 = (_plus + " )");
        text = (_text_1 + _plus_1);
      }
    }
    return text;
  }
  
  protected CharSequence _indentExpression(final ExprSimple exprSimple) {
    String _term = exprSimple.getTerm();
    boolean _tripleNotEquals = (_term != null);
    if (_tripleNotEquals) {
      return exprSimple.getTerm();
    } else {
      return this.indentExpression(exprSimple.getExpression());
    }
  }
  
  protected CharSequence _indentExpression(final ExprSimpleWithLExpr exprSimpleWithLExpr) {
    String _operation = exprSimpleWithLExpr.getOperation();
    String _plus = ("( " + _operation);
    String _plus_1 = (_plus + " ");
    CharSequence _indentExpression = this.indentExpression(exprSimpleWithLExpr.getLexpr());
    String _plus_2 = (_plus_1 + _indentExpression);
    return (_plus_2 + " )");
  }
  
  protected CharSequence _indentExpression(final ExprSimpleWithExpr exprSimpleWithExpr) {
    String _operation = exprSimpleWithExpr.getOperation();
    String _plus = ("( " + _operation);
    String _plus_1 = (_plus + " ");
    CharSequence _indentExpression = this.indentExpression(exprSimpleWithExpr.getExpr());
    String _plus_2 = (_plus_1 + _indentExpression);
    return (_plus_2 + " )");
  }
  
  protected CharSequence _indentExpression(final ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr) {
    CharSequence _indentExpression = this.indentExpression(exprSimpleWithSymbolLExpr.getLexpr());
    String _plus = ("( " + _indentExpression);
    return (_plus + " )");
  }
  
  public String addTabulation(final CharSequence charSequence, final String tab) {
    String text = "";
    String[] _split = charSequence.toString().split(System.getProperty("line.separator"));
    for (final String s : _split) {
      String _text = text;
      text = (_text + ((tab + s) + "\n"));
    }
    return text;
  }
  
  public String indentList(final EList<String> list) {
    String text = "";
    for (final String s : list) {
      String _text = text;
      text = (_text + (s + ","));
    }
    int _length = text.length();
    int _minus = (_length - 1);
    text = text.substring(0, _minus);
    return text;
  }
  
  public CharSequence indentCommand(final Command forCommand) {
    if (forCommand instanceof ForCommand) {
      return _indentCommand((ForCommand)forCommand);
    } else if (forCommand instanceof ForeachCommand) {
      return _indentCommand((ForeachCommand)forCommand);
    } else if (forCommand instanceof IfCommand) {
      return _indentCommand((IfCommand)forCommand);
    } else if (forCommand instanceof NopCommand) {
      return _indentCommand((NopCommand)forCommand);
    } else if (forCommand instanceof VarsCommand) {
      return _indentCommand((VarsCommand)forCommand);
    } else if (forCommand instanceof WhileCommand) {
      return _indentCommand((WhileCommand)forCommand);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(forCommand).toString());
    }
  }
  
  public CharSequence indentExpression(final EObject expr) {
    if (expr instanceof Expr) {
      return _indentExpression((Expr)expr);
    } else if (expr instanceof ExprAnd) {
      return _indentExpression((ExprAnd)expr);
    } else if (expr instanceof ExprEq) {
      return _indentExpression((ExprEq)expr);
    } else if (expr instanceof ExprNot) {
      return _indentExpression((ExprNot)expr);
    } else if (expr instanceof ExprOr) {
      return _indentExpression((ExprOr)expr);
    } else if (expr instanceof ExprSimple) {
      return _indentExpression((ExprSimple)expr);
    } else if (expr instanceof ExprSimpleWithExpr) {
      return _indentExpression((ExprSimpleWithExpr)expr);
    } else if (expr instanceof ExprSimpleWithLExpr) {
      return _indentExpression((ExprSimpleWithLExpr)expr);
    } else if (expr instanceof ExprSimpleWithSymbolLExpr) {
      return _indentExpression((ExprSimpleWithSymbolLExpr)expr);
    } else if (expr instanceof Exprs) {
      return _indentExpression((Exprs)expr);
    } else if (expr instanceof LExpr) {
      return _indentExpression((LExpr)expr);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(expr).toString());
    }
  }
}
