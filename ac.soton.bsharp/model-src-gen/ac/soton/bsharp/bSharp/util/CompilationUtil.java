package ac.soton.bsharp.bSharp.util;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eventb.core.ast.extension.IOperatorProperties;
import org.eventb.core.ast.extension.IOperatorProperties.FormulaType;
import org.eventb.core.ast.extension.IOperatorProperties.Notation;
import org.eventb.theory.core.INewOperatorDefinition;
import org.rodinp.core.IInternalElement;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.FileImport;
import ac.soton.bsharp.bSharp.IBodyElementsContainer;
import ac.soton.bsharp.bSharp.IClassInstance;
import ac.soton.bsharp.bSharp.IExpressionContainer;
import ac.soton.bsharp.bSharp.ITheoryImportCacheProvider;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TopLevelInstance;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.mapletTree.IMapletNode;
import ac.soton.bsharp.mapletTree.MapletExpressionLeaf;
import ac.soton.bsharp.mapletTree.MapletExpressionVariableLeaf;
import ac.soton.bsharp.mapletTree.MapletTree;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;
import ac.soton.bsharp.typeInstanceRepresentation.ITypeInstance;
import ac.soton.bsharp.util.EcoreUtilJ;

public class CompilationUtil {
	
	protected static IProgressMonitor nullMonitor = new NullProgressMonitor();
	
	public static String compileVariablesNamesToArgumentsWithSeparator(ArrayList<String> vars, String sep, Boolean isFirst) {
		Boolean first = isFirst;
		String res = "";
		for (String var : vars) {
			if (!first) {
				res += sep;
			}
			
			first = false;
			
			res += var;
		}
		
		return res;
	}
	
	public static String compileTypedVariablesToNameListWithSeparator(ArrayList<Tuple2<String, String>> typedVars, 
			String separator, Boolean isFirst) {
		return compileTypedVariablesToNameListWithSeparator(typedVars, separator, isFirst, false);
	}
	
	/* Compiles just the names (the first member of the tuple), with the provided separator.
	 * isFirst is a boolean that  */
	public static String compileTypedVariablesToNameListWithSeparator(ArrayList<Tuple2<String, String>> typedVars, 
			String separator, Boolean isFirst, Boolean bracketAddedVars) {
		String sep = separator;
		if (typedVars == null) {
			return "";
		}
		
		Boolean addedOpenBrace = false;
		String result = "";
		if (isFirst && bracketAddedVars) {
			result += "(";
			addedOpenBrace = true;
		}
		
		if (sep == null) {
			sep = " ↦ ";
		}
		
		Boolean first = isFirst;
		
		for (Tuple2<String, String> typedVar : typedVars) {
			if (!first) {
				result += sep;
			}
			first  = false;
			
			if (bracketAddedVars && !addedOpenBrace) {
				result += "(";
				addedOpenBrace = true;
			}
			
			result += typedVar.x;
		}
		
		if (bracketAddedVars)
			result += ")";
		
		return result;
	}
	
	public static String compileTypedVaribalesToTypedList(ArrayList<Tuple2<String, String>> typedVars, Boolean isFirst) {
		if (typedVars == null || typedVars.isEmpty())
			return "";
		
		Boolean first = isFirst;
		String result = "";
		
		for (Tuple2<String, String> typedVar : typedVars) {
			if (!first) {
				result += " ∧ ";
			}
			first = false;
			
			result += typedVar.x + " ∈ " + typedVar.y;
		}
		
		return result;
	}
	
	/* Get the TheoryImportCache for the current theory. */
	public static TheoryImportCache getTheoryCacheForElement(EObject elem) {
		return EcoreUtil2.getContainerOfType(elem, ITheoryImportCacheProvider.class).getTheoryImportCache();
	}
	
	public static void compileTypedVariablesToOperatorArgs(List<Tuple2<String, String>> typedVars,
			INewOperatorDefinition op) throws Exception {
		for (Tuple2<String, String> typedArg : typedVars) {
			TheoryUtils.createArgument(op, typedArg.x, typedArg.y, null, nullMonitor);
		}
	}
	
	public static INewOperatorDefinition createOpWithArgumentsAsPred(TheoryImportCache thyCache,
			String name, List<Tuple2<String, String>> args, Notation notation, Boolean asPred) throws Exception {
		INewOperatorDefinition op = TheoryUtils.createOperator(thyCache.theory, name, false, false, 
				asPred ? FormulaType.PREDICATE : FormulaType.EXPRESSION, notation, null, nullMonitor);
		
		compileTypedVariablesToOperatorArgs(args, op);
		return op;
	}
	
	public static INewOperatorDefinition createOpWithArgumentsAsPred(TheoryImportCache thyCache,
			String name, ArrayList<Tuple2<String, String>> args, Notation notation, IInternalElement nextSybling, 
			Boolean asPred) throws Exception {
		INewOperatorDefinition op = TheoryUtils.createOperator(thyCache.theory, name, false, false, 
				asPred ? FormulaType.PREDICATE : FormulaType.EXPRESSION, notation, nextSybling, nullMonitor);
		
		compileTypedVariablesToOperatorArgs(args, op);
		return op;
	}
	
	public static INewOperatorDefinition createOpWithArguments(TheoryImportCache thyCache,
			String name, List<Tuple2<String, String>> args, IOperatorProperties.Notation notation) throws Exception {
		return createOpWithArgumentsAsPred(thyCache, name, args, notation, false);
	}
	
	public static INewOperatorDefinition createPredOpWithArguments(TheoryImportCache thyCache,
			String name, ArrayList<Tuple2<String, String>> args, IOperatorProperties.Notation notation) throws Exception {
		return createOpWithArgumentsAsPred(thyCache, name, args, notation, true);
	}
	
	public static String compileExpressionListWithSeperator(EList<Expression> exprs, String sep) throws Exception {
		Boolean first = true;
		String result = "";
		
		for (Expression expr : exprs) {
			if (!first) {
				result += sep;
			}
			
			first = false;
			result += expr.compileToEventBString(false);
		}
		
		return result;
	}
	
	public static String wrapNameInPrj1s(String n, int ps) {
		String result = "";
		
		for (int i = 0; i < ps; ++i) {
			result += "prj1(";
		}
		
		result += n;
		
		for (int i = 0; i < ps; ++i) {
			result += ")";
		}
		
		return result;
	}
	
	public static ClassDecl getClassDecl(EObject obj) {
		TopLevelInstance tl = EcoreUtil2.getContainerOfType(obj, TopLevelInstance.class);
		if (tl instanceof ClassDecl)
			return (ClassDecl)tl;
		
		return ((Extend)tl).getExtendedClass();
	}
	
	public static IMapletNode mapletNodeFromExpressionArray(List<Expression> vars) {
		if (vars == null || vars.isEmpty())
			return null;
		
		boolean first = true;
		IMapletNode c = null;
		for (Expression expr : vars) {
			if (first) {
				c = new MapletExpressionLeaf(expr);
				first = false;
				continue;
			}
			
			c = new MapletTree(c, new MapletExpressionLeaf(expr));
		}
		
		return c;
	}
	
	/* This only compares the package name and the file name to check if it is referring to the same file.
	 * TODO: This should be updated to take into account partial imports. 
	 */
	static boolean fileImportsContainFileImport(List<FileImport> fileImports, FileImport fileImport) {
		for (FileImport fi : fileImports) {
			if (fi.packageFileName().equals(fileImport.packageFileName()))
				return true;
		}
		
		return false;
	}
	
	static void getAllFileImportsForFileImportInternal(FileImport fileImport, ArrayList<FileImport> alreadyImported) {
		/* When a file is imported every import within that file also needs to be added, if it's not already imported,
		 * however, if there's a type in the file import then only the import section of the file related to and above 
		 * that section should be imported.
		 */
		
		ArrayList<FileImport> newFileImports = null;
		
		final ArrayList<FileImport> finalAlreadyImported = alreadyImported;
		
		Function1<EObject, Boolean> fileImportFilter = new Function1<EObject, Boolean>() {

			@Override
			public Boolean apply(EObject p) {
				return (p instanceof FileImport) && !fileImportsContainFileImport(finalAlreadyImported, (FileImport) p);
			}
		};
		
		
		EObject root = EcoreUtil2.getRootContainer(fileImport.getFileReference());
		
		TopLevelInstance type = fileImport.getType();
		if (type != null) {
			@SuppressWarnings("unchecked")
			ArrayList<FileImport> newFileImportsTmp = (ArrayList<FileImport>) EcoreUtilJ.eFilterUpToCurrentWith(type,
					fileImportFilter);
			newFileImports = newFileImportsTmp;
		} else {
			@SuppressWarnings("unchecked")
			ArrayList<FileImport> newFileImportsTmp = (ArrayList<FileImport>)EcoreUtilJ.eFilter(root, fileImportFilter);
			newFileImports = newFileImportsTmp;
		}
		
		if (newFileImports != null) {
			alreadyImported.addAll(newFileImports);
			
			for (FileImport imp : newFileImports) {
				getAllFileImportsForFileImportInternal(imp, alreadyImported);
			}
		}
	}
	
	/* Recursively gets all of the imports. */
	public static List<FileImport> getAllFileImports(EObject context) {
		@SuppressWarnings("unchecked")
		ArrayList<FileImport> fileImports = (ArrayList<FileImport>)EcoreUtilJ.eFilterUpToCurrentWith(context, new Function1<EObject, Boolean>() {

			@Override
			public Boolean apply(EObject p) {
				return p instanceof FileImport;
			}
		});
		
		ArrayList<FileImport> alreadyImported = new ArrayList<FileImport>(fileImports);
		
		for (FileImport imp : fileImports) {
			getAllFileImportsForFileImportInternal(imp, alreadyImported);
		}
		
		return alreadyImported;
	}
	
	public static EList<EObject> filterFileImportReference(FileImport fileImport, Function1<EObject, Boolean> filter) {
		TopLevelInstance type = fileImport.getType();
		
		EObject root = EcoreUtil2.getRootContainer(fileImport.getFileReference());
		if (type != null) {
			/* Find the topLevelImport/TopLevelFile associated with the classDecl. */
			IBodyElementsContainer container = EcoreUtil2.getContainerOfType(type, IBodyElementsContainer.class);

			@SuppressWarnings("unchecked")
			EList<EObject> result = (EList<EObject>) EcoreUtilJ.eFilterUpToIncludingCurrentWith(container, filter);
			return result;
		}
		
		@SuppressWarnings("unchecked")
		EList<EObject> result = (EList<EObject>)EcoreUtilJ.eFilter(root, filter);
		return result;
	}
	
	/* Does not search super types. Finds the declaration and extension blocks for the type t
	 * declared above the location of context. Do not include the block of the current object
	 * (if there is one) this would likely need to be searched in a different way.
	 */
	public static ArrayList<BSharpBlock> findBlocksForType(EObject context, ClassDecl t) {
		ArrayList<BSharpBlock> result = new ArrayList<BSharpBlock>();
		TopLevelInstance topLevel = EcoreUtil2.getContainerOfType(context, TopLevelInstance.class);
		
		final BSharpBlock currentBlock;
		
		if (topLevel != null) {
			if (topLevel == t) {
				return result;
			} else {
				/* This allows us to filter out the current block from the other blocks. 
				 * This is desirable, because the current block should only be filtered up
				 * to the location in the current block so needs to be ignored. */
				currentBlock = topLevel.getBlock();
			}
		} else {
			currentBlock = null;
		}
		
		Function1<EObject, Boolean> blockFinder = new Function1<EObject, Boolean>() {
			@Override
			public Boolean apply(EObject p) {
				if (p instanceof BSharpBlock) {
					if (p == currentBlock)
						return false;
					
					TopLevelInstance tL = (TopLevelInstance)p.eContainer();
					if (tL instanceof ClassDecl)
						return tL == t;
					else
						return ((Extend)tL).getExtendedClass() == t;
				}
				
				return false;
			}
		};
		
		/* Also filters out the current block rather than just finding all instances before. */
		@SuppressWarnings("unchecked")
		ArrayList<BSharpBlock> blocksInCurrent = (ArrayList<BSharpBlock>)EcoreUtilJ.eFilterUpToCurrentWith(context, blockFinder);
		
		result.addAll(blocksInCurrent);
		
		/* Find the imports before the current location. */
		List<FileImport> imports = getAllFileImports(context);
		
		for (FileImport imp : imports) {
			@SuppressWarnings("unchecked")
			ArrayList<BSharpBlock> impBlocks = (ArrayList<BSharpBlock>)EcoreUtilJ.eFilter(imp.getFileReference(), blockFinder);
			
			result.addAll(impBlocks);
		}
		
		return result;
		
	}
	
	/* Does not include the current Block. The current block may well need to be searched separately as we
	 * don't want to include items below the search location. */
	public static List<BSharpBlock> findAllBlocksForBSClass(EObject context, BSClass tc) {
		ArrayList<BSharpBlock> result = new ArrayList<BSharpBlock>();
		SuperTypeList supers = tc.getSupertypes();
		
		EList<TypeBuilder> superTypes = supers.getSuperTypes();
		
		for (TypeBuilder tb : superTypes) {
			if (tb.isAbstractTypeClass()) {
				result.addAll(findAllBlocksForBSClass(context, (BSClass)tb));
			} else if (tb.isDatatype()) {
				result.addAll(findBlocksForType(context, (ClassDecl)tb));
			}
		}
		
		result.addAll(findBlocksForType(context, tc));
		
		return result;
	}
	
	/* This finds all the relevant blocks that are directly inherited for the current context. The local
	 * block is kept separate from the other blocks. This is because in the local block it is often
	 * desirable to only search up to the context object.
	 */
	static Tuple2<List<BSharpBlock>, BSharpBlock> findBlocksForContext(EObject context) {
		TopLevelInstance topLevel = EcoreUtil2.getContainerOfType(context, TopLevelInstance.class);
		if (topLevel == null) {
			return null;
		}
		
		List<BSharpBlock> blocks = null;
		ClassDecl searchDecl;
		
		if (topLevel instanceof Extend) {
			searchDecl = ((Extend)topLevel).getExtendedClass();
		} else {
			searchDecl = (ClassDecl)topLevel;
		}
		
		if (searchDecl instanceof BSClass) {
			blocks = findAllBlocksForBSClass(context, (BSClass)searchDecl);
		} else {
			blocks = findBlocksForType(context, searchDecl);
		}
		
		BSharpBlock localBlock = null;
		if (context != topLevel) {
			localBlock = topLevel.getBlock();
		}
		
		return new Tuple2<List<BSharpBlock>, BSharpBlock>(blocks, localBlock);
	}
	
	/* This finds the type that the context object is currently in, and then finds all the blocks relevent to 
	 * that type. It filters those blocks and the block that the context is in up to the context.
	 */
	public static List<? extends EObject> filterInscopeBSharpBlocks(EObject context, Function1<EObject, Boolean> filter) {
		Tuple2<List<BSharpBlock>, BSharpBlock> blocks = findBlocksForContext(context);
		
		ArrayList<EObject> result = new ArrayList<EObject>();
		
		if (blocks.x != null) {
			for (BSharpBlock block : blocks.x) {
				result.addAll(EcoreUtilJ.eFilter(block, filter));
			}
		}
		
		if (blocks.y != null) {
			result.addAll(EcoreUtilJ.eFilterUpToCurrentWith(context, filter));
		}
		
		return result;
	}
	
	public static List<? extends EObject> filterInscopeBSharpBlocksForClass(EObject context, ClassDecl tc, Function1<EObject, Boolean> filter) {
		/* need to be a bit careful, if context is in a block of the ClassDecl type then we don't want
		 * to filter the entire block that the context is part of (only up to the context object).
		 */
		
		TopLevelInstance topLevel = EcoreUtil2.getContainerOfType(context, TopLevelInstance.class);
		if (topLevel != null) {
			ClassDecl classDecl = topLevel instanceof ClassDecl ? (ClassDecl)topLevel : ((Extend)topLevel).getExtendedClass();
			if (classDecl == tc) {
				return filterInscopeBSharpBlocks(context, filter);
			}
		}
		
		List<BSharpBlock> blocks = findBlocksForType(context, tc);
		ArrayList<EObject> result = new ArrayList<EObject>();
		
		for (BSharpBlock block : blocks) {
			result.addAll(EcoreUtilJ.eFilter(block, filter));
		}
		
		return result;
	}
	
	public static EObject findFirstInSupertypeScope(EObject context, Function1<EObject, Boolean> filter) {
		Tuple2<List<BSharpBlock>, BSharpBlock> blocks = findBlocksForContext(context);
		
		if (blocks.y != null) {
			EObject result = EcoreUtilJ.eFindFirstBeforeCurrent(context, filter);
			if (result != null)
				return result;
		}
		
		if (blocks.x != null) {
			for (BSharpBlock block : blocks.x) {
				EObject result = EcoreUtilJ.eFindFirstWithRoot(block, filter);
				if (result != null)
					return result;
				
			}
		}
		
		return null;
	}
	
	public static ITypeInstance getTypeInstance(EObject context) {
		IExpressionContainer exprContainer = EcoreUtil2.getContainerOfType(context, IExpressionContainer.class);
		return exprContainer.getInferredTypeInstance();
	}
	
	public static IClassInstance getClassInstance(EObject context) {
		IClassInstance result = EcoreUtil2.getContainerOfType(context, IClassInstance.class);
		if (result != null)
			return result;
		
		/* It's possible we're in an Extend. */
		Extend extend = EcoreUtil2.getContainerOfType(context, Extend.class);
		if (extend != null) {
			return extend.getExtendedClass();
		}
		
		return null;
	}
	
	/* removes elements matching the filter. */
	public static <T> void filterCollection(Collection<T> col, Function1<T, Boolean> filter) {
		Iterator<T> iter = col.iterator();
		T next;
		while (iter.hasNext()) {
			next = iter.next();
			if (filter.apply(next))
				iter.remove();
					
		}
	}
	
	public static <T> boolean collectionContainsObjectMatching(Collection<T> col, Function1<T, Boolean> filter) {
		Iterator<T> iter = col.iterator();
		T next;
		while (iter.hasNext()) {
			next = iter.next();
			if (filter.apply(next))
				return true;
					
		}
		
		return false;
	}
	
	public static <T> T collectionFirstObjectMatchingLambda(Collection<T> col, Function1<T, Boolean> filter) {
		Iterator<T> iter = col.iterator();
		T next;
		while (iter.hasNext()) {
			next = iter.next();
			if (filter.apply(next))
				return next;
					
		}
		
		return null;
	}
	
	public static void compileTopLevelInstances(List<TopLevelInstance> instances, IProgressMonitor monitor) {
		SubMonitor subMonitor = SubMonitor.convert(monitor, 20 * instances.size());
		for (TopLevelInstance inst : instances) {
			try {
				inst.compile(subMonitor.newChild(20));
			} catch (Exception e) {
				System.err.println("Failed to compile TopLevelInstance: " + inst.getName());
				e.printStackTrace();
			}
			
		}
	}
}
