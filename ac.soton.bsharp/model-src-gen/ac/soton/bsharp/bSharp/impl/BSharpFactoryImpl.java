/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BSharpFactoryImpl extends EFactoryImpl implements BSharpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BSharpFactory init() {
		try {
			BSharpFactory theBSharpFactory = (BSharpFactory)EPackage.Registry.INSTANCE.getEFactory(BSharpPackage.eNS_URI);
			if (theBSharpFactory != null) {
				return theBSharpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BSharpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSharpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BSharpPackage.TYPE: return createType();
			case BSharpPackage.BRACKET: return createBracket();
			case BSharpPackage.BS_CLASS: return createBSClass();
			case BSharpPackage.BSHARP_BLOCK: return createBSharpBlock();
			case BSharpPackage.CLASS_VAR_DECL: return createClassVarDecl();
			case BSharpPackage.CONSTRUCTED_TYPE: return createConstructedType();
			case BSharpPackage.DATATYPE: return createDatatype();
			case BSharpPackage.DATATYPE_CONSTRUCTOR: return createDatatypeConstructor();
			case BSharpPackage.EXTEND: return createExtend();
			case BSharpPackage.EXPRESSION: return createExpression();
			case BSharpPackage.FILE_IMPORT: return createFileImport();
			case BSharpPackage.FUNCTION_CALL: return createFunctionCall();
			case BSharpPackage.FUNCTION_DECL: return createFunctionDecl();
			case BSharpPackage.GLOBAL_IMPORT: return createGlobalImport();
			case BSharpPackage.INBUILT_INFIX: return createInbuiltInfix();
			case BSharpPackage.INFIX: return createInfix();
			case BSharpPackage.INST_NAME: return createInstName();
			case BSharpPackage.INSTANCE: return createInstance();
			case BSharpPackage.LOCAL_IMPORT: return createLocalImport();
			case BSharpPackage.MATCH_CASE: return createMatchCase();
			case BSharpPackage.MATCH_STATEMENT: return createMatchStatement();
			case BSharpPackage.NAMED_OBJECT: return createNamedObject();
			case BSharpPackage.POLY_CONTEXT: return createPolyContext();
			case BSharpPackage.POLY_TYPE: return createPolyType();
			case BSharpPackage.PREFIX: return createPrefix();
			case BSharpPackage.QUANT_LAMBDA: return createQuantLambda();
			case BSharpPackage.REFERENCING_FUNC: return createReferencingFunc();
			case BSharpPackage.SUPER_TYPE_LIST: return createSuperTypeList();
			case BSharpPackage.THEOREM_BODY: return createTheoremBody();
			case BSharpPackage.THEOREM_DECL: return createTheoremDecl();
			case BSharpPackage.TOP_LEVEL_FILE: return createTopLevelFile();
			case BSharpPackage.TOP_LEVEL: return createTopLevel();
			case BSharpPackage.TOP_LEVEL_IMPORT: return createTopLevelImport();
			case BSharpPackage.TYPE_CONSTRUCTOR: return createTypeConstructor();
			case BSharpPackage.TYPE_CONSTR_BRACKET: return createTypeConstrBracket();
			case BSharpPackage.TYPE_DECL_CONTEXT: return createTypeDeclContext();
			case BSharpPackage.TYPE_POWER_SET: return createTypePowerSet();
			case BSharpPackage.TYPED_VARIABLE: return createTypedVariable();
			case BSharpPackage.TYPED_VARIABLE_LIST: return createTypedVariableList();
			case BSharpPackage.VARIABLE_TYPING: return createVariableTyping();
			case BSharpPackage.WHERE: return createWhere();
			case BSharpPackage.WRAPPED_INFIX: return createWrappedInfix();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevel createTopLevel() {
		TopLevelImpl topLevel = new TopLevelImpl();
		return topLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelFile createTopLevelFile() {
		TopLevelFileImpl topLevelFile = new TopLevelFileImpl();
		return topLevelFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelImport createTopLevelImport() {
		TopLevelImportImpl topLevelImport = new TopLevelImportImpl();
		return topLevelImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSharpBlock createBSharpBlock() {
		BSharpBlockImpl bSharpBlock = new BSharpBlockImpl();
		return bSharpBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyContext createPolyContext() {
		PolyContextImpl polyContext = new PolyContextImpl();
		return polyContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyType createPolyType() {
		PolyTypeImpl polyType = new PolyTypeImpl();
		return polyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperTypeList createSuperTypeList() {
		SuperTypeListImpl superTypeList = new SuperTypeListImpl();
		return superTypeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstructedType createConstructedType() {
		ConstructedTypeImpl constructedType = new ConstructedTypeImpl();
		return constructedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstructor createTypeConstructor() {
		TypeConstructorImpl typeConstructor = new TypeConstructorImpl();
		return typeConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstrBracket createTypeConstrBracket() {
		TypeConstrBracketImpl typeConstrBracket = new TypeConstrBracketImpl();
		return typeConstrBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclContext createTypeDeclContext() {
		TypeDeclContextImpl typeDeclContext = new TypeDeclContextImpl();
		return typeDeclContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where createWhere() {
		WhereImpl where = new WhereImpl();
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WrappedInfix createWrappedInfix() {
		WrappedInfixImpl wrappedInfix = new WrappedInfixImpl();
		return wrappedInfix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype createDatatype() {
		DatatypeImpl datatype = new DatatypeImpl();
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeConstructor createDatatypeConstructor() {
		DatatypeConstructorImpl datatypeConstructor = new DatatypeConstructorImpl();
		return datatypeConstructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extend createExtend() {
		ExtendImpl extend = new ExtendImpl();
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDecl createFunctionDecl() {
		FunctionDeclImpl functionDecl = new FunctionDeclImpl();
		return functionDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchStatement createMatchStatement() {
		MatchStatementImpl matchStatement = new MatchStatementImpl();
		return matchStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchCase createMatchCase() {
		MatchCaseImpl matchCase = new MatchCaseImpl();
		return matchCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoremBody createTheoremBody() {
		TheoremBodyImpl theoremBody = new TheoremBodyImpl();
		return theoremBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheoremDecl createTheoremDecl() {
		TheoremDeclImpl theoremDecl = new TheoremDeclImpl();
		return theoremDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariableList createTypedVariableList() {
		TypedVariableListImpl typedVariableList = new TypedVariableListImpl();
		return typedVariableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTyping createVariableTyping() {
		VariableTypingImpl variableTyping = new VariableTypingImpl();
		return variableTyping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedVariable createTypedVariable() {
		TypedVariableImpl typedVariable = new TypedVariableImpl();
		return typedVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantLambda createQuantLambda() {
		QuantLambdaImpl quantLambda = new QuantLambdaImpl();
		return quantLambda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencingFunc createReferencingFunc() {
		ReferencingFuncImpl referencingFunc = new ReferencingFuncImpl();
		return referencingFunc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Expression createExpression() {
		/* I don't believe that an Expression can ever be directly referenced/created, a 
		 * concrete subtype should be used instead.
		 */
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassVarDecl createClassVarDecl() {
		ClassVarDeclImpl classVarDecl = new ClassVarDeclImpl();
		return classVarDecl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prefix createPrefix() {
		PrefixImpl prefix = new PrefixImpl();
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bracket createBracket() {
		BracketImpl bracket = new BracketImpl();
		return bracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infix createInfix() {
		InfixImpl infix = new InfixImpl();
		return infix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedObject createNamedObject() {
		NamedObjectImpl namedObject = new NamedObjectImpl();
		return namedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePowerSet createTypePowerSet() {
		TypePowerSetImpl typePowerSet = new TypePowerSetImpl();
		return typePowerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalImport createGlobalImport() {
		GlobalImportImpl globalImport = new GlobalImportImpl();
		return globalImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InbuiltInfix createInbuiltInfix() {
		InbuiltInfixImpl inbuiltInfix = new InbuiltInfixImpl();
		return inbuiltInfix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileImport createFileImport() {
		FileImportImpl fileImport = new FileImportImpl();
		return fileImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalImport createLocalImport() {
		LocalImportImpl localImport = new LocalImportImpl();
		return localImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSClass createBSClass() {
		BSClassImpl bsClass = new BSClassImpl();
		return bsClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstName createInstName() {
		InstNameImpl instName = new InstNameImpl();
		return instName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSharpPackage getBSharpPackage() {
		return (BSharpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BSharpPackage getPackage() {
		return BSharpPackage.eINSTANCE;
	}

} //BSharpFactoryImpl
