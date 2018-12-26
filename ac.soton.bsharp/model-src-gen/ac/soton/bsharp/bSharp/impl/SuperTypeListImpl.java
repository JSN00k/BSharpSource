/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.SuperTypeList;

import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypePowerSet;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Super Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.SuperTypeListImpl#getSuperTypes <em>Super Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperTypeListImpl extends MinimalEObjectImpl.Container implements SuperTypeList {
	/**
	 * The cached value of the '{@link #getSuperTypes() <em>Super Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBuilder> superTypes;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperTypeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.SUPER_TYPE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBuilder> getSuperTypes() {
		if (superTypes == null) {
			superTypes = new EObjectContainmentEList<TypeBuilder>(TypeBuilder.class, this, BSharpPackage.SUPER_TYPE_LIST__SUPER_TYPES);
		}
		return superTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.SUPER_TYPE_LIST__SUPER_TYPES:
				return ((InternalEList<?>)getSuperTypes()).basicRemove(otherEnd, msgs);
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
			case BSharpPackage.SUPER_TYPE_LIST__SUPER_TYPES:
				return getSuperTypes();
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
			case BSharpPackage.SUPER_TYPE_LIST__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends TypeBuilder>)newValue);
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
			case BSharpPackage.SUPER_TYPE_LIST__SUPER_TYPES:
				getSuperTypes().clear();
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
			case BSharpPackage.SUPER_TYPE_LIST__SUPER_TYPES:
				return superTypes != null && !superTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public TypeBuilder getFirst() {
		if (superTypes != null && !superTypes.isEmpty())
			return superTypes.get(0);
		
		return null;
	}
	
	@Override
	public boolean isPowerSet() {
		if (superTypes == null || superTypes.size() != 1)
			return false;
		
		TypeBuilder st = superTypes.get(0);
		return st instanceof TypePowerSet;
	}
	
	@Override
	public String supertypeType(ArrayList<Tuple2<String, String>> bsOpPolyTypes) {
		if (superTypes == null || superTypes.isEmpty()) {
			try {
				throw new Exception("Type class doesn't have a supertype. This should be validated against");
			} catch (Exception e) {
				System.err.println("A type is created without any supertypes.");
				return null;
			}
		}
		
		String result = "";
		Boolean first = true;
		
		for (TypeBuilder st : superTypes) {
			if (!first) {
				result += " ∩ ";
			}
			first = false;
			
			Boolean hasInferredTypes = st.inferredTypeCount() != 0;
			if (hasInferredTypes) {
				result += st.getTypeClass().eventBPolymorphicTypeConstructorName();
				result += "(" + CompilationUtil.compileTypedVariablesToNameListWithSeparator(bsOpPolyTypes, ", ", true) + ")";
			} else {
				if (isPowerSet())
					result += ((TypePowerSet)st).getChild().buildEventBType();
				else 
					result += st.buildEventBType();
				
			}
		}
		
		return result;
	}
	
	@Override
	public boolean isEmpty() {
		List<TypeBuilder> superTs = getSuperTypes();
		if (superTs == null || superTs.isEmpty())
			return true;
		
		return false;
	}
	
	@Override 
	public boolean containsTypeRecursive(ClassDecl type) {
		for (TypeBuilder tb : getSuperTypes()) {
			ClassDecl cd = tb.getClassDecl();
			if (cd != null && cd == type)
				return true;
			
		}
		
		for (TypeBuilder tb : getSuperTypes()) {
			BSClass c = tb.getTypeClass();
			
			if (c != null && c.isSuperType(c)) {
				return true;
			}
			
		}
		
		return false;
	}
	
	@Override
	public boolean containsType(ClassDecl type) {
		for (TypeBuilder tb : getSuperTypes()) {
			ClassDecl cd = tb.getClassDecl();
			if (cd != null && cd == type)
				return true;
			
		}
		
		return false;
	}
} //SuperTypeListImpl
