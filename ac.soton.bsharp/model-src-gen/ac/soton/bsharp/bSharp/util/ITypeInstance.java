package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

import ac.soton.bsharp.bSharp.ClassDecl;

/* When creating ClassDecl, Theorems, or functions, the type (or supertypes) in which each of these is 
 * declared can be implicitly referenced. When they are implicitly referenced an instance of the type
 * is created in EventB. This interface manages information about the created instance.
 */
public interface ITypeInstance {
	ClassDecl bSharpType();
	
	/* Returns a list of the polymophic types used to construct the instance. */
	ArrayList<String> typeConstructionTypes();
	
	/* Returns the construction types paired with their EventB types, Including the 
	 * instance of the type. */
	ArrayList<Tuple2<String, String>> typeConstructionTypesTyped();
	
	/* returns the EventB version of the instance as a String. */
	String eventBTypeInstance();
	
	/* ClassDecl has to be a supertype of the TypeInstance type, this returns 
	 * an eventB expression which represents the supertype
	 */
	String eventBTypeInstanceForType(ClassDecl type);
}
