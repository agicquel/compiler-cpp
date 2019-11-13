/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vars Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.VarsCommand#getVariables <em>Variables</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.VarsCommand#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see esir.comp.cpp.whileDsl.WhileDslPackage#getVarsCommand()
 * @model
 * @generated
 */
public interface VarsCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference.
   * @see #setVariables(Vars)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getVarsCommand_Variables()
   * @model containment="true"
   * @generated
   */
  Vars getVariables();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.VarsCommand#getVariables <em>Variables</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variables</em>' containment reference.
   * @see #getVariables()
   * @generated
   */
  void setVariables(Vars value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference.
   * @see #setValues(Exprs)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getVarsCommand_Values()
   * @model containment="true"
   * @generated
   */
  Exprs getValues();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.VarsCommand#getValues <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Values</em>' containment reference.
   * @see #getValues()
   * @generated
   */
  void setValues(Exprs value);

} // VarsCommand
