package ac.soton.bsharp.bSharp.util;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.linking.LinkingScopeProviderBinding;
import org.eventb.core.ast.extension.IOperator;
import org.eventb.core.ast.extension.IOperatorProperties;
import org.eventb.core.ast.extension.IOperatorProperties.FormulaType;
import org.eventb.core.ast.extension.IOperatorProperties.Notation;
import org.eventb.theory.core.INewOperatorDefinition;
import org.rodinp.core.IInternalElement;

import com.google.inject.Inject;

import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.Extend;
import ac.soton.bsharp.bSharp.ITheoryImportCacheProvider;
import ac.soton.bsharp.bSharp.TopLevelInstance;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;

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
	
	public static void compileTypedVariablesToOperatorArgs(ArrayList<Tuple2<String, String>> typedVars,
			INewOperatorDefinition op) throws Exception {
		for (Tuple2<String, String> typedArg : typedVars) {
			TheoryUtils.createArgument(op, typedArg.x, typedArg.y, null, nullMonitor);
		}
	}
	
	public static INewOperatorDefinition createOpWithArgumentsAsPred(TheoryImportCache thyCache,
			String name, ArrayList<Tuple2<String, String>> args, Notation notation, Boolean asPred) throws Exception {
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
			String name, ArrayList<Tuple2<String, String>> args, IOperatorProperties.Notation notation) throws Exception {
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
}
