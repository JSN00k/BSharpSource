/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.TypeInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionCallImpl#getTypeInstance <em>Type Instance</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionCallImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends ExpressionImpl implements FunctionCall {
	/**
	 * The cached value of the '{@link #getTypeInstance() <em>Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected TypeInstance typeInstance;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeInstance getTypeInstance() {
		return typeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeInstance(TypeInstance newTypeInstance, NotificationChain msgs) {
		TypeInstance oldTypeInstance = typeInstance;
		typeInstance = newTypeInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE, oldTypeInstance, newTypeInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeInstance(TypeInstance newTypeInstance) {
		if (newTypeInstance != typeInstance) {
			NotificationChain msgs = null;
			if (typeInstance != null)
				msgs = ((InternalEObject)typeInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE, null, msgs);
			if (newTypeInstance != null)
				msgs = ((InternalEObject)newTypeInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE, null, msgs);
			msgs = basicSetTypeInstance(newTypeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE, newTypeInstance, newTypeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, BSharpPackage.FUNCTION_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE:
				return basicSetTypeInstance(null, msgs);
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE:
				return getTypeInstance();
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				return getArguments();
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
			case BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE:
				setTypeInstance((TypeInstance)newValue);
				return;
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
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
			case BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE:
				setTypeInstance((TypeInstance)null);
				return;
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				getArguments().clear();
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
			case BSharpPackage.FUNCTION_CALL__TYPE_INSTANCE:
				return typeInstance != null;
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String constructLatexExpressionTree(String indent) {
		if (arguments == null || arguments.isEmpty()) {
			String name = typeInst.getDescriptiveName();
			if (name == null)
				name = "noName";
			
			return indent + "$" + name + "$";
		}
		
		String result = indent + "[.$" + typeInst.getTypeName().getName() + "$\n";
		
		for (Expression expr : arguments) {
			result += expr.constructLatexExpressionTree("  " + indent) + "\n";
		}
		
		result += indent + "]";
		
		return result;
	}

} //FunctionCallImpl
