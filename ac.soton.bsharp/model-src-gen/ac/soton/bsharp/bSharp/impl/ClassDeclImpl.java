/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.NamedObject;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolymorphicTypeName;
import ac.soton.bsharp.bSharp.Type;
import ac.soton.bsharp.bSharp.TypeBodyElements;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ClassDeclImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ClassDeclImpl#getBodyElements <em>Body Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassDeclImpl extends GenNameImpl implements ClassDecl {
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
	 * The cached value of the '{@link #getBodyElements() <em>Body Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBodyElements> bodyElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.CLASS_DECL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.CLASS_DECL__CONTEXT, oldContext, newContext);
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
				msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CLASS_DECL__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CLASS_DECL__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.CLASS_DECL__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBodyElements> getBodyElements() {
		if (bodyElements == null) {
			bodyElements = new EObjectContainmentEList<TypeBodyElements>(TypeBodyElements.class, this, BSharpPackage.CLASS_DECL__BODY_ELEMENTS);
		}
		return bodyElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.CLASS_DECL__CONTEXT:
				return basicSetContext(null, msgs);
			case BSharpPackage.CLASS_DECL__BODY_ELEMENTS:
				return ((InternalEList<?>)getBodyElements()).basicRemove(otherEnd, msgs);
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
			case BSharpPackage.CLASS_DECL__CONTEXT:
				return getContext();
			case BSharpPackage.CLASS_DECL__BODY_ELEMENTS:
				return getBodyElements();
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
			case BSharpPackage.CLASS_DECL__CONTEXT:
				setContext((PolyContext)newValue);
				return;
			case BSharpPackage.CLASS_DECL__BODY_ELEMENTS:
				getBodyElements().clear();
				getBodyElements().addAll((Collection<? extends TypeBodyElements>)newValue);
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
			case BSharpPackage.CLASS_DECL__CONTEXT:
				setContext((PolyContext)null);
				return;
			case BSharpPackage.CLASS_DECL__BODY_ELEMENTS:
				getBodyElements().clear();
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
			case BSharpPackage.CLASS_DECL__CONTEXT:
				return context != null;
			case BSharpPackage.CLASS_DECL__BODY_ELEMENTS:
				return bodyElements != null && !bodyElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/* Not sure why this wasn't automatically generated :-/ */
	@Override
	public String descriptiveName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public Collection<PolymorphicTypeName> getPolyTypeNames() {
		/* Context is the Polynomial context. */
		return EcoreUtil2.getAllContentsOfType(getContext(), PolymorphicTypeName.class);
	}

} //ClassDeclImpl
