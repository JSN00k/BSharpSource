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

import org.xtext.sampleProj.mydsl.myDsl.MyDslPackage;
import org.xtext.sampleProj.mydsl.myDsl.TypedVariable;
import org.xtext.sampleProj.mydsl.myDsl.TypedVariableList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Variable List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.TypedVariableListImpl#getTypeVar <em>Type Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedVariableListImpl extends MinimalEObjectImpl.Container implements TypedVariableList
{
  /**
   * The cached value of the '{@link #getTypeVar() <em>Type Var</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeVar()
   * @generated
   * @ordered
   */
  protected EList<TypedVariable> typeVar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypedVariableListImpl()
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
    return MyDslPackage.Literals.TYPED_VARIABLE_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypedVariable> getTypeVar()
  {
    if (typeVar == null)
    {
      typeVar = new EObjectContainmentEList<TypedVariable>(TypedVariable.class, this, MyDslPackage.TYPED_VARIABLE_LIST__TYPE_VAR);
    }
    return typeVar;
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
      case MyDslPackage.TYPED_VARIABLE_LIST__TYPE_VAR:
        return ((InternalEList<?>)getTypeVar()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.TYPED_VARIABLE_LIST__TYPE_VAR:
        return getTypeVar();
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
      case MyDslPackage.TYPED_VARIABLE_LIST__TYPE_VAR:
        getTypeVar().clear();
        getTypeVar().addAll((Collection<? extends TypedVariable>)newValue);
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
      case MyDslPackage.TYPED_VARIABLE_LIST__TYPE_VAR:
        getTypeVar().clear();
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
      case MyDslPackage.TYPED_VARIABLE_LIST__TYPE_VAR:
        return typeVar != null && !typeVar.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypedVariableListImpl