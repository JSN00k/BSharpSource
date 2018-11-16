/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.IEventBPrefixProvider;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.IVarType;
import ac.soton.bsharp.bSharp.NamedObject;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.QuantLambda;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;
import ac.soton.bsharp.util.BSharpUtil;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.PolymorphicDispatcher.WarningErrorHandler;
import org.eventb.core.ast.extension.IOperatorProperties.FormulaType;
import org.eventb.core.ast.extension.IOperatorProperties.Notation;
import org.eventb.theory.core.INewOperatorDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionDeclImpl#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionDeclImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionDeclImpl#getVarList <em>Var List</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionDeclImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionDeclImpl#getInfix <em>Infix</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionDeclImpl#getPrecedence <em>Precedence</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionDeclImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDeclImpl extends MinimalEObjectImpl.Container implements FunctionDecl {
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
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected TypeConstructor returnType;

	/**
	 * The default value of the '{@link #getInfix() <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfix()
	 * @generated
	 * @ordered
	 */
	protected static final String INFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInfix() <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfix()
	 * @generated
	 * @ordered
	 */
	protected String infix = INFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecedence() <em>Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected static final int PRECEDENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrecedence() <em>Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedence()
	 * @generated
	 * @ordered
	 */
	protected int precedence = PRECEDENCE_EDEFAULT;

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
	protected FunctionDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.FUNCTION_DECL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_DECL__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_DECL__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__CONTEXT, newContext, newContext));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__VAR_LIST, oldVarList, newVarList);
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
				msgs = ((InternalEObject)varList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_DECL__VAR_LIST, null, msgs);
			if (newVarList != null)
				msgs = ((InternalEObject)newVarList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_DECL__VAR_LIST, null, msgs);
			msgs = basicSetVarList(newVarList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__VAR_LIST, newVarList, newVarList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstructor getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(TypeConstructor newReturnType, NotificationChain msgs) {
		TypeConstructor oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(TypeConstructor newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_DECL__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_DECL__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInfix() {
		return infix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfix(String newInfix) {
		String oldInfix = infix;
		infix = newInfix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__INFIX, oldInfix, infix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrecedence() {
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedence(int newPrecedence) {
		int oldPrecedence = precedence;
		precedence = newPrecedence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__PRECEDENCE, oldPrecedence, precedence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__EXPR, oldExpr, newExpr);
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
				msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_DECL__EXPR, null, msgs);
			if (newExpr != null)
				msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_DECL__EXPR, null, msgs);
			msgs = basicSetExpr(newExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__EXPR, newExpr, newExpr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_DECL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.FUNCTION_DECL__CONTEXT:
				return basicSetContext(null, msgs);
			case BSharpPackage.FUNCTION_DECL__VAR_LIST:
				return basicSetVarList(null, msgs);
			case BSharpPackage.FUNCTION_DECL__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case BSharpPackage.FUNCTION_DECL__EXPR:
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
			case BSharpPackage.FUNCTION_DECL__NAME:
				return getName();
			case BSharpPackage.FUNCTION_DECL__CONTEXT:
				return getContext();
			case BSharpPackage.FUNCTION_DECL__VAR_LIST:
				return getVarList();
			case BSharpPackage.FUNCTION_DECL__RETURN_TYPE:
				return getReturnType();
			case BSharpPackage.FUNCTION_DECL__INFIX:
				return getInfix();
			case BSharpPackage.FUNCTION_DECL__PRECEDENCE:
				return getPrecedence();
			case BSharpPackage.FUNCTION_DECL__EXPR:
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
			case BSharpPackage.FUNCTION_DECL__NAME:
				setName((String)newValue);
				return;
			case BSharpPackage.FUNCTION_DECL__CONTEXT:
				setContext((PolyContext)newValue);
				return;
			case BSharpPackage.FUNCTION_DECL__VAR_LIST:
				setVarList((TypedVariableList)newValue);
				return;
			case BSharpPackage.FUNCTION_DECL__RETURN_TYPE:
				setReturnType((TypeConstructor)newValue);
				return;
			case BSharpPackage.FUNCTION_DECL__INFIX:
				setInfix((String)newValue);
				return;
			case BSharpPackage.FUNCTION_DECL__PRECEDENCE:
				setPrecedence((Integer)newValue);
				return;
			case BSharpPackage.FUNCTION_DECL__EXPR:
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
			case BSharpPackage.FUNCTION_DECL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BSharpPackage.FUNCTION_DECL__CONTEXT:
				setContext((PolyContext)null);
				return;
			case BSharpPackage.FUNCTION_DECL__VAR_LIST:
				setVarList((TypedVariableList)null);
				return;
			case BSharpPackage.FUNCTION_DECL__RETURN_TYPE:
				setReturnType((TypeConstructor)null);
				return;
			case BSharpPackage.FUNCTION_DECL__INFIX:
				setInfix(INFIX_EDEFAULT);
				return;
			case BSharpPackage.FUNCTION_DECL__PRECEDENCE:
				setPrecedence(PRECEDENCE_EDEFAULT);
				return;
			case BSharpPackage.FUNCTION_DECL__EXPR:
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
			case BSharpPackage.FUNCTION_DECL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BSharpPackage.FUNCTION_DECL__CONTEXT:
				return context != null;
			case BSharpPackage.FUNCTION_DECL__VAR_LIST:
				return varList != null;
			case BSharpPackage.FUNCTION_DECL__RETURN_TYPE:
				return returnType != null;
			case BSharpPackage.FUNCTION_DECL__INFIX:
				return INFIX_EDEFAULT == null ? infix != null : !INFIX_EDEFAULT.equals(infix);
			case BSharpPackage.FUNCTION_DECL__PRECEDENCE:
				return precedence != PRECEDENCE_EDEFAULT;
			case BSharpPackage.FUNCTION_DECL__EXPR:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IPolyTypeProvider.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
				case BSharpPackage.FUNCTION_DECL__NAME: return BSharpPackage.NAMED_OBJECT__NAME;
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
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IPolyTypeProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
				case BSharpPackage.NAMED_OBJECT__NAME: return BSharpPackage.FUNCTION_DECL__NAME;
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
		result.append(", infix: ");
		result.append(infix);
		result.append(", precedence: ");
		result.append(precedence);
		result.append(')');
		return result.toString();
	}
	
	protected IProgressMonitor nullMonitor = new NullProgressMonitor();
	
	@Override
	public Collection<EObject> getVariablesNames() {
		ArrayList<EObject> result = new ArrayList<EObject>();
		result.addAll(EcoreUtil2.getAllContentsOfType(varList, TypedVariable.class));
		return result;
	}

	@Override
	public Collection<PolyType> getPolyTypeNames() {
		return EcoreUtil2.getAllContentsOfType(getContext(), PolyType.class);
	}

	@Override
	public String descriptiveName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String eventBPredName() throws Exception {
		if (context != null || !(returnType instanceof TypeConstructor) || !((TypeConstructor)returnType).getTypeName().getName().equals("Bool")) {
			throw new Exception("In FunctionDeclImpl tried to get a EventB predicate function for non-boolean function type");
		}
		
		return eventBExprName() + "_Pred";
	}

	@Override
	public boolean hasEventBInfix() throws Exception {
		if (!infix.isEmpty()) {
			if (varList.varCount() != 2) {
				//TODO: validation.
				throw new Exception("In FunctionDeclImpl when compiling got infix operator with more than 2 variables. This"
						+ " should be validated against.");
			}
			
			return context == null;
		}
		
		return false;
	}

	@Override
	public String eventBExprName() {
		/* Add a new type EventBPrefixProvider type. */
		IEventBPrefixProvider provider = EcoreUtil2.getContainerOfType(this, IEventBPrefixProvider.class);
		return provider.eventBPrefix() + name;
	}

	@Override
	public String callWithTypeContext(TypeDeclContext context) {
		// TODO Implement me
		System.err.print("In FunctionDeclImpl callWithTypeContext(TypeDeclContext context) is unimplemented\n");
		return null;
	}

	@Override
	public void compile() {
		/* There are functions with polymorphic contexts, functions with inferred polymorphic contexts,
		 * (They use types from the class that they are declared in), and functions which only work on 
		 * the passed variables. Functions that have polymorphic contexts inferred or otherwise will 
		 * work by having an eventB operator that takes the polymorphic context as the argument, and 
		 * generates a lambda which is then called with the function arguments.
		 */
		ArrayList<Tuple2<String, String>> polyContext = null;
		
		if (expr.hasInferredContext()) {
			ClassDecl containerClass = EcoreUtil2.getContainerOfType(this, ClassDecl.class);
			polyContext = containerClass.typedConstructionArgs();
		}
		
		if (context != null) {
			TheoryImportCache thyCache = CompilationUtil.getTheoryCacheForElement(this);
			ArrayList<Tuple2<String, String>> contextPolyContext = context.namesAndTypesForPolyContext(thyCache);
			
			if (polyContext == null ) {
				polyContext = contextPolyContext;
			} else {
				polyContext.addAll(contextPolyContext);
			}
		}
		
		if (polyContext != null ) {
			compileWithPolyContext(polyContext);
		} else {
			compileWithoutPolyContext();
		}
	}
	
	void compileWithPolyContext(ArrayList<Tuple2<String, String>> pContext) {
		expr = expr.reorderExpresionTree();
		
		QuantLambda lambda = BSharpFactory.eINSTANCE.createQuantLambda();
		lambda.setQType("λ");
		lambda.setVarList(varList);
		lambda.setExpr(expr);
		
		TheoryImportCache thyCache = CompilationUtil.getTheoryCacheForElement(this);
		INewOperatorDefinition op;
		try {
			op = CompilationUtil.createOpWithArguments(thyCache, name, pContext);
		} catch (Exception e) {
			System.err.println("Unable to create op in FunctionDeclImplementation with Error: " + e.getLocalizedMessage());
			return;
		}
		
		try {
			TheoryUtils.createDirectDefinition(op, lambda.compileToEventBString(false), null, nullMonitor);
		} catch (Exception e) {
			System.err.println("Unable to create operator definition for op: " + name + "in FunctionDecl");
		}
		
		return;
	}
	
	String passableName() {
		return name + "_P";
	}
	
	void compileWithoutPolyContext() {
		expr = expr.reorderExpresionTree();
		
		ArrayList<Tuple2<String, String>> args = varList.getCompiledVariablesAndTypes();
		TheoryImportCache thyCache = CompilationUtil.getTheoryCacheForElement(this);
		INewOperatorDefinition op;
		
		try {
			op = CompilationUtil.createOpWithArguments(thyCache, name, args);
		} catch (Exception e) {
			System.err.println("Unable to create op in FunctionDeclImplementation with Error: " + e.getLocalizedMessage());
			return;
		}
		
		try {
			TheoryUtils.createDirectDefinition(op, expr.compileToEventBString(false), null, nullMonitor);
		} catch (Exception e) {
			System.err.println("Unable to create operator definition for op: " + name + "in FunctionDecl");
		}
		
		if (returnType.isBoolType()) {
			/* Create a predicate version of the function. */
			try {
				op = CompilationUtil.createPredOpWithArguments(thyCache, name, args);
			} catch (Exception e) {
				System.err.println("Unable to create op in FunctionDeclImplementation with Error: " + e.getLocalizedMessage());
				return;
			}
			
			try {
				TheoryUtils.createDirectDefinition(op, expr.compileToEventBString(true), null, nullMonitor);
			} catch (Exception e) {
				System.err.println("Unable to create operator definition for op: " + name + "in FunctionDecl");
			}
		}
		
		/* Build the passable form of the function. */
		try {
			op = TheoryUtils.createOperator(thyCache.theory, passableName(), false, false, FormulaType.EXPRESSION,
					Notation.PREFIX, null, nullMonitor);
		} catch (Exception e) {
			System.err.println("Unable to create op in FunctionDeclImplementation with Error: " + e.getLocalizedMessage());
			return;
		}
		
		/* There's already code to compile a lambda to EventB therefore it's easier to generate
		 * a BSharp lambda and compile it, then it is to re-write code to generate a EventB lambda.
		 */
		QuantLambda lambda = BSharpFactory.eINSTANCE.createQuantLambda();
		lambda.setQType("λ");
		lambda.setVarList(varList);
		FunctionCall func = BSharpFactory.eINSTANCE.createFunctionCall();
		func.setTypeInst(this);
		EList<Expression> callArgs = func.getArguments();
		
		ArrayList<TypedVariable> variables = varList.getTypedVariableNames();
		ArrayList<FunctionCall> wrappedVariables = new ArrayList<FunctionCall>();
		for (TypedVariable var : variables) {
			FunctionCall wrappedVar = BSharpFactory.eINSTANCE.createFunctionCall();
			wrappedVar.setTypeInst(var);
		}
		
		callArgs.addAll(wrappedVariables);
		lambda.setExpr(func);
		
		try {
			TheoryUtils.createDirectDefinition(op, lambda.compileToEventBString(false), null, nullMonitor);
		} catch (Exception e) {
			System.err.println("Unable to create operator definition for op: " + name + "in FunctionDecl");
		}		
	}

	@Override
	public String compileToStringWithContextAndArguments(FunctionCall fc, Boolean asPred) {
		// TODO Auto-generated method stub
		return null;
	}

} //FunctionDeclImpl
