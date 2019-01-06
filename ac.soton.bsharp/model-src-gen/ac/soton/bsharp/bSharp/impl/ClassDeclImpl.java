/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.IClassInstance;
import ac.soton.bsharp.bSharp.IEventBPrefixProvider;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.IVarType;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;

import ac.soton.bsharp.bSharp.TopLevelInstance;
import ac.soton.bsharp.bSharp.Type;
import java.util.ArrayList;
import java.util.Collection;

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
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ClassDeclImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ClassDeclImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassDeclImpl extends GenNameImpl implements ClassDecl {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected BSharpBlock block;

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
	public BSharpBlock getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(BSharpBlock newBlock, NotificationChain msgs) {
		BSharpBlock oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.CLASS_DECL__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(BSharpBlock newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CLASS_DECL__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.CLASS_DECL__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.CLASS_DECL__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.CLASS_DECL__BLOCK:
				return basicSetBlock(null, msgs);
			case BSharpPackage.CLASS_DECL__CONTEXT:
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
			case BSharpPackage.CLASS_DECL__BLOCK:
				return getBlock();
			case BSharpPackage.CLASS_DECL__CONTEXT:
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
			case BSharpPackage.CLASS_DECL__BLOCK:
				setBlock((BSharpBlock)newValue);
				return;
			case BSharpPackage.CLASS_DECL__CONTEXT:
				setContext((PolyContext)newValue);
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
			case BSharpPackage.CLASS_DECL__BLOCK:
				setBlock((BSharpBlock)null);
				return;
			case BSharpPackage.CLASS_DECL__CONTEXT:
				setContext((PolyContext)null);
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
			case BSharpPackage.CLASS_DECL__BLOCK:
				return block != null;
			case BSharpPackage.CLASS_DECL__CONTEXT:
				return context != null;
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
		if (baseClass == IVariableProvider.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IPolyTypeProvider.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TopLevelInstance.class) {
			switch (derivedFeatureID) {
				case BSharpPackage.CLASS_DECL__BLOCK: return BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK;
				default: return -1;
			}
		}
		if (baseClass == IEventBPrefixProvider.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IClassInstance.class) {
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
		if (baseClass == IVariableProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IPolyTypeProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TopLevelInstance.class) {
			switch (baseFeatureID) {
				case BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK: return BSharpPackage.CLASS_DECL__BLOCK;
				default: return -1;
			}
		}
		if (baseClass == IEventBPrefixProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IClassInstance.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/* Not sure why this wasn't automatically generated :-/ */
	@Override
	public String descriptiveName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public Collection<PolyType> getPolyTypeNames() {
		/* Context is the Polynomial context. */
		if (context != null) {
			return EcoreUtil2.getAllContentsOfType(context, PolyType.class);
		} else {
;			return new ArrayList<PolyType>();
		}
	}

} //ClassDeclImpl
