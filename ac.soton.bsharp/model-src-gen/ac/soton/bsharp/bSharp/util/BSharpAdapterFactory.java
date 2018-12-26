/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.util;

import ac.soton.bsharp.bSharp.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.bsharp.bSharp.BSharpPackage
 * @generated
 */
public class BSharpAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BSharpPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSharpAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BSharpPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSharpSwitch<Adapter> modelSwitch =
		new BSharpSwitch<Adapter>() {
			@Override
			public Adapter caseIEventBPrefixProvider(IEventBPrefixProvider object) {
				return createIEventBPrefixProviderAdapter();
			}
			@Override
			public Adapter caseIVariableProvider(IVariableProvider object) {
				return createIVariableProviderAdapter();
			}
			@Override
			public Adapter caseIPolyTypeProvider(IPolyTypeProvider object) {
				return createIPolyTypeProviderAdapter();
			}
			@Override
			public Adapter caseIClassDeclExtend(IClassDeclExtend object) {
				return createIClassDeclExtendAdapter();
			}
			@Override
			public Adapter caseIExpressionContainer(IExpressionContainer object) {
				return createIExpressionContainerAdapter();
			}
			@Override
			public Adapter caseITheoryImportCacheProvider(ITheoryImportCacheProvider object) {
				return createITheoryImportCacheProviderAdapter();
			}
			@Override
			public Adapter caseITheoremContainer(ITheoremContainer object) {
				return createITheoremContainerAdapter();
			}
			@Override
			public Adapter caseIVarType(IVarType object) {
				return createIVarTypeAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTopLevelInstance(TopLevelInstance object) {
				return createTopLevelInstanceAdapter();
			}
			@Override
			public Adapter caseBodyElements(BodyElements object) {
				return createBodyElementsAdapter();
			}
			@Override
			public Adapter caseBracket(Bracket object) {
				return createBracketAdapter();
			}
			@Override
			public Adapter caseBSClass(BSClass object) {
				return createBSClassAdapter();
			}
			@Override
			public Adapter caseBSharpBlock(BSharpBlock object) {
				return createBSharpBlockAdapter();
			}
			@Override
			public Adapter caseClassDecl(ClassDecl object) {
				return createClassDeclAdapter();
			}
			@Override
			public Adapter caseClassVarDecl(ClassVarDecl object) {
				return createClassVarDeclAdapter();
			}
			@Override
			public Adapter caseConstructedType(ConstructedType object) {
				return createConstructedTypeAdapter();
			}
			@Override
			public Adapter caseDatatype(Datatype object) {
				return createDatatypeAdapter();
			}
			@Override
			public Adapter caseDatatypeConstructor(DatatypeConstructor object) {
				return createDatatypeConstructorAdapter();
			}
			@Override
			public Adapter caseExtend(Extend object) {
				return createExtendAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseExpressionVariable(ExpressionVariable object) {
				return createExpressionVariableAdapter();
			}
			@Override
			public Adapter caseFileImport(FileImport object) {
				return createFileImportAdapter();
			}
			@Override
			public Adapter caseFunctionCall(FunctionCall object) {
				return createFunctionCallAdapter();
			}
			@Override
			public Adapter caseFunctionDecl(FunctionDecl object) {
				return createFunctionDeclAdapter();
			}
			@Override
			public Adapter caseGenName(GenName object) {
				return createGenNameAdapter();
			}
			@Override
			public Adapter caseGlobalImport(GlobalImport object) {
				return createGlobalImportAdapter();
			}
			@Override
			public Adapter caseInbuiltInfix(InbuiltInfix object) {
				return createInbuiltInfixAdapter();
			}
			@Override
			public Adapter caseInfix(Infix object) {
				return createInfixAdapter();
			}
			@Override
			public Adapter caseInfixFunc(InfixFunc object) {
				return createInfixFuncAdapter();
			}
			@Override
			public Adapter caseInstName(InstName object) {
				return createInstNameAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseLocalImport(LocalImport object) {
				return createLocalImportAdapter();
			}
			@Override
			public Adapter caseMatchCase(MatchCase object) {
				return createMatchCaseAdapter();
			}
			@Override
			public Adapter caseMatchStatement(MatchStatement object) {
				return createMatchStatementAdapter();
			}
			@Override
			public Adapter caseNamedObject(NamedObject object) {
				return createNamedObjectAdapter();
			}
			@Override
			public Adapter casePolyContext(PolyContext object) {
				return createPolyContextAdapter();
			}
			@Override
			public Adapter casePolyType(PolyType object) {
				return createPolyTypeAdapter();
			}
			@Override
			public Adapter casePrefix(Prefix object) {
				return createPrefixAdapter();
			}
			@Override
			public Adapter caseQuantLambda(QuantLambda object) {
				return createQuantLambdaAdapter();
			}
			@Override
			public Adapter caseSuperTypeList(SuperTypeList object) {
				return createSuperTypeListAdapter();
			}
			@Override
			public Adapter caseTheoremBody(TheoremBody object) {
				return createTheoremBodyAdapter();
			}
			@Override
			public Adapter caseTheoremDecl(TheoremDecl object) {
				return createTheoremDeclAdapter();
			}
			@Override
			public Adapter caseTopLevelFile(TopLevelFile object) {
				return createTopLevelFileAdapter();
			}
			@Override
			public Adapter caseTopLevel(TopLevel object) {
				return createTopLevelAdapter();
			}
			@Override
			public Adapter caseTopLevelImport(TopLevelImport object) {
				return createTopLevelImportAdapter();
			}
			@Override
			public Adapter caseTypeBuilder(TypeBuilder object) {
				return createTypeBuilderAdapter();
			}
			@Override
			public Adapter caseTypeConstructor(TypeConstructor object) {
				return createTypeConstructorAdapter();
			}
			@Override
			public Adapter caseTypeConstrBracket(TypeConstrBracket object) {
				return createTypeConstrBracketAdapter();
			}
			@Override
			public Adapter caseTypeDeclContext(TypeDeclContext object) {
				return createTypeDeclContextAdapter();
			}
			@Override
			public Adapter caseTypePowerSet(TypePowerSet object) {
				return createTypePowerSetAdapter();
			}
			@Override
			public Adapter caseTypedVariable(TypedVariable object) {
				return createTypedVariableAdapter();
			}
			@Override
			public Adapter caseTypedVariableList(TypedVariableList object) {
				return createTypedVariableListAdapter();
			}
			@Override
			public Adapter caseVariableTyping(VariableTyping object) {
				return createVariableTypingAdapter();
			}
			@Override
			public Adapter caseWhere(Where object) {
				return createWhereAdapter();
			}
			@Override
			public Adapter caseWrappedInfix(WrappedInfix object) {
				return createWrappedInfixAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.IEventBPrefixProvider <em>IEvent BPrefix Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.IEventBPrefixProvider
	 * @generated
	 */
	public Adapter createIEventBPrefixProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TopLevel <em>Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TopLevel
	 * @generated
	 */
	public Adapter createTopLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TopLevelFile <em>Top Level File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TopLevelFile
	 * @generated
	 */
	public Adapter createTopLevelFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TopLevelImport <em>Top Level Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TopLevelImport
	 * @generated
	 */
	public Adapter createTopLevelImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.ClassDecl <em>Class Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.ClassDecl
	 * @generated
	 */
	public Adapter createClassDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.BSClass <em>BS Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.BSClass
	 * @generated
	 */
	public Adapter createBSClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.InstName <em>Inst Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.InstName
	 * @generated
	 */
	public Adapter createInstNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.BSharpBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.BSharpBlock
	 * @generated
	 */
	public Adapter createBSharpBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.GenName <em>Gen Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.GenName
	 * @generated
	 */
	public Adapter createGenNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.PolyContext <em>Poly Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.PolyContext
	 * @generated
	 */
	public Adapter createPolyContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.PolyType <em>Poly Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.PolyType
	 * @generated
	 */
	public Adapter createPolyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.SuperTypeList <em>Super Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.SuperTypeList
	 * @generated
	 */
	public Adapter createSuperTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.ConstructedType <em>Constructed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.ConstructedType
	 * @generated
	 */
	public Adapter createConstructedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TypeConstructor <em>Type Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TypeConstructor
	 * @generated
	 */
	public Adapter createTypeConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TypeConstrBracket <em>Type Constr Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TypeConstrBracket
	 * @generated
	 */
	public Adapter createTypeConstrBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TypeDeclContext <em>Type Decl Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TypeDeclContext
	 * @generated
	 */
	public Adapter createTypeDeclContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Where <em>Where</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Where
	 * @generated
	 */
	public Adapter createWhereAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.WrappedInfix <em>Wrapped Infix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.WrappedInfix
	 * @generated
	 */
	public Adapter createWrappedInfixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Datatype
	 * @generated
	 */
	public Adapter createDatatypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.DatatypeConstructor <em>Datatype Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.DatatypeConstructor
	 * @generated
	 */
	public Adapter createDatatypeConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Extend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Extend
	 * @generated
	 */
	public Adapter createExtendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.FunctionDecl <em>Function Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.FunctionDecl
	 * @generated
	 */
	public Adapter createFunctionDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.MatchStatement <em>Match Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.MatchStatement
	 * @generated
	 */
	public Adapter createMatchStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.MatchCase <em>Match Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.MatchCase
	 * @generated
	 */
	public Adapter createMatchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TheoremBody <em>Theorem Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TheoremBody
	 * @generated
	 */
	public Adapter createTheoremBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TheoremDecl <em>Theorem Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TheoremDecl
	 * @generated
	 */
	public Adapter createTheoremDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TypedVariableList <em>Typed Variable List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TypedVariableList
	 * @generated
	 */
	public Adapter createTypedVariableListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.VariableTyping <em>Variable Typing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.VariableTyping
	 * @generated
	 */
	public Adapter createVariableTypingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TypedVariable <em>Typed Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TypedVariable
	 * @generated
	 */
	public Adapter createTypedVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.QuantLambda <em>Quant Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.QuantLambda
	 * @generated
	 */
	public Adapter createQuantLambdaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.ClassVarDecl <em>Class Var Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.ClassVarDecl
	 * @generated
	 */
	public Adapter createClassVarDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Prefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Prefix
	 * @generated
	 */
	public Adapter createPrefixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Bracket <em>Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Bracket
	 * @generated
	 */
	public Adapter createBracketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.ExpressionVariable <em>Expression Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.ExpressionVariable
	 * @generated
	 */
	public Adapter createExpressionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Infix <em>Infix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Infix
	 * @generated
	 */
	public Adapter createInfixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.InfixFunc <em>Infix Func</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.InfixFunc
	 * @generated
	 */
	public Adapter createInfixFuncAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.IVariableProvider <em>IVariable Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.IVariableProvider
	 * @generated
	 */
	public Adapter createIVariableProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.IPolyTypeProvider <em>IPoly Type Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.IPolyTypeProvider
	 * @generated
	 */
	public Adapter createIPolyTypeProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.IClassDeclExtend <em>IClass Decl Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.IClassDeclExtend
	 * @generated
	 */
	public Adapter createIClassDeclExtendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.IExpressionContainer <em>IExpression Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.IExpressionContainer
	 * @generated
	 */
	public Adapter createIExpressionContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.ITheoryImportCacheProvider <em>ITheory Import Cache Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.ITheoryImportCacheProvider
	 * @generated
	 */
	public Adapter createITheoryImportCacheProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.ITheoremContainer <em>ITheorem Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.ITheoremContainer
	 * @generated
	 */
	public Adapter createITheoremContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.IVarType <em>IVar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.IVarType
	 * @generated
	 */
	public Adapter createIVarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TopLevelInstance <em>Top Level Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TopLevelInstance
	 * @generated
	 */
	public Adapter createTopLevelInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.NamedObject <em>Named Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.NamedObject
	 * @generated
	 */
	public Adapter createNamedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TypeBuilder <em>Type Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TypeBuilder
	 * @generated
	 */
	public Adapter createTypeBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.TypePowerSet <em>Type Power Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.TypePowerSet
	 * @generated
	 */
	public Adapter createTypePowerSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.GlobalImport <em>Global Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.GlobalImport
	 * @generated
	 */
	public Adapter createGlobalImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.InbuiltInfix <em>Inbuilt Infix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.InbuiltInfix
	 * @generated
	 */
	public Adapter createInbuiltInfixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.FileImport <em>File Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.FileImport
	 * @generated
	 */
	public Adapter createFileImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.LocalImport <em>Local Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.LocalImport
	 * @generated
	 */
	public Adapter createLocalImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ac.soton.bsharp.bSharp.BodyElements <em>Body Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ac.soton.bsharp.bSharp.BodyElements
	 * @generated
	 */
	public Adapter createBodyElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BSharpAdapterFactory
