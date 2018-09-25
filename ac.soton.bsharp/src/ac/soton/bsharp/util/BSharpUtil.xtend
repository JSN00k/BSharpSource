package ac.soton.bsharp.util

import ac.soton.bsharp.bSharp.BppClass
import ac.soton.bsharp.bSharp.ClassDecl
import java.util.ArrayList
import ac.soton.bsharp.bSharp.ConstructedType
import ac.soton.bsharp.bSharp.TypeConstructor
import ac.soton.bsharp.bSharp.Datatype
import org.eclipse.emf.ecore.EObject

class BSharpUtil {
	/* Constructed types can be a genuine constructed type (e.g., they are created with a 
	 * type constructor), or they can act as a wrapper around a a Type Constructor (which 
	 * can simply be a type or a type constructor with arguments. This is because the 
	 * definition of a constructed type is:
	 * 
	 * ConstructedType:
	 *   type+=TypeConstructor 
	 * 		(constructors+=('×' | '→' | '' | '' | '↔' | '⤖' | '⇸' | '↣' | '⤀' | '↠') type+=ConstructedType)?
	 * ;
	 * If there is nothing in the constructors section then there is only a Type Constructor wrapped in a ConstructedType
	 * flatternConstructedType(ConstructedType t) unpacks the ConstructedType if it is just acting as a wrapper.
	 * 
	 */
	def static flatternConstructedType(ConstructedType t) {
		if (t.constructors === null || t.constructors.isEmpty) {
			/* We're definitely only wrapping a Type Constructor */
			
			/* This doesn't deal with the idea that the Type may be a constructed type.
			 * Options are to disallow ad-hoc constructed types or to create a new type instance
			 * for the constructed type, which remembers its constructors.
			 */
			return (t.type.head as TypeConstructor).typeName
		}
		
		return t
	}
	
	/* This function simply finds all of the supertypes. It doesn't do any work to 
	 * unify them.
	 */
	def static void superClassesInternal(BppClass c, ArrayList<EObject> list) {
		val superclasses = c.supertypes
		
		for (superclass : superclasses.superType) {
			/* There are three possibilities, the supertype is a constructed type,
			 * the supertype is another ClassDecl (type class), or the supertype
			 * is a datatype
			 */
			 
			 /* If the supertype is a constructed type, or a datatype it must be a unique 
			  * supertype, this should be checked in the validation stage.
			  */
			  val type = flatternConstructedType(superclass)
			  if (type instanceof ConstructedType || type instanceof Datatype) {
			  	if (superclasses.superType.length != 1) {
			  		/* This is a problem that should be reported to the user somehow */
			  		return
			  	}
			  	
			  	if (!list.contains(type)) {
			  		list.add(type)
			  		return
			  	}
			  }
			  
			 //list.append()
			 
			 
			 if (superclass instanceof BppClass) {
			 	if (!list.contains(type)) {
			 		list.add(type as ClassDecl)
			 		superClassesInternal(type as BppClass, list)
			 	}
			 }
		}
	}
	
	def static superClasses(BppClass c) {
		var ArrayList<EObject> list  = new ArrayList
		superClassesInternal(c, list)
		return list
	}
}