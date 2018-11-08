package ac.soton.bsharp.generator

import ac.soton.bsharp.bSharp.BodyElements
import ac.soton.bsharp.bSharp.BSClass
import ac.soton.bsharp.bSharp.Datatype

/* Does the work to compile to a single EventB file from the body elements in 
 * that file
 */
class FileCompiler {
	val BodyElements elements
	
	new(BodyElements elem) {
		elements = elem
	}
	
	def compile() {
		/* The file needs to be compiled in the order that it was written */
		for (element : elements.eContents) {
			if (element instanceof BSClass) {
				val bsClass = element as BSClass
				bsClass.compile()
			} else if (element instanceof Datatype) {
				//compileDatatype(element as Datatype)
			} else {
				//compileExtend(element as Extend)
			}
		}
	}	
	
}