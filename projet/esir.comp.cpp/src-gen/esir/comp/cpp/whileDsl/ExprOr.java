/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expr Or</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.ExprOr#getExpressionsNot <em>Expressions Not</em>}</li>
 * </ul>
 *
 * @see esir.comp.cpp.whileDsl.WhileDslPackage#getExprOr()
 * @model
 * @generated
 */
public interface ExprOr extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions Not</b></em>' containment reference list.
   * The list contents are of type {@link esir.comp.cpp.whileDsl.ExprNot}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions Not</em>' containment reference list.
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getExprOr_ExpressionsNot()
   * @model containment="true"
   * @generated
   */
  EList<ExprNot> getExpressionsNot();

} // ExprOr
