/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.IVarType;
import ac.soton.bsharp.bSharp.NamedObject;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.theory.util.TheoryUtils;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eventb.theory.core.IDatatypeConstructor;
import org.eventb.theory.core.IDatatypeDefinition;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.DATATYPE_CONSTRUCTOR__NAME, oldName, name));
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
				setName((String)newValue);
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
				setName(NAME_EDEFAULT);
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
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BSharpPackage.DATATYPE_CONSTRUCTOR__DECONS:
				return decons != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
				case BSharpPackage.DATATYPE_CONSTRUCTOR__NAME: return BSharpPackage.NAMED_OBJECT__NAME;
				default: return -1;
			}
		}
		if (baseClass == IVarType.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExpressionVariable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypedVariable.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
				case BSharpPackage.NAMED_OBJECT__NAME: return BSharpPackage.DATATYPE_CONSTRUCTOR__NAME;
				default: return -1;
			}
		}
		if (baseClass == IVarType.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ExpressionVariable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TypedVariable.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	public Collection<EObject> getVariablesNames() {
		ArrayList<EObject> result = new ArrayList<EObject>();
		result.add(this);
		return result;
	}

	@Override
	public String descriptiveName() {
		return name;
	}

	@Override
	public Boolean isPredicateVariable() {
		return false;
	}

	@Override
	public TypeBuilder getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String compileToStringWithContextAndArguments(FunctionCall fc, Boolean asPred) {
		String result = name;
		EList<Expression> args = fc.getArguments();
		if (args != null && !args.isEmpty()) {
			result += "(";
			try {
				result += CompilationUtil.compileExpressionListWithSeperator(args, ", ");
			} catch (Exception e) {
				System.err.println("Failed to compile args for match statement with error: " + e.getMessage());
			}
			
			result += ")";
		}
		
		return result;
	}

	@Override
	public Boolean isTypeClassVariable() {
		return false;
	}

	@Override
	public String inferredPolyTypeArgsForType(ClassDecl t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void compileInto(IDatatypeDefinition datatype, IProgressMonitor monitor) {
		IDatatypeConstructor constr = null;
		try {
			constr = TheoryUtils.createConstructor(datatype, name, null, monitor);
		} catch (Exception e) {
			System.err.println("Unable to create datatype constructor with error: " + e.getLocalizedMessage());
			return;
		}
		
		if (decons != null) {
			ArrayList<Tuple2<String, String>> typedVars = decons.getCompiledVariablesAndTypes();
			for (Tuple2<String, String> var : typedVars) {
				try {
					TheoryUtils.createDestructor(constr, var.x, var.y, null, monitor);
				} catch (Exception e) {
					System.err.println("Unable to create datatype destructor with error: " + e.getLocalizedMessage());
				}
				
			}
		}
	}

	
	@Override
	public String opNameForMatchStatement(MatchStatementImpl match) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeBuilder calculateReturnType() {
		Datatype container = (Datatype)this.eContainer();
		TypeConstructor tc = BSharpFactory.eINSTANCE.createTypeConstructor();
		tc.setTypeName(container);
		
		return tc;
	}

	@Override
	public TypeBuilder calculateType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<? extends Tuple2<String, String>> inScopeTypedVariables() {
		return decons.getCompiledVariablesAndTypes();
	}

} //DatatypeConstructorImpl
