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
				val bsClass = element as BSClass
				bsClass.setupCompilation(theoryCache)
				bsClass.compileOp()
			} else if (element instanceof Datatype) {
				//compileDatatype(element as Datatype)
			} else {
				//compileExtend(element as Extend)
			}
		}
	}	
	
}