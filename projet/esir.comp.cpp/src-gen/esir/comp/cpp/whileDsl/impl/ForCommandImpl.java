/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl.impl;

import esir.comp.cpp.whileDsl.Commands;
import esir.comp.cpp.whileDsl.ForCommand;
import esir.comp.cpp.whileDsl.WhileDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ForCommandImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ForCommandImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForCommandImpl extends CommandImpl implements ForCommand
{
  /**
   * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected static final String COND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected String cond = COND_EDEFAULT;

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
  protected ForCommandImpl()
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
    return WhileDslPackage.Literals.FOR_COMMAND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCond(String newCond)
  {
    String oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileDslPackage.FOR_COMMAND__COND, oldCond, cond));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileDslPackage.FOR_COMMAND__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.FOR_COMMAND__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.FOR_COMMAND__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileDslPackage.FOR_COMMAND__BODY, newBody, newBody));
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
      case WhileDslPackage.FOR_COMMAND__BODY:
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
      case WhileDslPackage.FOR_COMMAND__COND:
        return getCond();
      case WhileDslPackage.FOR_COMMAND__BODY:
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
      case WhileDslPackage.FOR_COMMAND__COND:
        setCond((String)newValue);
        return;
      case WhileDslPackage.FOR_COMMAND__BODY:
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
      case WhileDslPackage.FOR_COMMAND__COND:
        setCond(COND_EDEFAULT);
        return;
      case WhileDslPackage.FOR_COMMAND__BODY:
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
      case WhileDslPackage.FOR_COMMAND__COND:
        return COND_EDEFAULT == null ? cond != null : !COND_EDEFAULT.equals(cond);
      case WhileDslPackage.FOR_COMMAND__BODY:
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
    result.append(" (cond: ");
    result.append(cond);
    result.append(')');
    return result.toString();
  }

} //ForCommandImpl
