/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.MatchCase;
import ac.soton.bsharp.bSharp.MatchStatement;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.services.BSharpGrammarAccess.BuilderElemElements;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.EcoreUtil2;
import org.eventb.core.ast.extension.IOperatorProperties.Notation;
import org.eventb.theory.core.INewOperatorDefinition;
import org.eventb.theory.core.IRecursiveOperatorDefinition;
import org.eventb.theory.core.ITheoryRoot;
import org.rodinp.core.IInternalElement;

import com.google.common.collect.ImmutableBiMap.Builder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.MatchStatementImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.MatchStatementImpl#getInductCase <em>Induct Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchStatementImpl extends ExpressionImpl implements MatchStatement {
	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected Expression match;

	/**
	 * The cached value of the '{@link #getInductCase() <em>Induct Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInductCase()
	 * @generated
	 * @ordered
	 */
	protected EList<MatchCase> inductCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.MATCH_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getMatch() {
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatch(Expression newMatch, NotificationChain msgs) {
		Expression oldMatch = match;
		match = newMatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.MATCH_STATEMENT__MATCH, oldMatch, newMatch);
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
	public void setMatch(Expression newMatch) {
		if (newMatch != match) {
			NotificationChain msgs = null;
			if (match != null)
				msgs = ((InternalEObject)match).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.MATCH_STATEMENT__MATCH, null, msgs);
			if (newMatch != null)
				msgs = ((InternalEObject)newMatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.MATCH_STATEMENT__MATCH, null, msgs);
			msgs = basicSetMatch(newMatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.MATCH_STATEMENT__MATCH, newMatch, newMatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatchCase> getInductCase() {
		if (inductCase == null) {
			inductCase = new EObjectContainmentEList<MatchCase>(MatchCase.class, this, BSharpPackage.MATCH_STATEMENT__INDUCT_CASE);
		}
		return inductCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.MATCH_STATEMENT__MATCH:
				return basicSetMatch(null, msgs);
			case BSharpPackage.MATCH_STATEMENT__INDUCT_CASE:
				return ((InternalEList<?>)getInductCase()).basicRemove(otherEnd, msgs);
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
			case BSharpPackage.MATCH_STATEMENT__MATCH:
				return getMatch();
			case BSharpPackage.MATCH_STATEMENT__INDUCT_CASE:
				return getInductCase();
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
			case BSharpPackage.MATCH_STATEMENT__MATCH:
				setMatch((Expression)newValue);
				return;
			case BSharpPackage.MATCH_STATEMENT__INDUCT_CASE:
				getInductCase().clear();
				getInductCase().addAll((Collection<? extends MatchCase>)newValue);
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
			case BSharpPackage.MATCH_STATEMENT__MATCH:
				setMatch((Expression)null);
				return;
			case BSharpPackage.MATCH_STATEMENT__INDUCT_CASE:
				getInductCase().clear();
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
			case BSharpPackage.MATCH_STATEMENT__MATCH:
				return match != null;
			case BSharpPackage.MATCH_STATEMENT__INDUCT_CASE:
				return inductCase != null && !inductCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String constructLatexExpressionTree(String indent) {
		String result = indent + "[.$match\\ " + getMatch() + "$ \n";
		EList<MatchCase> cases = getInductCase();
		for (MatchCase matchCase : cases) {
			result += "[.$" + matchCase.getDeconName() + "$\n";
			result += matchCase.getExpr().constructLatexExpressionTree("  " + indent);
		}
		
		return result;
	}

	@Override
	public String compileToEventBString(Boolean asPredicate) throws Exception {
		/* If the match statement is at the top of a function with no polycontext 
		 * then compileToRecursiveDefs is called directly by the function. Otherwise
		 * the match statement is compiled to a new recursive function, and this function
		 * is then called.
		 */
		
		/* The naming of the match statment is controlled by the variable provider (e.g., the 
		 * thing that the statement expression is found within.
		 */
		
		IVariableProvider prov = EcoreUtil2.getContainerOfType(this, IVariableProvider.class);
		String opName = prov.opNameForMatchStatement(this);
		
		ArrayList<Tuple2<String, String>> args = new ArrayList<Tuple2<String, String>>();
		String recName = null;
		
		if (!match.isInstanceVariable()) {
			/* Check that the type of match is a datatype. When creating the recursive operator
			 * it is necessary to give the matched expression its own variable.
			 */
			
			match = match.reorderExpresionTree();
			TypeBuilder type = match.calculateType();
			
			if (!type.isDatatype()) {
				/* TODO: This should be caught in validation, tried to match a statement that wasn't
				 * a datatype.
				 */
				throw new Exception("Tried to construct a matchstatment with a non-datatype argument");
			}
			
			args.add(new Tuple2<String, String>("MCase", type.getDatatype().getName()));
			recName = "MCase";
		} else {
			recName = ((TypedVariable)((FunctionCall)match).getTypeInst()).getName();
		}
		
		
		args.addAll(prov.inScopeTypedVariables());
		TheoryImportCache thyCache = CompilationUtil.getTheoryCacheForElement(this);
		
		FunctionDecl funcDecl = EcoreUtil2.getContainerOfType(this, FunctionDecl.class);
		
		IInternalElement nextSyb = null;
		if (funcDecl != null) {
			nextSyb = funcDecl.getCurrentCompilingOp();
		}
		
		INewOperatorDefinition op = CompilationUtil.createOpWithArgumentsAsPred(thyCache, opName, args, 
				Notation.PREFIX, nextSyb, false);
		
		IRecursiveOperatorDefinition opDef = TheoryUtils.createRecursiveDefinition(op,
				recName, null, null);
		
		for (MatchCase c : inductCase) {
			c.compileToRecCase(opDef, null);
		}
		
		String result = opName + "(";
		
		result += CompilationUtil.compileTypedVariablesToNameListWithSeparator(args, ", ", true);
		result += ")";
		
		return result;
	}
	
	@Override
	public void compileToRecursiveDefs(INewOperatorDefinition op, IProgressMonitor monitor) throws Exception {
		/* In this case the match expression should always be a TypedVariable wrapped in a Function call. 
		 * as this is called from a function. */
		String recOpDefName = ((TypedVariable)((FunctionCall)match).getTypeInst()).getName();
		IRecursiveOperatorDefinition opDef = TheoryUtils.createRecursiveDefinition(op,
				recOpDefName, null, monitor);
		
		for (MatchCase c : inductCase) {
			c.compileToRecCase(opDef, monitor);
		}
	}

	@Override
	public Integer eventBPrecedence(Boolean whenPredicate) {
		return 2;
	}

	@Override
	public Boolean requiresInferredContext() {
		for (MatchCase mCase : inductCase) {
			if (mCase.hasInferredContext())
				return true;
		}
		
		return false;
	}

	@Override
	public Expression reorderExpresionTree() {
		if (reordered)
			return this;
		
		reordered = true;
		for (MatchCase mCase : inductCase) {
			Expression matchExpr = mCase.getExpr();
			if (matchExpr != null) {
				mCase.setExpr(matchExpr.reorderExpresionTree());
			}
		}
		
		return this;
	}

	@Override
	public boolean referencesContainingType() {
		for (MatchCase c : inductCase) {
			if (c.getExpr().referencesContainingType())
				return true;
		}
		
		return false;
	}

	@Override
	public TypeBuilder calculateType() {
		/* Validation should have checked that all of the inductCase expressions have the
		 * same type.
		 */
		
		return inductCase.get(0).getExpr().calculateType();
	}

} //MatchStatementImpl
