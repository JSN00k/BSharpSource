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
import org.xtext.sampleProj.mydsl.myDsl.TypedVariableList;
import org.xtext.sampleProj.mydsl.myDsl.VariableTyping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Variable List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.TypedVariableListImpl#getVariablesOfType <em>Variables Of Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedVariableListImpl extends MinimalEObjectImpl.Container implements TypedVariableList
{
  /**
   * The cached value of the '{@link #getVariablesOfType() <em>Variables Of Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablesOfType()
   * @generated
   * @ordered
   */
  protected EList<VariableTyping> variablesOfType;

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
  public EList<VariableTyping> getVariablesOfType()
  {
    if (variablesOfType == null)
    {
      variablesOfType = new EObjectContainmentEList<VariableTyping>(VariableTyping.class, this, MyDslPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE);
    }
    return variablesOfType;
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
      case MyDslPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
        return ((InternalEList<?>)getVariablesOfType()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
        return getVariablesOfType();
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
      case MyDslPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
        getVariablesOfType().clear();
        getVariablesOfType().addAll((Collection<? extends VariableTyping>)newValue);
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
      case MyDslPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
        getVariablesOfType().clear();
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
      case MyDslPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
        return variablesOfType != null && !variablesOfType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypedVariableListImpl
