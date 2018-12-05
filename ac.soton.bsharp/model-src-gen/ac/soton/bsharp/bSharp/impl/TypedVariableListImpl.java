/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.VariableTyping;
import ac.soton.bsharp.bSharp.util.Tuple2;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Variable List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.TypedVariableListImpl#getVariablesOfType <em>Variables Of Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedVariableListImpl extends MinimalEObjectImpl.Container implements TypedVariableList {
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
	protected TypedVariableListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.TYPED_VARIABLE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableTyping> getVariablesOfType() {
		if (variablesOfType == null) {
			variablesOfType = new EObjectContainmentEList<VariableTyping>(VariableTyping.class, this, BSharpPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE);
		}
		return variablesOfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BSharpPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BSharpPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BSharpPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BSharpPackage.TYPED_VARIABLE_LIST__VARIABLES_OF_TYPE:
				return variablesOfType != null && !variablesOfType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public ArrayList<Tuple2<TypedVariable, TypeBuilder>> getVariablesAndTypesInternal() {
		ArrayList<Tuple2<TypedVariable, TypeBuilder>> result = new ArrayList<Tuple2<TypedVariable, TypeBuilder>>();
		
		if (variablesOfType == null)
			return result;
		
		for (VariableTyping varsOfTypes : variablesOfType) {
			result.addAll(varsOfTypes.getVariablesAndTypes());
		}
		
		return result;
	}
	
	@Override
	public ArrayList<Tuple2<String, String>> getCompiledVariablesAndTypes() {
		ArrayList<Tuple2<TypedVariable, TypeBuilder>> typedVars = getVariablesAndTypesInternal();
		ArrayList<Tuple2<String, String>> result = new ArrayList<Tuple2<String,String>>();
		
		if (typedVars == null || typedVars.isEmpty())
			return result;
		
		for (Tuple2<TypedVariable, TypeBuilder> typedVar : typedVars) {
			result.add(new Tuple2<String, String>(typedVar.x.getName(), typedVar.y.buildEventBType()));
		}
		
		return result;
	}

	@Override
	public int varCount() {
		int result = 0;
		for (VariableTyping varsOfType : variablesOfType) {
			result += varsOfType.varCount();
		}
		
		return result;
	}

	@Override
	public ArrayList<TypedVariable> getTypedVariableNames() {
		ArrayList<TypedVariable> result = new ArrayList<TypedVariable>();
		if (variablesOfType == null) {
			return result;
		}
		
		for (VariableTyping varsOfType : variablesOfType) {
			Collection<TypedVariable> vars = varsOfType.getTypeVar();
			if (vars != null)
				result.addAll(vars);
		}
		
		return result;
	}

	@Override
	public ArrayList<Tuple2<TypedVariable, TypeBuilder>> getVariablesWithBSharpTypes() {
		ArrayList<Tuple2<TypedVariable, TypeBuilder>> result = new ArrayList<Tuple2<TypedVariable,TypeBuilder>>();
		if (variablesOfType == null)
			return result;
		
		for (VariableTyping varsOfType : variablesOfType) {
			Collection<Tuple2<TypedVariable, TypeBuilder>> typedVars = varsOfType.getVariablesAndTypes();
			if (typedVars != null)
				result.addAll(typedVars);
			
		}
		
		return result;
	}

	@Override
	public boolean isEmpty() {
		return variablesOfType == null || variablesOfType.isEmpty();
	}

	/* returns a list of types, a separate type for each of the variables in the list. */
	@Override
	public Collection<TypeBuilder> getTypes() {
		ArrayList<TypeBuilder> result = new ArrayList<TypeBuilder>();
		
		for (VariableTyping varTyping : variablesOfType) {
			result.addAll(varTyping.getTypesSeparately());
		}
		
		return result;
	}
	
	

} //TypedVariableListImpl
