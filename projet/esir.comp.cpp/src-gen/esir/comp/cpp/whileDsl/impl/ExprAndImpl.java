/**
 * generated by Xtext 2.19.0
 */
package esir.comp.cpp.whileDsl.impl;

import esir.comp.cpp.whileDsl.ExprAnd;
import esir.comp.cpp.whileDsl.ExprOr;
import esir.comp.cpp.whileDsl.WhileDslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr And</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esir.comp.cpp.whileDsl.impl.ExprAndImpl#getExpressionsOr <em>Expressions Or</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExprAndImpl extends MinimalEObjectImpl.Container implements ExprAnd
{
  /**
   * The cached value of the '{@link #getExpressionsOr() <em>Expressions Or</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionsOr()
   * @generated
   * @ordered
   */
  protected EList<ExprOr> expressionsOr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprAndImpl()
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
    return WhileDslPackage.Literals.EXPR_AND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExprOr> getExpressionsOr()
  {
    if (expressionsOr == null)
    {
      expressionsOr = new EObjectContainmentEList<ExprOr>(ExprOr.class, this, WhileDslPackage.EXPR_AND__EXPRESSIONS_OR);
    }
    return expressionsOr;
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
      case WhileDslPackage.EXPR_AND__EXPRESSIONS_OR:
        return ((InternalEList<?>)getExpressionsOr()).basicRemove(otherEnd, msgs);
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
      case WhileDslPackage.EXPR_AND__EXPRESSIONS_OR:
        return getExpressionsOr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WhileDslPackage.EXPR_AND__EXPRESSIONS_OR:
        getExpressionsOr().clear();
        getExpressionsOr().addAll((Collection<? extends ExprOr>)newValue);
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
      case WhileDslPackage.EXPR_AND__EXPRESSIONS_OR:
        getExpressionsOr().clear();
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
      case WhileDslPackage.EXPR_AND__EXPRESSIONS_OR:
        return expressionsOr != null && !expressionsOr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExprAndImpl
