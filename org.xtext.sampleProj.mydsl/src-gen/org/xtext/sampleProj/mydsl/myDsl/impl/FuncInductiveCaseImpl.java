/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.sampleProj.mydsl.myDsl.DTypeConstructor;
import org.xtext.sampleProj.mydsl.myDsl.Expression;
import org.xtext.sampleProj.mydsl.myDsl.FuncInductiveCase;
import org.xtext.sampleProj.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Func Inductive Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.FuncInductiveCaseImpl#getDeconName <em>Decon Name</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.FuncInductiveCaseImpl#getExpre <em>Expre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncInductiveCaseImpl extends MinimalEObjectImpl.Container implements FuncInductiveCase
{
  /**
   * The cached value of the '{@link #getDeconName() <em>Decon Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeconName()
   * @generated
   * @ordered
   */
  protected DTypeConstructor deconName;

  /**
   * The cached value of the '{@link #getExpre() <em>Expre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpre()
   * @generated
   * @ordered
   */
  protected Expression expre;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuncInductiveCaseImpl()
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
    return MyDslPackage.Literals.FUNC_INDUCTIVE_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTypeConstructor getDeconName()
  {
    if (deconName != null && deconName.eIsProxy())
    {
      InternalEObject oldDeconName = (InternalEObject)deconName;
      deconName = (DTypeConstructor)eResolveProxy(oldDeconName);
      if (deconName != oldDeconName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.FUNC_INDUCTIVE_CASE__DECON_NAME, oldDeconName, deconName));
      }
    }
    return deconName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTypeConstructor basicGetDeconName()
  {
    return deconName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeconName(DTypeConstructor newDeconName)
  {
    DTypeConstructor oldDeconName = deconName;
    deconName = newDeconName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNC_INDUCTIVE_CASE__DECON_NAME, oldDeconName, deconName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpre()
  {
    return expre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpre(Expression newExpre, NotificationChain msgs)
  {
    Expression oldExpre = expre;
    expre = newExpre;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE, oldExpre, newExpre);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpre(Expression newExpre)
  {
    if (newExpre != expre)
    {
      NotificationChain msgs = null;
      if (expre != null)
        msgs = ((InternalEObject)expre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE, null, msgs);
      if (newExpre != null)
        msgs = ((InternalEObject)newExpre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE, null, msgs);
      msgs = basicSetExpre(newExpre, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE, newExpre, newExpre));
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
      case MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE:
        return basicSetExpre(null, msgs);
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
      case MyDslPackage.FUNC_INDUCTIVE_CASE__DECON_NAME:
        if (resolve) return getDeconName();
        return basicGetDeconName();
      case MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE:
        return getExpre();
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
      case MyDslPackage.FUNC_INDUCTIVE_CASE__DECON_NAME:
        setDeconName((DTypeConstructor)newValue);
        return;
      case MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE:
        setExpre((Expression)newValue);
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
      case MyDslPackage.FUNC_INDUCTIVE_CASE__DECON_NAME:
        setDeconName((DTypeConstructor)null);
        return;
      case MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE:
        setExpre((Expression)null);
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
      case MyDslPackage.FUNC_INDUCTIVE_CASE__DECON_NAME:
        return deconName != null;
      case MyDslPackage.FUNC_INDUCTIVE_CASE__EXPRE:
        return expre != null;
    }
    return super.eIsSet(featureID);
  }

} //FuncInductiveCaseImpl
