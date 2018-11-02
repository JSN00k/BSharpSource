/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.QuantLambda;
import ac.soton.bsharp.bSharp.Where;

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
 * An implementation of the model object '<em><b>Where</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.WhereImpl#getExpessions <em>Expessions</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.WhereImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhereImpl extends MinimalEObjectImpl.Container implements Where {
	/**
	 * The cached value of the '{@link #getExpessions() <em>Expessions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpessions()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantLambda> expessions;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.WHERE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantLambda> getExpessions() {
		if (expessions == null) {
			expessions = new EObjectContainmentEList<QuantLambda>(QuantLambda.class, this, BSharpPackage.WHERE__EXPESSIONS);
		}
		return expessions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<Expression>(Expression.class, this, BSharpPackage.WHERE__EXPRESSIONS);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.WHERE__EXPESSIONS:
				return ((InternalEList<?>)getExpessions()).basicRemove(otherEnd, msgs);
			case BSharpPackage.WHERE__EXPRESSIONS:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case BSharpPackage.WHERE__EXPESSIONS:
				return getExpessions();
			case BSharpPackage.WHERE__EXPRESSIONS:
				return getExpressions();
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
			case BSharpPackage.WHERE__EXPESSIONS:
				getExpessions().clear();
				getExpessions().addAll((Collection<? extends QuantLambda>)newValue);
				return;
			case BSharpPackage.WHERE__EXPRESSIONS:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends Expression>)newValue);
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
			case BSharpPackage.WHERE__EXPESSIONS:
				getExpessions().clear();
				return;
			case BSharpPackage.WHERE__EXPRESSIONS:
				getExpressions().clear();
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
			case BSharpPackage.WHERE__EXPESSIONS:
				return expessions != null && !expessions.isEmpty();
			case BSharpPackage.WHERE__EXPRESSIONS:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String compileToEventBPredStatements() {
		if (expressions == null || expressions.isEmpty()) {
			return "";
		}
		
		Boolean first = true;
		String result = "";
		for (Expression expr : expressions) {
			if (!first) {
				result += "∧";
			}
			
			first = false;
			
			/* These expressions have to compile to predicates. */
			try {
				result += expr.compileToEventBString(true);
			} catch (Exception e) {
				System.err.print("Failed to compile expression as boolean with error: " + e.getLocalizedMessage());
			}
			
		}
		
		return result;
	}

} //WhereImpl
