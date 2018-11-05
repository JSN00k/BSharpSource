package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eventb.theory.core.INewOperatorDefinition;

import ac.soton.bsharp.bSharp.ITheoryImportCacheProvider;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;

public class CompilationUtil {
	
	protected static IProgressMonitor nullMonitor = new NullProgressMonitor();
	
	/* Compiles just the names (the first member of the tuple), with the provided separator.
	 * isFirst is a boolean that  */
	public static String compileTypedVariablesToNameListWithSeparator(ArrayList<Tuple2<String, String>> typedVars, 
			String separator, Boolean isFirst) {
		String sep = separator;
		if (typedVars == null) {
			return "";
		}
		
		if (sep == null) {
			sep = " ↦ ";
		}
		
		Boolean first = isFirst;
		String result = "";
		for (Tuple2<String, String> typedVar : typedVars) {
			if (!first) {
				result += sep;
			}
			first  = false;
			
			result += typedVar.x;
		}
		
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
	
	public static void compileTypedVariablesToOperatorArgs(ArrayList<Tuple2<String, String>> typedVars,
			INewOperatorDefinition op) throws Exception {
		for (Tuple2<String, String> typedArg : typedVars) {
			TheoryUtils.createArgument(op, typedArg.x, typedArg.y, null, nullMonitor);
		}
	}
}
