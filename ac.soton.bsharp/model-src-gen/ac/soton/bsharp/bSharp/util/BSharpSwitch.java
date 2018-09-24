/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.util;

import ac.soton.bsharp.bSharp.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ac.soton.bsharp.bSharp.BSharpPackage
 * @generated
 */
public class BSharpSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BSharpPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSharpSwitch() {
		if (modelPackage == null) {
			modelPackage = BSharpPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BSharpPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TOP_LEVEL: {
				TopLevel topLevel = (TopLevel)theEObject;
				T result = caseTopLevel(topLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.IMPORT_STATEMENT: {
				ImportStatement importStatement = (ImportStatement)theEObject;
				T result = caseImportStatement(importStatement);
				if (result == null) result = caseTopLevel(importStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.CLASS_DECL: {
				ClassDecl classDecl = (ClassDecl)theEObject;
				T result = caseClassDecl(classDecl);
				if (result == null) result = caseTopLevel(classDecl);
				if (result == null) result = caseGenName(classDecl);
				if (result == null) result = caseExpressionVariable(classDecl);
				if (result == null) result = caseIVariableProvider(classDecl);
				if (result == null) result = caseIPolyTypeProvider(classDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.BPP_CLASS: {
				BppClass bppClass = (BppClass)theEObject;
				T result = caseBppClass(bppClass);
				if (result == null) result = caseClassDecl(bppClass);
				if (result == null) result = caseTopLevel(bppClass);
				if (result == null) result = caseGenName(bppClass);
				if (result == null) result = caseExpressionVariable(bppClass);
				if (result == null) result = caseIVariableProvider(bppClass);
				if (result == null) result = caseIPolyTypeProvider(bppClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.GEN_NAME: {
				GenName genName = (GenName)theEObject;
				T result = caseGenName(genName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.POLYMORPHIC_TYPE_NAME: {
				PolymorphicTypeName polymorphicTypeName = (PolymorphicTypeName)theEObject;
				T result = casePolymorphicTypeName(polymorphicTypeName);
				if (result == null) result = caseGenName(polymorphicTypeName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.POLY_CONTEXT: {
				PolyContext polyContext = (PolyContext)theEObject;
				T result = casePolyContext(polyContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.POLY_CONTEXT_TYPES: {
				PolyContextTypes polyContextTypes = (PolyContextTypes)theEObject;
				T result = casePolyContextTypes(polyContextTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.POLY_TYPE_CONSTRAINTS: {
				PolyTypeConstraints polyTypeConstraints = (PolyTypeConstraints)theEObject;
				T result = casePolyTypeConstraints(polyTypeConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.SUPER_TYPE_LIST: {
				SuperTypeList superTypeList = (SuperTypeList)theEObject;
				T result = caseSuperTypeList(superTypeList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.CONSTRUCTED_TYPE: {
				ConstructedType constructedType = (ConstructedType)theEObject;
				T result = caseConstructedType(constructedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TYPE_CONSTRUCTOR: {
				TypeConstructor typeConstructor = (TypeConstructor)theEObject;
				T result = caseTypeConstructor(typeConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TYPE_DECL_CONTEXT: {
				TypeDeclContext typeDeclContext = (TypeDeclContext)theEObject;
				T result = caseTypeDeclContext(typeDeclContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TYPE_STRUCTURE: {
				TypeStructure typeStructure = (TypeStructure)theEObject;
				T result = caseTypeStructure(typeStructure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.WHERE: {
				Where where = (Where)theEObject;
				T result = caseWhere(where);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.DATATYPE: {
				Datatype datatype = (Datatype)theEObject;
				T result = caseDatatype(datatype);
				if (result == null) result = caseClassDecl(datatype);
				if (result == null) result = caseTopLevel(datatype);
				if (result == null) result = caseGenName(datatype);
				if (result == null) result = caseExpressionVariable(datatype);
				if (result == null) result = caseIVariableProvider(datatype);
				if (result == null) result = caseIPolyTypeProvider(datatype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.DATATYPE_CONSTRUCTOR: {
				DatatypeConstructor datatypeConstructor = (DatatypeConstructor)theEObject;
				T result = caseDatatypeConstructor(datatypeConstructor);
				if (result == null) result = caseIVariableProvider(datatypeConstructor);
				if (result == null) result = caseTypedVariable(datatypeConstructor);
				if (result == null) result = caseExpressionVariable(datatypeConstructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.EXTEND: {
				Extend extend = (Extend)theEObject;
				T result = caseExtend(extend);
				if (result == null) result = caseTopLevel(extend);
				if (result == null) result = caseIVariableProvider(extend);
				if (result == null) result = caseIPolyTypeProvider(extend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TYPE_BODY_ELEMENTS: {
				TypeBodyElements typeBodyElements = (TypeBodyElements)theEObject;
				T result = caseTypeBodyElements(typeBodyElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.FUNCTION_DECL: {
				FunctionDecl functionDecl = (FunctionDecl)theEObject;
				T result = caseFunctionDecl(functionDecl);
				if (result == null) result = caseIVariableProvider(functionDecl);
				if (result == null) result = caseIPolyTypeProvider(functionDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.FUNCTION_NAME: {
				FunctionName functionName = (FunctionName)theEObject;
				T result = caseFunctionName(functionName);
				if (result == null) result = caseExpressionVariable(functionName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.MATCH_STATEMENT: {
				MatchStatement matchStatement = (MatchStatement)theEObject;
				T result = caseMatchStatement(matchStatement);
				if (result == null) result = caseExpression(matchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.MATCH_CASE: {
				MatchCase matchCase = (MatchCase)theEObject;
				T result = caseMatchCase(matchCase);
				if (result == null) result = caseIVariableProvider(matchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.THEOREM_BODY: {
				TheoremBody theoremBody = (TheoremBody)theEObject;
				T result = caseTheoremBody(theoremBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.THEOREM_DECL: {
				TheoremDecl theoremDecl = (TheoremDecl)theEObject;
				T result = caseTheoremDecl(theoremDecl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TYPED_VARIABLE_LIST: {
				TypedVariableList typedVariableList = (TypedVariableList)theEObject;
				T result = caseTypedVariableList(typedVariableList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.VARIABLE_TYPING: {
				VariableTyping variableTyping = (VariableTyping)theEObject;
				T result = caseVariableTyping(variableTyping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TYPED_VARIABLE: {
				TypedVariable typedVariable = (TypedVariable)theEObject;
				T result = caseTypedVariable(typedVariable);
				if (result == null) result = caseExpressionVariable(typedVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TYPE_DECLARATION: {
				TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
				T result = caseTypeDeclaration(typeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.QUANT_LAMBDA: {
				QuantLambda quantLambda = (QuantLambda)theEObject;
				T result = caseQuantLambda(quantLambda);
				if (result == null) result = caseExpression(quantLambda);
				if (result == null) result = caseIVariableProvider(quantLambda);
				if (result == null) result = caseIPolyTypeProvider(quantLambda);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.FUNCTION_CALL: {
				FunctionCall functionCall = (FunctionCall)theEObject;
				T result = caseFunctionCall(functionCall);
				if (result == null) result = caseExpression(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.PREFIX: {
				Prefix prefix = (Prefix)theEObject;
				T result = casePrefix(prefix);
				if (result == null) result = caseExpression(prefix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.BRACKET: {
				Bracket bracket = (Bracket)theEObject;
				T result = caseBracket(bracket);
				if (result == null) result = caseExpression(bracket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.EXPRESSION_VARIABLE: {
				ExpressionVariable expressionVariable = (ExpressionVariable)theEObject;
				T result = caseExpressionVariable(expressionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.TYPE_INSTANCE: {
				TypeInstance typeInstance = (TypeInstance)theEObject;
				T result = caseTypeInstance(typeInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.INBUILT_TYPE_SCAN: {
				InbuiltTypeScan inbuiltTypeScan = (InbuiltTypeScan)theEObject;
				T result = caseInbuiltTypeScan(inbuiltTypeScan);
				if (result == null) result = caseTypeConstructor(inbuiltTypeScan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseTopLevel(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.INFIX: {
				Infix infix = (Infix)theEObject;
				T result = caseInfix(infix);
				if (result == null) result = caseExpression(infix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.IVARIABLE_PROVIDER: {
				IVariableProvider iVariableProvider = (IVariableProvider)theEObject;
				T result = caseIVariableProvider(iVariableProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BSharpPackage.IPOLY_TYPE_PROVIDER: {
				IPolyTypeProvider iPolyTypeProvider = (IPolyTypeProvider)theEObject;
				T result = caseIPolyTypeProvider(iPolyTypeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevel(TopLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportStatement(ImportStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDecl(ClassDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bpp Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bpp Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBppClass(BppClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gen Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gen Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenName(GenName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polymorphic Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polymorphic Type Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolymorphicTypeName(PolymorphicTypeName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poly Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poly Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyContext(PolyContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poly Context Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poly Context Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyContextTypes(PolyContextTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poly Type Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poly Type Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyTypeConstraints(PolyTypeConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Type List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Type List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperTypeList(SuperTypeList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructedType(ConstructedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConstructor(TypeConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Decl Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Decl Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclContext(TypeDeclContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Structure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Structure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeStructure(TypeStructure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhere(Where object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatype(Datatype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeConstructor(DatatypeConstructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtend(Extend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Body Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Body Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeBodyElements(TypeBodyElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDecl(FunctionDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionName(FunctionName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchStatement(MatchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchCase(MatchCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Theorem Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Theorem Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheoremBody(TheoremBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Theorem Decl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Theorem Decl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheoremDecl(TheoremDecl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Variable List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedVariableList(TypedVariableList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Typing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Typing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableTyping(VariableTyping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedVariable(TypedVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quant Lambda</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quant Lambda</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantLambda(QuantLambda object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefix(Prefix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bracket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBracket(Bracket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionVariable(ExpressionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeInstance(TypeInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inbuilt Type Scan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbuilt Type Scan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInbuiltTypeScan(InbuiltTypeScan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfix(Infix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IVariable Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IVariable Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIVariableProvider(IVariableProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IPoly Type Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IPoly Type Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPolyTypeProvider(IPolyTypeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BSharpSwitch
