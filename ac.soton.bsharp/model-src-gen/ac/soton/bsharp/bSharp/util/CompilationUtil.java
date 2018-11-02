package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

import org.eventb.theory.core.INewOperatorDefinition;

import ac.soton.bsharp.theory.util.TheoryImportCache;

public class CompilationUtil {
	/* Compiles just the names (the first member of the tuple), with the provided separator.
	 * isFirst is a boolean that  */
	String compileTypedVariablesToNameListWithSeparator(ArrayList<Tuple2<String, String>> typedVars, 
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
	
	String compileTypedVaribalesToTypedList(ArrayList<Tuple2<String, String>> typedVars, Boolean isFirst) {
		if (typedVars == null || typedVars.isEmpty())
			return "";
		
		Boolean first = isFirst;
		String result = "";
		
		for (Tuple2<String, String> typedVar : typedVars) {
			if (!first) {
				result += " ∧ ";
			}
			
			result += typedVar.x + " ∈ " + typedVar.y;
		}
		
		return result;
	}
	
	void compileTypedVariablesToOperatorArgs(ArrayList<Tuple2<String, String>> typedVars,
			INewOperatorDefinition op, TheoryImportCache thyCache) {
		
	}
}
