/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.MatchCase;
import ac.soton.bsharp.bSharp.TypedVariable;

import java.util.ArrayList;
import java.util.Collection;

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
 * An implementation of the model object '<em><b>Match Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.MatchCaseImpl#getDeconName <em>Decon Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.MatchCaseImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.MatchCaseImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchCaseImpl extends MinimalEObjectImpl.Container implements MatchCase {
	/**
	 * The cached value of the '{@link #getDeconName() <em>Decon Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeconName()
	 * @generated
	 * @ordered
	 */
	protected TypedVariable deconName;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<TypedVariable> variables;

	/**
	 * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpr()
	 * @generated
	 * @ordered
	 */
	protected Expression expr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.MATCH_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariable getDeconName() {
		if (deconName != null && deconName.eIsProxy()) {
			InternalEObject oldDeconName = (InternalEObject)deconName;
			deconName = (TypedVariable)eResolveProxy(oldDeconName);
			if (deconName != oldDeconName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.MATCH_CASE__DECON_NAME, oldDeconName, deconName));
			}
		}
		return deconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariable basicGetDeconName() {
		return deconName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeconName(TypedVariable newDeconName) {
		TypedVariable oldDeconName = deconName;
		deconName = newDeconName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.MATCH_CASE__DECON_NAME, oldDeconName, deconName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<TypedVariable>(TypedVariable.class, this, BSharpPackage.MATCH_CASE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getExpr() {
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs) {
		Expression oldExpr = expr;
		expr = newExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.MATCH_CASE__EXPR, oldExpr, newExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpr(Expression newExpr) {
		if (newExpr != expr) {
			NotificationChain msgs = null;
			if (expr != null)
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.MATCH_CASE__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.MATCH_CASE__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.MATCH_CASE__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.MATCH_CASE__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case BSharpPackage.MATCH_CASE__EXPR:
				return basicSetExpr(null, msgs);
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
			case BSharpPackage.MATCH_CASE__DECON_NAME:
				if (resolve) return getDeconName();
				return basicGetDeconName();
			case BSharpPackage.MATCH_CASE__VARIABLES:
				return getVariables();
			case BSharpPackage.MATCH_CASE__EXPR:
				return getExpr();
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
			case BSharpPackage.MATCH_CASE__DECON_NAME:
				setDeconName((TypedVariable)newValue);
				return;
			case BSharpPackage.MATCH_CASE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends TypedVariable>)newValue);
				return;
			case BSharpPackage.MATCH_CASE__EXPR:
				setExpr((Expression)newValue);
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
			case BSharpPackage.MATCH_CASE__DECON_NAME:
				setDeconName((TypedVariable)null);
				return;
			case BSharpPackage.MATCH_CASE__VARIABLES:
				getVariables().clear();
				return;
			case BSharpPackage.MATCH_CASE__EXPR:
				setExpr((Expression)null);
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
			case BSharpPackage.MATCH_CASE__DECON_NAME:
				return deconName != null;
			case BSharpPackage.MATCH_CASE__VARIABLES:
				return variables != null && !variables.isEmpty();
			case BSharpPackage.MATCH_CASE__EXPR:
				return expr != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Collection<EObject> getVariablesNames() {		
		ArrayList<EObject> result = new ArrayList<EObject>();
		
		result.add(this);
		if (variables == null) {
			return result;
		}
		
		result.addAll(variables);
		return result;
	}

} //MatchCaseImpl
