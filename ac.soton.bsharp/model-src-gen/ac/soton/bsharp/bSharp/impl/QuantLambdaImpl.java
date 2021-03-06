/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.IExpressionContainer;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.Infix;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.QuantLambda;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
	@Override
	public String getQType() {
		return qType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	
	/* SET_COMP may be an unexpected addition here and requires some explanation.
	 * In Event-B lambdas can only return expressions. If a lambda is expected 
	 * instead to return a predicate a different approach is taken. A compiled 
	 * lambda has the form:
	 * λ paramDecl \cdot typingConditions \bar expression
	 * When this lambda is called it could be turned into a predicate by appending "= TRUE"
	 * the generated effect would likely be: bool(expr) = TRUE (not nice when proving). as
	 * the expression generated by the lambda must be a predicate expression so would need to 
	 * be instantly turned into an EventB BOOL.
	 * If instead a SET_COMP is generated we get the following:
	 * { paramDecl \bar typingConditions \wedge expression }
	 * The end resulting expression args : SET_COMP, which saves the wrapping and unwrapping 
	 * from the EventB BOOL type.
	 */
	public enum QuantLambdaType {
		FORALL, EXISTS, LAMBDA, SET_COMP
	}
	
	@Override
	public QuantLambdaType quantLambdaType() {
		if (qType.equals("∀")) {
			return QuantLambdaType.FORALL;
		} else if (qType.equals("∃")) {
			return QuantLambdaType.EXISTS;
		} else {
			return QuantLambdaType.LAMBDA;
		}
	}
	
	@Override
	public void setQuantLambdaType(QuantLambdaType type) {
		switch (type) {
		case FORALL:
			setQType("∀");
			break;
		case EXISTS:
			setQType("∃");;
			break;
		case LAMBDA:
			setQType("λ");;
			break;
		}
	}

	@Override
	public String constructLatexExpressionTree(String indent) {
		String qString = null;
		QuantLambdaType type = quantLambdaType();
		
		switch (type) {
		case FORALL:
			qString = "\\forall";
			break;
		case EXISTS:
			qString = "\\exists";
			break;
		case LAMBDA:
			qString = "\\lambda";
			break;
		}
		
		String result = "[.$" + qString + "$\n";
		result += expr.constructLatexExpressionTree("  " + indent) + "\n";
		result += indent + "]";
		return result;
	}

	@Override
	public Collection<ExpressionVariable> getVariablesNames() {
		ArrayList<ExpressionVariable> result = new ArrayList<ExpressionVariable>();
		result.addAll(EcoreUtil2.getAllContentsOfType(varList, TypedVariable.class));
		return result;
	}

	@Override
	public List<PolyType> getPolyTypeNames() {
		PolyContext ctx = getContext();
		if (getContext() == null) {
			return Collections.emptyList();
		}
		
		return ctx.getPolyTypes();
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
		QuantLambdaType type = quantLambdaType();
		if (type == QuantLambdaType.LAMBDA && asPredicate) {
			type = QuantLambdaType.SET_COMP;
			result = "{";
		}
		
		
		ArrayList<Tuple2<String, String>> typedVariables = null;
		if (context != null) {
			typedVariables = context.namesAndTypesForPolyContext(null);
		}
		
		if (varList != null) {
			ArrayList<Tuple2<String, String>> vars = varList.getCompiledVariablesAndTypes();
			if (typedVariables == null) {
				typedVariables = vars;
			} else if (vars != null) {
				typedVariables.addAll(vars);
			}
		}
		
		if ((typedVariables == null || typedVariables.isEmpty())) {
			throw new Exception("QuantLambdaImpl tried to compile without any arguments.");
		}
		
		String sep = type == QuantLambdaType.LAMBDA || type == QuantLambdaType.SET_COMP ? " ↦ " : ", ";
		
		if (typedVariables != null) {
			result += CompilationUtil.compileTypedVariablesToNameListWithSeparator(typedVariables, sep, true);
		}
		
		if (type == QuantLambdaType.SET_COMP) {
			result += " ∣ ";
		} else {
			result += "·";
		}

		if (typedVariables != null) {
			result += CompilationUtil.compileTypedVaribalesToTypedList(typedVariables, true);
		}
		
		switch (type) {
		case FORALL:
			result += " ⇒ ";
			break;
		case EXISTS:
		case SET_COMP:
			result += " ∧ ";
			break;
		case LAMBDA:
			result += " ∣ ";
			break;
		}
		
		/* TODO: Consult EventB precedence to reduce number of brackets */
		boolean resultRequiresParens = expr instanceof Infix 
				|| (type == QuantLambdaType.FORALL && expr instanceof QuantLambda && ((QuantLambda)expr).quantLambdaType() == QuantLambdaType.FORALL)
				|| ((type == QuantLambdaType.EXISTS || type ==  QuantLambdaType.FORALL) && expr instanceof QuantLambda && (((QuantLambda)expr).quantLambdaType() == QuantLambdaType.EXISTS || ((QuantLambda)expr).quantLambdaType() == QuantLambdaType.FORALL));
		if (resultRequiresParens) {
			result += "(";
		}
		
		boolean quantLambdaIsPred = type != QuantLambdaType.LAMBDA && type != QuantLambdaType.SET_COMP;
		result += expr.compileToEventBString(quantLambdaIsPred);
		
		if (resultRequiresParens) {
			result += ")";
		}
		
		if (type == QuantLambdaType.SET_COMP) {
			result += " }";
		}
		
		/* If I am compiling a forall, or exists this may need to return an expression,
		 * in which case it needs to be encapsulated in "bool(...)" If I am compiling a 
		 * lambda asPred describes the return type of the lambda rather than trying
		 * to get a boolean from a lambda expression. In this case a Set comprehension
		 * expression is generated instead of the lambda, when the lambda is called 
		 * it becomes a |-> b \in SetComp.
		 */
		if (quantLambdaIsPred) {
			if (asPredicate)
				return result;
			else
				return "bool(" + result + ")";
		}
		
		return result;
	}

	@Override
	public Integer eventBPrecedence(Boolean whenPredicate) {
		if (quantLambdaType() == QuantLambdaType.FORALL) {
			return 0;
		}
		return 2;
	}

	@Override
	public Boolean requiresInferredContext() {
		return expr.requiresInferredContext();
	}

	@Override
	public Expression reorderExpresionTree() {
		if (reordered) {
			return this;
		}
		
		reordered = true;
		
		expr = expr.reorderExpresionTree();
		return this;
	}

	@Override
	public String inferredPolyTypeArgsForType(ClassDecl t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean referencesContainingType() {
//		TypedVariableList varList = getVarList();
//		if (varList.referencesContainingType())
//			return true;
		
		return expr.referencesContainingType();
	}

	@Override
	public String baseTypeForBSClass(BSClass typeName) {
		/* The only time that I think this needs to be used is when the containing class 
		 * is referenced within the expression. Currently I use the same variable names
		 * that are used when creating the type class.
		 */
		return typeName.baseTypeFromBSContext();
	}

	@Override
	public String getNameExpressionForVariable(TypedVariable typedVariable) {
		/* The variable may reference a instance variable of the current type class, in this case we need 
		 * to deconstruct the current type class. This requires knowing what the inferred type class is
		 * called. This is generated here. */
		return typedVariable.getName();
	}

	@Override
	public String opNameForMatchStatement(MatchStatementImpl match) {
		/* pass on up (the quant lambda is not in charge of nameing things). */
		IVariableProvider varProv = EcoreUtil2.getContainerOfType(this.eContainer(), IVariableProvider.class);
		return varProv.opNameForMatchStatement(match);
	}

	@Override
	public TypeBuilder calculateType() {
		TypeConstructor tc =  BSharpFactory.eINSTANCE.createTypeConstructor();
		Datatype bool = BSharpFactory.eINSTANCE.createDatatype();
		bool.setName("Bool");
		tc.setTypeName(bool);
		
		return tc;
	}

	@Override
	public Collection<? extends Tuple2<String, String>> inScopeTypedVariables() {
		IVariableProvider prov = EcoreUtil2.getContainerOfType(this.eContainer(), IVariableProvider.class);
		
		ArrayList<Tuple2<String, String>> result = new ArrayList<Tuple2<String,String>>();
		Collection<? extends Tuple2<String, String>> superScopeTypes = prov.inScopeTypedVariables();
		
		if (superScopeTypes != null)
			result.addAll(superScopeTypes);
		
		EObject container = eContainer();
		if (!(container instanceof FunctionDecl) || !((FunctionDecl) container).getGeneratedLambdas().contains(this)) {
			result.addAll(varList.getCompiledVariablesAndTypes());
		}
		
		
		if (result.isEmpty()) {
			return null;
		}
		
		return result;
	}

	@Override
	public ITypeInstance getClassTypeInst() {
		// TODO Auto-generated method stub
		return null;
	}
} //QuantLambdaImpl
