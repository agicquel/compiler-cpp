/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl.util;

import esir.comp.cpp.whileDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see esir.comp.cpp.whileDsl.WhileDslPackage
 * @generated
 */
public class WhileDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WhileDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WhileDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhileDslSwitch<Adapter> modelSwitch =
    new WhileDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseInput(Input object)
      {
        return createInputAdapter();
      }
      @Override
      public Adapter caseOutput(Output object)
      {
        return createOutputAdapter();
      }
      @Override
      public Adapter caseCommands(Commands object)
      {
        return createCommandsAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseWhileCommand(WhileCommand object)
      {
        return createWhileCommandAdapter();
      }
      @Override
      public Adapter caseForCommand(ForCommand object)
      {
        return createForCommandAdapter();
      }
      @Override
      public Adapter caseIfCommand(IfCommand object)
      {
        return createIfCommandAdapter();
      }
      @Override
      public Adapter caseForeachCommand(ForeachCommand object)
      {
        return createForeachCommandAdapter();
      }
      @Override
      public Adapter caseVarsCommand(VarsCommand object)
      {
        return createVarsCommandAdapter();
      }
      @Override
      public Adapter caseVars(Vars object)
      {
        return createVarsAdapter();
      }
      @Override
      public Adapter caseExprSimple(ExprSimple object)
      {
        return createExprSimpleAdapter();
      }
      @Override
      public Adapter caseExprSimpleWithLExpr(ExprSimpleWithLExpr object)
      {
        return createExprSimpleWithLExprAdapter();
      }
      @Override
      public Adapter caseExprSimpleWithExpr(ExprSimpleWithExpr object)
      {
        return createExprSimpleWithExprAdapter();
      }
      @Override
      public Adapter caseExprSimpleWithSymbolLExpr(ExprSimpleWithSymbolLExpr object)
      {
        return createExprSimpleWithSymbolLExprAdapter();
      }
      @Override
      public Adapter caseLExpr(LExpr object)
      {
        return createLExprAdapter();
      }
      @Override
      public Adapter caseExprs(Exprs object)
      {
        return createExprsAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseExprAnd(ExprAnd object)
      {
        return createExprAndAdapter();
      }
      @Override
      public Adapter caseExprOr(ExprOr object)
      {
        return createExprOrAdapter();
      }
      @Override
      public Adapter caseExprNot(ExprNot object)
      {
        return createExprNotAdapter();
      }
      @Override
      public Adapter caseExprEq(ExprEq object)
      {
        return createExprEqAdapter();
      }
      @Override
      public Adapter caseNopCommand(NopCommand object)
      {
        return createNopCommandAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Input
   * @generated
   */
  public Adapter createInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Output
   * @generated
   */
  public Adapter createOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Commands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Commands
   * @generated
   */
  public Adapter createCommandsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.WhileCommand <em>While Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.WhileCommand
   * @generated
   */
  public Adapter createWhileCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ForCommand <em>For Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ForCommand
   * @generated
   */
  public Adapter createForCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.IfCommand <em>If Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.IfCommand
   * @generated
   */
  public Adapter createIfCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ForeachCommand <em>Foreach Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ForeachCommand
   * @generated
   */
  public Adapter createForeachCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.VarsCommand <em>Vars Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.VarsCommand
   * @generated
   */
  public Adapter createVarsCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Vars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Vars
   * @generated
   */
  public Adapter createVarsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ExprSimple <em>Expr Simple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ExprSimple
   * @generated
   */
  public Adapter createExprSimpleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ExprSimpleWithLExpr <em>Expr Simple With LExpr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ExprSimpleWithLExpr
   * @generated
   */
  public Adapter createExprSimpleWithLExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ExprSimpleWithExpr <em>Expr Simple With Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ExprSimpleWithExpr
   * @generated
   */
  public Adapter createExprSimpleWithExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ExprSimpleWithSymbolLExpr <em>Expr Simple With Symbol LExpr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ExprSimpleWithSymbolLExpr
   * @generated
   */
  public Adapter createExprSimpleWithSymbolLExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.LExpr <em>LExpr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.LExpr
   * @generated
   */
  public Adapter createLExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Exprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Exprs
   * @generated
   */
  public Adapter createExprsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ExprAnd <em>Expr And</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ExprAnd
   * @generated
   */
  public Adapter createExprAndAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ExprOr <em>Expr Or</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ExprOr
   * @generated
   */
  public Adapter createExprOrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ExprNot <em>Expr Not</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ExprNot
   * @generated
   */
  public Adapter createExprNotAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.ExprEq <em>Expr Eq</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.ExprEq
   * @generated
   */
  public Adapter createExprEqAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link esir.comp.cpp.whileDsl.NopCommand <em>Nop Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see esir.comp.cpp.whileDsl.NopCommand
   * @generated
   */
  public Adapter createNopCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //WhileDslAdapterFactory
