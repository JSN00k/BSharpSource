package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eventb.core.ast.extension.IOperatorProperties.FormulaType;
import org.eventb.core.ast.extension.IOperatorProperties.Notation;
import org.eventb.theory.core.INewOperatorDefinition;

import ac.soton.bsharp.bSharp.Expression;
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
	
	public static INewOperatorDefinition createOpWithArgumentsAsPred(TheoryImportCache thyCache,
			String name, ArrayList<Tuple2<String, String>> args, Boolean asPred) throws Exception {
		INewOperatorDefinition op = TheoryUtils.createOperator(thyCache.theory, name, false, false, 
				asPred ? FormulaType.PREDICATE : FormulaType.EXPRESSION, Notation.PREFIX, null, nullMonitor);
		
		compileTypedVariablesToOperatorArgs(args, op);
		return op;
	}
	
	public static INewOperatorDefinition createOpWithArguments(TheoryImportCache thyCache,
			String name, ArrayList<Tuple2<String, String>> args) throws Exception {
		return createOpWithArgumentsAsPred(thyCache, name, args, false);
	}
	
	public static INewOperatorDefinition createPredOpWithArguments(TheoryImportCache thyCache,
			String name, ArrayList<Tuple2<String, String>> args) throws Exception {
		return createOpWithArgumentsAsPred(thyCache, name, args, true);
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
	
	public static String wrapNameInPrjs(String n, int ps) {
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
}
