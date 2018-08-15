/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.BppClass;
import ac.soton.bsharp.bSharp.PolymorphicTypeName;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TypeStructure;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.Where;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bpp Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BppClassImpl#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BppClassImpl#getVarList <em>Var List</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BppClassImpl#getWhere <em>Where</em>}</li>
 * </ul>
 */
public class BppClassImpl extends ClassDeclImpl implements BppClass {
	/**
	 * The cached value of the '{@link #getSupertypes() <em>Supertypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypes()
	 * @generated
	 * @ordered
	 */
	protected SuperTypeList supertypes;

	/**
	 * The cached value of the '{@link #getVarList() <em>Var List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarList()
	 * @generated
	 * @ordered
	 */
	protected TypeStructure varList;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Where where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BppClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.BPP_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperTypeList getSupertypes() {
		return supertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertypes(SuperTypeList newSupertypes, NotificationChain msgs) {
		SuperTypeList oldSupertypes = supertypes;
		supertypes = newSupertypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BPP_CLASS__SUPERTYPES, oldSupertypes, newSupertypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertypes(SuperTypeList newSupertypes) {
		if (newSupertypes != supertypes) {
			NotificationChain msgs = null;
			if (supertypes != null)
				msgs = ((InternalEObject)supertypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BPP_CLASS__SUPERTYPES, null, msgs);
			if (newSupertypes != null)
				msgs = ((InternalEObject)newSupertypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BPP_CLASS__SUPERTYPES, null, msgs);
			msgs = basicSetSupertypes(newSupertypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BPP_CLASS__SUPERTYPES, newSupertypes, newSupertypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeStructure getVarList() {
		return varList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarList(TypeStructure newVarList, NotificationChain msgs) {
		TypeStructure oldVarList = varList;
		varList = newVarList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BPP_CLASS__VAR_LIST, oldVarList, newVarList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarList(TypeStructure newVarList) {
		if (newVarList != varList) {
			NotificationChain msgs = null;
			if (varList != null)
				msgs = ((InternalEObject)varList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BPP_CLASS__VAR_LIST, null, msgs);
			if (newVarList != null)
				msgs = ((InternalEObject)newVarList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BPP_CLASS__VAR_LIST, null, msgs);
			msgs = basicSetVarList(newVarList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BPP_CLASS__VAR_LIST, newVarList, newVarList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Where newWhere, NotificationChain msgs) {
		Where oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BPP_CLASS__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Where newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BPP_CLASS__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BPP_CLASS__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BPP_CLASS__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.BPP_CLASS__SUPERTYPES:
				return basicSetSupertypes(null, msgs);
			case BSharpPackage.BPP_CLASS__VAR_LIST:
				return basicSetVarList(null, msgs);
			case BSharpPackage.BPP_CLASS__WHERE:
				return basicSetWhere(null, msgs);
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
			case BSharpPackage.BPP_CLASS__SUPERTYPES:
				return getSupertypes();
			case BSharpPackage.BPP_CLASS__VAR_LIST:
				return getVarList();
			case BSharpPackage.BPP_CLASS__WHERE:
				return getWhere();
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
			case BSharpPackage.BPP_CLASS__SUPERTYPES:
				setSupertypes((SuperTypeList)newValue);
				return;
			case BSharpPackage.BPP_CLASS__VAR_LIST:
				setVarList((TypeStructure)newValue);
				return;
			case BSharpPackage.BPP_CLASS__WHERE:
				setWhere((Where)newValue);
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
			case BSharpPackage.BPP_CLASS__SUPERTYPES:
				setSupertypes((SuperTypeList)null);
				return;
			case BSharpPackage.BPP_CLASS__VAR_LIST:
				setVarList((TypeStructure)null);
				return;
			case BSharpPackage.BPP_CLASS__WHERE:
				setWhere((Where)null);
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
			case BSharpPackage.BPP_CLASS__SUPERTYPES:
				return supertypes != null;
			case BSharpPackage.BPP_CLASS__VAR_LIST:
				return varList != null;
			case BSharpPackage.BPP_CLASS__WHERE:
				return where != null;
		}
		return super.eIsSet(featureID);
	}

	public Collection<EObject> getVariablesNames() {		
		ArrayList<EObject> result = new ArrayList<EObject>();
		result.add(typeName);
		if (varList == null) {
			return result;
		}
		
		result.addAll(EcoreUtil2.getAllContentsOfType(varList, TypedVariable.class));
		return result;
	}
	
	@Override
	public Collection<PolymorphicTypeName> getPolyTypeNames() {
		return EcoreUtil2.getAllContentsOfType(getContext(), PolymorphicTypeName.class);
	}

} //BppClassImpl
