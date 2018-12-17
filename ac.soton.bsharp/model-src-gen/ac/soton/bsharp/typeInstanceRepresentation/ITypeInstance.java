package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

import ac.soton.bsharp.bSharp.ClassDecl;

/* When creating ClassDecl, Theorems, or functions, the type (or supertypes) in which each of these is 
 * declared can be implicitly referenced. When they are implicitly referenced an instance of the type
 * is created in EventB. This interface manages information about the created instance.
 */
public interface ITypeInstance {
	ClassDecl bSharpType();
	
	/* Returns a list of the polymophic types used to construct the instance. This only 
	 * includes teh polymophic context, it does not include the constructed type.*/
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
	
	/* ClassDecl has to be a supertype of the TypeInstance type, this returns 
	 * an eventB expression which represents the supertype
	 */
	String eventBTypeInstanceForType(ClassDecl type);
	
	/* Returns all the names for the type variables, and all the names of the variables used to construct the type */
	ArrayList<String> typeAndVariableNames();
}
