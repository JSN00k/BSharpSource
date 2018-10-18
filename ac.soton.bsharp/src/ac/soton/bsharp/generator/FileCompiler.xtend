package ac.soton.bsharp.generator

import ac.soton.bsharp.bSharp.BodyElements
import ac.soton.bsharp.theory.util.TheoryImportCache
import ac.soton.bsharp.bSharp.BSClass
import java.util.List
import java.util.Collection
import ac.soton.bsharp.bSharp.Datatype
import ac.soton.bsharp.bSharp.Extend
import ac.soton.bsharp.bSharp.PolyContext
import org.eventb.theory.core.ITypeParameter
import java.util.HashMap
import org.eventb.theory.core.ITheoryRoot
import ac.soton.bsharp.theory.util.TheoryUtils
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.IProgressMonitor
import org.eventb.theory.core.INewOperatorDefinition
import org.eventb.core.ast.^extension.IOperatorProperties.FormulaType
import org.eventb.core.ast.^extension.IOperatorProperties.Notation;
import ac.soton.bsharp.bSharp.SuperTypeList

/* Does the work to compile to a single EventB file from the body elements in 
 * that file
 */
class FileCompiler {
	
	protected IProgressMonitor nullMonitor = new NullProgressMonitor();
	/* This is used to suffix Event-B type variables it results in Event-B code like T : T_EvB */
	protected String EventBTypeSuffix = "_EvB"
	
	val BodyElements elements
	val TheoryImportCache theoryCache
	val ITheoryRoot thy
	
	/* Maps the name of a Type parameter to the type paramenter,
	 * allowing the reuse of type parameters.
	 */
	var HashMap<String, ITypeParameter> polyTypeMap = new HashMap
	
	new(BodyElements elem, TheoryImportCache cache) {
		elements = elem
		theoryCache = cache
		thy = cache.theory
	}
	
	def compile() {
		/* The file needs to be compiled in the order that it was written */
		for (element : elements.eContents) {
			if (element instanceof BSClass) {
				compileBSClass(element as BSClass)
			} else if (element instanceof Datatype) {
				compileDatatype(element as Datatype)
			} else {
				compileExtend(element as Extend)
			}
		}
	}
	
	def compileBSClass(BSClass bsClass) {
		/* Create the main type class operator */
		var op = TheoryUtils.createOperator(thy, bsClass.name, false, false, FormulaType.EXPRESSION, Notation.PREFIX, null, nullMonitor)
		var opString = "{ "
		
		val context = bsClass.getContext()
		if (context !== null)
			createPolyTypesFromPolyContext(bsClass.context, opString, op)
			
		
	}
	
	def compileDatatype(Datatype datatype) {
		/* Pred has to be special cased to work with the Event-B Bool and 
		 * predicate types.
		 */
		if (datatype.name == "Pred")
			return
	}
	
	def compileExtend(Extend extend) {
		
	}
	
	/* ------------------------------------------------------------------- */
	def createPolyTypesFromPolyContext(PolyContext context, String opString, INewOperatorDefinition op) {
		for (polyType : context.polyTypes) {
			val name = polyType.name
			val typeParam = polyTypeMap.get(name)
			if (typeParam === null) {
				val newTypeParam = TheoryUtils.createTypeParameter(thy, name + EventBTypeSuffix, null, nullMonitor)
				polyTypeMap.put(polyType.name, newTypeParam)
			}
			
			TheoryUtils.createArgument(op, name, "ℙ(" + name + EventBTypeSuffix + ")", null, nullMonitor)
			
			val superTypes = polyType.getSuperTypes()
			if (superTypes !== null) {
				for (supertype : superTypes) {
					TheoryUtils.createArgument(op, supertype.name, supertype.name + "(" + name + ")", null, nullMonitor)
				}
			}
		}
	}
	
	def compileSuperTypes(SuperTypeList superTypeList) {
		for (constructedType : superTypeList.superTypes) {
			
		}
	}
}