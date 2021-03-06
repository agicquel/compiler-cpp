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
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class PrettyPrinterGenerator extends AbstractGenerator {
  private static final String INDENT_DEFAULT = "  ";
  
  @Accessors
  private PrettyPrinterGeneratorParameters parameters;
  
  @Accessors
  private String outputFile;
  
  public PrettyPrinterGenerator(final PrettyPrinterGeneratorParameters parameters, final String outputFile) {
    this.parameters = parameters;
    this.outputFile = outputFile;
  }
  
  public PrettyPrinterGenerator() {
    this(new PrettyPrinterGeneratorParameters(PrettyPrinterGenerator.INDENT_DEFAULT, PrettyPrinterGenerator.INDENT_DEFAULT, PrettyPrinterGenerator.INDENT_DEFAULT, PrettyPrinterGenerator.INDENT_DEFAULT, PrettyPrinterGenerator.INDENT_DEFAULT), 
      "output.whpp");
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String prettyCode = "";
    Iterable<Model> _filter = Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class);
    for (final Model m : _filter) {
      String _prettyCode = prettyCode;
      String _indent = this.indent(m);
      prettyCode = (_prettyCode + _indent);
    }
    fsa.generateFile(
      this.outputFile, prettyCode);
  }
  
  public String indent(final Model model) {
    String text = "";
    for (int i = 0; (i < model.getProgram().size()); i++) {
      {
        String _text = text;
        String _functionName = model.getProgram().get(i).getFunctionName();
        String _plus = ("function " + _functionName);
        String _plus_1 = (_plus + ":\n");
        text = (_text + _plus_1);
        String _text_1 = text;
        CharSequence _indent = this.indent(model.getProgram().get(i).getFunctionDefinition());
        text = (_text_1 + _indent);
        int _size = model.getProgram().size();
        boolean _lessThan = ((i + 1) < _size);
        if (_lessThan) {
          String _text_2 = text;
          text = (_text_2 + "\n");
        }
      }
    }
    return text;
  }
  
  public CharSequence indent(final Definition definition) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("read ");
    String _indentList = this.indentList(definition.getIntput().getVariables());
    _builder.append(_indentList);
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    String _addTabulation = this.addTabulation(this.indentCommands(definition.getBody().getCommands()), this.parameters.getIndentationFunction());
    _builder.append(_addTabulation);
    _builder.newLineIfNotEmpty();
    _builder.append("%");
    _builder.newLine();
    _builder.append("write ");
    String _indentList_1 = this.indentList(definition.getOutput().getVariables());
    _builder.append(_indentList_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String indentCommands(final EList<Command> commands) {
    String text = "";
    for (int i = 0; (i < commands.size()); i++) {
      {
        String _text = text;
        CharSequence _indentCommand = this.indentCommand(commands.get(i));
        text = (_text + _indentCommand);
        int _size = commands.size();
        boolean _lessThan = ((i + 1) < _size);
        if (_lessThan) {
          String _text_1 = text;
          text = (_text_1 + " ;");
        }
        String _text_2 = text;
        text = (_text_2 + "\n");
      }
    }
    return text;
  }
  
  protected CharSequence _indentCommand(final WhileCommand whileCommand) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("while ");
    CharSequence _indentExpression = this.indentExpression(whileCommand.getCond());
    _builder.append(_indentExpression);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    String _addTabulation = this.addTabulation(this.indentCommands(whileCommand.getBody().getCommands()), this.parameters.getIndentationWhile());
    _builder.append(_addTabulation);
    _builder.newLineIfNotEmpty();
    _builder.append("od");
    return _builder;
  }
  
  protected CharSequence _indentCommand(final NopCommand nopCommand) {
    return "nop";
  }
  
  protected CharSequence _indentCommand(final ForCommand forCommand) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("for ");
    CharSequence _indentExpression = this.indentExpression(forCommand.getCond());
    _builder.append(_indentExpression);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    String _addTabulation = this.addTabulation(this.indentCommands(forCommand.getBody().getCommands()), this.parameters.getIndentationFor());
    _builder.append(_addTabulation);
    _builder.newLineIfNotEmpty();
    _builder.append("od");
    return _builder;
  }
  
  protected CharSequence _indentCommand(final IfCommand ifCommand) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ");
    CharSequence _indentExpression = this.indentExpression(ifCommand.getCond());
    _builder.append(_indentExpression);
    _builder.append(" then");
    _builder.newLineIfNotEmpty();
    String _addTabulation = this.addTabulation(this.indentCommands(ifCommand.getThenBody().getCommands()), this.parameters.getIndentationIf());
    _builder.append(_addTabulation);
    _builder.newLineIfNotEmpty();
    {
      int _size = ifCommand.getElseBody().getCommands().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("else");
        _builder.newLine();
        String _addTabulation_1 = this.addTabulation(this.indentCommands(ifCommand.getElseBody().getCommands()), this.parameters.getIndentationIf());
        _builder.append(_addTabulation_1);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("fi");
    return _builder;
  }
  
  protected CharSequence _indentCommand(final ForeachCommand foreachCommand) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("foreach ");
    String _expElement = foreachCommand.getExpElement();
    _builder.append(_expElement);
    _builder.append(" in ");
    CharSequence _indentExpression = this.indentExpression(foreachCommand.getExpList());
    _builder.append(_indentExpression);
    _builder.append(" do");
    _builder.newLineIfNotEmpty();
    String _addTabulation = this.addTabulation(this.indentCommands(foreachCommand.getBody().getCommands()), this.parameters.getIndentationForEach());
    _builder.append(_addTabulation);
    _builder.newLineIfNotEmpty();
    _builder.append("od");
    return _builder;
  }
  
  protected CharSequence _indentCommand(final VarsCommand varsCommand) {
    StringConcatenation _builder = new StringConcatenation();
    String _indentList = this.indentList(varsCommand.getVariables().getVariables());
    _builder.append(_indentList);
    _builder.append(" := ");
    CharSequence _indentExpression = this.indentExpression(varsCommand.getValues());
    _builder.append(_indentExpression);
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
    String text = "";
    Expr _expr = exprEq.getExpr();
    boolean _tripleNotEquals = (_expr != null);
    if (_tripleNotEquals) {
      String _text = text;
      CharSequence _indentExpression = this.indentExpression(exprEq.getExpr());
      String _plus = ("(" + _indentExpression);
      String _plus_1 = (_plus + ")");
      text = (_text + _plus_1);
    } else {
      if (((exprEq.getExprLSimple() != null) && (exprEq.getExprRSimple() != null))) {
        String _text_1 = text;
        CharSequence _indentExpression_1 = this.indentExpression(exprEq.getExprLSimple());
        String _plus_2 = (_indentExpression_1 + " =? ");
        text = (_text_1 + _plus_2);
        String _text_2 = text;
        CharSequence _indentExpression_2 = this.indentExpression(exprEq.getExprRSimple());
        text = (_text_2 + _indentExpression_2);
      } else {
        if (((exprEq.getExprLSimple() != null) && (exprEq.getExprRSimple() == null))) {
          String _text_3 = text;
          CharSequence _indentExpression_3 = this.indentExpression(exprEq.getExprLSimple());
          text = (_text_3 + _indentExpression_3);
        }
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
    String _plus = ("(" + _operation);
    String _plus_1 = (_plus + " ");
    CharSequence _indentExpression = this.indentExpression(exprSimpleWithLExpr.getLexpr());
    String _plus_2 = (_plus_1 + _indentExpression);
    return (_plus_2 + ")");
  }
  
  protected CharSequence _indentExpression(final ExprSimpleWithExpr exprSimpleWithExpr) {
    String _operation = exprSimpleWithExpr.getOperation();
    String _plus = ("(" + _operation);
    String _plus_1 = (_plus + " ");
    CharSequence _indentExpression = this.indentExpression(exprSimpleWithExpr.getExpr());
    String _plus_2 = (_plus_1 + _indentExpression);
    return (_plus_2 + ")");
  }
  
  protected CharSequence _indentExpression(final ExprSimpleWithSymbolLExpr exprSimpleWithSymbolLExpr) {
    String _symbol = exprSimpleWithSymbolLExpr.getSymbol();
    String _plus = ("(" + _symbol);
    String _xifexpression = null;
    int _size = exprSimpleWithSymbolLExpr.getLexpr().getExpressions().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      _xifexpression = " ";
    } else {
      _xifexpression = "";
    }
    String _plus_1 = (_plus + _xifexpression);
    CharSequence _indentExpression = this.indentExpression(exprSimpleWithSymbolLExpr.getLexpr());
    String _plus_2 = (_plus_1 + _indentExpression);
    return (_plus_2 + ")");
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
  
  @Pure
  public PrettyPrinterGeneratorParameters getParameters() {
    return this.parameters;
  }
  
  public void setParameters(final PrettyPrinterGeneratorParameters parameters) {
    this.parameters = parameters;
  }
  
  @Pure
  public String getOutputFile() {
    return this.outputFile;
  }
  
  public void setOutputFile(final String outputFile) {
    this.outputFile = outputFile;
  }
}
