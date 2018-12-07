package ac.soton.bsharp.generator

import ac.soton.bsharp.bSharp.BSClass
import ac.soton.bsharp.bSharp.BodyElements
import ac.soton.bsharp.bSharp.Datatype
import ac.soton.bsharp.bSharp.util.CompilationUtil
import org.eclipse.core.resources.IWorkspaceRunnable
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.rodinp.core.RodinCore
import ac.soton.bsharp.bSharp.Extend

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
		val wsRunnable = new IWorkspaceRunnable {

			override run(IProgressMonitor monitor) throws CoreException {
				var theoryCache = CompilationUtil.getTheoryCacheForElement(elements);
				for (element : elements.eContents) {
					if (element instanceof BSClass) {
						val bsClass = element as BSClass
						bsClass.compile()
					} else if (element instanceof Datatype) {
						val datatype = element as Datatype
						datatype.compile();
					} else {
						val extend = element as Extend
						extend.compile();
					}
				}
				theoryCache.save();
			}

		}
		RodinCore.run(wsRunnable, new NullProgressMonitor)

	}

}
