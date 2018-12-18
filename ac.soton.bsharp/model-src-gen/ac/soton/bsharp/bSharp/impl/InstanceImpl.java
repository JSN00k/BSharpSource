/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.BodyElements;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.Instance;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.mapletTree.IMapletNode;
import ac.soton.bsharp.typeInstanceRepresentation.ConcreteTypeInstance;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.mapping.RemoteResourceMappingContext;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.linking.LinkingScopeProviderBinding;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.linking.lazy.LazyURIEncoder;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.util.EcoreGenericsUtil;
import org.eclipse.xtext.util.SimpleCache;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.common.base.Function;
import com.google.inject.Inject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends IExpressionContainerImpl implements Instance {
	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected BSClass className;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected BodyElements context;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSClass getClassName() {
		if (className != null && className.eIsProxy()) {
			InternalEObject oldClassName = (InternalEObject)className;
			className = (BSClass)eResolveProxy(oldClassName);
			if (className != oldClassName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.INSTANCE__CLASS_NAME, oldClassName, className));
			}
		}
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSClass basicGetClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(BSClass newClassName) {
		BSClass oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INSTANCE__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyElements getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (BodyElements)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSharpPackage.INSTANCE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyElements basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(BodyElements newContext) {
		BodyElements oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INSTANCE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Expression>(Expression.class, this, BSharpPackage.INSTANCE__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		if (name == null) {
			name = defaultName();
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INSTANCE__NAME, null, name));
		}
		
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INSTANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.INSTANCE__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
			case BSharpPackage.INSTANCE__CLASS_NAME:
				if (resolve) return getClassName();
				return basicGetClassName();
			case BSharpPackage.INSTANCE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case BSharpPackage.INSTANCE__ARGUMENTS:
				return getArguments();
			case BSharpPackage.INSTANCE__NAME:
				return getName();
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
			case BSharpPackage.INSTANCE__CLASS_NAME:
				setClassName((BSClass)newValue);
				return;
			case BSharpPackage.INSTANCE__CONTEXT:
				setContext((BodyElements)newValue);
				return;
			case BSharpPackage.INSTANCE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case BSharpPackage.INSTANCE__NAME:
				setName((String)newValue);
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
			case BSharpPackage.INSTANCE__CLASS_NAME:
				setClassName((BSClass)null);
				return;
			case BSharpPackage.INSTANCE__CONTEXT:
				setContext((BodyElements)null);
				return;
			case BSharpPackage.INSTANCE__ARGUMENTS:
				getArguments().clear();
				return;
			case BSharpPackage.INSTANCE__NAME:
				setName(NAME_EDEFAULT);
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
			case BSharpPackage.INSTANCE__CLASS_NAME:
				return className != null;
			case BSharpPackage.INSTANCE__CONTEXT:
				return context != null;
			case BSharpPackage.INSTANCE__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case BSharpPackage.INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	
	protected ITypeInstance typeInst = null;
	
	String defaultName() {
		ClassDecl cd = EcoreUtil2.getContainerOfType(this.eContainer(), ClassDecl.class);
		
		return cd.eventBPrefix() + "_" + className.getName();
	}
	
	Instance getSuperInstance() {
		/* The approach is to generate a reference for the supertype, get the scope for 
		 * the reference, and then manually search the scope to try and find the description
		 * This avoids the need to have the information about nodes that the validator uses.
		 * It also means that we only find in scope instances of extends (If we used the 
		 * index then out of scope objects would als be found). */
		BSClass targetType = getClassName();
		ClassDecl superT = targetType.getFirstSupertypeTypeClass();
		if (superT == null)
			return null;
		
		BSharpBlock emptyBlock = BSharpFactory.eINSTANCE.createBSharpBlock();
		EReference ref = EcoreFactory.eINSTANCE.createEReference();
		ref.setName(className.eventBPrefix() + "_" + superT.getName());
		ref.setEType(emptyBlock.eClass());
		
		LazyLinkingResource res = new LazyLinkingResource();
		res.addLazyProxyInformation(this, ref, null);
		
		EcoreUtil2.resolveLazyCrossReferences(res, null);
		
		return null;
	}
	
	IMapletNode mapletTreeForArguments(List<Expression> args) {
		int argsCount = args.size();
		int typeClassArgsCount = className.getVarList().count();
		
		if (argsCount < typeClassArgsCount) {
			// TODO: Validate
			try {
				throw new Exception("Too few arguments to create an instance. This should have been"
						+ "validated against.");
			} catch (Exception e) {
				System.err.println("Too few arguments to create an instance. This should have been"
						+ "validated against.");
				return null;
			}
		}
		
		return null;
	}
	
	/* If we have Instance Setoid<pNat>([=]) this compiles to an operator with the direct definition
	 *  pNat |-> = \in Setoid(pNat)
	 *  Given a more compilcated statement such as Instance Monoid<pNat>(op, ident) we need to recognize that
	 *  the Monoid type class only adds the "ident" variable, so a semi-group is also being created, but the
	 *  setoid part is inferred and the default setoid is to be used.
	 */
	void compileMembershipOperatorExpr() {
		Instance superInst = getSuperInstance();
	}
	
	@Override 
	public void compile() {
		typeInst = new ConcreteTypeInstance(getClassName());
		compileMembershipOperatorExpr();
		
		//TODO: Some compiling!
		
		typeInst = null;
	}

	@Override
	public ITypeInstance getTypeInstance() {
		return typeInst;
	}

} //InstanceImpl
