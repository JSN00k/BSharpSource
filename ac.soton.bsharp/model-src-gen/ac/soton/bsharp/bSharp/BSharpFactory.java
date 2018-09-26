/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ac.soton.bsharp.bSharp.BSharpPackage
 * @generated
 */
public interface BSharpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BSharpFactory eINSTANCE = ac.soton.bsharp.bSharp.impl.BSharpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Top Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Level</em>'.
	 * @generated
	 */
	TopLevel createTopLevel();

	/**
	 * Returns a new object of class '<em>Import Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Statement</em>'.
	 * @generated
	 */
	ImportStatement createImportStatement();

	/**
	 * Returns a new object of class '<em>Bpp Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bpp Class</em>'.
	 * @generated
	 */
	BppClass createBppClass();

	/**
	 * Returns a new object of class '<em>Gen Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Name</em>'.
	 * @generated
	 */
	GenName createGenName();

	/**
	 * Returns a new object of class '<em>Polymorphic Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polymorphic Type Name</em>'.
	 * @generated
	 */
	PolymorphicTypeName createPolymorphicTypeName();

	/**
	 * Returns a new object of class '<em>Poly Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poly Context</em>'.
	 * @generated
	 */
	PolyContext createPolyContext();

	/**
	 * Returns a new object of class '<em>Poly Context Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poly Context Types</em>'.
	 * @generated
	 */
	PolyContextTypes createPolyContextTypes();

	/**
	 * Returns a new object of class '<em>Poly Type Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poly Type Constraints</em>'.
	 * @generated
	 */
	PolyTypeConstraints createPolyTypeConstraints();

	/**
	 * Returns a new object of class '<em>Super Type List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Type List</em>'.
	 * @generated
	 */
	SuperTypeList createSuperTypeList();

	/**
	 * Returns a new object of class '<em>Constructed Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constructed Type</em>'.
	 * @generated
	 */
	ConstructedType createConstructedType();

	/**
	 * Returns a new object of class '<em>Type Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Constructor</em>'.
	 * @generated
	 */
	TypeConstructor createTypeConstructor();

	/**
	 * Returns a new object of class '<em>Type Decl Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Decl Context</em>'.
	 * @generated
	 */
	TypeDeclContext createTypeDeclContext();

	/**
	 * Returns a new object of class '<em>Type Structure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Structure</em>'.
	 * @generated
	 */
	TypeStructure createTypeStructure();

	/**
	 * Returns a new object of class '<em>Where</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Where</em>'.
	 * @generated
	 */
	Where createWhere();

	/**
	 * Returns a new object of class '<em>Datatype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype</em>'.
	 * @generated
	 */
	Datatype createDatatype();

	/**
	 * Returns a new object of class '<em>Datatype Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Constructor</em>'.
	 * @generated
	 */
	DatatypeConstructor createDatatypeConstructor();

	/**
	 * Returns a new object of class '<em>Extend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extend</em>'.
	 * @generated
	 */
	Extend createExtend();

	/**
	 * Returns a new object of class '<em>Type Body Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Body Elements</em>'.
	 * @generated
	 */
	TypeBodyElements createTypeBodyElements();

	/**
	 * Returns a new object of class '<em>Function Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Decl</em>'.
	 * @generated
	 */
	FunctionDecl createFunctionDecl();

	/**
	 * Returns a new object of class '<em>Function Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Name</em>'.
	 * @generated
	 */
	FunctionName createFunctionName();

	/**
	 * Returns a new object of class '<em>Match Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Statement</em>'.
	 * @generated
	 */
	MatchStatement createMatchStatement();

	/**
	 * Returns a new object of class '<em>Match Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match Case</em>'.
	 * @generated
	 */
	MatchCase createMatchCase();

	/**
	 * Returns a new object of class '<em>Theorem Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theorem Body</em>'.
	 * @generated
	 */
	TheoremBody createTheoremBody();

	/**
	 * Returns a new object of class '<em>Theorem Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theorem Decl</em>'.
	 * @generated
	 */
	TheoremDecl createTheoremDecl();

	/**
	 * Returns a new object of class '<em>Typed Variable List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Variable List</em>'.
	 * @generated
	 */
	TypedVariableList createTypedVariableList();

	/**
	 * Returns a new object of class '<em>Variable Typing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Typing</em>'.
	 * @generated
	 */
	VariableTyping createVariableTyping();

	/**
	 * Returns a new object of class '<em>Typed Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Variable</em>'.
	 * @generated
	 */
	TypedVariable createTypedVariable();

	/**
	 * Returns a new object of class '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Declaration</em>'.
	 * @generated
	 */
	TypeDeclaration createTypeDeclaration();

	/**
	 * Returns a new object of class '<em>Quant Lambda</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quant Lambda</em>'.
	 * @generated
	 */
	QuantLambda createQuantLambda();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>Prefix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prefix</em>'.
	 * @generated
	 */
	Prefix createPrefix();

	/**
	 * Returns a new object of class '<em>Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bracket</em>'.
	 * @generated
	 */
	Bracket createBracket();

	/**
	 * Returns a new object of class '<em>Expression Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Variable</em>'.
	 * @generated
	 */
	ExpressionVariable createExpressionVariable();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Infix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infix</em>'.
	 * @generated
	 */
	Infix createInfix();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Inbuilt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inbuilt Type</em>'.
	 * @generated
	 */
	InbuiltType createInbuiltType();

	/**
	 * Returns a new object of class '<em>Named Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Object</em>'.
	 * @generated
	 */
	NamedObject createNamedObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BSharpPackage getBSharpPackage();

} //BSharpFactory
