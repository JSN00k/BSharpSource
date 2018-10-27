/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.VariableTyping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Typing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.VariableTypingImpl#getTypeVar <em>Type Var</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.VariableTypingImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableTypingImpl extends MinimalEObjectImpl.Container implements VariableTyping {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ConstructedType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableTypingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.VARIABLE_TYPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedVariable> getTypeVar() {
		if (typeVar == null) {
			typeVar = new EObjectContainmentEList<TypedVariable>(TypedVariable.class, this, BSharpPackage.VARIABLE_TYPING__TYPE_VAR);
		}
		return typeVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructedType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ConstructedType newType, NotificationChain msgs) {
		ConstructedType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.VARIABLE_TYPING__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ConstructedType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.VARIABLE_TYPING__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.VARIABLE_TYPING__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.VARIABLE_TYPING__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.VARIABLE_TYPING__TYPE_VAR:
				return ((InternalEList<?>)getTypeVar()).basicRemove(otherEnd, msgs);
			case BSharpPackage.VARIABLE_TYPING__TYPE:
				return basicSetType(null, msgs);
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
			case BSharpPackage.VARIABLE_TYPING__TYPE_VAR:
				return getTypeVar();
			case BSharpPackage.VARIABLE_TYPING__TYPE:
				return getType();
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
			case BSharpPackage.VARIABLE_TYPING__TYPE_VAR:
				getTypeVar().clear();
				getTypeVar().addAll((Collection<? extends TypedVariable>)newValue);
				return;
			case BSharpPackage.VARIABLE_TYPING__TYPE:
				setType((ConstructedType)newValue);
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
			case BSharpPackage.VARIABLE_TYPING__TYPE_VAR:
				getTypeVar().clear();
				return;
			case BSharpPackage.VARIABLE_TYPING__TYPE:
				setType((ConstructedType)null);
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
			case BSharpPackage.VARIABLE_TYPING__TYPE_VAR:
				return typeVar != null && !typeVar.isEmpty();
			case BSharpPackage.VARIABLE_TYPING__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Map<String, ArrayList<? extends EObject>> getVariablesAndTypes() {
		ArrayList<TypedVariable> variables = new ArrayList<TypedVariable>();
		ArrayList<ConstructedType> constructors = new ArrayList<ConstructedType>();
		
		TreeMap<String, ArrayList<? extends EObject>> result = new TreeMap<String, ArrayList<? extends EObject>>();
		
		if (typeVar == null || typeVar.isEmpty())
			return result;
		
		for (TypedVariable var : typeVar) {
			variables.add(var);
			constructors.add(type);
		}
		
		result.put("vars", variables);
		result.put("constructors", constructors);
		
		return result;
	}

} //VariableTypingImpl
