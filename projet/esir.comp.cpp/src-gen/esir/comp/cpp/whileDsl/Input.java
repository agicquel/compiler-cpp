/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.Input#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see esir.comp.cpp.whileDsl.WhileDslPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' attribute list.
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getInput_Variables()
   * @model unique="false"
   * @generated
   */
  EList<String> getVariables();

} // Input