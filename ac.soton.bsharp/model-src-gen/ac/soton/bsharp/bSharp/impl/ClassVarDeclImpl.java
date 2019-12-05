/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ClassVarDecl;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.IPolyTypeProvider;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.util.CompilationUtil;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ClassVarDeclImpl#getOwnerType <em>Owner Type</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.ClassVarDeclImpl#getTypeInst <em>Type Inst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassVarDeclImpl extends MinimalEObjectImpl.Container implements ClassVarDecl {
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
	 * The cached value of the '{@link #getTypeInst() <em>Type Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeInst()
	 * @generated
	 * @ordered
	 */
	protected ExpressionVariable typeInst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassVarDeclImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.CLASS_VAR_DECL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenName getOwnerType() {
		if (ownerType != null && ownerType.eIsProxy()) {
			InternalEObject oldOwnerType = (InternalEObject)ownerType;
			ownerType = (GenName)eResolveProxy(oldOwnerType);
			if (ownerType != oldOwnerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.CLASS_VAR_DECL__OWNER_TYPE, oldOwnerType, ownerType));
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
	@Override
	public void setOwnerType(GenName newOwnerType) {
		GenName oldOwnerType = ownerType;
		ownerType = newOwnerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.CLASS_VAR_DECL__OWNER_TYPE, oldOwnerType, ownerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionVariable getTypeInst() {
		if (typeInst != null && typeInst.eIsProxy()) {
			InternalEObject oldTypeInst = (InternalEObject)typeInst;
			typeInst = (ExpressionVariable)eResolveProxy(oldTypeInst);
			if (typeInst != oldTypeInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.CLASS_VAR_DECL__TYPE_INST, oldTypeInst, typeInst));
			}
		}
		return typeInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionVariable basicGetTypeInst() {
		return typeInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeInst(ExpressionVariable newTypeInst) {
		ExpressionVariable oldTypeInst = typeInst;
		typeInst = newTypeInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.CLASS_VAR_DECL__TYPE_INST, oldTypeInst, typeInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BSharpPackage.CLASS_VAR_DECL__OWNER_TYPE:
				if (resolve) return getOwnerType();
				return basicGetOwnerType();
			case BSharpPackage.CLASS_VAR_DECL__TYPE_INST:
				if (resolve) return getTypeInst();
				return basicGetTypeInst();
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
			case BSharpPackage.CLASS_VAR_DECL__OWNER_TYPE:
				setOwnerType((GenName)newValue);
				return;
			case BSharpPackage.CLASS_VAR_DECL__TYPE_INST:
				setTypeInst((ExpressionVariable)newValue);
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
			case BSharpPackage.CLASS_VAR_DECL__OWNER_TYPE:
				setOwnerType((GenName)null);
				return;
			case BSharpPackage.CLASS_VAR_DECL__TYPE_INST:
				setTypeInst((ExpressionVariable)null);
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
			case BSharpPackage.CLASS_VAR_DECL__OWNER_TYPE:
				return ownerType != null;
			case BSharpPackage.CLASS_VAR_DECL__TYPE_INST:
				return typeInst != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String getEventBFunctypeForCall(FunctionCall fc) throws Exception {
		/* In most cases this class acts only as a wrapper, allowing typeInst
		 * to be uniquely referenced, if so simply call the methods on the
		 * wrapped class. When the typeInst is a TypedVariable the deconstructors 
		 * need to be called on a type class to get the right name.
		 */
		if (!(typeInst instanceof TypedVariable)) {
			return typeInst.getEventBFunctypeForCall(fc);
		}
		
		/* Henceforth it is assumed that we are referencing an
		 * associated variable of a class.
		 */
		if (ownerType instanceof PolyType) {
			List<ClassDecl> supers = ((PolyType) ownerType).getSuperTypes();
			
			for (ClassDecl sup : supers) {
				String res = null;
				if (sup instanceof BSClass)
					res = ((BSClass)sup).applyGetter((PolyType)ownerType, typeInst);
				
				if (res != null && !res.isEmpty())
					return res;
			}
		}
		
		/* Don't know when this would happen. */
		return null;
	}

	@Override
	public String evBSeparatorForFunc() {
		if (typeInst instanceof FunctionDecl) {
			return typeInst.evBSeparatorForFunc();
		}
		
		if (typeInst instanceof DatatypeConstructor)
			return ", ";
		
		
		return " ↦ ";
	}
	
	@Override
	public String getParaContextArgs(FunctionCall fc) throws Exception {
		return null;
	}

	@Override
	public String compileToStringWithContext(FunctionCall fc, Boolean asPred) throws Exception {
		return ExpressionVariableImpl.compileToStringWithContextFunc(this, fc, asPred);
	}

	@Override
	public boolean referencesContainingType() {
		/* Either the owner type can the containing type class (This is unlikely as 
		 * variables can be referenced, and the type is implicit). Or, the GenNam can
		 * be a polymorphic type declared in the TypeClass Constructor. 
		 */
		
		ClassDecl container = EcoreUtil2.getContainerOfType(this, ClassDecl.class);
		if (ownerType == container) {
			return true;
		}
		
		if (ownerType instanceof PolyType) {
			PolyType pType = (PolyType)ownerType;
			IPolyTypeProvider prov = EcoreUtil2.getContainerOfType(pType, IPolyTypeProvider.class);
			
			if (prov == ownerType) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public TypeBuilder calculateReturnType() {
		return typeInst.calculateReturnType();
	}

	@Override
	public TypeBuilder calculateType() {
		return typeInst.calculateType();
	}
} //ClassVarDeclImpl
