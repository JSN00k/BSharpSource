/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.DatatypeConstructorImpl#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.DatatypeConstructorImpl#getDecons <em>Decons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatatypeConstructorImpl extends MinimalEObjectImpl.Container implements DatatypeConstructor {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected TypedVariable name;

	/**
	 * The cached value of the '{@link #getDecons() <em>Decons</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecons()
	 * @generated
	 * @ordered
	 */
	protected TypedVariableList decons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.DATATYPE_CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariable getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(TypedVariable newName, NotificationChain msgs) {
		TypedVariable oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.DATATYPE_CONSTRUCTOR__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(TypedVariable newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.DATATYPE_CONSTRUCTOR__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.DATATYPE_CONSTRUCTOR__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.DATATYPE_CONSTRUCTOR__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariableList getDecons() {
		return decons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecons(TypedVariableList newDecons, NotificationChain msgs) {
		TypedVariableList oldDecons = decons;
		decons = newDecons;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS, oldDecons, newDecons);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecons(TypedVariableList newDecons) {
		if (newDecons != decons) {
			NotificationChain msgs = null;
			if (decons != null)
				msgs = ((InternalEObject)decons).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS, null, msgs);
			if (newDecons != null)
				msgs = ((InternalEObject)newDecons).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS, null, msgs);
			msgs = basicSetDecons(newDecons, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS, newDecons, newDecons));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.DATATYPE_CONSTRUCTOR__NAME:
				return basicSetName(null, msgs);
			case BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS:
				return basicSetDecons(null, msgs);
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
			case BSharpPackage.DATATYPE_CONSTRUCTOR__NAME:
				return getName();
			case BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS:
				return getDecons();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BSharpPackage.DATATYPE_CONSTRUCTOR__NAME:
				setName((TypedVariable)newValue);
				return;
			case BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS:
				setDecons((TypedVariableList)newValue);
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
			case BSharpPackage.DATATYPE_CONSTRUCTOR__NAME:
				setName((TypedVariable)null);
				return;
			case BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS:
				setDecons((TypedVariableList)null);
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
			case BSharpPackage.DATATYPE_CONSTRUCTOR__NAME:
				return name != null;
			case BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS:
				return decons != null;
		}
		return super.eIsSet(featureID);
	}

} //DatatypeConstructorImpl
