/**
 * generated by Xtext 2.12.0
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

import org.xtext.sampleProj.mydsl.myDsl.Datatype;
import org.xtext.sampleProj.mydsl.myDsl.DatatypeConstructor;
import org.xtext.sampleProj.mydsl.myDsl.MyDslPackage;
import org.xtext.sampleProj.mydsl.myDsl.PolyContext;
import org.xtext.sampleProj.mydsl.myDsl.TypeName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.DatatypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.DatatypeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.DatatypeImpl#getConstructors <em>Constructors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatatypeImpl extends ClassDeclImpl implements Datatype
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
   * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstructors()
   * @generated
   * @ordered
   */
  protected EList<DatatypeConstructor> constructors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatatypeImpl()
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
    return MyDslPackage.Literals.DATATYPE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.DATATYPE__NAME, oldName, newName);
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
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATATYPE__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.DATATYPE__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.DATATYPE__NAME, newName, newName));
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
      context = new EObjectContainmentEList<PolyContext>(PolyContext.class, this, MyDslPackage.DATATYPE__CONTEXT);
    }
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DatatypeConstructor> getConstructors()
  {
    if (constructors == null)
    {
      constructors = new EObjectContainmentEList<DatatypeConstructor>(DatatypeConstructor.class, this, MyDslPackage.DATATYPE__CONSTRUCTORS);
    }
    return constructors;
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
      case MyDslPackage.DATATYPE__NAME:
        return basicSetName(null, msgs);
      case MyDslPackage.DATATYPE__CONTEXT:
        return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
      case MyDslPackage.DATATYPE__CONSTRUCTORS:
        return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.DATATYPE__NAME:
        return getName();
      case MyDslPackage.DATATYPE__CONTEXT:
        return getContext();
      case MyDslPackage.DATATYPE__CONSTRUCTORS:
        return getConstructors();
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
      case MyDslPackage.DATATYPE__NAME:
        setName((TypeName)newValue);
        return;
      case MyDslPackage.DATATYPE__CONTEXT:
        getContext().clear();
        getContext().addAll((Collection<? extends PolyContext>)newValue);
        return;
      case MyDslPackage.DATATYPE__CONSTRUCTORS:
        getConstructors().clear();
        getConstructors().addAll((Collection<? extends DatatypeConstructor>)newValue);
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
      case MyDslPackage.DATATYPE__NAME:
        setName((TypeName)null);
        return;
      case MyDslPackage.DATATYPE__CONTEXT:
        getContext().clear();
        return;
      case MyDslPackage.DATATYPE__CONSTRUCTORS:
        getConstructors().clear();
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
      case MyDslPackage.DATATYPE__NAME:
        return name != null;
      case MyDslPackage.DATATYPE__CONTEXT:
        return context != null && !context.isEmpty();
      case MyDslPackage.DATATYPE__CONSTRUCTORS:
        return constructors != null && !constructors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DatatypeImpl
