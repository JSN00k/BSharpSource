/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.QuantLambda;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quant Lambda</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.QuantLambdaImpl#getQType <em>QType</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.QuantLambdaImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.QuantLambdaImpl#getVarList <em>Var List</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.QuantLambdaImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 */
public class QuantLambdaImpl extends ExpressionImpl implements QuantLambda {
	/**
	 * The default value of the '{@link #getQType() <em>QType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQType()
	 * @generated
	 * @ordered
	 */
	protected static final String QTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQType() <em>QType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQType()
	 * @generated
	 * @ordered
	 */
	protected String qType = QTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected PolyContext context;

	/**
	 * The cached value of the '{@link #getVarList() <em>Var List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarList()
	 * @generated
	 * @ordered
	 */
	protected TypedVariableList varList;

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
	protected QuantLambdaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.QUANT_LAMBDA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQType() {
		return qType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQType(String newQType) {
		String oldQType = qType;
		qType = newQType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.QUANT_LAMBDA__QTYPE, oldQType, qType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(PolyContext newContext, NotificationChain msgs) {
		PolyContext oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.QUANT_LAMBDA__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(PolyContext newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.QUANT_LAMBDA__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.QUANT_LAMBDA__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.QUANT_LAMBDA__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariableList getVarList() {
		return varList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarList(TypedVariableList newVarList, NotificationChain msgs) {
		TypedVariableList oldVarList = varList;
		varList = newVarList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.QUANT_LAMBDA__VAR_LIST, oldVarList, newVarList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarList(TypedVariableList newVarList) {
		if (newVarList != varList) {
			NotificationChain msgs = null;
			if (varList != null)
				msgs = ((InternalEObject)varList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.QUANT_LAMBDA__VAR_LIST, null, msgs);
			if (newVarList != null)
				msgs = ((InternalEObject)newVarList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.QUANT_LAMBDA__VAR_LIST, null, msgs);
			msgs = basicSetVarList(newVarList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.QUANT_LAMBDA__VAR_LIST, newVarList, newVarList));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.QUANT_LAMBDA__EXPR, oldExpr, newExpr);
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
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.QUANT_LAMBDA__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.QUANT_LAMBDA__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.QUANT_LAMBDA__EXPR, newExpr, newExpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.QUANT_LAMBDA__CONTEXT:
				return basicSetContext(null, msgs);
			case BSharpPackage.QUANT_LAMBDA__VAR_LIST:
				return basicSetVarList(null, msgs);
			case BSharpPackage.QUANT_LAMBDA__EXPR:
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
			case BSharpPackage.QUANT_LAMBDA__QTYPE:
				return getQType();
			case BSharpPackage.QUANT_LAMBDA__CONTEXT:
				return getContext();
			case BSharpPackage.QUANT_LAMBDA__VAR_LIST:
				return getVarList();
			case BSharpPackage.QUANT_LAMBDA__EXPR:
				return getExpr();
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
			case BSharpPackage.QUANT_LAMBDA__QTYPE:
				setQType((String)newValue);
				return;
			case BSharpPackage.QUANT_LAMBDA__CONTEXT:
				setContext((PolyContext)newValue);
				return;
			case BSharpPackage.QUANT_LAMBDA__VAR_LIST:
				setVarList((TypedVariableList)newValue);
				return;
			case BSharpPackage.QUANT_LAMBDA__EXPR:
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
			case BSharpPackage.QUANT_LAMBDA__QTYPE:
				setQType(QTYPE_EDEFAULT);
				return;
			case BSharpPackage.QUANT_LAMBDA__CONTEXT:
				setContext((PolyContext)null);
				return;
			case BSharpPackage.QUANT_LAMBDA__VAR_LIST:
				setVarList((TypedVariableList)null);
				return;
			case BSharpPackage.QUANT_LAMBDA__EXPR:
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
			case BSharpPackage.QUANT_LAMBDA__QTYPE:
				return QTYPE_EDEFAULT == null ? qType != null : !QTYPE_EDEFAULT.equals(qType);
			case BSharpPackage.QUANT_LAMBDA__CONTEXT:
				return context != null;
			case BSharpPackage.QUANT_LAMBDA__VAR_LIST:
				return varList != null;
			case BSharpPackage.QUANT_LAMBDA__EXPR:
				return expr != null;
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
		result.append(" (qType: ");
		result.append(qType);
		result.append(')');
		return result.toString();
	}

	@Override
	public String constructLatexExpressionTree(String indent) {
		String result = "[.$" + qType + "$\n";
		result += expr.constructLatexExpressionTree("  " + indent) + "\n";
		result += indent + "]";
		return result;
	}

	@Override
	public Collection<EObject> getVariablesNames() {
		ArrayList<EObject> result = new ArrayList<EObject>();
		result.addAll(EcoreUtil2.getAllContentsOfType(varList, TypedVariable.class));
		return result;
	}

	@Override
	public Collection<PolyType> getPolyTypeNames() {
		if (getContext() == null) {
			return Collections.emptyList();
		}
		
		return EcoreUtil2.getAllContentsOfType(getContext(), PolyType.class);
	}

	@Override
	public String compileToEventBString(Boolean asPredicate) throws Exception {
		/* Polymorphic contexts make this a little more complex. There are two possibilities
		 * either the polymorphic context can become direct arguments to an EventB Quantifier/Lambda
		 * or an additional operator could be generated which given the polymorphic context
		 * generates a lambda which can then be evaluated.
		 * 
		 * In the case of QuantLambdas the approach is to compile the polycontext directly 
		 * to eventB equivalents.
		 */
		
		String result = qType;
		
		
		ArrayList<Tuple2<String, String>> typedVariables = null;
		if (context != null) {
			typedVariables = context.namesAndTypesForPolyContext();
		}
		
		if (varList != null) {
			ArrayList<Tuple2<String, String>> vars = varList.getCompiledVariablesAndTypes();
			if (typedVariables == null) {
				typedVariables = vars;
			} else if (vars != null) {
				typedVariables.addAll(vars);
			}
		}
		
		if (typedVariables == null || typedVariables.isEmpty()) {
			throw new Exception("QuantLambdaImpl tried to compile without any arguments.");
		}
		
		String sep = qType.equals("λ") ? " ↦ " : ", ";
		
		result += CompilationUtil.compileTypedVariablesToNameListWithSeparator(typedVariables,
				sep, true);
		
		result += "·";
		
		result += CompilationUtil.compileTypedVaribalesToTypedList(typedVariables, true);
		
		if (qType.equals("λ")) {
			result += " ∣ ";
		} else {
			result += " ∧ ";
		}
		
		result += expr.compileToEventBString(true);
		
		if (asPredicate) {
			return result;
		} else {
			return "bool(" + result + ")";
		}
	}

	@Override
	public Integer eventBPrecedence(Boolean whenPredicate) {
		return 2;
	}

} //QuantLambdaImpl
