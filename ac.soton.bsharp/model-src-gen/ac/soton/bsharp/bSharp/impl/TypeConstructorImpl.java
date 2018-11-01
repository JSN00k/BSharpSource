/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeDeclContext;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
public class TypeConstructorImpl extends ConstructedTypeImpl implements TypeConstructor {
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
	public String buildEventBType(ArrayList<String> inferredTypes) {
		if (typeName instanceof ClassDecl) {
			ArrayList<String> typeString = inferredTypes;
			if (context != null) {
				return ((ClassDecl)typeName).constructWithTypeContext(context);
			} else {
				String tName = typeName.getName().toString();
				if (tName.equals("Bool")) {
					/* When we're in a function that points to a Pred it would be better 
					 * to deal with this using the set notation, this requires handling this 
					 * at a higher point, Interestingly the left handed graph automatically generated
					 * would make detecting this easy (e.g., this could be checked before reversing the 
					 * graph. 
					 */
					return "BOOL";
				}
				
				System.out.print("Unimplemented in TypeConstructorImpl need to handle Datatypes.\n");
				return ((BSClass)typeName).constructWithEventBPolytypes(typeString);
			}
			
		} else if (typeName instanceof PolyType){
			System.out.print("This currently doesn't handle types with super types that aren't simple.");
			return ((PolyType)typeName).getName();
		} else {
			System.out.print("Unimplemeneted in TypeConstrutorImpl unexpected case.");
			return "";
		}
	}

} //TypeConstructorImpl
