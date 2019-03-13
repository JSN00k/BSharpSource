/*
 * generated by Xtext 2.12.0
 */
package ac.soton.bsharp.validation

import ac.soton.bsharp.bSharp.Infix
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class BSharpValidator extends AbstractBSharpValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MyDslPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	public static val UNEXPECTED_POLY_CONTEXT = "unexpectedPolyContext"
	public static val POLYMORPHIC_TYPE_OUT_OF_SCOPE = "PolymorphicTypeOutOfScope"
	
	// Check that we should be able to have a type declaration at this point
	@Check
	def checkExpressionTree(Infix expression) {
		var copy = EcoreUtil2.copy(expression)
		copy = copy.reorderExpresionTree() as Infix
		
		var copy2 = EcoreUtil2.copy(expression)
		//print("\n\n")
		//print(copy2.constructLatexExpressionTree(""))
		//print("\n\n\n")
		
		/* The tree structure now represents the equation and the order of operations
		 * so we can do validation on it.
		 */
		
		//print(copy)
	}

	
}