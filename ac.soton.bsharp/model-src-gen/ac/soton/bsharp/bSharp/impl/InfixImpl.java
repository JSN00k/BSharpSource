/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.InbuiltInfix;
import ac.soton.bsharp.bSharp.Infix;
import ac.soton.bsharp.bSharp.InfixFunc;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.util.ExprPredEnum;
import ac.soton.bsharp.bSharp.util.Tuple2;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InfixImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InfixImpl#getFuncName <em>Func Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InfixImpl#getRight <em>Right</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InfixImpl#getOpName <em>Op Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixImpl extends ExpressionImpl implements Infix {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Expression left;

	/**
	 * The cached value of the '{@link #getFuncName() <em>Func Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncName()
	 * @generated
	 * @ordered
	 */
	protected InfixFunc funcName;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Expression right;

	/**
	 * The default value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpName()
	 * @generated
	 * @ordered
	 */
	protected static final String OP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpName() <em>Op Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpName()
	 * @generated
	 * @ordered
	 */
	protected String opName = OP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.INFIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		Expression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.INFIX__LEFT, oldLeft, newLeft);
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
	public void setLeft(Expression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.INFIX__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.INFIX__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INFIX__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public InfixFunc getFuncName() {
		if (funcName != null && funcName.eIsProxy()) {
			InternalEObject oldFuncName = (InternalEObject)funcName;
			funcName = (InfixFunc)eResolveProxy(oldFuncName);
			if (funcName != oldFuncName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.INFIX__FUNC_NAME, oldFuncName, funcName));
			}
		}
		
		if (funcName == null) {
			funcName = BSharpFactory.eINSTANCE.createInbuiltInfix();
			funcName.setName(opName);
		}
		
		return funcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixFunc basicGetFuncName() {
		return funcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuncName(InfixFunc newFuncName) {
		InfixFunc oldFuncName = funcName;
		funcName = newFuncName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INFIX__FUNC_NAME, oldFuncName, funcName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		Expression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.INFIX__RIGHT, oldRight, newRight);
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
	public void setRight(Expression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.INFIX__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.INFIX__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INFIX__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOpName() {
		return opName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpName(String newOpName) {
		String oldOpName = opName;
		opName = newOpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INFIX__OP_NAME, oldOpName, opName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.INFIX__LEFT:
				return basicSetLeft(null, msgs);
			case BSharpPackage.INFIX__RIGHT:
				return basicSetRight(null, msgs);
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
			case BSharpPackage.INFIX__LEFT:
				return getLeft();
			case BSharpPackage.INFIX__FUNC_NAME:
				if (resolve) return getFuncName();
				return basicGetFuncName();
			case BSharpPackage.INFIX__RIGHT:
				return getRight();
			case BSharpPackage.INFIX__OP_NAME:
				return getOpName();
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
			case BSharpPackage.INFIX__LEFT:
				setLeft((Expression)newValue);
				return;
			case BSharpPackage.INFIX__FUNC_NAME:
				setFuncName((InfixFunc)newValue);
				return;
			case BSharpPackage.INFIX__RIGHT:
				setRight((Expression)newValue);
				return;
			case BSharpPackage.INFIX__OP_NAME:
				setOpName((String)newValue);
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
			case BSharpPackage.INFIX__LEFT:
				setLeft((Expression)null);
				return;
			case BSharpPackage.INFIX__FUNC_NAME:
				setFuncName((InfixFunc)null);
				return;
			case BSharpPackage.INFIX__RIGHT:
				setRight((Expression)null);
				return;
			case BSharpPackage.INFIX__OP_NAME:
				setOpName(OP_NAME_EDEFAULT);
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
			case BSharpPackage.INFIX__LEFT:
				return left != null;
			case BSharpPackage.INFIX__FUNC_NAME:
				return funcName != null;
			case BSharpPackage.INFIX__RIGHT:
				return right != null;
			case BSharpPackage.INFIX__OP_NAME:
				return OP_NAME_EDEFAULT == null ? opName != null : !OP_NAME_EDEFAULT.equals(opName);
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
		result.append(" (opName: ");
		result.append(opName);
		result.append(')');
		return result.toString();
	}

	@Override
	public String constructLatexExpressionTree(String indent) {
		
		String infixString = getFuncName().latexName();
		String result = indent + "[.$" + infixString + "$\n";
		
		result += left.constructLatexExpressionTree("  " + indent) + "\n";
		result += right.constructLatexExpressionTree("  " + indent) + "\n" ;
		result += indent + "]";
		
		return result;
	}

	@Override
	public String compileToEventBString(Boolean asPredicate) throws Exception {
		InfixFunc fName = getFuncName();
		Tuple2<ExprPredEnum, ExprPredEnum> argTypes = fName.infixArgumentExprPredTypes();
		boolean leftIsPred = argTypes.x == ExprPredEnum.PREDICATE;
		boolean rightIsPred = argTypes.y == ExprPredEnum.PREDICATE;
		

		
		ExprPredEnum compType = asPredicate ? ExprPredEnum.PREDICATE : ExprPredEnum.EXPRESSION;
		String nameStr = funcName.eventBName(compType);
		
		/* If the left or the right is a predicate statement, and the infix operator is equals
		 * it likely means the user meant if and only if. We shall kindly make this substitution
		 * for them.
		 * TODO: during validation make sure that a warning is generated for equals on predicate 
		 * statements.
		 */
		boolean leftIsBoolType = false;
		try {
			leftIsBoolType = left.calculateType().isBoolType();
		} catch (Exception e) {
			System.err.println("Unable to calculate return type, this should be looked into.");
		}
		if (fName.getName().equals("=") && leftIsBoolType) {
			nameStr = "⇔";
			leftIsPred = true;
			rightIsPred = true;
		}
		
		String leftStr = left.compileToEventBString(leftIsPred);
		String rightStr = right.compileToEventBString(rightIsPred);
		
		if (left.eventBPrecedence(true) <= eventBPrecedence(leftIsPred)) {
			leftStr = "(" + leftStr + ")";
		}
		
		if (right.eventBPrecedence(true) <= eventBPrecedence(rightIsPred)) {
			rightStr = "(" + rightStr + ")";
		}
		
		
		ExprPredEnum compAvailable = fName.compilationResultType(compType);
		
		
		String result = null;
		
		if (funcName.hasEventBInfixOp()) {
			result = leftStr + " "  + nameStr + " " + rightStr;
		} else {
			result = nameStr + "(" + leftStr + ", " + rightStr + ")";
		} 
		
		if (compAvailable == compType) {
			return result;
		} else if (compType == ExprPredEnum.PREDICATE) {
			/* I doubt this is right now I've changed everything to use sets. */
			return result + " = TRUE";
		} else {
			return "bool(" + result + ")";
		}
	}

	@Override
	public Integer eventBPrecedence(Boolean whenPredicate) {
		InfixFunc fName = getFuncName();
		if (fName instanceof InbuiltInfix) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public Boolean requiresInferredContext() {
		return (left.requiresInferredContext() || right.requiresInferredContext());
	}

	@Override
	public Expression reorderExpresionTree() {
		if (reordered)
			return this;
		
		reordered = true;
		
		left = left.reorderExpresionTree();
		right = right.reorderExpresionTree();
		
		if (left instanceof InfixImpl && precedence() > left.precedence()) {
			InfixImpl holdLeft = (InfixImpl)left;
			left = holdLeft.right;
			holdLeft.right = this;

			return holdLeft;
		}
		
		return this;
	}

	@Override
	public boolean referencesContainingType() {
		return left.referencesContainingType() || right.referencesContainingType(); 
	}

	@Override
	public TypeBuilder calculateType() {
		/* TODO: This could be T x T -> Bool, to work out T would require inference on the
		 * expression, beyond what bsharp is currently capable of.
		 */
		InfixFunc fName = getFuncName();
		return fName.calculateReturnType(null, null);
	}
	
	@Override
	public Integer precedence() {
		return getFuncName().bSharpPrecedence();
	}

} //InfixImpl
