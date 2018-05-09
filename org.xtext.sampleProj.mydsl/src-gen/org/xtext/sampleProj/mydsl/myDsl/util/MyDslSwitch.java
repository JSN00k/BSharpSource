/**
 * generated by Xtext 2.13.0
 */
package org.xtext.sampleProj.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.sampleProj.mydsl.myDsl.*;

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
 * @see org.xtext.sampleProj.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
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
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.DOMAIN_MODEL:
      {
        DomainModel domainModel = (DomainModel)theEObject;
        T result = caseDomainModel(domainModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TOP_LEVEL:
      {
        TopLevel topLevel = (TopLevel)theEObject;
        T result = caseTopLevel(topLevel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMPORT_STATEMENT:
      {
        ImportStatement importStatement = (ImportStatement)theEObject;
        T result = caseImportStatement(importStatement);
        if (result == null) result = caseTopLevel(importStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMPORT_COMPONENT:
      {
        ImportComponent importComponent = (ImportComponent)theEObject;
        T result = caseImportComponent(importComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLASS_DECL:
      {
        ClassDecl classDecl = (ClassDecl)theEObject;
        T result = caseClassDecl(classDecl);
        if (result == null) result = caseTopLevel(classDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BPP_CLASS:
      {
        BppClass bppClass = (BppClass)theEObject;
        T result = caseBppClass(bppClass);
        if (result == null) result = caseClassDecl(bppClass);
        if (result == null) result = caseTopLevel(bppClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_NAME:
      {
        TypeName typeName = (TypeName)theEObject;
        T result = caseTypeName(typeName);
        if (result == null) result = caseName(typeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POLYMORPHIC_TYPE_NAME:
      {
        PolymorphicTypeName polymorphicTypeName = (PolymorphicTypeName)theEObject;
        T result = casePolymorphicTypeName(polymorphicTypeName);
        if (result == null) result = caseName(polymorphicTypeName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POLY_CONTEXT:
      {
        PolyContext polyContext = (PolyContext)theEObject;
        T result = casePolyContext(polyContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POLY_CONTEXT_TYPES:
      {
        PolyContextTypes polyContextTypes = (PolyContextTypes)theEObject;
        T result = casePolyContextTypes(polyContextTypes);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POLY_TYPE_CONSTRAINTS:
      {
        PolyTypeConstraints polyTypeConstraints = (PolyTypeConstraints)theEObject;
        T result = casePolyTypeConstraints(polyTypeConstraints);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SUPER_TYPE_LIST:
      {
        SuperTypeList superTypeList = (SuperTypeList)theEObject;
        T result = caseSuperTypeList(superTypeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONSTRUCTED_TYPE:
      {
        ConstructedType constructedType = (ConstructedType)theEObject;
        T result = caseConstructedType(constructedType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_CONSTRUCTOR:
      {
        TypeConstructor typeConstructor = (TypeConstructor)theEObject;
        T result = caseTypeConstructor(typeConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_DECL_CONTEXT:
      {
        TypeDeclContext typeDeclContext = (TypeDeclContext)theEObject;
        T result = caseTypeDeclContext(typeDeclContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_STRUCTURE:
      {
        TypeStructure typeStructure = (TypeStructure)theEObject;
        T result = caseTypeStructure(typeStructure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.WHERE:
      {
        Where where = (Where)theEObject;
        T result = caseWhere(where);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DATATYPE:
      {
        Datatype datatype = (Datatype)theEObject;
        T result = caseDatatype(datatype);
        if (result == null) result = caseClassDecl(datatype);
        if (result == null) result = caseTopLevel(datatype);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DATATYPE_CONSTRUCTOR:
      {
        DatatypeConstructor datatypeConstructor = (DatatypeConstructor)theEObject;
        T result = caseDatatypeConstructor(datatypeConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BASE_CONSTRUCTOR:
      {
        BaseConstructor baseConstructor = (BaseConstructor)theEObject;
        T result = caseBaseConstructor(baseConstructor);
        if (result == null) result = caseDatatypeConstructor(baseConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DTYPE_CONSTRUCTOR:
      {
        DTypeConstructor dTypeConstructor = (DTypeConstructor)theEObject;
        T result = caseDTypeConstructor(dTypeConstructor);
        if (result == null) result = caseDatatypeConstructor(dTypeConstructor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXTEND:
      {
        Extend extend = (Extend)theEObject;
        T result = caseExtend(extend);
        if (result == null) result = caseClassDecl(extend);
        if (result == null) result = caseTopLevel(extend);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_BODY_ELEMENTS:
      {
        TypeBodyElements typeBodyElements = (TypeBodyElements)theEObject;
        T result = caseTypeBodyElements(typeBodyElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FUNCTION_DECL:
      {
        FunctionDecl functionDecl = (FunctionDecl)theEObject;
        T result = caseFunctionDecl(functionDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FUNCTION_NAME:
      {
        FunctionName functionName = (FunctionName)theEObject;
        T result = caseFunctionName(functionName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FUNCTION_BODY:
      {
        FunctionBody functionBody = (FunctionBody)theEObject;
        T result = caseFunctionBody(functionBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FUNC_DIRECT_DEF:
      {
        FuncDirectDef funcDirectDef = (FuncDirectDef)theEObject;
        T result = caseFuncDirectDef(funcDirectDef);
        if (result == null) result = caseFunctionBody(funcDirectDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FUNC_INDUCTIVE:
      {
        FuncInductive funcInductive = (FuncInductive)theEObject;
        T result = caseFuncInductive(funcInductive);
        if (result == null) result = caseFunctionBody(funcInductive);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FUNC_INDUCTIVE_CASE:
      {
        FuncInductiveCase funcInductiveCase = (FuncInductiveCase)theEObject;
        T result = caseFuncInductiveCase(funcInductiveCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.THEOREM_BODY:
      {
        TheoremBody theoremBody = (TheoremBody)theEObject;
        T result = caseTheoremBody(theoremBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.THEOREM_DECL:
      {
        TheoremDecl theoremDecl = (TheoremDecl)theEObject;
        T result = caseTheoremDecl(theoremDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPED_VARIABLE_LIST:
      {
        TypedVariableList typedVariableList = (TypedVariableList)theEObject;
        T result = caseTypedVariableList(typedVariableList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPED_VARIABLE:
      {
        TypedVariable typedVariable = (TypedVariable)theEObject;
        T result = caseTypedVariable(typedVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_DECLARATION:
      {
        TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
        T result = caseTypeDeclaration(typeDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BUILT_IN:
      {
        BuiltIn builtIn = (BuiltIn)theEObject;
        T result = caseBuiltIn(builtIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LAMBDA:
      {
        Lambda lambda = (Lambda)theEObject;
        T result = caseLambda(lambda);
        if (result == null) result = caseBuiltIn(lambda);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.QUANTIFIER:
      {
        Quantifier quantifier = (Quantifier)theEObject;
        T result = caseQuantifier(quantifier);
        if (result == null) result = caseBuiltIn(quantifier);
        if (result == null) result = caseExpression(quantifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PREFIX:
      {
        Prefix prefix = (Prefix)theEObject;
        T result = casePrefix(prefix);
        if (result == null) result = caseExpression(prefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INFIX:
      {
        Infix infix = (Infix)theEObject;
        T result = caseInfix(infix);
        if (result == null) result = caseExpression(infix);
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
  public T caseDomainModel(DomainModel object)
  {
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
  public T caseTopLevel(TopLevel object)
  {
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
  public T caseImportStatement(ImportStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportComponent(ImportComponent object)
  {
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
  public T caseClassDecl(ClassDecl object)
  {
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
  public T caseBppClass(BppClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeName(TypeName object)
  {
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
  public T casePolymorphicTypeName(PolymorphicTypeName object)
  {
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
  public T casePolyContext(PolyContext object)
  {
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
  public T casePolyContextTypes(PolyContextTypes object)
  {
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
  public T casePolyTypeConstraints(PolyTypeConstraints object)
  {
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
  public T caseSuperTypeList(SuperTypeList object)
  {
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
  public T caseConstructedType(ConstructedType object)
  {
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
  public T caseTypeConstructor(TypeConstructor object)
  {
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
  public T caseTypeDeclContext(TypeDeclContext object)
  {
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
  public T caseTypeStructure(TypeStructure object)
  {
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
  public T caseWhere(Where object)
  {
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
  public T caseDatatype(Datatype object)
  {
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
  public T caseDatatypeConstructor(DatatypeConstructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseConstructor(BaseConstructor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DType Constructor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DType Constructor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDTypeConstructor(DTypeConstructor object)
  {
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
  public T caseExtend(Extend object)
  {
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
  public T caseTypeBodyElements(TypeBodyElements object)
  {
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
  public T caseFunctionDecl(FunctionDecl object)
  {
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
  public T caseFunctionName(FunctionName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionBody(FunctionBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Direct Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Direct Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncDirectDef(FuncDirectDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Inductive</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Inductive</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncInductive(FuncInductive object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Func Inductive Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Func Inductive Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFuncInductiveCase(FuncInductiveCase object)
  {
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
  public T caseTheoremBody(TheoremBody object)
  {
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
  public T caseTheoremDecl(TheoremDecl object)
  {
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
  public T caseTypedVariableList(TypedVariableList object)
  {
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
  public T caseTypedVariable(TypedVariable object)
  {
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
  public T caseTypeDeclaration(TypeDeclaration object)
  {
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
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltIn(BuiltIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lambda</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lambda</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLambda(Lambda object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Quantifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Quantifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuantifier(Quantifier object)
  {
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
  public T casePrefix(Prefix object)
  {
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
  public T caseInfix(Infix object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
