/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.Infix;
import ac.soton.bsharp.bSharp.QuantLambda;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeConstructor;

import java.util.HashMap;
import java.util.Map;

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
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InfixImpl#getOpName <em>Op Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InfixImpl#getRight <em>Right</em>}</li>
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
	protected FunctionDecl funcName;

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
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Expression right;

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
	 * @generated
	 */
	public FunctionDecl getFuncName() {
		if (funcName != null && funcName.eIsProxy()) {
			InternalEObject oldFuncName = (InternalEObject)funcName;
			funcName = (FunctionDecl)eResolveProxy(oldFuncName);
			if (funcName != oldFuncName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.INFIX__FUNC_NAME, oldFuncName, funcName));
			}
		}
		return funcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDecl basicGetFuncName() {
		return funcName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncName(FunctionDecl newFuncName) {
		FunctionDecl oldFuncName = funcName;
		funcName = newFuncName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INFIX__FUNC_NAME, oldFuncName, funcName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpName() {
		return opName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			case BSharpPackage.INFIX__OP_NAME:
				return getOpName();
			case BSharpPackage.INFIX__RIGHT:
				return getRight();
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
				setFuncName((FunctionDecl)newValue);
				return;
			case BSharpPackage.INFIX__OP_NAME:
				setOpName((String)newValue);
				return;
			case BSharpPackage.INFIX__RIGHT:
				setRight((Expression)newValue);
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
				setFuncName((FunctionDecl)null);
				return;
			case BSharpPackage.INFIX__OP_NAME:
				setOpName(OP_NAME_EDEFAULT);
				return;
			case BSharpPackage.INFIX__RIGHT:
				setRight((Expression)null);
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
			case BSharpPackage.INFIX__OP_NAME:
				return OP_NAME_EDEFAULT == null ? opName != null : !OP_NAME_EDEFAULT.equals(opName);
			case BSharpPackage.INFIX__RIGHT:
				return right != null;
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
	public String getInfixName() {
		String opName = getOpName();
		
		if (opName != null)
			return opName;
					
		return getFuncName().getName();
	}

	@Override
	public String constructLatexExpressionTree(String indent) {
		String infixString = getInfixName();
		
		if (infixString.equals("⇔")) {
			infixString = "\\Leftrightarrow";
		} else if (infixString.equals("⇒")) {
			infixString = "\\implies";
		} else if (infixString.equals("≠")) {
			infixString = "\\neq";
		} else if (infixString.equals("∧")) {
			infixString = "\\land";
		} else if (infixString.equals("∨")) {
			infixString = "\\lor";
		}
		
		String result = indent + "[.$" + infixString + "$\n";
		
		result += left.constructLatexExpressionTree("  " + indent) + "\n";
		result += right.constructLatexExpressionTree("  " + indent) + "\n" ;
		result += indent + "]";
		
		return result;
	}

	@Override
	public String compileToEventBString(Boolean asPredicate) throws Exception {
		if (opName != null && !opName.isEmpty()) {
			boolean opTakesPreds = !opName.equals("=") && !opName.equals("≠");
			
			String leftStr = left.compileToEventBString(opTakesPreds);
			String rightStr = right.compileToEventBString(opTakesPreds);
			if (left.eventBPrecedence(true) <= eventBPrecedence(opTakesPreds)) {
				leftStr = "(" + leftStr + ")";
			}
			
			if (right.eventBPrecedence(true) <= eventBPrecedence(opTakesPreds)) {
				rightStr = "(" + rightStr + ")";
			}
			
			
			String result = leftStr + opName + rightStr;
			
			if (asPredicate)
				return result;
			else
				return "bool(" + result + ")";
		}
		
		/* This may need to be changed substantially to allow other elements to be infix. Current I believe
		 * that there's always an EventB operator */
		
		String fName;
		if (asPredicate) {
			fName = funcName.eventBPredName();
		} else {
			fName = funcName.eventBExprName();
		}
		
		if (funcName.hasEventBInfix()) {
			String leftStr = left.compileToEventBString(false);
			String rightStr = right.compileToEventBString(false);
			
			if (left.eventBPrecedence(false) <= eventBPrecedence(false)) {
				leftStr = "(" + leftStr + ")";
			}
			
			if (right.eventBPrecedence(false) <= eventBPrecedence(false)) {
				rightStr = "(" + rightStr + ")";
			}
			
			return leftStr + " " + fName + " " + rightStr;
		} else {
			return fName + "(" + left.compileToEventBString(false) + ", " + right.compileToEventBString(false) + ")";
		}
	}
	
	protected final Map<String, Integer> inbuiltPrecedence = createMap();
	static HashMap<String, Integer> createMap() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("⇔", 50);
	 	map.put("⇒", 50);
	 	map.put("=", 70);
	 	map.put("≠", 70);
	 	map.put("∧", 60);
	 	map.put("∨", 60);
	 	return map;
	}

	@Override
	public Integer eventBPrecedence(Boolean whenPredicate) {
		if (opName != null && !opName.isEmpty()) {
			return 0;
		} else {
			return 1;
		}
	}

	@Override
	public Boolean hasInferredContext() {
		return (left.hasInferredContext() || right.hasInferredContext());
	}
	
	@Override
	public Integer precedence() {
		if (opName != null) {
			return inbuiltPrecedence.get(opName);
		}
		
		return funcName.getPrecedence();
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
		if (opName != null) {
			Datatype dt = BSharpFactory.eINSTANCE.createDatatype();
			dt.setName("Bool");
			TypeConstructor tc = BSharpFactory.eINSTANCE.createTypeConstructor();
			tc.setTypeName(dt);
			return tc;
		}
		
		return funcName.getReturnType();
	}

} //InfixImpl
