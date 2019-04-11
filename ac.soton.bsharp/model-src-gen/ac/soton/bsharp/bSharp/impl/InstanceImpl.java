/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FileImport;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.GenName;
import ac.soton.bsharp.bSharp.IClassInstance;
import ac.soton.bsharp.bSharp.IEventBPrefixProvider;
import ac.soton.bsharp.bSharp.ITheoremContainer;
import ac.soton.bsharp.bSharp.Instance;
import ac.soton.bsharp.bSharp.NamedObject;
import ac.soton.bsharp.bSharp.ReferencingFunc;
import ac.soton.bsharp.bSharp.TheoremDecl;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.mapletTree.IMapletNode;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;
import ac.soton.bsharp.typeInstanceRepresentation.ConcreteTypeInstance;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;
import ac.soton.bsharp.typeInstanceRepresentation.MapletTypeInstance;
import ac.soton.bsharp.util.EcoreUtilJ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.mapping.RemoteResourceMappingContext;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eventb.core.ast.extension.IOperatorProperties.FormulaType;
import org.eventb.core.ast.extension.IOperatorProperties.Notation;
import org.eventb.theory.core.INewOperatorDefinition;
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
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getClassNameName <em>Class Name Name</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.InstanceImpl#getReferencingFuncs <em>Referencing Funcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends IExpressionContainerImpl implements Instance {
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
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected BSClass className;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<IClassInstance> context;

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
	 * The default value of the '{@link #getClassNameName() <em>Class Name Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNameName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassNameName() <em>Class Name Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNameName()
	 * @generated
	 * @ordered
	 */
	protected String classNameName = CLASS_NAME_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencingFuncs() <em>Referencing Funcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencingFuncs()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferencingFunc> referencingFuncs;

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
	public EList<IClassInstance> getContext() {
		if (context == null) {
			context = new EObjectResolvingEList<IClassInstance>(IClassInstance.class, this, BSharpPackage.INSTANCE__CONTEXT);
		}
		return context;
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
	 * @generated
	 */
	public String getClassNameName() {
		return classNameName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassNameName(String newClassNameName) {
		String oldClassNameName = classNameName;
		classNameName = newClassNameName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.INSTANCE__CLASS_NAME_NAME, oldClassNameName, classNameName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferencingFunc> getReferencingFuncs() {
		if (referencingFuncs == null) {
			referencingFuncs = new EObjectContainmentEList<ReferencingFunc>(ReferencingFunc.class, this, BSharpPackage.INSTANCE__REFERENCING_FUNCS);
		}
		return referencingFuncs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getName() {
		if (name == null) {
			name = defaultName();
			isDefault = true;
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
			case BSharpPackage.INSTANCE__REFERENCING_FUNCS:
				return ((InternalEList<?>)getReferencingFuncs()).basicRemove(otherEnd, msgs);
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
			case BSharpPackage.INSTANCE__NAME:
				return getName();
			case BSharpPackage.INSTANCE__CLASS_NAME:
				if (resolve) return getClassName();
				return basicGetClassName();
			case BSharpPackage.INSTANCE__CONTEXT:
				return getContext();
			case BSharpPackage.INSTANCE__ARGUMENTS:
				return getArguments();
			case BSharpPackage.INSTANCE__CLASS_NAME_NAME:
				return getClassNameName();
			case BSharpPackage.INSTANCE__REFERENCING_FUNCS:
				return getReferencingFuncs();
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
			case BSharpPackage.INSTANCE__NAME:
				setName((String)newValue);
				return;
			case BSharpPackage.INSTANCE__CLASS_NAME:
				setClassName((BSClass)newValue);
				return;
			case BSharpPackage.INSTANCE__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends IClassInstance>)newValue);
				return;
			case BSharpPackage.INSTANCE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Expression>)newValue);
				return;
			case BSharpPackage.INSTANCE__CLASS_NAME_NAME:
				setClassNameName((String)newValue);
				return;
			case BSharpPackage.INSTANCE__REFERENCING_FUNCS:
				getReferencingFuncs().clear();
				getReferencingFuncs().addAll((Collection<? extends ReferencingFunc>)newValue);
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
			case BSharpPackage.INSTANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BSharpPackage.INSTANCE__CLASS_NAME:
				setClassName((BSClass)null);
				return;
			case BSharpPackage.INSTANCE__CONTEXT:
				getContext().clear();
				return;
			case BSharpPackage.INSTANCE__ARGUMENTS:
				getArguments().clear();
				return;
			case BSharpPackage.INSTANCE__CLASS_NAME_NAME:
				setClassNameName(CLASS_NAME_NAME_EDEFAULT);
				return;
			case BSharpPackage.INSTANCE__REFERENCING_FUNCS:
				getReferencingFuncs().clear();
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
			case BSharpPackage.INSTANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BSharpPackage.INSTANCE__CLASS_NAME:
				return className != null;
			case BSharpPackage.INSTANCE__CONTEXT:
				return context != null && !context.isEmpty();
			case BSharpPackage.INSTANCE__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case BSharpPackage.INSTANCE__CLASS_NAME_NAME:
				return CLASS_NAME_NAME_EDEFAULT == null ? classNameName != null : !CLASS_NAME_NAME_EDEFAULT.equals(classNameName);
			case BSharpPackage.INSTANCE__REFERENCING_FUNCS:
				return referencingFuncs != null && !referencingFuncs.isEmpty();
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
		if (baseClass == ITheoremContainer.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IClassInstance.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (derivedFeatureID) {
				case BSharpPackage.INSTANCE__NAME: return BSharpPackage.NAMED_OBJECT__NAME;
				default: return -1;
			}
		}
		if (baseClass == IEventBPrefixProvider.class) {
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
		if (baseClass == ITheoremContainer.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IClassInstance.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedObject.class) {
			switch (baseFeatureID) {
				case BSharpPackage.NAMED_OBJECT__NAME: return BSharpPackage.INSTANCE__NAME;
				default: return -1;
			}
		}
		if (baseClass == IEventBPrefixProvider.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", classNameName: ");
		result.append(classNameName);
		result.append(')');
		return result.toString();
	}
	
	protected Boolean isDefault = null;
	
	@Override
	public
	boolean isDefault() {
		if (isDefault == null) {
			getName();
		}
		
		return isDefault;
	}
	
	protected ConcreteTypeInstance typeInst = null;
	
	String defaultName() {
		ClassDecl cd = EcoreUtil2.getContainerOfType(this.eContainer(), ClassDecl.class);
		return cd.eventBPrefix() + "_" + getClassNameName();
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
	
	void compileEventBOperator(IProgressMonitor monitor) {
		String operatorName = getName();
		TheoryImportCache thyCache = CompilationUtil.getTheoryCacheForElement(this);

		INewOperatorDefinition op;
		
		try {
			op = TheoryUtils.createOperator(thyCache.theory, operatorName, false, false, 
					FormulaType.EXPRESSION, Notation.PREFIX, null, monitor);
			TheoryUtils.createDirectDefinition(op, typeInst.eventBTypeInstance(), null, monitor);
		} catch (Exception e) {
			System.err.println("Failed to create new operator definition for Instance with error: " + e.getMessage());
			return;
		}	
	}
	
	/* If we have Instance Setoid<pNat>([=]) this compiles to an operator with the direct definition
	 *  pNat |-> = \in Setoid(pNat)
	 *  Given a more compilcated statement such as Instance Monoid<pNat>(op, ident) we need to recognize that
	 *  the Monoid type class only adds the "ident" variable, so a semi-group is also being created, but the
	 *  setoid part is inferred and the default setoid is to be used.
	 */
	void compileMembershipTheoremExpr(IProgressMonitor monitor) {
		String membershipThmName = getName() + " in " + className.getName();
		
		TheoryImportCache thyCache = CompilationUtil.getTheoryCacheForElement(this);
		
		/* To do the constructWithIClassInstance it is necessary to have already constructed super instances
		 * before I get to this point. This is something that I need to put some consideration into. Special note
		 * needs to be given to the naming scheme.
		 */
		List<IClassInstance> ctx = getContext();
		ArrayList<ITypeInstance> typeInstList = new ArrayList<ITypeInstance>();
		
		for (IClassInstance ci : ctx) {
			typeInstList.add(ci.typeInstanceForContext(this));
		}
		
		String ebPred = typeInst.eventBTypeInstanceForType(getClassName()) + " ∈ " + className.constructWithTypeInstances(typeInstList);
		
		try {
			TheoryUtils.createTheorem(thyCache.theory, membershipThmName, ebPred, monitor);
		} catch (Exception e) {
			System.err.println("Failed to compile Instance theorem with error: " + e.getMessage());
		}
	}
	
	@Override 
	public void compile(IProgressMonitor monitor) {
		typeInst = new ConcreteTypeInstance(this, this);
		SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
		compileMembershipTheoremExpr(subMonitor.newChild(50));
		/*compileEventBOperator(subMonitor.newChild(50)); Left out due to typing difficulty, The problem
		 * is that polymorphic functions such as equality cannot infer the polymorphic type. The type information
		 * for this is in the type class that they are a member of, so a future implementation can use this 
		 * information to resolve the type issue.
		 */
		
		//TODO: Some compiling of functions and theorems
		List<FunctionDecl> methods = allMethods();
		for (FunctionDecl meth : methods) {
			meth.compileWithTypeInstancesForInferredType(typeInst, getName());
		}
		
		List<TheoremDecl> theorems = allTheorems();
		
		for (TheoremDecl theorem : theorems) {
			theorem.compileWithTypeInstancesForInferredType(typeInst, getName());
		}
		
		typeInst = null;
	}
	
	List<FunctionDecl> allMethods() {
		List<BSClass> representedTypeClasses = typeClassesRepresentedByInstance();
		ArrayList<FunctionDecl> result = new ArrayList<FunctionDecl>();
		
		for (BSClass tc : representedTypeClasses) {
			@SuppressWarnings("unchecked")
			List<FunctionDecl> functionDecls = (List<FunctionDecl>) CompilationUtil
					.filterInscopeBSharpBlocksForClass(this, tc, new Function1<EObject, Boolean>() {

						@Override
						public Boolean apply(EObject p) {
							return p instanceof FunctionDecl && ((FunctionDecl) p).isMethod();
						}
					});
			result.addAll(functionDecls);
		}
		
		return result;
	}
	
	List<TheoremDecl> allTheorems() {
		List<BSClass> representedTypeClasses = typeClassesRepresentedByInstance();
		ArrayList<TheoremDecl> result = new ArrayList<TheoremDecl>();
		
		for (BSClass tc : representedTypeClasses) {
			@SuppressWarnings("unchecked")
			List<TheoremDecl> theoremDecl = (List<TheoremDecl>) CompilationUtil.filterInscopeBSharpBlocksForClass(this,
					tc, new Function1<EObject, Boolean>() {

						@Override
						public Boolean apply(EObject p) {
							return p instanceof TheoremDecl && ((TheoremDecl) p).getExpr().hasInferredContext();
						}
					});
			result.addAll(theoremDecl);
		}
		
		return result;
	}

	@Override
	public ClassDecl getBaseType() {
		if (context.size() != 1) {
			/* If the context has more than one type within it I should construct
			 *  the base type from the type class baseType and the types in the context.
			 */
			return null;
		}
		
		IClassInstance classInst = context.get(0);
		
		if (classInst instanceof ClassDecl)
			return (ClassDecl)classInst;
		else {
			return ((Instance)classInst).getBaseType();
		}
	}

	@Override
	public IMapletNode concreteInstanceMapletTree() {
		return getClassName().concreteTypeMapletTree(getContext(), arguments, this, this);
	}
	
	@Override
	public ConcreteTypeInstance findSuperTypeInstanceOfType(ClassDecl type, EObject context) {
		/* Again, I'm going to assume that the context only has a single variable within it. */
		if (type instanceof Datatype) {
			return ((Datatype)type).typeInstanceForContext(context);
		}
		
		List<IClassInstance> ctx = getContext();
		if (ctx != null && ctx.size() == 1) {
			IClassInstance ctxType = ctx.get(0);
			
			if (ctxType instanceof Instance) {
				if (((Instance)ctxType).getClassName() != type) {
					try {
						throw new Exception("This would require some sort of mixing of default types and "
								+ "supplied types. I do not currently support this.");
					} catch (Exception e) {
						System.err.println("Instance.findSuperTypeInstanceOfType(): an attempt to mix "
								+ "default types and supplied types was made, and this is not currently"
								+ "supported.");
						return null;
					}
				}
				
				return ((Instance)ctxType).typeInstanceForContext(context);
			}
		}
		
		/* We need to search for a Instance of the supertype within the default instances. 
		 * Basically we find the first non-named Instance that is the searched for type, 
		 * or any subtype of the searched for type.
		 */
		Instance inst = (Instance)CompilationUtil.findFirstInSupertypeScope(context, new Function1<EObject, Boolean>() {

			@Override
			public Boolean apply(EObject p) {
				if (p instanceof Instance) {
					Instance pInst = (Instance)p;
					if (pInst.isDefault()) {
						return type == pInst.getClassName() || pInst.getClassName().isSuperType(type);
					}
				}
				
				return false;
			}
		});
		
		return inst.typeInstanceForContext(context);
	}
	
	@Override
	public List<BSClass> typeClassesRepresentedByInstance() {
		return getClassName().typeClassesConstructableWithArgs(getArguments());
	}

	@Override
	public ConcreteTypeInstance getInferredTypeInstance() {
		return typeInst;
	}

	@Override
	public ConcreteTypeInstance typeInstanceForContext(EObject context) {
		return new ConcreteTypeInstance(this, context);
	}

	@Override
	public String eventBPrefix() {
		return CompilationUtil.getClassDecl(this).getName() + "_" + getName();
	}
} //InstanceImpl
