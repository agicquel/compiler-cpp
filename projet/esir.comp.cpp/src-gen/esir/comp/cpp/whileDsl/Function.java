/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.Function#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.Function#getFunctionDefinition <em>Function Definition</em>}</li>
 * </ul>
 *
 * @see esir.comp.cpp.whileDsl.WhileDslPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject
{
  /**
   * Returns the value of the '<em><b>Function Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' attribute.
   * @see #setFunctionName(String)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getFunction_FunctionName()
   * @model
   * @generated
   */
  String getFunctionName();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.Function#getFunctionName <em>Function Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Name</em>' attribute.
   * @see #getFunctionName()
   * @generated
   */
  void setFunctionName(String value);

  /**
   * Returns the value of the '<em><b>Function Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Definition</em>' containment reference.
   * @see #setFunctionDefinition(Definition)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getFunction_FunctionDefinition()
   * @model containment="true"
   * @generated
   */
  Definition getFunctionDefinition();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.Function#getFunctionDefinition <em>Function Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Definition</em>' containment reference.
   * @see #getFunctionDefinition()
   * @generated
   */
  void setFunctionDefinition(Definition value);

} // Function
