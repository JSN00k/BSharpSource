package ac.soton.bsharp.generator

import ac.soton.bsharp.bSharp.util.CompilationUtil
import org.eclipse.core.resources.IWorkspaceRunnable
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.rodinp.core.RodinCore
import org.eclipse.emf.common.util.EList
import ac.soton.bsharp.bSharp.TopLevelInstance

/* Does the work to compile to a single EventB file from the body elements in 
 * that file
 */
class FileCompiler {
	val EList<TopLevelInstance> elements
	
	new(EList<TopLevelInstance> elem) {
		elements = elem
	}
	
	def compile() {
		/* The file needs to be compiled in the order that it was written */
		if (elements.isEmpty) {
			return;
		}
		
		val wsRunnable = new IWorkspaceRunnable {
			

			override run(IProgressMonitor monitor) throws CoreException {
				var theoryCache = CompilationUtil.getTheoryCacheForElement(elements.get(0));
				for (element : elements) {
					try {
						element.compile();
					} catch (Exception exception) {
						System.err.println("Compilation failed with error: " + exception.message);
					}
					
				}
				
				theoryCache.save();
			}

		}
		RodinCore.run(wsRunnable, new NullProgressMonitor)

	}

}
