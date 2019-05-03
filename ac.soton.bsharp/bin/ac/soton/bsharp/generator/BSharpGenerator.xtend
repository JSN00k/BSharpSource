/*
 * generated by Xtext 2.13.0
 */
package ac.soton.bsharp.generator

import ac.soton.bsharp.bSharp.TopLevel
import ch.ethz.eventb.utils.EventBUtils
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.rodinp.core.IRodinProject
import org.rodinp.core.RodinCore
import org.eclipse.core.resources.IWorkspaceRunnable
import org.eclipse.core.runtime.CoreException

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BSharpGenerator extends AbstractGenerator {
	
	protected IProgressMonitor nullMonitor = new NullProgressMonitor();
	
	var String projName
	var IRodinProject proj


	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		/* When we come into this we're expecting the resource to be at the very top level
		 * This is above the TopLevel, we can get the TopLevel item using resource.contents[0].
		 * To handle imports it is quite nice to iterate over the TopLevel in declaration order
		 * rather than using .imports, .classes etc. 
		 */
		
		val topLevel = resource.contents.get(0) as TopLevel
		projName = topLevel.name + "-gen"
		
		var eventBproj = EventBUtils.getEventBProject(projName)
		if (!eventBproj.rodinProject.exists) {
			eventBproj = EventBUtils.createEventBProject(projName, nullMonitor)
		}
		
		proj = eventBproj.rodinProject
		
		/* The top level just contains the package name and a topLevelFile, this
		 * contains the file name and the rest of the emf tree 
		 * (ClassDecl | Extend) which is then iterated over
		 */
		val topLevelFile = topLevel.topLevelFile
		
		/* Generates all of the theories that this file will need and imports
		 * as many files as possible.
		 */
		
		val wsRunnable = new IWorkspaceRunnable {
			override run(IProgressMonitor monitor) throws CoreException {

				topLevelFile.compile(nullMonitor, proj);
			}
		}

		RodinCore.run(wsRunnable, new NullProgressMonitor)
	}

}