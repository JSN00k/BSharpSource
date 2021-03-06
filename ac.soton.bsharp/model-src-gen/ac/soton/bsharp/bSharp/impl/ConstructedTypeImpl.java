/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.TypeBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructed Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ConstructedTypeImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ConstructedTypeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ConstructedTypeImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstructedTypeImpl extends TypeBuilderImpl implements ConstructedType {
	/**
	 * The default value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRUCTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected String constructor = CONSTRUCTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected TypeBuilder left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected TypeBuilder right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstructedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.CONSTRUCTED_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstructor(String newConstructor) {
		String oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.CONSTRUCTED_TYPE__CONSTRUCTOR, oldConstructor, constructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeBuilder getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(TypeBuilder newLeft, NotificationChain msgs) {
		TypeBuilder oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.CONSTRUCTED_TYPE__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeft(TypeBuilder newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CONSTRUCTED_TYPE__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CONSTRUCTED_TYPE__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.CONSTRUCTED_TYPE__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeBuilder getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(TypeBuilder newRight, NotificationChain msgs) {
		TypeBuilder oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.CONSTRUCTED_TYPE__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRight(TypeBuilder newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CONSTRUCTED_TYPE__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CONSTRUCTED_TYPE__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.CONSTRUCTED_TYPE__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.CONSTRUCTED_TYPE__LEFT:
				return basicSetLeft(null, msgs);
			case BSharpPackage.CONSTRUCTED_TYPE__RIGHT:
				return basicSetRight(null, msgs);
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
			case BSharpPackage.CONSTRUCTED_TYPE__CONSTRUCTOR:
				return getConstructor();
			case BSharpPackage.CONSTRUCTED_TYPE__LEFT:
				return getLeft();
			case BSharpPackage.CONSTRUCTED_TYPE__RIGHT:
				return getRight();
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
			case BSharpPackage.CONSTRUCTED_TYPE__CONSTRUCTOR:
				setConstructor((String)newValue);
				return;
			case BSharpPackage.CONSTRUCTED_TYPE__LEFT:
				setLeft((TypeBuilder)newValue);
				return;
			case BSharpPackage.CONSTRUCTED_TYPE__RIGHT:
				setRight((TypeBuilder)newValue);
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
			case BSharpPackage.CONSTRUCTED_TYPE__CONSTRUCTOR:
				setConstructor(CONSTRUCTOR_EDEFAULT);
				return;
			case BSharpPackage.CONSTRUCTED_TYPE__LEFT:
				setLeft((TypeBuilder)null);
				return;
			case BSharpPackage.CONSTRUCTED_TYPE__RIGHT:
				setRight((TypeBuilder)null);
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
			case BSharpPackage.CONSTRUCTED_TYPE__CONSTRUCTOR:
				return CONSTRUCTOR_EDEFAULT == null ? constructor != null : !CONSTRUCTOR_EDEFAULT.equals(constructor);
			case BSharpPackage.CONSTRUCTED_TYPE__LEFT:
				return left != null;
			case BSharpPackage.CONSTRUCTED_TYPE__RIGHT:
				return right != null;
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
		result.append(" (constructor: ");
		result.append(constructor);
		result.append(')');
		return result.toString();
	}

	@Override
	public Integer inferredTypeCount() {
		/* We only have inferred types when the super type is a type class. This is 
		 * handled by the TypeConstructor subclass.
		 */
		return 0;
	}

	@Override
	public String buildEventBType() {
		/* This terminates when a leaf is reached, i.e., a member of TypeConstructor
		 * which is handled by the subclass implementation.
		 */
		
		String result = left.buildEventBType();
		if (constructor.equals("→") && right.isBoolType()) {
			return "ℙ(" + result + ")";
		}
		
		String rightString = null;
		if (right instanceof ConstructedType) {
			rightString = "(" + right.buildEventBType() + ")";
		} else {
			rightString = right.buildEventBType();
		}
		
		result += " " + constructor + " " + rightString;
		return result;
	}

	@Override
	public TypeBuilder reorderTypeTree() {
		if (isOrdered)
			return this;
		
		isOrdered = true;
		
		/* In effect all this does is remove brackets, leaving the bracketed tree where it is
		 * the left weighted tree that is produced by the parsing is already correct. */
		 left = left.reorderTypeTree();
		 right = right.reorderTypeTree();
		
		return this;
	}

	@Override
	public Boolean isBaseType() {
		return true;
	}
	
	/* TODO: I haven't handled brackets there is currently no code to decide when they are required. */
	
	@Override
	void getPrimativeTypePathsByDeconstructionInternal( 
			ArrayList<Integer> currentPath, LinkedHashMap<String, ArrayList<Integer>> paths) {
		currentPath.add(1);
		((TypeBuilderImpl)left).getPrimativeTypePathsByDeconstructionInternal(currentPath, paths);
		
		currentPath.set(currentPath.size() - 1, 2);
		((TypeBuilderImpl)right).getPrimativeTypePathsByDeconstructionInternal(currentPath, paths);
	}
	
	String constructWithTypesInternal(ArrayList<String> requiredEBTypes, HashMap<String, String> typeNameMap) {
		String l = ((TypeBuilderImpl)left).constructWithTypesInternal(requiredEBTypes, typeNameMap);
		String r = ((TypeBuilderImpl)right).constructWithTypesInternal(requiredEBTypes, typeNameMap);
		
		return l + " " + constructor + " " + r;
	}

	@Override
	public boolean referencesContainingType() {
		return left.referencesContainingType() || right.referencesContainingType();
	}

	@Override
	public TypeBuilder copyWithConcreteTypes(HashMap<PolyType, TypeBuilder> typeMap) {
		ConstructedType result = BSharpFactory.eINSTANCE.createConstructedType();
		result.setLeft(getLeft().copyWithConcreteTypes(typeMap));
		result.setRight(getRight().copyWithConcreteTypes(typeMap));
		result.setConstructor(getConstructor());
		return result;
	}



} //ConstructedTypeImpl
