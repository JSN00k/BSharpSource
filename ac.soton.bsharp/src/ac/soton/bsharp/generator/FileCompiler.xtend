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
import ac.soton.bsharp.util.BSharpUtil
import ac.soton.bsharp.bSharp.ConstructedType
import ac.soton.bsharp.bSharp.TypeConstructor
import java.util.ArrayList
import ac.soton.bsharp.bSharp.TypeConstrBracket
import java.util.LinkedHashMap
import ac.soton.bsharp.bSharp.TypeStructure
import org.eclipse.xtext.EcoreUtil2

/* Does the work to compile to a single EventB file from the body elements in 
 * that file
 */
class FileCompiler {
	
	protected IProgressMonitor nullMonitor = new NullProgressMonitor();
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
		
		val supertypes = bsClass.getSupertypes()
		if (supertypes !== null) {
			opString = compileSuperTypes(bsClass, opString)
		}
		
		
		TheoryUtils.createDirectDefinition(op, opString, null, nullMonitor)
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
	
	def compileSuperTypes(BSClass bsClass, String opString) {
		var resultString = opString
		val superTypeList = bsClass.supertypes
		
		/* TODO handle subclassing of type classes better. Specifically there are 
		 * infered polytypes which are currently not generated, the current mission is 
		 * to build something for simpler classes.
		 */
		 
		var LinkedHashMap<String, String> typeStringForName = new LinkedHashMap

		for (constructedType : superTypeList.superTypes) {
			/* Calling reveres more than once is unlikely to be an issue 
			 * as attempting to reverse a right handed list with this algorithm 
			 * won't do anything.
			 */
			var reversed = EcoreUtil2.copy(constructedType)
			reversed = BSharpUtil.reverseLeftHandedConstructedType(reversed)
			
			/* If the supertype is actually a constructed type (e.g., built using type constructors)
			 * then it's name is the name of the BSClass, otherwise its name is the name of the type
			 * class that creates it.
			 */
			 
			 if (reversed instanceof TypeConstructor) {
			 	typeStringForName.put((reversed as TypeConstructor).typeName.name, compileConstructedType(reversed)) 
			 } else {
			 	typeStringForName.put(bsClass.name, compileConstructedType(reversed))
			 }
		}
		
		var first = true
		
		for (name : typeStringForName.keySet) {
			if (first)
				resultString += name
			else 
				resultString += '∧' + name
			
			first = false
		}
		
		if (bsClass.getVarList() !== null)
			resultString += compileVarListNames(bsClass.varList)
		
		resultString += '|'
		
		first = true
		
		for (name : typeStringForName.keySet) {
			if (!first)
				resultString += '∧'
			else
				first = false
			
			resultString += name + '∈' + typeStringForName.get(name)
		}
		
		if (bsClass.getVarList() !== null)
			resultString += compileVarListTyping(bsClass.varList)
			
		return resultString
	}
	
	def String compileConstructedType(ConstructedType constrType) {
		if (constrType instanceof TypeConstructor)
			return compileTypeConstructor(constrType as TypeConstructor)
		
		if (constrType instanceof TypeConstrBracket) {
			return '(' + compileConstructedType((constrType as TypeConstrBracket).child) + ')'
		}
		
		return compileConstructedType(constrType.left) + constrType.constructor + compileConstructedType(constrType.right)
	}
	
	def compileTypeConstructor(TypeConstructor constr) {
		/* TODO implement constructing type classes */
		
		if (constr.getContext() === null || constr.context.length == 0) {
			if (constr.typeName.name == 'Pred')
				return 'BOOL'
			
			return constr.typeName.name
		}
		
		return ""
	}
	
	def compileVarListNames(TypeStructure varList) {
		
	}
	
	def compileVarListTyping(TypeStructure varList) {
		
	}
	
	
}