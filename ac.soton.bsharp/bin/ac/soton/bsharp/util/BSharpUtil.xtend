package ac.soton.bsharp.util

import ac.soton.bsharp.bSharp.ClassDecl
import java.util.ArrayList
import ac.soton.bsharp.bSharp.ConstructedType
import ac.soton.bsharp.bSharp.TypeConstructor
import ac.soton.bsharp.bSharp.Datatype
import org.eclipse.emf.ecore.EObject
import java.util.Collection
import ac.soton.bsharp.bSharp.BSClass
import ac.soton.bsharp.bSharp.TypeConstrBracket
import ac.soton.bsharp.bSharp.TypeBuilder


class BSharpUtil {	
	/* This function simply finds all of the supertypes. It doesn't do any work to 
	 * unify them.
	 */
	def static void superClassesInternal(BSClass c, ArrayList<EObject> list) {
		val superclasses = c.getSupertypes
		
		for (superclass : superclasses.superTypes) {
			/* There are three possibilities, the supertype is a constructed type,
			 * the supertype is another ClassDecl (type class), or the supertype
			 * is a datatype
			 */
			 
			 /* If the supertype is a constructed type, or a datatype it must be a unique 
			  * supertype, this should be checked in the validation stage.
			  */
			  if (superclass instanceof TypeConstructor) { 
			  	val type = (superclass as TypeConstructor).typeName
			  if (type instanceof ConstructedType || type instanceof Datatype) {
					if (superclasses.superTypes.length != 1) {
						/* This is a problem that should be reported to the user somehow */
						return
					}

					if (!list.contains(type)) {
						list.add(type)
						return
					}
				}

				if (type instanceof BSClass) {
					if (!list.contains(type)) {
						list.add(type as ClassDecl)
						superClassesInternal(type as BSClass, list)
					}
				}
			}
		}
	}
	
	def static ArrayList<EObject> expandConstraintTypes(Collection<ClassDecl> constraints) {
		var ArrayList<EObject> result = new ArrayList
		
		result += constraints
		
		for (superClass : constraints) {
			superClassesInternal(superClass as BSClass, result)
		}
		
		return result
	}
	
	def static superClasses(BSClass c) {
		var ArrayList<EObject> list  = new ArrayList
		superClassesInternal(c, list)
		return list
	}
	
	def static TypeBuilder reverseLeftHandedConstructedType(TypeBuilder ct) {
		if (ct instanceof TypeConstructor)
			return ct
			
		if (ct instanceof TypeConstrBracket) {
			ct.child = reverseLeftHandedConstructedType((ct as TypeConstrBracket).child)
			return ct;
		}
		
		val constructor = (ct as ConstructedType)
		
		if (constructor.left instanceof TypeConstructor)
			return ct
			
		if (constructor.left instanceof TypeConstrBracket) {
			constructor.left = reverseLeftHandedConstructedType(constructor.left);
			return constructor
		}
		
		val left = constructor.left as ConstructedType
		val newLeft = left.right
		left.right = ct
		constructor.left = newLeft
		
		return reverseLeftHandedConstructedType(left)
	}
	

}