/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.IEventBPrefixProvider;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.TopLevelInstance;
import ac.soton.bsharp.bSharp.util.Tuple2;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ExtendImpl#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ExtendImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ExtendImpl#getBodyElements <em>Body Elements</em>}</li>
 * </ul>
 */
public class ExtendImpl extends TopLevelInstanceImpl implements Extend {
	/**
	 * The cached value of the '{@link #getExtendedClass() <em>Extended Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedClass()
	 * @generated
	 * @ordered
	 */
	protected ClassDecl extendedClass;

	/**
	 * The default value of the '{@link #getExtendedClassName() <em>Extended Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedClassName() <em>Extended Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedClassName()
	 * @generated
	 * @ordered
	 */
	protected String extendedClassName = EXTENDED_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.EXTEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDecl getExtendedClass() {
		if (extendedClass != null && extendedClass.eIsProxy()) {
			InternalEObject oldExtendedClass = (InternalEObject)extendedClass;
			extendedClass = (ClassDecl)eResolveProxy(oldExtendedClass);
			if (extendedClass != oldExtendedClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.EXTEND__EXTENDED_CLASS, oldExtendedClass, extendedClass));
			}
		}
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDecl basicGetExtendedClass() {
		return extendedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedClass(ClassDecl newExtendedClass) {
		ClassDecl oldExtendedClass = extendedClass;
		extendedClass = newExtendedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.EXTEND__EXTENDED_CLASS, oldExtendedClass, extendedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedClassName() {
		return extendedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedClassName(String newExtendedClassName) {
		String oldExtendedClassName = extendedClassName;
		extendedClassName = newExtendedClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.EXTEND__EXTENDED_CLASS_NAME, oldExtendedClassName, extendedClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BSharpPackage.EXTEND__EXTENDED_CLASS:
				if (resolve) return getExtendedClass();
				return basicGetExtendedClass();
			case BSharpPackage.EXTEND__EXTENDED_CLASS_NAME:
				return getExtendedClassName();
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
			case BSharpPackage.EXTEND__EXTENDED_CLASS:
				setExtendedClass((ClassDecl)newValue);
				return;
			case BSharpPackage.EXTEND__EXTENDED_CLASS_NAME:
				setExtendedClassName((String)newValue);
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
			case BSharpPackage.EXTEND__EXTENDED_CLASS:
				setExtendedClass((ClassDecl)null);
				return;
			case BSharpPackage.EXTEND__EXTENDED_CLASS_NAME:
				setExtendedClassName(EXTENDED_CLASS_NAME_EDEFAULT);
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
			case BSharpPackage.EXTEND__EXTENDED_CLASS:
				return extendedClass != null;
			case BSharpPackage.EXTEND__EXTENDED_CLASS_NAME:
				return EXTENDED_CLASS_NAME_EDEFAULT == null ? extendedClassName != null : !EXTENDED_CLASS_NAME_EDEFAULT.equals(extendedClassName);
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
		result.append(" (extendedClassName: ");
		result.append(extendedClassName);
		result.append(')');
		return result.toString();
	}

	@Override
	public Collection<EObject> getVariablesNames() {
		/* Note datatypes don't create type variables, I think these may be 
		 * covered when looking for function names instead.
		 */
		if (extendedClass instanceof BSClass) {
			return ((BSClass)extendedClass).getVariablesNames();
		} else {
			return null;
		}
	}

	@Override
	public Collection<PolyType> getPolyTypeNames() {
		if (extendedClass instanceof BSClass) {
			return ((BSClass)extendedClass).getPolyTypeNames();
		} else {
			return null;
		}
	}

	@Override
	public String eventBPrefix() {
		return extendedClass.eventBPrefix();
	}

	@Override
	public String inferredPolyTypeArgsForType(ClassDecl t) {
		return extendedClass.inferredPolyTypeArgsForType(t);
	}
	
	
	@Override
	public void compile(IProgressMonitor monitor) {
		block.compile(monitor);
	}

	@Override
	public String opNameForMatchStatement(MatchStatementImpl match) {
		// This should never happen, if there is a match statement it will be within a function or theorem.
		return null;
	}

	@Override
	public Collection<? extends Tuple2<String, String>> inScopeTypedVariables() {
		/* This should never happen, as an expression must always be in a theorem or 
		 * function, or BSClass statement, each of these already handles getting the types.
		 */
		return null;
	}
} //ExtendImpl
