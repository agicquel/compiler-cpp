/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl.impl;

import esir.comp.cpp.whileDsl.Command;
import esir.comp.cpp.whileDsl.Commands;
import esir.comp.cpp.whileDsl.Definition;
import esir.comp.cpp.whileDsl.ForCommand;
import esir.comp.cpp.whileDsl.ForeachCommand;
import esir.comp.cpp.whileDsl.Function;
import esir.comp.cpp.whileDsl.IfCommand;
import esir.comp.cpp.whileDsl.Model;
import esir.comp.cpp.whileDsl.NopCommand;
import esir.comp.cpp.whileDsl.VarsCommand;
import esir.comp.cpp.whileDsl.WhileCommand;
import esir.comp.cpp.whileDsl.WhileDslFactory;
import esir.comp.cpp.whileDsl.WhileDslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileDslPackageImpl extends EPackageImpl implements WhileDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whileCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreachCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varsCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nopCommandEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WhileDslPackageImpl()
  {
    super(eNS_URI, WhileDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link WhileDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WhileDslPackage init()
  {
    if (isInited) return (WhileDslPackage)EPackage.Registry.INSTANCE.getEPackage(WhileDslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredWhileDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    WhileDslPackageImpl theWhileDslPackage = registeredWhileDslPackage instanceof WhileDslPackageImpl ? (WhileDslPackageImpl)registeredWhileDslPackage : new WhileDslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theWhileDslPackage.createPackageContents();

    // Initialize created meta-data
    theWhileDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWhileDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WhileDslPackage.eNS_URI, theWhileDslPackage);
    return theWhileDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Program()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFunction_FunctionName()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFunction_FunctionDefinition()
  {
    return (EReference)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefinition_Intput()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDefinition_Body()
  {
    return (EReference)definitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefinition_Output()
  {
    return (EAttribute)definitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCommands()
  {
    return commandsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCommands_Commands()
  {
    return (EReference)commandsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCommand()
  {
    return commandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getWhileCommand()
  {
    return whileCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getWhileCommand_Cond()
  {
    return (EAttribute)whileCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getWhileCommand_Body()
  {
    return (EReference)whileCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getForCommand()
  {
    return forCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getForCommand_Cond()
  {
    return (EAttribute)forCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForCommand_Body()
  {
    return (EReference)forCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIfCommand()
  {
    return ifCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIfCommand_Cond()
  {
    return (EAttribute)ifCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIfCommand_ThenBody()
  {
    return (EReference)ifCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIfCommand_ElseBody()
  {
    return (EReference)ifCommandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getForeachCommand()
  {
    return foreachCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getForeachCommand_ExpElement()
  {
    return (EAttribute)foreachCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getForeachCommand_ExpList()
  {
    return (EAttribute)foreachCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getForeachCommand_Body()
  {
    return (EReference)foreachCommandEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getVarsCommand()
  {
    return varsCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVarsCommand_Variables()
  {
    return (EAttribute)varsCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getVarsCommand_Values()
  {
    return (EAttribute)varsCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNopCommand()
  {
    return nopCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhileDslFactory getWhileDslFactory()
  {
    return (WhileDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PROGRAM);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__FUNCTION_NAME);
    createEReference(functionEClass, FUNCTION__FUNCTION_DEFINITION);

    definitionEClass = createEClass(DEFINITION);
    createEAttribute(definitionEClass, DEFINITION__INTPUT);
    createEReference(definitionEClass, DEFINITION__BODY);
    createEAttribute(definitionEClass, DEFINITION__OUTPUT);

    commandsEClass = createEClass(COMMANDS);
    createEReference(commandsEClass, COMMANDS__COMMANDS);

    commandEClass = createEClass(COMMAND);

    whileCommandEClass = createEClass(WHILE_COMMAND);
    createEAttribute(whileCommandEClass, WHILE_COMMAND__COND);
    createEReference(whileCommandEClass, WHILE_COMMAND__BODY);

    forCommandEClass = createEClass(FOR_COMMAND);
    createEAttribute(forCommandEClass, FOR_COMMAND__COND);
    createEReference(forCommandEClass, FOR_COMMAND__BODY);

    ifCommandEClass = createEClass(IF_COMMAND);
    createEAttribute(ifCommandEClass, IF_COMMAND__COND);
    createEReference(ifCommandEClass, IF_COMMAND__THEN_BODY);
    createEReference(ifCommandEClass, IF_COMMAND__ELSE_BODY);

    foreachCommandEClass = createEClass(FOREACH_COMMAND);
    createEAttribute(foreachCommandEClass, FOREACH_COMMAND__EXP_ELEMENT);
    createEAttribute(foreachCommandEClass, FOREACH_COMMAND__EXP_LIST);
    createEReference(foreachCommandEClass, FOREACH_COMMAND__BODY);

    varsCommandEClass = createEClass(VARS_COMMAND);
    createEAttribute(varsCommandEClass, VARS_COMMAND__VARIABLES);
    createEAttribute(varsCommandEClass, VARS_COMMAND__VALUES);

    nopCommandEClass = createEClass(NOP_COMMAND);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    whileCommandEClass.getESuperTypes().add(this.getCommand());
    forCommandEClass.getESuperTypes().add(this.getCommand());
    ifCommandEClass.getESuperTypes().add(this.getCommand());
    foreachCommandEClass.getESuperTypes().add(this.getCommand());
    varsCommandEClass.getESuperTypes().add(this.getCommand());
    nopCommandEClass.getESuperTypes().add(this.getCommand());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Program(), this.getFunction(), null, "program", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_FunctionName(), ecorePackage.getEString(), "functionName", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunction_FunctionDefinition(), this.getDefinition(), null, "functionDefinition", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefinition_Intput(), ecorePackage.getEString(), "intput", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefinition_Body(), this.getCommands(), null, "body", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefinition_Output(), ecorePackage.getEString(), "output", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandsEClass, Commands.class, "Commands", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCommands_Commands(), this.getCommand(), null, "commands", null, 0, -1, Commands.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(whileCommandEClass, WhileCommand.class, "WhileCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWhileCommand_Cond(), ecorePackage.getEString(), "cond", null, 0, 1, WhileCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhileCommand_Body(), this.getCommands(), null, "body", null, 0, 1, WhileCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forCommandEClass, ForCommand.class, "ForCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForCommand_Cond(), ecorePackage.getEString(), "cond", null, 0, 1, ForCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForCommand_Body(), this.getCommands(), null, "body", null, 0, 1, ForCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifCommandEClass, IfCommand.class, "IfCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIfCommand_Cond(), ecorePackage.getEString(), "cond", null, 0, 1, IfCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfCommand_ThenBody(), this.getCommands(), null, "thenBody", null, 0, 1, IfCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfCommand_ElseBody(), this.getCommands(), null, "elseBody", null, 0, 1, IfCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreachCommandEClass, ForeachCommand.class, "ForeachCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForeachCommand_ExpElement(), ecorePackage.getEString(), "expElement", null, 0, 1, ForeachCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getForeachCommand_ExpList(), ecorePackage.getEString(), "expList", null, 0, 1, ForeachCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForeachCommand_Body(), this.getCommands(), null, "body", null, 0, 1, ForeachCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varsCommandEClass, VarsCommand.class, "VarsCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVarsCommand_Variables(), ecorePackage.getEString(), "variables", null, 0, 1, VarsCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarsCommand_Values(), ecorePackage.getEString(), "values", null, 0, 1, VarsCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nopCommandEClass, NopCommand.class, "NopCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //WhileDslPackageImpl
