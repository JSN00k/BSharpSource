/*
 * generated by Xtext 2.13.0
 */
package ac.soton.bsharp.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.util.ArrayList
import ac.soton.bsharp.bSharp.TopLevel
import ac.soton.bsharp.bSharp.ImportStatement
import java.util.Collection
import ac.soton.bsharp.bSharp.ClassDecl
import ac.soton.bsharp.bSharp.Extend
import org.eventb.core.IEventBProject
import ch.ethz.eventb.utils.EventBUtils

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BSharpGenerator extends AbstractGenerator {
	
	var IEventBProject proj
	var String fileName

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		/* When we come into this we're expecting the resource to be at the very top level
		 * This is above the TopLevel, we can get the TopLevel item using resource.contents[0].
		 * To handle imports it is quite nice to iterate over the TopLevel in declaration order
		 * rather than using .imports, .classes etc. 
		 */
		
		val topLevel = resource.contents.get(0) as TopLevel
		val pkgName = topLevel.name
		
		proj = EventBUtils.getEventBProject(pkgName)
		if (!proj.rodinProject.exists) {
			proj = EventBUtils.createEventBProject(pkgName, null)
		}
		
		/* The top level just contains the package name and a topLevelFile, this
		 * contains the file name and the rest of the emf tree 
		 * (ClassDecl | Extend) which is then iterated over
		 */
		val topLevelFile = topLevel.topLevelFile
		fileName = topLevelFile.name
		
		
		
		/* The strategy for importing is to import any imports declared directly before 
		 * a Class, Datatype, or Extend declaration (if they've not already been imported,
		 * and to import the previous Class/Datatype/Extend generated file. */
		var ArrayList<String> toImport = new ArrayList
		
		/* A list of all the classes that have already been imported by the current 
		 * file. This is used to check against when writing the toImport
		 */
		var ArrayList<String> prevImports = new ArrayList
		
		var importing = true
		var firstImport = true
		
		for (eObject : topLevelFile.eContents) {
			if (eObject instanceof ImportStatement) {
				importing = true
				addToToImports(toImport, (eObject as ImportStatement).imports, prevImports)	
			} else {
				if (eObject instanceof ClassDecl) {

					generate_ClassDecl((eObject as ClassDecl), toImport, fsa, context)
					/* Clear out the current imports as we only want to import each thing once.*/
					prevImports += toImport
					toImport = new ArrayList
				/* I need to add the file that I just created to the toImport list */
				} else if (eObject instanceof Extend) {
					generate_Extend((eObject as Extend), toImport, fsa, context)
					prevImports += toImport
					toImport = new ArrayList

				/* I need to add the file that I just created to the toImport list */
				}

			}
		}
	}
	
	/* Importing in the theory plug-in we don't want to import the same file more than once so
	 * we make sure we only import each file once. This doesn't check across files yet.
	 */
	def addToToImports(ArrayList<String> toImport, Collection<String> newImports, ArrayList<String> allImports) {
		for (string : newImports) {
			if (!allImports.contains(string) && !toImport.contains(string))
				toImport.add(string)
		}
	}
	
	def generate_ClassDecl(ClassDecl classDecl, ArrayList<String> imports, 
		IFileSystemAccess2 fsa, IGeneratorContext context) {
		
	}
	
	def generate_Extend(Extend extend, ArrayList<String> imports, IFileSystemAccess2 fsa, IGeneratorContext ctx) {
		
	}
}