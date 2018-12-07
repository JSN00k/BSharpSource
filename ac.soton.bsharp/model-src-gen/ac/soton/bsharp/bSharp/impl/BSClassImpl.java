/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.InstName;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.PolyType;
import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TheoremDecl;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeDeclContext;
import ac.soton.bsharp.bSharp.TypePowerSet;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.bSharp.Where;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.IMapletNode;
import ac.soton.bsharp.bSharp.util.ITypeInstance;
import ac.soton.bsharp.bSharp.util.MapletStringLeaf;
import ac.soton.bsharp.bSharp.util.MapletTree;
import ac.soton.bsharp.bSharp.util.MapletTypeInstance;
import ac.soton.bsharp.bSharp.util.StringTypeInstance;
import ac.soton.bsharp.bSharp.util.Tuple2;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eventb.core.ast.extension.IOperatorProperties.FormulaType;
import org.eventb.core.ast.extension.IOperatorProperties.Notation;
import org.eventb.theory.core.INewOperatorDefinition;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bpp Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BSClassImpl#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BSClassImpl#getVarList <em>Var List</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BSClassImpl#getWhere <em>Where</em>}</li>
 * </ul>
 */
public class BSClassImpl extends ClassDeclImpl implements BSClass {
	/**
	 * The cached value of the '{@link #getSupertypes() <em>Supertypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypes()
	 * @generated
	 * @ordered
	 */
	protected SuperTypeList supertypes;

	/**
	 * The cached value of the '{@link #getVarList() <em>Var List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarList()
	 * @generated
	 * @ordered
	 */
	protected TypedVariableList varList;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Where where;

	/**
	 * The cached value of the '{@link #getInstName() <em>Inst Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstName()
	 * @generated
	 * @ordered
	 */
	protected InstName instName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.BS_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperTypeList getSupertypes() {
		return supertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertypes(SuperTypeList newSupertypes, NotificationChain msgs) {
		SuperTypeList oldSupertypes = supertypes;
		supertypes = newSupertypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__SUPERTYPES, oldSupertypes, newSupertypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertypes(SuperTypeList newSupertypes) {
		if (newSupertypes != supertypes) {
			NotificationChain msgs = null;
			if (supertypes != null)
				msgs = ((InternalEObject)supertypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__SUPERTYPES, null, msgs);
			if (newSupertypes != null)
				msgs = ((InternalEObject)newSupertypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__SUPERTYPES, null, msgs);
			msgs = basicSetSupertypes(newSupertypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__SUPERTYPES, newSupertypes, newSupertypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariableList getVarList() {
		return varList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarList(TypedVariableList newVarList, NotificationChain msgs) {
		TypedVariableList oldVarList = varList;
		varList = newVarList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__VAR_LIST, oldVarList, newVarList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarList(TypedVariableList newVarList) {
		if (newVarList != varList) {
			NotificationChain msgs = null;
			if (varList != null)
				msgs = ((InternalEObject)varList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__VAR_LIST, null, msgs);
			if (newVarList != null)
				msgs = ((InternalEObject)newVarList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__VAR_LIST, null, msgs);
			msgs = basicSetVarList(newVarList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__VAR_LIST, newVarList, newVarList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Where newWhere, NotificationChain msgs) {
		Where oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Where newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstName getInstName() {
		return instName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstName(InstName newInstName, NotificationChain msgs) {
		InstName oldInstName = instName;
		instName = newInstName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__INST_NAME, oldInstName, newInstName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstName(InstName newInstName) {
		if (newInstName != instName) {
			NotificationChain msgs = null;
			if (instName != null)
				msgs = ((InternalEObject)instName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__INST_NAME, null, msgs);
			if (newInstName != null)
				msgs = ((InternalEObject)newInstName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__INST_NAME, null, msgs);
			msgs = basicSetInstName(newInstName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__INST_NAME, newInstName, newInstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				return basicSetSupertypes(null, msgs);
			case BSharpPackage.BS_CLASS__VAR_LIST:
				return basicSetVarList(null, msgs);
			case BSharpPackage.BS_CLASS__WHERE:
				return basicSetWhere(null, msgs);
			case BSharpPackage.BS_CLASS__INST_NAME:
				return basicSetInstName(null, msgs);
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
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				return getSupertypes();
			case BSharpPackage.BS_CLASS__VAR_LIST:
				return getVarList();
			case BSharpPackage.BS_CLASS__WHERE:
				return getWhere();
			case BSharpPackage.BS_CLASS__INST_NAME:
				return getInstName();
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
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				setSupertypes((SuperTypeList)newValue);
				return;
			case BSharpPackage.BS_CLASS__VAR_LIST:
				setVarList((TypedVariableList)newValue);
				return;
			case BSharpPackage.BS_CLASS__WHERE:
				setWhere((Where)newValue);
				return;
			case BSharpPackage.BS_CLASS__INST_NAME:
				setInstName((InstName)newValue);
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
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				setSupertypes((SuperTypeList)null);
				return;
			case BSharpPackage.BS_CLASS__VAR_LIST:
				setVarList((TypedVariableList)null);
				return;
			case BSharpPackage.BS_CLASS__WHERE:
				setWhere((Where)null);
				return;
			case BSharpPackage.BS_CLASS__INST_NAME:
				setInstName((InstName)null);
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
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				return supertypes != null;
			case BSharpPackage.BS_CLASS__VAR_LIST:
				return varList != null;
			case BSharpPackage.BS_CLASS__WHERE:
				return where != null;
			case BSharpPackage.BS_CLASS__INST_NAME:
				return instName != null;
		}
		return super.eIsSet(featureID);
	}

	public Collection<EObject> getVariablesNames() {		
		ArrayList<EObject> result = new ArrayList<EObject>();
		
		if (instName != null)
			result.add(instName);
		
		if (varList == null) {
			return result;
		}
		
		result.addAll(EcoreUtil2.getAllContentsOfType(varList, TypedVariable.class));
		return result;
	}
	
	protected IProgressMonitor nullMonitor = new NullProgressMonitor();
	
	/* This get's the number of polymorhic types required to construct the type class */
	public Integer eventBRequiredPolyTypes() {
		generateInferredContext();
		if (context != null) {
			return context.eventBPolyVarCount();
		} else if (supertypes != null) {
			/* The polyContext is inferred from the supertype. */
			TypeBuilder superclass = supertypes.getFirst();
			if (superclass == null)
				return 1;
			
			BSClass sup = (BSClass)((TypeConstructor)superclass).getTypeName();
			return sup.eventBRequiredPolyTypes();
		}
		
		return 1;
	}
	
	@Override
	public void compile() throws Exception {
		compileOp();
		compileGetterOperators();
		block.compile();
	}
	
	public boolean isNewTypeClass() {
		if (supertypes == null)
			return false;
		
		EList<TypeBuilder> supers = supertypes.getSuperTypes();
		if (supers.size() != 1)
			return false;
		
		TypeBuilder sup = supers.get(0);
		if (sup.isAbstractTypeClass())
			return false;
		
		return varList != null && varList.varCount() != 0;
	}
	
	protected Integer compiledMatchStatements = 0;
	
	
	protected ITypeInstance typeInstance = null;
	/* Get type instance is used during compilation of the op for the type class. As a result it actually 
	 * contains an instance representing the supertype.
	 */
	@Override
	public ITypeInstance getTypeInstance() {
		/* Changing the way that this works could allow the creation of a constructed type 
		 * rather than a destructed type. For now this is a big change, and needs to be left for 
		 * latter.
		 */
		return typeInstance;
	}
	
	/* Compiles the operator used to create an instance of this type class. */
	public void compileOp() throws Exception {
		compiledMatchStatements = 0;
		/*TODO: document this method working through a couple of event B examples to show 
		 * how and where they are compiled. Maybe Monoid and TransitiveOp.
		 */
		
		/* Due to a bug in the EventB language the instance name here is modified with a '1' The
		 * TypeEnvironmentBuilder needs fixing to resolve this issue.
		 */
		String iName = instanceName();
		
		generateInferredContext();
		TheoryImportCache thyCache = CompilationUtil.getTheoryCacheForElement(this);
		
		INewOperatorDefinition op;
		try {
			op = TheoryUtils.createOperator(thyCache.theory,
					eventBPolymorphicTypeConstructorName(), false, false, FormulaType.EXPRESSION, Notation.PREFIX, null, nullMonitor);
		} catch (Exception e) {
			System.err.println(" Unable to crate EventB operator " + e.getLocalizedMessage());
			return;
		}
		
		/* This creates the type variables for the EventB operator and creates arguments on
		 * the EventB operator so these type variables can then be used.
		 */
		ArrayList<Tuple2<String, String>> polyTypedVars = null;
		if (context != null) {
			polyTypedVars = context.namesAndTypesForPolyContext(thyCache);
			try {
				CompilationUtil.compileTypedVariablesToOperatorArgs(polyTypedVars, op);
			} catch (Exception e) {
				System.err.println("In BSClassImpl compileOp() couldn't compile the poly context with error: " + e.getLocalizedMessage());
			}
		}
		
		String opString = "{ " + iName;
		ArrayList<Tuple2<String, String>> typedVars = null;
		if (varList != null) {
			typedVars = varList.getCompiledVariablesAndTypes();
			opString += CompilationUtil.compileTypedVariablesToNameListWithSeparator(typedVars, " ↦ ", 
					false, typedVars.size() > 1);
		}

		opString += " | ";
		if (supertypes.isPowerSet())
			opString += iName + "=";
		else 
			opString += iName + " ∈ ";
		
		opString += supertypes.supertypeType(polyTypedVars);
		
		polyTypedVars.add(new Tuple2<String, String>(iName, supertypes.supertypeType(polyTypedVars)));
		BSClass superT = supertypes.getFirst().getTypeClass();
		if (superT != null) {
			typeInstance = new StringTypeInstance(superT, polyTypedVars); 
		} else {
			typeInstance = new StringTypeInstance(this, polyTypedVars);
		}
		
		if (typedVars != null) {
			opString += CompilationUtil.compileTypedVaribalesToTypedList(typedVars, false);
		}
		
		if (where != null) {
			String whereString = where.compileToEventBPredStatements();
			if (whereString != null && !whereString.isEmpty()) {
				opString += " ∧ (" + whereString + ")";
			}
		}
		
		
		opString += "}";
		TheoryUtils.createDirectDefinition(op, opString, null, nullMonitor);
	}
	
	
	@Override
	public ArrayList<String>  getterOperatorSuffixes() {
		/* Get the complete list of operator suffixes from the super type, then append the operator 
		 * suffixes from this type.
		 */
		
		ArrayList<String> result = new ArrayList<String>();
		if (supertypes != null) {
			Collection<TypeBuilder> sTypes = supertypes.getSuperTypes();
			if (sTypes != null && !sTypes.isEmpty()) {
				TypeBuilder sup = sTypes.iterator().next();
				
				if (sup.isAbstractTypeClass()) {
					result.addAll(sup.getTypeClass().getterOperatorSuffixes());
				}
			}
		}
		
		if (varList != null) {
			ArrayList<Tuple2<String, String>> typedVars = varList.getCompiledVariablesAndTypes();
			
			for (Tuple2<String, String> typedVar : typedVars) {
				result.add("_" + typedVar.x);
			}
		}
		
		return result;
	}
	
	/* The typed list of arguments required to construct an entirely generic instance of
	 * this type. Does not include the construction of the type itself.
	 */
	@Override
	public ArrayList<Tuple2<String, String>> polyArgumentsToConstructGenericTypeClass (TheoryImportCache theoryCache) throws Exception {
		generateInferredContext();
		TheoryImportCache thyCache = null;
		if (theoryCache == null) {
			thyCache = CompilationUtil.getTheoryCacheForElement(this);
		} else {
			thyCache = theoryCache;
		}
 
		if (context != null) {
			return context.namesAndTypesForPolyContext(thyCache);
		}
		
		if (supertypes == null) {
			throw new Exception("Type class declared without any sort of supertype");
		}
		
		Collection<TypeBuilder> sTypes = supertypes.getSuperTypes();
		if (sTypes == null || sTypes.isEmpty()) {
			throw new Exception("Type class declared without any sort of supertype");
		}
		
		TypeBuilder sup = sTypes.iterator().next();
		
		if (!sup.isAbstractTypeClass())
			throw new Exception("Type class declared without any sort of supertype");
		
		BSClass superClass = sup.getTypeClass();
		ArrayList<Tuple2<String, String>> result = superClass.polyArgumentsToConstructGenericTypeClass(thyCache);
		
		return result;
	}
	
	/* returns all the typed arguments needed to construct a fully polymorphic version of this
	 * typeclass, including the argument for the type class itself. 
	 */
	@Override
	public ITypeInstance genericTypeInstance(TheoryImportCache thyCache) {
		ArrayList<Tuple2<String, String>> typeConstructors;
		
		try {
			typeConstructors = polyArgumentsToConstructGenericTypeClass(thyCache);
		} catch (Exception e) {
			//TODO: Validation against this.
			System.err.println("Illegal type declaration, this should be validataed against.");
			return null;
		}
		
		String argsForConstructor = "(" + CompilationUtil.compileTypedVariablesToNameListWithSeparator(typeConstructors, ", ", true) + ")";
		typeConstructors.add(new Tuple2<String, String>(instanceName(), eventBPolymorphicTypeConstructorName() + argsForConstructor));
		
		StringTypeInstance res = new StringTypeInstance(this, typeConstructors);
		
		return res;
	}
	
	/* Only the variables from this declaration, does not include variables from the supertypes. */
	public IMapletNode localMappedVars() {
		TypedVariableList vl = getVarList();
		if (vl == null || vl.isEmpty())
			return null;
		
		ArrayList<TypedVariable> typedVars = vl.getTypedVariableNames();
		boolean first = true;
		IMapletNode c = null;
		for (TypedVariable tv : typedVars) {
			if (first) {
				c = new MapletStringLeaf(tv.getName());
				first = false;
				continue;
			}
			
			c = new MapletTree(c, new MapletStringLeaf(tv.getName()));
		}
		
		return c;
	}
	
	public IMapletNode mappedVariables() {
		BSClass superT = supertypes.getFirst().getTypeClass();
		IMapletNode superVars = null;
		
		if (superT != null)
			superVars = ((BSClassImpl)superT).mappedVariables();
		
		IMapletNode myVars = localMappedVars();
		
		if (myVars != null)
			return superVars;
		
		if (superVars != null)
			return myVars;
		
		return new MapletTree(superVars, myVars);
	}
	
	/* This is currently used by theorems to generate the inferred type arguments. It currently 
	 * can't be used in methods as elements are not stored in an individually typed way.
	 */
	@Override
	public ITypeInstance deconstructedTypeInstance(TheoryImportCache thyCache) {
		ArrayList<Tuple2<String, String>> typeConstructors;
		
		try {
			typeConstructors = polyArgumentsToConstructGenericTypeClass(thyCache);
		} catch (Exception e) {
			//TODO: Validation against this.
			System.err.println("Illegal type declaration, this should be validataed against.");
			return null;
		}
		
		IMapletNode mappedVariables = mappedVariables();
		typeConstructors.get(typeConstructors.size() - 1).x = mappedVariables.compileToString();
		MapletTypeInstance res = new MapletTypeInstance(this, typeConstructors, mappedVariables);
		return res;
	}
	
	
	
	INewOperatorDefinition constructOpForGetterWithName(String n) {
		TheoryImportCache thyCache = CompilationUtil.getTheoryCacheForElement(this);
		INewOperatorDefinition op;
		
		try {
			op = TheoryUtils.createOperator(thyCache.theory,
					n, false, false, FormulaType.EXPRESSION, Notation.PREFIX, null, nullMonitor);
		} catch (Exception e) {
			System.err.println("Unable to crate EventB operator " + e.getLocalizedMessage());
			return null;
		}
		
		ArrayList<Tuple2<String, String>> polyArgs = genericTypeInstance(null).typeConstructionTypesTyped();
		
		for (Tuple2<String, String> typedVar : polyArgs) {
			try {
				TheoryUtils.createArgument(op, typedVar.x, typedVar.y, null,
						nullMonitor);
			} catch (Exception e) {
				System.err.println("Unable to create argument for operator op: " + n + " arg: " + typedVar.x + ":" + typedVar.y);
			}
		}
		
		return op;
	}
	
	@Override
	public String getterForOpName(String opName) {
		return name + "_" + opName;
	}
	
	public void compileGetterOperators() {
		String iName = instanceName();
		
		
		if (supertypes != null) {
			/* I think that I'm going to use Event-B operators to pass getters onto subtypes. 
			 * This makes coding simpler. The supertype is always at prj1. of the type. */
			ArrayList<String> polyVars = context.namesForPolyContextTypes();
			polyVars.add("prj1(" + instanceName() + ")");
			String polyTypeArgs = "(" +  CompilationUtil.compileVariablesNamesToArgumentsWithSeparator(polyVars, ", ", true) + ")";
			Collection<TypeBuilder> sTypes = supertypes.getSuperTypes();
			
			if (sTypes != null && !sTypes.isEmpty()) {
				TypeBuilder sup = sTypes.iterator().next();
				
				if (sup.isAbstractTypeClass()) {
					BSClass sType = sup.getTypeClass();
					ArrayList<String> suffixes = sType.getterOperatorSuffixes();
					
					for (String suffix : suffixes) {
						INewOperatorDefinition op = constructOpForGetterWithName(name + suffix);
						try {
							TheoryUtils.createDirectDefinition(op, sType.getName() + suffix + polyTypeArgs, 
									null, nullMonitor);
						} catch (Exception e) {
							System.err.println("Unable to create direct definition for getter op with erorr: " + e.getLocalizedMessage());
						}
						
					}
				}
			}
		}
		
		if (varList != null) {
			ArrayList<Tuple2<String, String>> varListVariables = varList.getCompiledVariablesAndTypes();
			Integer varsCount = varListVariables.size();
			Integer prj1sRequired = varsCount - 1;
			Boolean isFirst = true;
			for (Tuple2<String, String> typedVar : varListVariables) {
				INewOperatorDefinition op = constructOpForGetterWithName(getterForOpName(typedVar.x));
				
				String directDefString = "prj2(" + iName + ")";
				
				directDefString = CompilationUtil.wrapNameInPrj1s(directDefString, prj1sRequired);
				prj1sRequired--;
				
				if (!isFirst) {
					directDefString = "prj2(" + directDefString + ")";
				}
				
				isFirst = false;
				
				try {
					TheoryUtils.createDirectDefinition(op, directDefString, 
							null, nullMonitor);
				} catch (Exception e) {
					System.err.println("Unable to create direct definition for getter op with erorr: " + e.getLocalizedMessage());
				}
			}
		}
	}
	
	@Override
	public Boolean isTypeClass() {
		if (varList != null) {
			if (varList.getCompiledVariablesAndTypes().size() != 0) {
				return true;
			}
		}
		
		if (supertypes != null) {
			Collection<TypeBuilder> sTypes = supertypes.getSuperTypes();
			
			if (sTypes != null && !sTypes.isEmpty()) {
				TypeBuilder sup = sTypes.iterator().next();
				return sup.isAbstractTypeClass();
			}
		}
		
		return false;
	}
	
	@Override
	public String instanceName() {
		return instName.getName();
	}
	
	/* The name for the EventB operator used to construct entirely polymorphic instances of the type. */
	@Override
	public String eventBPolymorphicTypeConstructorName() {
		return name + "_T";
	}

	@Override
	public String constructWithTypeContext(TypeDeclContext ctx, ClassDecl containerType) {
		generateInferredContext();
		if (context == null)
			return "()";
		
		String result = eventBPolymorphicTypeConstructorName();

		try {
			result += context.compileCallWithTypeContext(ctx, containerType);
		} catch (Exception e) {
			System.err.print(e.getLocalizedMessage());
		}
		
		return result;
	}
	
	@Override
	public String compileToStringWithContextAndArguments(FunctionCall fc, Boolean asPred) throws Exception {
		generateInferredContext();
		TypeDeclContext ctx = fc.getContext();
		EList<Expression> arguments = fc.getArguments();
		
		
		if (ctx == null && arguments == null) {
			if (asPred) {
				throw new Exception("This should be validated against, a type class appears wihtout context or argument, "
						+ "and is required to be a predicate.");
			} else {
				/* I'm not sure that this should be possible either. It would require the unification of types and instances (I think). */
				return name;
			}
		}
		
		if (ctx == null && arguments != null) {
			/* If the expression is in a Theorem of a method then the name of the instance
			 * will be the name of the type class. If we're within a where statement the 
			 * name of the instance is "super"
			 */
			String result = null;
			
			if (EcoreUtil2.getContainerOfType(fc, TheoremDecl.class) != null
					|| EcoreUtil2.getContainerOfType(fc, FunctionDecl.class) != null)
				result = name;
			else {
				/* We need to know about the type this was referenced from. */
				BSClass containingClass = EcoreUtil2.getContainerOfType(fc, BSClass.class);

				if (containingClass != null && containingClass == this) {
					/* Due to a name change this requires special casing. */
					result = containingClass.instanceName();
				} else {
					result = name;
				}
			}

			result += "(" + CompilationUtil.compileExpressionListWithSeperator(arguments, " ↦ ") + ")";

			if (asPred) {
				result += " = TRUE";
			}

			return result;

		}

		if (context != null) {
			/* If there is a context then it is necessary to build the types within the context correctly. 
			 * Fortunately there is a method on the context to do this. */
			//context.compileCallWithTypeContext(ctx);
		}
		
		return null;
	}

	@Override
	public String eventBPrefix() {
		//TODO Fix this when a prefix can be manually set.
		return getName();
	}
	
	/* If there is an inferred Context for this type class because it has super types which are 
	 * type classes, this method will create the inferred context if it hasn't already been created.
	 */
	public void generateInferredContext() {
		if (context != null)
			return;
		
		if (supertypes == null)
			return;
		
		EList<TypeBuilder> sTypes = supertypes.getSuperTypes();
		if (sTypes == null || sTypes.isEmpty())
			return;
		
		TypeBuilder first = sTypes.get(0);
		BSClass s = first.getTypeClass();
		context = EcoreUtil2.copy(s.getContext());
	}
	
	@Override
	public PolyContext getContext() {
		generateInferredContext();
		return context;
	}
	
	/* Reduces the type to the BSharp type without any Type classes within it. */
	@Override
	public TypeBuilder identType() {
		TypeBuilder result = null;
		TypeBuilder superType = supertypes.getFirst();
		if (superType.isAbstractTypeClass()) {
			result = superType.getTypeClass().identType();
		} else {
			result = superType;
		}
		
		if (varList == null)
			return result;
		
		ArrayList<Tuple2<TypedVariable, TypeBuilder>> typedVars = varList.getVariablesWithBSharpTypes();
		TypeBuilder res = null;
		for (Tuple2<TypedVariable, TypeBuilder> typeVar : typedVars) {
			if (res == null)
				res = typeVar.y;
			else {
				ConstructedType newRes = BSharpFactory.eINSTANCE.createConstructedType();
				newRes.setLeft(res);
				newRes.setRight(typeVar.y);
				res = newRes;
			}
		}
		
		if (res == null)
			return result;
		
		ConstructedType newRes = BSharpFactory.eINSTANCE.createConstructedType();
		newRes.setLeft(result);
		newRes.setRight(res);
		
		return newRes;
	}

	@Override
	public Integer prjsRequiredForSupertype(BSClass sType) {
		/* To do this I want to do type analysis, this involves expanding 
		 * all of the Type classes, to build a type tree. This is done for
		 * both this type and sType. The type trees can then be compared 
		 * to calculate the number of prjs required.
		 */
		if (sType == this)
			return 0;
		
		if (supertypes == null)
			return null;
		
		EList<TypeBuilder> sTypes = supertypes.getSuperTypes();
		
		for (TypeBuilder supT : sTypes) {
			if (supT.isAbstractTypeClass()) {
				BSClass s = supT.getTypeClass();
				Integer prjs = s.prjsRequiredForSupertype(sType);
				if (prjs != null)
					return prjs + 1;
			}
		}
		
		return null;
	}
	
	@Override
	public Integer prjsRequiredForBaseType() {
		if (supertypes != null) {
			TypeBuilder super1 = supertypes.getFirst();
			super1.reorderTypeTree();

			if (super1.isBaseType()) {
				if (varList != null && varList.varCount() != 0)
					return 1;
				else 
					return 0;
			}
			
			Integer res = ((BSClass)((TypeConstructor)super1).getTypeName()).prjsRequiredForBaseType(); 
			
			if (varList != null && varList.varCount() != 0) {
				return res + 1;
			}
			
			return res;
		}
		
		return 0;
	}
	
	/* The base type is the type before any additional variables have been added. Importantly 
	 * this base type will reference all of the possible polymorphic types that are available.
	 * By examining the base types the relevant prj calls can be generated to deconstruct instances
	 * to fill in the EventB polymorphic context.
	 */
	@Override
	public TypeBuilder baseType() {
		if (supertypes != null) {
			TypeBuilder super1 = supertypes.getFirst();
			super1.reorderTypeTree();
			
			/* It's likely that we'll need to unwrap a power set here. As the base type of a type
			 * class needs to be a power set of a type.
			 */
			
			if (super1 instanceof TypePowerSet) {
				super1 = ((TypePowerSet)super1).getChild();
			}

			if (super1.isBaseType())
				return super1;
			
			return ((BSClass)((TypeConstructor)super1).getTypeName()).baseType();
		}
		
		return null;
	}

	@Override
	public String deconstructEventBTypeToArguments(String deconstructionType) {
		Integer prjsRequired = prjsRequiredForBaseType();
		
		String deconType = CompilationUtil.wrapNameInPrj1s(deconstructionType, prjsRequired);
		
		TypeBuilder baseType = baseType();
		String result = baseType.getPrimativeTypesListByDeconstruction(deconType);
		
		if (result == null || result.isEmpty()) {
			result = deconType;
		} else {
			result += ", " + deconstructionType;
		}
		
		return result;
	}

	/* Given a polytype T : Setoid this deals with a call like T.equ(a, b) 
	 * ownerType would be T, typeInst would be equ, function call contains a polytype and 
	 */
	@Override
	public String applyMemberOrFuncGetter(ExpressionVariable typeInst, PolyType ownerType, FunctionCall fc,
			Boolean asPred) {
		/* It's possible that the type of owner type is a subtype of the required type. In this case
		 * it is necessary to calculate the number of prj1s to apply to the current type to get the 
		 * correct supertype.
		 */
		TypeDeclContext ctx = fc.getContext();
		EList<Expression> args =  fc.getArguments();
		
		TypedVariableList varList = EcoreUtil2.getContainerOfType(typeInst, TypedVariableList.class);
		
		if (varList != null && varList.eContainer() instanceof BSClass) {
			String getterFunc = getterForOpName(typeInst.getName());
			String result = getterFunc + "(";
			ArrayList<String> polyTypes = ownerType.typeNames();
			
			boolean first = true;
			for (String tName : polyTypes) {
				if (!first) {
					result += ", ";
				}
				first = false;
				
				result += tName;
			}
			
			result += ")";
			
			if (args != null) {
				try {
					result += "(" + CompilationUtil.compileExpressionListWithSeperator(args, " ↦ ") + ")";
				} catch (Exception e) {
					System.err.println("unable to compile variable list with error: " + e.getLocalizedMessage());
				}
				
			}
			
			if (asPred) {
				result += "= TRUE";
			}
			
			return result;
		}
		
		return null;
	}
	
	@Override
	public String expandSupertypeMemberReferencedInWhere(TypedVariable var) {
		TypeBuilder superT = supertypes.getFirst();
		BSClass bsSuper = superT.getTypeClass();
		
		String result  = bsSuper.getterForOpName(var.getName()) + "(";
		ArrayList<String> types = context.namesForPolyContextTypes();
		
		boolean first = true;
		for (String type : types) {
			if (!first) {
				result += ", ";
			}
			first = false;
			
			result += type;
		}
		
		if (!first)
			result += ", ";
		
		result += instanceName() + ")";
		return result;
	}
	
	/* If we have an expression such as T : Setoid in a polymophic in eventB this becomes 
	 * T1 : POW(T_EvB), T : Setoid_T(T1), this method will return T1. If the Setoid was a 
	 * subset of T ** T then it would return T1 ** T1.
	 */
	@Override 
	public String baseTypeStringForPolymorphicType(PolyType p) {
		String baseName = p.getName();
		Integer neededPolys = eventBRequiredPolyTypes();
		ArrayList<String> requiredEBTypes = new ArrayList<String>();
		
		for (Integer i = 1; i <= neededPolys; ++i) {
			requiredEBTypes.add(baseName + i.toString());
		}
		
		
		TypeBuilder baseType = baseType();
		return baseType.constructWithTypes(requiredEBTypes);
	}
	
	/* In type class declarations such as the Monoid declaration you can do a : Monoid.
	 * This will return the name of the type used to construct the monoid. */
	@Override 
	public String baseTypeFromBSContext() {
		generateInferredContext();
		ArrayList<String> polyTypedVars = context.namesForPolyContextTypes();
		TypeBuilder baseType = baseType();
		return baseType.constructWithTypes(polyTypedVars);
	}

	@Override
	public String appyMemberOrFunc(ExpressionVariable typeInst, FunctionCall fc, Boolean asPred) {
		return null;
	}

	@Override
	public String inferredPolyTypeArgsForType(ClassDecl t) {
		
		ArrayList<String> constrTypeVars = context.namesForPolyContextTypes();
		
		String result = "";
		boolean first = true;
		for (int i = 0; i < constrTypeVars.size(); ++i) {
			if (!first)
				result += ", ";
			
			first = false;
			
			result += constrTypeVars;
		}
		
		int prjsRequired;
		
		if (t instanceof Datatype)
			prjsRequired = prjsRequiredForBaseType() - 1;
		else 
			prjsRequired = prjsRequiredForSupertype((BSClass)t) - 1;
		
		String instName = instanceName();
		CompilationUtil.wrapNameInPrj1s(instName, prjsRequired);
		
		if (!first) {
			result += ", ";
		}
		
		return result += instName;
	}

	@Override
	public String opNameForMatchStatement(MatchStatementImpl match) {
		return name + "_M" + (compiledMatchStatements++).toString();
	}

	@Override
	public TypeBuilder calculateReturnType() {
		/* I think that I need some serious consideration about whether this should ever happen.
		 * I don't think that it should.
		 */
		return null;
	}

	@Override
	public TypeBuilder calculateType() {
		TypePowerSet tps = BSharpFactory.eINSTANCE.createTypePowerSet();
		TypeConstructor tc = BSharpFactory.eINSTANCE.createTypeConstructor();
		tc.setTypeName(this);
		tps.setChild(tps);
		return tps;
	}

	@Override
	public Collection<? extends Tuple2<String, String>> inScopeTypedVariables() {
		/* Check for a supertype and get it's in scope varaibles, then append any 
		 * additional variables from the varlist.
		 */
		TypeBuilder superT = supertypes.getFirst();
		BSClass bsSuper = superT.getTypeClass();
		
		ArrayList<Tuple2<String, String>> result = new ArrayList<Tuple2<String,String>>();
		if (bsSuper != null) {
			result.addAll(bsSuper.inScopeTypedVariables());
		}
		
		result.addAll(varList.getCompiledVariablesAndTypes());
		return result;
	}
	
} //BppClassImpl
