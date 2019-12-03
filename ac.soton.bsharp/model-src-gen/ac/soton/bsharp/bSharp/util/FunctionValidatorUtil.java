package ac.soton.bsharp.bSharp.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.DatatypeConstructor;
import ac.soton.bsharp.bSharp.ExpressionVariable;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.IVariableProvider;
import ac.soton.bsharp.bSharp.MatchCase;
import ac.soton.bsharp.bSharp.QuantLambda;
import ac.soton.bsharp.bSharp.ReferencingFunc;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TopLevelInstance;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.TypedVariableList;
import ac.soton.bsharp.util.EcoreUtilJ;

/* A library of functions to get all possible references that can be used as a function call. */
public class FunctionValidatorUtil {
	/* To handle the fact that some Expression variables hide other expression variables a 
	 * additional class is added to wrap ExpressionVariables and implement the hash methods.
	 * This encapsulation class makes all expression variables with the same name equal 
	 * unless they are both functions (functions do not hide each other in scope.
	 *  The result of this is that You can add the objects 
	 * from the inner scope first, and any objects from the outer scope with the same name
	 * will end up hidden.
	 */
	public static class ExpressionVariableWrapper {
		ExpressionVariable exprVar;
		public ExpressionVariableWrapper(ExpressionVariable e) {
			exprVar = e;
		}
		
		@Override
		public int hashCode() {
			return exprVar.getName().hashCode();
		}

		/* This equals method is not transitive! I hope that's ok with everybody. */
		@Override
		public boolean equals(Object o) {
			if (!(o instanceof ExpressionVariableWrapper)) {
				return false;
			}
			
			ExpressionVariableWrapper other = (ExpressionVariableWrapper)o;
			if (isGlobalFuncType(exprVar) && isGlobalFuncType(other.exprVar)) {
				return exprVar.equals(other.exprVar);
			}
			 
			return exprVar.getName().equals(other.exprVar.getName());
		}
	}
	
	public static void addAllExpressionVariablesToWrapped(HashSet<ExpressionVariableWrapper> wrappedSet,
			Collection<? extends ExpressionVariable> exprVars) {
		for (ExpressionVariable e : exprVars) {
			wrappedSet.add(new ExpressionVariableWrapper(e));
		}
	}
	
	/* Tests if the expression variable is globally visible, or local to the
	 * typebody it is currently in.
	 */
	public static boolean isGlobalFuncType(ExpressionVariable e) {
		return e instanceof FunctionDecl || e instanceof DatatypeConstructor 
				|| EcoreUtil2.getContainerOfType(e, DatatypeConstructor.class) != null;
	}
	
	public static void addDatatypeConstructorsAndDestructors(Datatype d, HashSet<ExpressionVariableWrapper> s) {
		List<DatatypeConstructor> constructors = d.getConstructors();
		
		for (DatatypeConstructor dc : constructors) {
			TypedVariableList tvList = dc.getDecons();
			
			if (tvList == null)
				continue;
			
			
			List<TypedVariable> typed = tvList.getTypedVariables();
			if (typed != null)
				addAllExpressionVariablesToWrapped(s, typed);
		}
		
		addAllExpressionVariablesToWrapped(s, constructors);
	}
	
	public static void addTypedVariableForBSClass(BSClass c, HashSet<ExpressionVariableWrapper> s) {
		TypedVariableList tvList = c.getVarList();
		if (tvList != null) {
			List<TypedVariable> typed = tvList.getTypedVariables();
			addAllExpressionVariablesToWrapped(s, typed);
		}
		
		SuperTypeList stList = c.getSupertypes();
		if (stList != null) {
			List<TypeBuilder> supers = stList.getSuperTypes();
			
			for (TypeBuilder tb : supers) {
				BSClass superClass = tb.getTypeClass();
				if (superClass != null) {
					addTypedVariableForBSClass(superClass, s);
				}
				
				if (tb.isDatatype()) {
					
				}
			}
		}		
	}
	
	public static void addTypedVariableForExpression(EObject context, HashSet<ExpressionVariableWrapper> s) {
		/* getContainerOfType() includes the EObject used as the context. As a result if you do not do context.eContainer()
		 * you get unterminated recursion.
		 */
		IVariableProvider provAbove = EcoreUtil2.getContainerOfType(context.eContainer(), IVariableProvider.class);
		/* Referencing Funcs are only ever called, so should never add variables to an expression
		 * They can appear in this context because of instance statements.
		 */
		if (context instanceof FunctionDecl && !(context instanceof ReferencingFunc)) {
			addAllExpressionVariablesToWrapped(s, ((FunctionDecl)context).getVariablesNames());
			return;
		}
		
		if (context instanceof MatchCase || context instanceof QuantLambda) {
			addAllExpressionVariablesToWrapped(s, ((IVariableProvider)context).getVariablesNames());
		}
		
		if (provAbove != null)
			addTypedVariableForExpression(provAbove, s);
		
		return;
	}
	
	public static void addLocalFunctions(EObject context, HashSet<ExpressionVariableWrapper> s) {
		@SuppressWarnings("unchecked")
		List<FunctionDecl> localFuncs = (List<FunctionDecl>) EcoreUtilJ.eFilterUpToIncludingCurrentWith(context, new Function1<EObject, Boolean>() {
			public Boolean apply(EObject e) {
				return e instanceof FunctionDecl || e instanceof DatatypeConstructor
						|| (e instanceof TypedVariable 
								&& EcoreUtil2.getContainerOfType(e, DatatypeConstructor.class) != null);
			}
		});
		
		addAllExpressionVariablesToWrapped(s, localFuncs);
	}
	
	public static void addImportedFunctions(EObject context, HashSet<ExpressionVariableWrapper> s) {
		List<TopLevelInstance> topLevel = CompilationUtil.getAllImportedTopLevelInstances(context);
		
		for (TopLevelInstance inst: topLevel) {
			Collection<FunctionDecl> funcs = EcoreUtil2.getAllContentsOfType(inst, FunctionDecl.class);
			addAllExpressionVariablesToWrapped(s, funcs);
			Collection<Datatype> datatypes = EcoreUtil2.eAllOfType(inst, Datatype.class);
			for (Datatype d : datatypes)
				addDatatypeConstructorsAndDestructors(d, s);
		}
	}
	
	public static HashSet<ExpressionVariable> unwrapWrappedExpressions(Collection<ExpressionVariableWrapper> c) {
		HashSet<ExpressionVariable> result = new HashSet<ExpressionVariable>();
		for (ExpressionVariableWrapper e : c) {
			result.add(e.exprVar);
		}
		
		return result;
	}
	
	/* Any in scope ExpressionVariables, this includes local variables, class variables
	 * ,datatype constructors/destructors, and functions in the local file, or imported 
	 * from other files.
	 */
	public static HashSet<ExpressionVariable> allInscopeExpressionVariables (EObject context) {
		HashSet<ExpressionVariableWrapper> variables = new HashSet<ExpressionVariableWrapper>();
		addTypedVariableForExpression(context, variables);
		ClassDecl c = CompilationUtil.getClassDecl(context);
		if (c instanceof BSClass) {
			variables.add(new ExpressionVariableWrapper(((BSClass) c).getInstName()));
			addTypedVariableForBSClass((BSClass)c, variables);
		}
		
		addLocalFunctions(context, variables);
		addImportedFunctions(context, variables);
		
		return unwrapWrappedExpressions(variables);
	}
}
