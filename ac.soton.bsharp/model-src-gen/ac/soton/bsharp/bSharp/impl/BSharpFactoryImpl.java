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
			case BSharpPackage.DOMAIN_MODEL: return createDomainModel();
			case BSharpPackage.TOP_LEVEL: return createTopLevel();
			case BSharpPackage.IMPORT_STATEMENT: return createImportStatement();
			case BSharpPackage.BPP_CLASS: return createBppClass();
			case BSharpPackage.GEN_NAME: return createGenName();
			case BSharpPackage.POLYMORPHIC_TYPE_NAME: return createPolymorphicTypeName();
			case BSharpPackage.POLY_CONTEXT: return createPolyContext();
			case BSharpPackage.POLY_CONTEXT_TYPES: return createPolyContextTypes();
			case BSharpPackage.POLY_TYPE_CONSTRAINTS: return createPolyTypeConstraints();
			case BSharpPackage.SUPER_TYPE_LIST: return createSuperTypeList();
			case BSharpPackage.CONSTRUCTED_TYPE: return createConstructedType();
			case BSharpPackage.TYPE_CONSTRUCTOR: return createTypeConstructor();
			case BSharpPackage.TYPE_DECL_CONTEXT: return createTypeDeclContext();
			case BSharpPackage.TYPE_STRUCTURE: return createTypeStructure();
			case BSharpPackage.WHERE: return createWhere();
			case BSharpPackage.DATATYPE: return createDatatype();
			case BSharpPackage.DATATYPE_CONSTRUCTOR: return createDatatypeConstructor();
			case BSharpPackage.EXTEND: return createExtend();
			case BSharpPackage.TYPE_BODY_ELEMENTS: return createTypeBodyElements();
			case BSharpPackage.FUNCTION_DECL: return createFunctionDecl();
			case BSharpPackage.FUNCTION_NAME: return createFunctionName();
			case BSharpPackage.MATCH_STATEMENT: return createMatchStatement();
			case BSharpPackage.MATCH_CASE: return createMatchCase();
			case BSharpPackage.THEOREM_BODY: return createTheoremBody();
			case BSharpPackage.THEOREM_DECL: return createTheoremDecl();
			case BSharpPackage.TYPED_VARIABLE_LIST: return createTypedVariableList();
			case BSharpPackage.VARIABLE_TYPING: return createVariableTyping();
			case BSharpPackage.TYPED_VARIABLE: return createTypedVariable();
			case BSharpPackage.TYPE_DECLARATION: return createTypeDeclaration();
			case BSharpPackage.QUANT_LAMBDA: return createQuantLambda();
			case BSharpPackage.EXPRESSION: return createExpression();
			case BSharpPackage.FUNCTION_CALL: return createFunctionCall();
			case BSharpPackage.PREFIX: return createPrefix();
			case BSharpPackage.BRACKET: return createBracket();
			case BSharpPackage.EXPRESSION_VARIABLE: return createExpressionVariable();
			case BSharpPackage.INSTANCE: return createInstance();
			case BSharpPackage.INFIX: return createInfix();
			case BSharpPackage.TYPE: return createType();
			case BSharpPackage.NAMED_OBJECT: return createNamedObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
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
	public ImportStatement createImportStatement() {
		ImportStatementImpl importStatement = new ImportStatementImpl();
		return importStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BppClass createBppClass() {
		BppClassImpl bppClass = new BppClassImpl();
		return bppClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenName createGenName() {
		GenNameImpl genName = new GenNameImpl();
		return genName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolymorphicTypeName createPolymorphicTypeName() {
		PolymorphicTypeNameImpl polymorphicTypeName = new PolymorphicTypeNameImpl();
		return polymorphicTypeName;
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
	public PolyContextTypes createPolyContextTypes() {
		PolyContextTypesImpl polyContextTypes = new PolyContextTypesImpl();
		return polyContextTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyTypeConstraints createPolyTypeConstraints() {
		PolyTypeConstraintsImpl polyTypeConstraints = new PolyTypeConstraintsImpl();
		return polyTypeConstraints;
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
	public TypeDeclContext createTypeDeclContext() {
		TypeDeclContextImpl typeDeclContext = new TypeDeclContextImpl();
		return typeDeclContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeStructure createTypeStructure() {
		TypeStructureImpl typeStructure = new TypeStructureImpl();
		return typeStructure;
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
	public TypeBodyElements createTypeBodyElements() {
		TypeBodyElementsImpl typeBodyElements = new TypeBodyElementsImpl();
		return typeBodyElements;
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
	public FunctionName createFunctionName() {
		FunctionNameImpl functionName = new FunctionNameImpl();
		return functionName;
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
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
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
	 */
	public Expression createExpression() {
		assert false : "I don't think I should ever return a raw expression";
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
	public ExpressionVariable createExpressionVariable() {
		ExpressionVariableImpl expressionVariable = new ExpressionVariableImpl();
		return expressionVariable;
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
