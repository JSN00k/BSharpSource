/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.sampleProj.mydsl.myDsl.MyDslPackage;
import org.xtext.sampleProj.mydsl.myDsl.PolyContext;
import org.xtext.sampleProj.mydsl.myDsl.Supertype;
import org.xtext.sampleProj.mydsl.myDsl.TypeName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.ClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.ClassImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.ClassImpl#getSupertypes <em>Supertypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ClassDeclImpl implements org.xtext.sampleProj.mydsl.myDsl.Class
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected TypeName name;

  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected EList<PolyContext> context;

  /**
   * The cached value of the '{@link #getSupertypes() <em>Supertypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupertypes()
   * @generated
   * @ordered
   */
  protected EList<Supertype> supertypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return MyDslPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(TypeName newName, NotificationChain msgs)
  {
    TypeName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(TypeName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLASS__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CLASS__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CLASS__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PolyContext> getContext()
  {
    if (context == null)
    {
      context = new EObjectContainmentEList<PolyContext>(PolyContext.class, this, MyDslPackage.CLASS__CONTEXT);
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Supertype> getSupertypes()
  {
    if (supertypes == null)
    {
      supertypes = new EObjectContainmentEList<Supertype>(Supertype.class, this, MyDslPackage.CLASS__SUPERTYPES);
    }
    return supertypes;
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
      case MyDslPackage.CLASS__NAME:
        return basicSetName(null, msgs);
      case MyDslPackage.CLASS__CONTEXT:
        return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
      case MyDslPackage.CLASS__SUPERTYPES:
        return ((InternalEList<?>)getSupertypes()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CLASS__NAME:
        return getName();
      case MyDslPackage.CLASS__CONTEXT:
        return getContext();
      case MyDslPackage.CLASS__SUPERTYPES:
        return getSupertypes();
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
      case MyDslPackage.CLASS__NAME:
        setName((TypeName)newValue);
        return;
      case MyDslPackage.CLASS__CONTEXT:
        getContext().clear();
        getContext().addAll((Collection<? extends PolyContext>)newValue);
        return;
      case MyDslPackage.CLASS__SUPERTYPES:
        getSupertypes().clear();
        getSupertypes().addAll((Collection<? extends Supertype>)newValue);
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
      case MyDslPackage.CLASS__NAME:
        setName((TypeName)null);
        return;
      case MyDslPackage.CLASS__CONTEXT:
        getContext().clear();
        return;
      case MyDslPackage.CLASS__SUPERTYPES:
        getSupertypes().clear();
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
      case MyDslPackage.CLASS__NAME:
        return name != null;
      case MyDslPackage.CLASS__CONTEXT:
        return context != null && !context.isEmpty();
      case MyDslPackage.CLASS__SUPERTYPES:
        return supertypes != null && !supertypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
