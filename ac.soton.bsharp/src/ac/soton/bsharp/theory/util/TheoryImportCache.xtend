package ac.soton.bsharp.theory.util

import java.util.HashMap
import org.eventb.theory.core.ITheoryRoot
import org.eventb.theory.core.IImportTheoryProject
import org.rodinp.core.IRodinProject
import ch.ethz.eventb.utils.EventBUtils
import ac.soton.bsharp.theory.util.TheoryUtils
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eventb.theory.core.DatabaseUtilities
import org.eventb.theory.core.ITypeParameter
import ac.soton.bsharp.bSharp.TopLevelImport
import ac.soton.bsharp.bSharp.util.EventBFQNImport
import ac.soton.bsharp.bSharp.util.ComparatorHashSet
import org.eclipse.xtext.xbase.lib.Functions.Function2

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
	var ComparatorHashSet<EventBFQNImport> alreadyImported
	
	val Function2<EventBFQNImport, Object, Boolean> comparator = [EventBFQNImport containedObj, Object other | 
		if (!(other instanceof EventBFQNImport))
			return false
			
		return containedObj.isInferredImporterOf(other as EventBFQNImport)
	]
	
	/* Keeps references to the in memory import blocks (imports are blocked by
	 * project) allowing them to be easily appended to.
	 */
	public var HashMap<String, IImportTheoryProject> thyImportBlocks
	
	public val ITheoryRoot theory
	public val EventBFQNImport evBFQN
	
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
	new(IRodinProject proj, EventBFQNImport evBFqn, TheoryImportCache prevTheory) {	
		this.evBFQN = evBFqn
		theory = TheoryUtils.createTheory(proj, evBFqn.fileName, null)
		
		thyImportBlocks = new HashMap
		if (prevTheory !== null) {
			alreadyImported = prevTheory.alreadyImported.clone as ComparatorHashSet<EventBFQNImport>
			importEventBFQNInternal(prevTheory.evBFQN)
		} else {
			alreadyImported = new ComparatorHashSet(comparator)
		}
			
		/* Just in case let's make it so it is not possible for a file to import itself by
		 * adding itself to the alreadyImported list
		 */
		 alreadyImported += evBFqn
	}
	
	new(IRodinProject proj, TopLevelImport imports, EventBFQNImport fileFQN, TheoryImportCache prevTheory) {
		this.evBFQN = fileFQN
		theory = TheoryUtils.createTheory(proj, fileFQN.fileName, null)
		
		thyImportBlocks = new HashMap
		if (prevTheory !== null) {
			alreadyImported = prevTheory.alreadyImported.clone as ComparatorHashSet<EventBFQNImport>
		} else {
			alreadyImported = new ComparatorHashSet(comparator)
		}
		
		var ComparatorHashSet<EventBFQNImport> newImports = new ComparatorHashSet(comparator)
		
		imports.addAllEventBImportsToNewImports(alreadyImported, newImports)
		
		if (prevTheory !== null && !alreadyImported.contains(prevTheory.evBFQN)) {
			alreadyImported.add(prevTheory.evBFQN)
			newImports.add(prevTheory.evBFQN)
		}
		
		for (imp : newImports) {
			importEventBFQNInternal(imp)
		}
	}
	
	/* Only call if you're certain that this has not already been imported.
	 * DOES NOT CHECK AGAINST ALREADY IMPORTED
	 */
	private def importEventBFQNInternal(EventBFQNImport fqn) {
		val evBProj = EventBUtils.getEventBProject(fqn.projName)
		val rodProj = evBProj.rodinProject;
		val importBlock = getImportBlockForProj(fqn, rodProj)
		val thyRoot = DatabaseUtilities.getTheory(fqn.fileName, rodProj)
		
		TheoryUtils.createImportTheory(importBlock, thyRoot, nullMonitor)
	}
	
	def getImportBlockForProj(EventBFQNImport fqn, IRodinProject rodProj){
		val projName = fqn.projName

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