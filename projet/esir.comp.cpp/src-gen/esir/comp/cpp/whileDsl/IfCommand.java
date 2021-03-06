/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.IfCommand#getCond <em>Cond</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.IfCommand#getThenBody <em>Then Body</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.IfCommand#getElseBody <em>Else Body</em>}</li>
 * </ul>
 *
 * @see esir.comp.cpp.whileDsl.WhileDslPackage#getIfCommand()
 * @model
 * @generated
 */
public interface IfCommand extends Command
{
  /**
   * Returns the value of the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' containment reference.
   * @see #setCond(Expr)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getIfCommand_Cond()
   * @model containment="true"
   * @generated
   */
  Expr getCond();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.IfCommand#getCond <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' containment reference.
   * @see #getCond()
   * @generated
   */
  void setCond(Expr value);

  /**
   * Returns the value of the '<em><b>Then Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Body</em>' containment reference.
   * @see #setThenBody(Commands)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getIfCommand_ThenBody()
   * @model containment="true"
   * @generated
   */
  Commands getThenBody();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.IfCommand#getThenBody <em>Then Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Body</em>' containment reference.
   * @see #getThenBody()
   * @generated
   */
  void setThenBody(Commands value);

  /**
   * Returns the value of the '<em><b>Else Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Body</em>' containment reference.
   * @see #setElseBody(Commands)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getIfCommand_ElseBody()
   * @model containment="true"
   * @generated
   */
  Commands getElseBody();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.IfCommand#getElseBody <em>Else Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Body</em>' containment reference.
   * @see #getElseBody()
   * @generated
   */
  void setElseBody(Commands value);

} // IfCommand
