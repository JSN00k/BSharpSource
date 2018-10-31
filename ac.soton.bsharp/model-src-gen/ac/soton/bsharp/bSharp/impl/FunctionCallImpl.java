/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ClassVarDecl;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.NamedObject;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypedVariable;

import java.util.Collection;
import java.util.jar.Attributes.Name;

import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.common.base.Functions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionCallImpl#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionCallImpl#getClassVarDecl <em>Class Var Decl</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.FunctionCallImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionCallImpl extends ExpressionImpl implements FunctionCall {
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
	 * The cached value of the '{@link #getOwnerType() <em>Owner Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerType()
	 * @generated
	 * @ordered
	 */
	protected GenName ownerType;

	/**
	 * The cached value of the '{@link #getClassVarDecl() <em>Class Var Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassVarDecl()
	 * @generated
	 * @ordered
	 */
	protected ClassVarDecl classVarDecl;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected TypeDeclContext context;

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
	public GenName getOwnerType() {
		if (ownerType != null && ownerType.eIsProxy()) {
			InternalEObject oldOwnerType = (InternalEObject)ownerType;
			ownerType = (GenName)eResolveProxy(oldOwnerType);
			if (ownerType != oldOwnerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.FUNCTION_CALL__OWNER_TYPE, oldOwnerType, ownerType));
			}
		}
		return ownerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenName basicGetOwnerType() {
		return ownerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerType(GenName newOwnerType) {
		GenName oldOwnerType = ownerType;
		ownerType = newOwnerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_CALL__OWNER_TYPE, oldOwnerType, ownerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassVarDecl getClassVarDecl() {
		return classVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassVarDecl(ClassVarDecl newClassVarDecl, NotificationChain msgs) {
		ClassVarDecl oldClassVarDecl = classVarDecl;
		classVarDecl = newClassVarDecl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL, oldClassVarDecl, newClassVarDecl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassVarDecl(ClassVarDecl newClassVarDecl) {
		if (newClassVarDecl != classVarDecl) {
			NotificationChain msgs = null;
			if (classVarDecl != null)
				msgs = ((InternalEObject)classVarDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL, null, msgs);
			if (newClassVarDecl != null)
				msgs = ((InternalEObject)newClassVarDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL, null, msgs);
			msgs = basicSetClassVarDecl(newClassVarDecl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL, newClassVarDecl, newClassVarDecl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclContext getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(TypeDeclContext newContext, NotificationChain msgs) {
		TypeDeclContext oldContext = context;
		context = newContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_CALL__CONTEXT, oldContext, newContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(TypeDeclContext newContext) {
		if (newContext != context) {
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_CALL__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.FUNCTION_CALL__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.FUNCTION_CALL__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL:
				return basicSetClassVarDecl(null, msgs);
			case BSharpPackage.FUNCTION_CALL__CONTEXT:
				return basicSetContext(null, msgs);
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
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				return getArguments();
			case BSharpPackage.FUNCTION_CALL__OWNER_TYPE:
				if (resolve) return getOwnerType();
				return basicGetOwnerType();
			case BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL:
				return getClassVarDecl();
			case BSharpPackage.FUNCTION_CALL__CONTEXT:
				return getContext();
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
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case BSharpPackage.FUNCTION_CALL__OWNER_TYPE:
				setOwnerType((GenName)newValue);
				return;
			case BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL:
				setClassVarDecl((ClassVarDecl)newValue);
				return;
			case BSharpPackage.FUNCTION_CALL__CONTEXT:
				setContext((TypeDeclContext)newValue);
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
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case BSharpPackage.FUNCTION_CALL__OWNER_TYPE:
				setOwnerType((GenName)null);
				return;
			case BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL:
				setClassVarDecl((ClassVarDecl)null);
				return;
			case BSharpPackage.FUNCTION_CALL__CONTEXT:
				setContext((TypeDeclContext)null);
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
			case BSharpPackage.FUNCTION_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case BSharpPackage.FUNCTION_CALL__OWNER_TYPE:
				return ownerType != null;
			case BSharpPackage.FUNCTION_CALL__CLASS_VAR_DECL:
				return classVarDecl != null;
			case BSharpPackage.FUNCTION_CALL__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String constructLatexExpressionTree(String indent) {
		if (arguments == null || arguments.isEmpty()) {
			String name = typeInst.getName();
			if (name == null)
				name = "noName";
			
			return indent + "$" + name + "$";
		}
		
		String result = indent + "[.$" + typeInst.getName() + "$\n";
		
		for (Expression expr : arguments) {
			result += expr.constructLatexExpressionTree("  " + indent) + "\n";
		}
		
		result += indent + "]";
		
		return result;
	}
	
	@Override
	public String compileToEventBString(Boolean asPredicate) throws Exception {
		/* FunctionCall  is an expression variable followed by a type context 
		 * and the arguments, the type context and arguments are optional, without these
		 * it's just a variable declaration. If there are type contexts and arguments then
		 * these need to be validated to check the types. The type context requires the 
		 * context of the original declaration to be compiled properly. The arguments can be
		 * compiled entirely on their own.
		 */
		ExpressionVariable var;
		
		if (typeInst != null) {
			var = typeInst;
		} else {
			/* The classVarDecl allows scoping of member variables from other types, as the scoping has
			 * been done this method only needs the ExpressionVariable (it already contains the necessary
			 * information about where it was declared).
			 */
			var = classVarDecl.getTypeInst();
		}
		
		if (context != null) {
			if (typeInst instanceof TypedVariable) {
				/* This is an impossible situation and should be validated against. */
				throw new Exception("In FunctionCallImpl a type that is unable to have a context"
						+ "has one. Write validation so this can't happen at this stage.");
			}
		
			if (typeInst instanceof BSClass) {
				String result = ((BSClass) typeInst).constructWithTypeContext(context);
				if (arguments != null) {
					result += '(' + compileArgumentsWithSeparator(" ↦") + ")";
					if (asPredicate) {
						result += "= BOOL";
					}
				}
				
				return result;
			}
			
			if (typeInst instanceof FunctionDecl) {
				/* Made a decision that functions with polymorphic contexts have an EventB operator
				 * which takes the polymorphic context as the argument and returns a lambda which can
				 * then be evaluated.
				 */
				String result = ((FunctionDecl) typeInst).callWithTypeContext(context);
				
				if (arguments != null) {
					result += '(' + compileArgumentsWithSeparator(" ↦") + ")";
					if (asPredicate) {
						result += "= BOOL";
					}
				}
				
				
			}
			
			System.err.print("FunctionCallImpl hasn't handled datatypes when calling types with "
					+ "polymorphic contexts");
			
			return "";
		}
		
		/* There is no context, start by doing the simple thing, and I'll add features later
		 * e.g., inferred contexts from type classes.  
		 */
		if (arguments != null) {
			if (typeInst instanceof FunctionDecl) {
				/* This means that there should be an operator to directly evaluate the function */
				String result = ((NamedObject)typeInst).getName();
				if (asPredicate) {
					result += "_Pred";
				}
				
				result += "(" + compileArgumentsWithSeparator(",") + ")";
				
				return result;
			}
			
			if (typeInst instanceof TypedVariable || typeInst instanceof BSClass) {
				String result = ((NamedObject)typeInst).getName();
				result += "(" + compileArgumentsWithSeparator(" ↦") + ")";
				
				if (asPredicate) {
					result += " = BOOL";
				}
				
				return result;
			}
		}
		
		if (asPredicate) {
			throw new Exception("In FunctionCallImpl tried to compile an expression as a Pred "
					+ "which couldn't be compiled to a predicate.");
		}
		
		if (typeInst instanceof ClassDecl || typeInst instanceof TypedVariable) {
			return ((NamedObject)typeInst).getName();
		} else {
			return ((FunctionDecl)typeInst).getName() + "_P";
		}
	}
	
	String compileArgumentsWithSeparator(String sep) throws Exception {
		Boolean first = true;
		String result = "";
		for (Expression expr : arguments) {
			if (!first) {
				result += sep + " ";
			}
			
			result += expr.compileToEventBString(false);
		}
		
		return result;
	}

} //FunctionCallImpl
