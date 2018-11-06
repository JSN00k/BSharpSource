/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.TypeDeclContext;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.DatatypeImpl#getConstructors <em>Constructors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatatypeImpl extends ClassDeclImpl implements Datatype {
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
	protected DatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.DATATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeConstructor> getConstructors() {
		if (constructors == null) {
			constructors = new EObjectContainmentEList<DatatypeConstructor>(DatatypeConstructor.class, this, BSharpPackage.DATATYPE__CONSTRUCTORS);
		}
		return constructors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.DATATYPE__CONSTRUCTORS:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BSharpPackage.DATATYPE__CONSTRUCTORS:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BSharpPackage.DATATYPE__CONSTRUCTORS:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case BSharpPackage.DATATYPE__CONSTRUCTORS:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BSharpPackage.DATATYPE__CONSTRUCTORS:
				return constructors != null && !constructors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	
	
	public Collection<EObject> getVariablesNames() {
		ArrayList<EObject> result = new ArrayList<EObject>();
		
		result.add(this);
		
		for (DatatypeConstructor constr : constructors) {
			result.addAll(constr.getVariablesNames());
		}
		
		return result;
	}

	@Override
	public String constructWithTypeContext(TypeDeclContext ctx) {
		// TODO Implement me
		System.out.print("In DatatypeImpl You haven't implemented constructing types using "
				+ "explicit contexts.");
		return null;
	}
	
	@Override
	public String eventBPrefix() {
		// TODO Change this when user defined prefixes are added.
		return name;
	}

	@Override
	public String eventBolymorphicTypeConstructorName() {
		return name;
	}

	@Override
	public void compile() throws Exception {
		System.err.println("Compiling a Datatype is unimplemented. Implement Me! (DatatypeImpl)");
	}

	@Override
	public String eventBTypeConstructorFromTypes() {
		// TODO Auto-generated method stub
		return null;
	}

} //DatatypeImpl
