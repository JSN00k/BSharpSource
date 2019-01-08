package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.util.Tuple2;

/* When creating ClassDecl, Theorems, or functions, the type (or supertypes) in which each of these is 
 * declared can be implicitly referenced. When they are implicitly referenced an instance of the type
 * is created in EventB. This interface manages information about the created instance.
 */
public interface ITypeInstance {
	ClassDecl bSharpType();
	
	/* Returns a list of the polymophic types used to construct the instance. This only 
	 * includes the polymophic context, it does not include the constructed type.*/
	ArrayList<String> typeConstructionTypes();
	
	/* Returns a statement with enough information to type the type and variable names
	 * It is not the case that each variable will be typed separately e.g., 
	 * for monoid it may give: T |-> equ |-> op |-> ident : Monoid(T) this depends on the
	 * ITypeInstance that's used another option is M : Monoid(T) if there is a deconstructive
	 * approach rather than a constructive approach. The lack of individual typing in the
	 * constructive approach is an issue I'd like to solve to allow the constructive type 
	 * to be used in operators.
	 */
	ArrayList<Tuple2<String, String>> typingStatementForInstance();
	
	/* returns the EventB version of the instance as a String. */
	String eventBTypeInstance();
	
	/* Returns all the names for the type variables, and all the names of the variables used to construct the type */
	ArrayList<String> typeAndVariableNames();

	/* A context needs to be passed about so that it's possible to work out which objects are in scope.
	 * This has come up when searching for default instances in concrete types.
	 */
	String eventBTypeInstanceForType(ClassDecl type);
	
	/* A later implementation may maintain base types in a different way, and it may be good to get this
	 * more general base type with a 'baseType()' function. 
	 */
	String baseTypeString();
	
	/* In the base implementation TypeInstanceAbstract this just calls baseTypeOfPoly.getPrimativeTypesListByDeconstruction() on the
	 * baseTypeString. In a better implementation 
	 */
	String baseTypeDeconstructedToPrimativeTypes(TypeBuilder baseTypeOfPoly);
}
