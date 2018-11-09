package ac.soton.bsharp.theory.util

import java.util.HashMap
import org.eventb.theory.core.ITheoryRoot
import java.util.ArrayList
import org.eventb.theory.core.IImportTheoryProject
import org.rodinp.core.IRodinProject
import ch.ethz.eventb.utils.EventBUtils
import ac.soton.bsharp.theory.util.TheoryUtils
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eventb.theory.core.DatabaseUtilities
import org.eventb.theory.core.ITypeParameter
import ac.soton.bsharp.util.EcoreUtilJ
import org.eclipse.emf.ecore.EObject
import ac.soton.bsharp.bSharp.ClassDecl
import org.eclipse.xtext.EcoreUtil2
import ac.soton.bsharp.bSharp.TopLevel
import ac.soton.bsharp.bSharp.TopLevelImport

/* A subclass of the TheoryRoot that keeps various additional references in 
 * memory to easy the creation of Thy files without unnecessary additional 
 * saving and deploying.
 */
class TheoryImportCache {
		
	protected IProgressMonitor nullMonitor = new NullProgressMonitor();
	/* This is used to suffix Event-B type variables it results in Event-B code like T : T_EvB */
	protected String EventBTypeSuffix = "_EvB"
	/* Stores the names of thys that have already been imported as 
	 * fully qualified names proj.fileName
	 */
	var ArrayList<String> alreadyImported
	
	/* Keeps references to the in memory import blocks (imports are blocked by
	 * project) allowing them to be easily appended to.
	 */
	public var HashMap<String, IImportTheoryProject> thyImportBlocks
	
	public val ITheoryRoot theory
	val String localProjName
	
	/* It is not necessary to create new eventB poly types for every new 
	 * use of a polytypes. This dictionary keeps references to previously
	 * created Event-B polytypes by their names.
	 */
	var HashMap<String, ITypeParameter> polyTypeMap = new HashMap
	
	/* This class is designed to be used in conjunction with the BSharpGenerator
	 * to cache additional information about the TheoryRoot in memory. prevTheory
	 * is used when more than one theory file is created for a single BSharp file,
	 * the later files need to import their previous file, this is what is contained
	 * in prevTheory.
	 */
	new(ITheoryRoot thy, String projName, TheoryImportCache prevTheory) {
		theory = thy
		localProjName = projName
		thyImportBlocks = new HashMap
		alreadyImported = new ArrayList
		
		if (prevTheory !== null)
			importLocalTheoryCache(prevTheory)
			
		/* Just in case let's make it so it is not possible for a file to import itself by
		 * adding itself to the alreadyImported list
		 */
		 alreadyImported += projName + '.' + thy.componentName
	}
	
	def importThyFromProjectWithName(ITheoryRoot thy, String projName) {
		val fqn = projName + '.' + thy.componentName
		if (alreadyImported.contains(fqn))
			return
			
		val eventBProj = EventBUtils.getEventBProject(projName)
		val rodinProj = eventBProj.rodinProject
		/* Either get or create the porject import block */

		val importBlock = getImportBlockForProj(projName, rodinProj)
		TheoryUtils.createImportTheory(importBlock, thy, nullMonitor)
	}
	
	def importLocalTheoryCache(TheoryImportCache thyCache) {
		importThyFromProjectWithName(thyCache.theory, localProjName)
		alreadyImported += thyCache.alreadyImported
	}
	
	def importLocalTheoryWithName(String thyName) {
		val localProjBlock = thyImportBlocks.get(localProjName)
		if (localProjBlock === null) {
			val localBlock = TheoryUtils.createImportTheoryProject(theory, theory.rodinProject, nullMonitor)
			thyImportBlocks.put(localProjName, localBlock)
		}
		
		importTheoryWithNameFromProjectWithName(thyName, localProjName)
	}
	
	def importTheoryWithNameFromProjectWithName(String thyName, String projName) {
		val fqn = projName + '.' + thyName
		if (alreadyImported.contains(fqn))
			return
			
		val eventBProj = EventBUtils.getEventBProject(projName)
		val rodinProj = eventBProj.rodinProject
		
		val importBlock = getImportBlockForProj(projName, rodinProj)
		/* This may need to change to use rodinProj.getRodinFiles and search the result for 
		 * the current file. This will happen if get theory requires an internal theory name
		 * rather than the name that I give to the theory. I won't be able to test this until
		 * I have got to the compilation point of deploying theories. */
		val thyRoot = DatabaseUtilities.getTheory(thyName, rodinProj)
		
		TheoryUtils.createImportTheory(importBlock, thyRoot, nullMonitor)
	}
	
	/* Finds an instance of the type to be imported and imports the theory of that type */
	def importTheoryForTypeNameInTree(String typeName, EObject tree) {
		val container = EcoreUtilJ.getObjectMatchingLambda(tree, 
			[eObj | for (crossRef : eObj.eCrossReferences) {
				if (crossRef instanceof ClassDecl && (crossRef as ClassDecl).name == typeName)
					return true;
				}
				
				return false
			])
		
		val classDecl = container.eCrossReferences.findFirst[obj | obj instanceof ClassDecl && (obj as ClassDecl).name == typeName]
			
		val topLevel = EcoreUtil2.getContainerOfType(classDecl, TopLevel)
		val projName = topLevel.name + "-gen"
		var String fileName = null
		
		val topLevelFile = topLevel.topLevelFile
		val bSharpFileName = topLevelFile.name
		
		val imports = topLevelFile.getTopLevelImports()
		
		if (imports === null || imports.isEmpty) {
			fileName = bSharpFileName
		} else {
			var fileNdx = 1;
			if (topLevelFile.getNoImportElements() !== null) {
				fileNdx = 2;
			}
			
			val topLevelImport = EcoreUtil2.getContainerOfType(classDecl, TopLevelImport)
			if (topLevelImport === null) {
				/* If there's no TopLevelImport above the classDecl the classDecl must have 
				 * been declared in the noImportElements section.
				 */
				fileName = bSharpFileName + 1.toString
			} else {
				if (imports.last === topLevelImport) {
					fileName = bSharpFileName
				} else {
					fileName = bSharpFileName + (imports.indexOf(topLevelImport) + fileNdx).toString
				}
			}
		}
		
		importTheoryWithNameFromProjectWithName(fileName, projName)
	}
	
	def getImportBlockForProj(String projName, IRodinProject rodProj){
		var importBlock = thyImportBlocks.get(projName)
		if (importBlock !== null)
			return importBlock

		if (!rodProj.exists) {
			/* This should never happen as this method should only be called
			 * during the compilation phase with rodin projects that already 
			 * exist, and have already been deployed (with the exception of
			 * the local project which should already be in the thyImportBlocks
			 */
			print("Roin project unexpectedly doesn't exist, presuamably it has not " + "been deployed after comilation")
		}

		importBlock = TheoryUtils.createImportTheoryProject(theory, rodProj, nullMonitor)
		thyImportBlocks.put(projName, importBlock)
		return importBlock
	}
	
	def save() {
		theory.rodinFile.save(nullMonitor, true)
		
	}
	
	/* If an Event-B polytype for that name already exists that polytype is returned
	 * otherwise a new polytype is created and added to the cache.
	 */
	def getEventBTypeParamNameForName(String name) {
		val typeParamName = name + EventBTypeSuffix
		val polytype = polyTypeMap.get(name)
		if (polytype !== null)
			return typeParamName
			
		val typeParam =TheoryUtils.createTypeParameter(theory, typeParamName, null, nullMonitor)
		polyTypeMap.put(name, typeParam)
		
		return typeParamName 
	}
}