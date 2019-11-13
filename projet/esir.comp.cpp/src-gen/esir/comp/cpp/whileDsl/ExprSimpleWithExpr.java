/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Simple With Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.ExprSimpleWithExpr#getOperation <em>Operation</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.ExprSimpleWithExpr#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see esir.comp.cpp.whileDsl.WhileDslPackage#getExprSimpleWithExpr()
 * @model
 * @generated
 */
public interface ExprSimpleWithExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' attribute.
   * @see #setOperation(String)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getExprSimpleWithExpr_Operation()
   * @model
   * @generated
   */
  String getOperation();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.ExprSimpleWithExpr#getOperation <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation</em>' attribute.
   * @see #getOperation()
   * @generated
   */
  void setOperation(String value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(Expr)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getExprSimpleWithExpr_Expr()
   * @model containment="true"
   * @generated
   */
  Expr getExpr();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.ExprSimpleWithExpr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(Expr value);

} // ExprSimpleWithExpr
