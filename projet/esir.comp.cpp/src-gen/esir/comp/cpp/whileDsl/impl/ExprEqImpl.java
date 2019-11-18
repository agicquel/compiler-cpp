/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl.impl;

import esir.comp.cpp.whileDsl.Expr;
import esir.comp.cpp.whileDsl.ExprEq;
import esir.comp.cpp.whileDsl.ExprSimple;
import esir.comp.cpp.whileDsl.WhileDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr Eq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ExprEqImpl#getExprL <em>Expr L</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ExprEqImpl#getExprRSimple <em>Expr RSimple</em>}</li>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ExprEqImpl#getExprRExpr <em>Expr RExpr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprEqImpl extends MinimalEObjectImpl.Container implements ExprEq
{
  /**
   * The cached value of the '{@link #getExprL() <em>Expr L</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprL()
   * @generated
   * @ordered
   */
  protected ExprSimple exprL;

  /**
   * The cached value of the '{@link #getExprRSimple() <em>Expr RSimple</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprRSimple()
   * @generated
   * @ordered
   */
  protected ExprSimple exprRSimple;

  /**
   * The cached value of the '{@link #getExprRExpr() <em>Expr RExpr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprRExpr()
   * @generated
   * @ordered
   */
  protected Expr exprRExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprEqImpl()
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
    return WhileDslPackage.Literals.EXPR_EQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprSimple getExprL()
  {
    return exprL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprL(ExprSimple newExprL, NotificationChain msgs)
  {
    ExprSimple oldExprL = exprL;
    exprL = newExprL;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileDslPackage.EXPR_EQ__EXPR_L, oldExprL, newExprL);
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
  public void setExprL(ExprSimple newExprL)
  {
    if (newExprL != exprL)
    {
      NotificationChain msgs = null;
      if (exprL != null)
        msgs = ((InternalEObject)exprL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.EXPR_EQ__EXPR_L, null, msgs);
      if (newExprL != null)
        msgs = ((InternalEObject)newExprL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.EXPR_EQ__EXPR_L, null, msgs);
      msgs = basicSetExprL(newExprL, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileDslPackage.EXPR_EQ__EXPR_L, newExprL, newExprL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExprSimple getExprRSimple()
  {
    return exprRSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprRSimple(ExprSimple newExprRSimple, NotificationChain msgs)
  {
    ExprSimple oldExprRSimple = exprRSimple;
    exprRSimple = newExprRSimple;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE, oldExprRSimple, newExprRSimple);
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
  public void setExprRSimple(ExprSimple newExprRSimple)
  {
    if (newExprRSimple != exprRSimple)
    {
      NotificationChain msgs = null;
      if (exprRSimple != null)
        msgs = ((InternalEObject)exprRSimple).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE, null, msgs);
      if (newExprRSimple != null)
        msgs = ((InternalEObject)newExprRSimple).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE, null, msgs);
      msgs = basicSetExprRSimple(newExprRSimple, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE, newExprRSimple, newExprRSimple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr getExprRExpr()
  {
    return exprRExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExprRExpr(Expr newExprRExpr, NotificationChain msgs)
  {
    Expr oldExprRExpr = exprRExpr;
    exprRExpr = newExprRExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhileDslPackage.EXPR_EQ__EXPR_REXPR, oldExprRExpr, newExprRExpr);
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
  public void setExprRExpr(Expr newExprRExpr)
  {
    if (newExprRExpr != exprRExpr)
    {
      NotificationChain msgs = null;
      if (exprRExpr != null)
        msgs = ((InternalEObject)exprRExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.EXPR_EQ__EXPR_REXPR, null, msgs);
      if (newExprRExpr != null)
        msgs = ((InternalEObject)newExprRExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhileDslPackage.EXPR_EQ__EXPR_REXPR, null, msgs);
      msgs = basicSetExprRExpr(newExprRExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhileDslPackage.EXPR_EQ__EXPR_REXPR, newExprRExpr, newExprRExpr));
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
      case WhileDslPackage.EXPR_EQ__EXPR_L:
        return basicSetExprL(null, msgs);
      case WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE:
        return basicSetExprRSimple(null, msgs);
      case WhileDslPackage.EXPR_EQ__EXPR_REXPR:
        return basicSetExprRExpr(null, msgs);
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
      case WhileDslPackage.EXPR_EQ__EXPR_L:
        return getExprL();
      case WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE:
        return getExprRSimple();
      case WhileDslPackage.EXPR_EQ__EXPR_REXPR:
        return getExprRExpr();
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
      case WhileDslPackage.EXPR_EQ__EXPR_L:
        setExprL((ExprSimple)newValue);
        return;
      case WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE:
        setExprRSimple((ExprSimple)newValue);
        return;
      case WhileDslPackage.EXPR_EQ__EXPR_REXPR:
        setExprRExpr((Expr)newValue);
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
      case WhileDslPackage.EXPR_EQ__EXPR_L:
        setExprL((ExprSimple)null);
        return;
      case WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE:
        setExprRSimple((ExprSimple)null);
        return;
      case WhileDslPackage.EXPR_EQ__EXPR_REXPR:
        setExprRExpr((Expr)null);
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
      case WhileDslPackage.EXPR_EQ__EXPR_L:
        return exprL != null;
      case WhileDslPackage.EXPR_EQ__EXPR_RSIMPLE:
        return exprRSimple != null;
      case WhileDslPackage.EXPR_EQ__EXPR_REXPR:
        return exprRExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ExprEqImpl