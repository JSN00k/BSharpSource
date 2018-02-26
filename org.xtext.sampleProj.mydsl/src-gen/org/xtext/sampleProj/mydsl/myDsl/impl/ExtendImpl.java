/**
 * generated by Xtext 2.12.0
 */
package org.xtext.sampleProj.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.sampleProj.mydsl.myDsl.Extend;
import org.xtext.sampleProj.mydsl.myDsl.MyDslPackage;
import org.xtext.sampleProj.mydsl.myDsl.TypeName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.ExtendImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.sampleProj.mydsl.myDsl.impl.ExtendImpl#getExtesnion <em>Extesnion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendImpl extends ClassDeclImpl implements Extend
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected TypeName name;

  /**
   * The default value of the '{@link #getExtesnion() <em>Extesnion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtesnion()
   * @generated
   * @ordered
   */
  protected static final String EXTESNION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtesnion() <em>Extesnion</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtesnion()
   * @generated
   * @ordered
   */
  protected String extesnion = EXTESNION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExtendImpl()
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
    return MyDslPackage.Literals.EXTEND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (TypeName)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.EXTEND__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeName basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(TypeName newName)
  {
    TypeName oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXTEND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtesnion()
  {
    return extesnion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtesnion(String newExtesnion)
  {
    String oldExtesnion = extesnion;
    extesnion = newExtesnion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXTEND__EXTESNION, oldExtesnion, extesnion));
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
      case MyDslPackage.EXTEND__NAME:
        if (resolve) return getName();
        return basicGetName();
      case MyDslPackage.EXTEND__EXTESNION:
        return getExtesnion();
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
      case MyDslPackage.EXTEND__NAME:
        setName((TypeName)newValue);
        return;
      case MyDslPackage.EXTEND__EXTESNION:
        setExtesnion((String)newValue);
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
      case MyDslPackage.EXTEND__NAME:
        setName((TypeName)null);
        return;
      case MyDslPackage.EXTEND__EXTESNION:
        setExtesnion(EXTESNION_EDEFAULT);
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
      case MyDslPackage.EXTEND__NAME:
        return name != null;
      case MyDslPackage.EXTEND__EXTESNION:
        return EXTESNION_EDEFAULT == null ? extesnion != null : !EXTESNION_EDEFAULT.equals(extesnion);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (extesnion: ");
    result.append(extesnion);
    result.append(')');
    return result.toString();
  }

} //ExtendImpl
