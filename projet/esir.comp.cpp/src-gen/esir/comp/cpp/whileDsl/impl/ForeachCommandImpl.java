/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl.impl;

import esir.comp.cpp.whileDsl.Commands;
import esir.comp.cpp.whileDsl.Expr;
import esir.comp.cpp.whileDsl.ForeachCommand;
import esir.comp.cpp.whileDsl.WhileDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreach Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ForeachCommandImpl#getExpElement <em>Exp Element</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ForeachCommandImpl#getExpList <em>Exp List</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ForeachCommandImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeachCommandImpl extends CommandImpl implements ForeachCommand
{
  /**
   * The default value of the '{@link #getExpElement() <em>Exp Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpElement()
   * @generated
   * @ordered
   */
  protected static final String EXP_ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpElement() <em>Exp Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpElement()
   * @generated
   * @ordered
   */
  protected String expElement = EXP_ELEMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpList() <em>Exp List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpList()
   * @generated
   * @ordered
   */
  protected Expr expList;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Commands body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForeachCommandImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WhileDslPackage.Literals.FOREACH_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getExpElement()
  {
    return expElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpElement(String newExpElement)
  {
    String oldExpElement = expElement;
    expElement = newExpElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileDslPackage.FOREACH_COMMAND__EXP_ELEMENT, oldExpElement, expElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getExpList()
  {
    return expList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpList(Expr newExpList, NotificationChain msgs)
  {
    Expr oldExpList = expList;
    expList = newExpList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileDslPackage.FOREACH_COMMAND__EXP_LIST, oldExpList, newExpList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpList(Expr newExpList)
  {
    if (newExpList != expList)
    {
      NotificationChain msgs = null;
      if (expList != null)
        msgs = ((InternalEObject)expList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.FOREACH_COMMAND__EXP_LIST, null, msgs);
      if (newExpList != null)
        msgs = ((InternalEObject)newExpList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.FOREACH_COMMAND__EXP_LIST, null, msgs);
      msgs = basicSetExpList(newExpList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileDslPackage.FOREACH_COMMAND__EXP_LIST, newExpList, newExpList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Commands getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Commands newBody, NotificationChain msgs)
  {
    Commands oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileDslPackage.FOREACH_COMMAND__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBody(Commands newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.FOREACH_COMMAND__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.FOREACH_COMMAND__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileDslPackage.FOREACH_COMMAND__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WhileDslPackage.FOREACH_COMMAND__EXP_LIST:
        return basicSetExpList(null, msgs);
      case WhileDslPackage.FOREACH_COMMAND__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WhileDslPackage.FOREACH_COMMAND__EXP_ELEMENT:
        return getExpElement();
      case WhileDslPackage.FOREACH_COMMAND__EXP_LIST:
        return getExpList();
      case WhileDslPackage.FOREACH_COMMAND__BODY:
        return getBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WhileDslPackage.FOREACH_COMMAND__EXP_ELEMENT:
        setExpElement((String)newValue);
        return;
      case WhileDslPackage.FOREACH_COMMAND__EXP_LIST:
        setExpList((Expr)newValue);
        return;
      case WhileDslPackage.FOREACH_COMMAND__BODY:
        setBody((Commands)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WhileDslPackage.FOREACH_COMMAND__EXP_ELEMENT:
        setExpElement(EXP_ELEMENT_EDEFAULT);
        return;
      case WhileDslPackage.FOREACH_COMMAND__EXP_LIST:
        setExpList((Expr)null);
        return;
      case WhileDslPackage.FOREACH_COMMAND__BODY:
        setBody((Commands)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WhileDslPackage.FOREACH_COMMAND__EXP_ELEMENT:
        return EXP_ELEMENT_EDEFAULT == null ? expElement != null : !EXP_ELEMENT_EDEFAULT.equals(expElement);
      case WhileDslPackage.FOREACH_COMMAND__EXP_LIST:
        return expList != null;
      case WhileDslPackage.FOREACH_COMMAND__BODY:
        return body != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (expElement: ");
    result.append(expElement);
    result.append(')');
    return result.toString();
  }

} //ForeachCommandImpl
