/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.IClassInstance;
import ac.soton.bsharp.bSharp.IEventBPrefixProvider;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.IVarType;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.NamedObject;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;

import ac.soton.bsharp.bSharp.TopLevelInstance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ClassDeclImpl#getRawContext <em>Raw Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassDeclImpl extends TopLevelInstanceImpl implements ClassDecl {
	/**
	 * The cached value of the '{@link #getRawContext() <em>Raw Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawContext()
	 * @generated
	 * @ordered
	 */
	protected PolyContext rawContext;
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
	@Override
	public PolyContext getRawContext() {
		return rawContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRawContext(PolyContext newRawContext, NotificationChain msgs) {
		PolyContext oldRawContext = rawContext;
		rawContext = newRawContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.CLASS_DECL__RAW_CONTEXT, oldRawContext, newRawContext);
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
	public void setRawContext(PolyContext newRawContext) {
		if (newRawContext != rawContext) {
			NotificationChain msgs = null;
			if (rawContext != null)
				msgs = ((InternalEObject)rawContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CLASS_DECL__RAW_CONTEXT, null, msgs);
			if (newRawContext != null)
				msgs = ((InternalEObject)newRawContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CLASS_DECL__RAW_CONTEXT, null, msgs);
			msgs = basicSetRawContext(newRawContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.CLASS_DECL__RAW_CONTEXT, newRawContext, newRawContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.CLASS_DECL__RAW_CONTEXT:
				return basicSetRawContext(null, msgs);
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
			case BSharpPackage.CLASS_DECL__RAW_CONTEXT:
				return getRawContext();
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
			case BSharpPackage.CLASS_DECL__RAW_CONTEXT:
				setRawContext((PolyContext)newValue);
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
			case BSharpPackage.CLASS_DECL__RAW_CONTEXT:
				setRawContext((PolyContext)null);
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
			case BSharpPackage.CLASS_DECL__RAW_CONTEXT:
				return rawContext != null;
		}
		return super.eIsSet(featureID);
	}

	/* Not sure why this wasn't automatically generated :-/ */
	@Override
	public String descriptiveName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public List<PolyType> getPolyTypeNames() {
		PolyContext ctx = getRawContext();
		/* Context is the Polynomial context. */
		if (ctx != null) {
			return ctx.getPolyTypes();
		} else {
			return new ArrayList<PolyType>();
		}
	}
	
	@Override
	public PolyContext getContext() {
		return getRawContext();
	}

} //ClassDeclImpl
