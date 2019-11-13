/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.Definition#getIntput <em>Intput</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.Definition#getBody <em>Body</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.Definition#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see esir.comp.cpp.whileDsl.WhileDslPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Intput</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intput</em>' attribute.
   * @see #setIntput(String)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getDefinition_Intput()
   * @model
   * @generated
   */
  String getIntput();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.Definition#getIntput <em>Intput</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intput</em>' attribute.
   * @see #getIntput()
   * @generated
   */
  void setIntput(String value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Commands)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getDefinition_Body()
   * @model containment="true"
   * @generated
   */
  Commands getBody();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.Definition#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Commands value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' attribute.
   * @see #setOutput(String)
   * @see esir.comp.cpp.whileDsl.WhileDslPackage#getDefinition_Output()
   * @model
   * @generated
   */
  String getOutput();

  /**
   * Sets the value of the '{@link esir.comp.cpp.whileDsl.Definition#getOutput <em>Output</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' attribute.
   * @see #getOutput()
   * @generated
   */
  void setOutput(String value);

} // Definition
