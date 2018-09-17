/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.BppClass;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.PolymorphicTypeName;
import ac.soton.bsharp.bSharp.TypeBodyElements;
import ac.soton.bsharp.bSharp.TypeName;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ExtendImpl#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ExtendImpl#getBodyElements <em>Body Elements</em>}</li>
 * </ul>
 */
public class ExtendImpl extends TopLevelImpl implements Extend {
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
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBodyElements() <em>Body Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBodyElements> bodyElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.EXTEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeName getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (TypeName)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.EXTEND__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeName basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(TypeName newName) {
		TypeName oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.EXTEND__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.EXTEND__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBodyElements> getBodyElements() {
		if (bodyElements == null) {
			bodyElements = new EObjectContainmentEList<TypeBodyElements>(TypeBodyElements.class, this, BSharpPackage.EXTEND__BODY_ELEMENTS);
		}
		return bodyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.EXTEND__BODY_ELEMENTS:
				return ((InternalEList<?>)getBodyElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BSharpPackage.EXTEND__NAME:
				if (resolve) return getName();
				return basicGetName();
			case BSharpPackage.EXTEND__EXTENSION:
				return getExtension();
			case BSharpPackage.EXTEND__BODY_ELEMENTS:
				return getBodyElements();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BSharpPackage.EXTEND__NAME:
				setName((TypeName)newValue);
				return;
			case BSharpPackage.EXTEND__EXTENSION:
				setExtension((String)newValue);
				return;
			case BSharpPackage.EXTEND__BODY_ELEMENTS:
				getBodyElements().clear();
				getBodyElements().addAll((Collection<? extends TypeBodyElements>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BSharpPackage.EXTEND__NAME:
				setName((TypeName)null);
				return;
			case BSharpPackage.EXTEND__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case BSharpPackage.EXTEND__BODY_ELEMENTS:
				getBodyElements().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BSharpPackage.EXTEND__NAME:
				return name != null;
			case BSharpPackage.EXTEND__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case BSharpPackage.EXTEND__BODY_ELEMENTS:
				return bodyElements != null && !bodyElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (extension: ");
		result.append(extension);
		result.append(')');
		return result.toString();
	}

	@Override
	public Collection<EObject> getVariablesNames() {
		/* Note datatypes don't create type variables, I think these may be 
		 * covered when looking for function names instead.
		 */
		EObject extended = name.eContainer();
		if (extended instanceof BppClass) {
			return ((BppClass)extended).getVariablesNames();
		} else {
			return null;
		}
	}

	@Override
	public Collection<PolymorphicTypeName> getPolyTypeNames() {
		EObject extended = name.eContainer();
		if (extended instanceof BppClass) {
			return ((BppClass)extended).getPolyTypeNames();
		} else {
			return null;
		}
	}
	
	

} //ExtendImpl
