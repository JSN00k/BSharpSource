/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.InstName;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.TheoremDecl;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypedVariableList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.TypeConstructorImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.TypeConstructorImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeConstructorImpl extends TypeBuilderImpl implements TypeConstructor {
	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected GenName typeName;

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
	protected TypeConstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.TYPE_CONSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenName getTypeName() {
		if (typeName != null && typeName.eIsProxy()) {
			InternalEObject oldTypeName = (InternalEObject)typeName;
			typeName = (GenName)eResolveProxy(oldTypeName);
			if (typeName != oldTypeName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.TYPE_CONSTRUCTOR__TYPE_NAME, oldTypeName, typeName));
			}
		}
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenName basicGetTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(GenName newTypeName) {
		GenName oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.TYPE_CONSTRUCTOR__TYPE_NAME, oldTypeName, typeName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT:
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
			case BSharpPackage.TYPE_CONSTRUCTOR__TYPE_NAME:
				if (resolve) return getTypeName();
				return basicGetTypeName();
			case BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT:
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
			case BSharpPackage.TYPE_CONSTRUCTOR__TYPE_NAME:
				setTypeName((GenName)newValue);
				return;
			case BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT:
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
			case BSharpPackage.TYPE_CONSTRUCTOR__TYPE_NAME:
				setTypeName((GenName)null);
				return;
			case BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT:
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
			case BSharpPackage.TYPE_CONSTRUCTOR__TYPE_NAME:
				return typeName != null;
			case BSharpPackage.TYPE_CONSTRUCTOR__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public Integer inferredTypeCount() {
		if (context != null)
			return 0;
		
		if (typeName instanceof BSClass) {
			return ((BSClass)typeName).eventBRequiredPolyTypes();
		} else {
			return 0;
		}
	}
	
	@Override
	public String buildEventBType() {
		GenName tn = getTypeName();
		if (tn instanceof InstName) {
			FunctionDecl func = EcoreUtil2.getContainerOfType(this, FunctionDecl.class);
			TheoremDecl theorem = EcoreUtil2.getContainerOfType(this, TheoremDecl.class);
			BSClass bsClass = EcoreUtil2.getContainerOfType(this, BSClass.class);
			if (func != null) {
				return ((BSClass)((InstName)tn).eContainer()).baseTypeFromBSContext();
			} else if (theorem != null) {
				return theorem.baseTypeForBSClass((BSClass)tn.eContainer());
			} else if (bsClass != null) {
				return bsClass.baseTypeFromBSContext();
			}
			
			return "";
		}
		
		if (tn instanceof ClassDecl) {
			if (context != null) {
				/*
				 * In type class declarations it is possible for a variable to be a : Monoid a
				 * monoid is a type with additional features (e.g. an identity) a : Monoid means
				 * that a is in the Monoid type. If we are in the monoid constructutor the
				 * polymorphic type used to construct the monoid can be used directly. If we are
				 * in a function or a theorem then the context of the function/theorm needs to
				 * be be considered.
				 */

				FunctionDecl func = EcoreUtil2.getContainerOfType(this, FunctionDecl.class);
				TheoremDecl theorem = EcoreUtil2.getContainerOfType(this, TheoremDecl.class);
				BSClass bsClass = EcoreUtil2.getContainerOfType(this, BSClass.class);
				if (func != null) {
					// TODO: Implement me!
					return "";
				} else if (theorem != null) {
					// TODO: Implement me!
				} else if (bsClass != null) {
					/*
					 * As we're not in a function or theorem, we can check if we're in a type class
					 * without us bing further into the tree.
					 */
					return ((ClassDecl)tn).constructWithTypeContext(context, bsClass);
				}
				
				return "";
			}

			String tName = tn.getName();
			if (tName.equals("Bool")) {
				/*
				 * When we're in a function that points to a Pred it would be better to deal
				 * with this using the set notation, this requires handling this at a higher
				 * point, Interestingly the left handed graph automatically generated would make
				 * detecting this easy (e.g., this could be checked before reversing the graph.
				 */
				return "BOOL";
			}

			return ((Datatype) typeName).typeStringWithContext(context);
		} else if (tn instanceof PolyType){
			return ((PolyType)typeName).baseTypeString();
		} else {
			System.out.print("Unimplemeneted in TypeConstrutorImpl unexpected case.");
			return "";
		}
	}
	
	@Override
	public boolean isAbstractTypeClass() {
		if (!(typeName instanceof BSClass))
			return false;
		
		TypedVariableList varList = ((BSClass)typeName).getVarList();
		return varList != null && varList.varCount() != 0 && (context == null || context.getTypeName().size() == 0);
	}

	@Override
	public BSClass getTypeClass() {
		GenName tn = getTypeName();
		if (tn instanceof BSClass) {
			return (BSClass)typeName;
		}
		
		return null;
	}
	
	@Override
	public boolean isBoolType() {
		return typeName.getName().equals("Bool");
	}

	@Override
	public TypeBuilder reorderTypeTree() {
		return this;
	}

	@Override
	public Boolean isBaseType() {
		/* typeName is a reference if the variable is use directly then the reference isn't
		 * resolved, and this may return false when it is in fact true.
		 */
		GenName tn = getTypeName();
		return tn instanceof PolyType || tn instanceof Datatype;
	}
	
	@Override
	void getPrimativeTypePathsByDeconstructionInternal( 
			ArrayList<Integer> currentPath, LinkedHashMap<String, ArrayList<Integer>> paths) {
		String myString = toString();
		if (paths.containsKey(myString))
			return;
		
		paths.put(myString, new ArrayList<Integer>(currentPath));
		return;
	}
	
	@Override
	String constructWithTypesInternal(ArrayList<String> requiredEBTypes, HashMap<String, String> typeNameMap) {
		String name = typeName.getName();
		if (typeNameMap.containsKey(name))
			return typeNameMap.get(name);
		
		String tn = null;
		/* Work out which name we're up to. */
		if (typeName instanceof PolyType) {
			tn = requiredEBTypes.get(typeNameMap.size());
			typeNameMap.put(name, tn);
		} else {
			tn = typeName.getName();
		}
		
		return tn;
	}

	@Override
	public boolean referencesContainingType() {
		ClassDecl container = EcoreUtil2.getContainerOfType(this, ClassDecl.class);
		
		if (typeName instanceof ClassDecl) {
			if (typeName == container && context == null)
				return true;
		}
		
		if (typeName instanceof PolyType) {
			IPolyTypeProvider polyProv = EcoreUtil2.getContainerOfType(this, IPolyTypeProvider.class);
			if (polyProv == container)
				return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isDatatype() {
		return typeName instanceof Datatype;
	}
	
	@Override
	public Datatype getDatatype() {
		if (!isDatatype())
			return null;
		
		return (Datatype)getTypeName();
	}
	
	@Override
	public ClassDecl getClassDecl() {
		if (typeName instanceof ClassDecl)
			return (ClassDecl)getTypeName();
		
		return null;
	}

} //TypeConstructorImpl
