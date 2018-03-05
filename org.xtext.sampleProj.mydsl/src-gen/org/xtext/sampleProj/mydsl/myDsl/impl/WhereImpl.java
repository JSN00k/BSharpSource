/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.sampleProj.mydsl.myDsl.Expression;
import org.xtext.sampleProj.mydsl.myDsl.MyDslPackage;
import org.xtext.sampleProj.mydsl.myDsl.Where;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.WhereImpl#getExpessions <em>Expessions</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.WhereImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereImpl extends MinimalEObjectImpl.Container implements Where
{
  /**
   * The cached value of the '{@link #getExpessions() <em>Expessions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpessions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expessions;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WhereImpl()
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
    return MyDslPackage.Literals.WHERE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpessions()
  {
    if (expessions == null)
    {
      expessions = new EObjectContainmentEList<Expression>(Expression.class, this, MyDslPackage.WHERE__EXPESSIONS);
    }
    return expessions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<Expression>(Expression.class, this, MyDslPackage.WHERE__EXPRESSIONS);
    }
    return expressions;
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
      case MyDslPackage.WHERE__EXPESSIONS:
        return ((InternalEList<?>)getExpessions()).basicRemove(otherEnd, msgs);
      case MyDslPackage.WHERE__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.WHERE__EXPESSIONS:
        return getExpessions();
      case MyDslPackage.WHERE__EXPRESSIONS:
        return getExpressions();
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
      case MyDslPackage.WHERE__EXPESSIONS:
        getExpessions().clear();
        getExpessions().addAll((Collection<? extends Expression>)newValue);
        return;
      case MyDslPackage.WHERE__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends Expression>)newValue);
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
      case MyDslPackage.WHERE__EXPESSIONS:
        getExpessions().clear();
        return;
      case MyDslPackage.WHERE__EXPRESSIONS:
        getExpressions().clear();
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
      case MyDslPackage.WHERE__EXPESSIONS:
        return expessions != null && !expessions.isEmpty();
      case MyDslPackage.WHERE__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WhereImpl
