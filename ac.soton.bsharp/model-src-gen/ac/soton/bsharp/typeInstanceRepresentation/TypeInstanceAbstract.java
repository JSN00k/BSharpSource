package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FuncCallArgs;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.FunctionDecl;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.impl.FunctionDeclImpl;
import ac.soton.bsharp.bSharp.util.CompilationUtil;

public abstract class TypeInstanceAbstract implements ITypeInstance {
	
	protected EObject context;
	
	boolean isInferredTypeInstance = false;
	
	@Override
	public boolean isInferredTypeInst() {
		return isInferredTypeInstance;
	}
	
	@Override
	public void setIsInferredTypeInst(boolean isInferred) {
		isInferredTypeInstance = isInferred;
	}
	
	@Override
	public EObject getContext() {
		// TODO Auto-generated method stub
		return context;
	}

	@Override
	public String eventBTypeInstanceForType(ClassDecl type) {
		/* It's possible that the bsharpType returns null if there is an instance that 
		 * represents a constructed type (this happens during compilation of type classes 
		 * that don't have a super type.
		 */
		ClassDecl classDecl = bSharpType();
		
		if (type instanceof Datatype && (classDecl == null || classDecl instanceof Datatype)) {
			return eventBTypeInstance();
		}
		
		int prjsRequired;
		if (type instanceof Datatype) {
			prjsRequired = ((BSClass)classDecl).prjsRequiredForBaseType();
		} else {
			prjsRequired = ((BSClass)classDecl).prjsRequiredForSupertype((BSClass)type);
		}
		
		return CompilationUtil.wrapNameInPrj1s(eventBTypeInstance(), prjsRequired);
	}

	@Override
	public String baseTypeDeconstructedToPrimativeTypes(TypeBuilder baseTypeOfPoly) {
		String baseTypeString = baseTypeString();		
		return baseTypeOfPoly.getPrimativeTypesListByDeconstruction(baseTypeString);
	}
	
	@Override
	public String baseTypeString() {
		ClassDecl classDecl = bSharpType();
		String instanceString = eventBTypeInstance();
		
		
		if (classDecl == null || classDecl instanceof Datatype) {
			return instanceString;
		}
		
		int prjsRequired = ((BSClass)classDecl).prjsRequiredForBaseType();
		
		return CompilationUtil.wrapNameInPrj1s(instanceString, prjsRequired);
	}
	
	@Override
	public String compiledTypeVariable(TypedVariable typedVariable) {
		ClassDecl variableContainer = EcoreUtil2.getContainerOfType(typedVariable, ClassDecl.class);
		
		
		if (variableContainer instanceof Datatype) {
			return ((Datatype)variableContainer).eventBPrefix() + "_" + typedVariable.getName();
		}
		
		ClassDecl bSharpType = bSharpType();
		
		String evBClass = eventBTypeInstanceForType(variableContainer);
		
		String getterOp = ((BSClass)bSharpType).getterForOpName(typedVariable.getName()) + "(";
		getterOp += ((BSClass)bSharpType).deconstructEventBTypeToArguments(evBClass) + ")";
		return getterOp;
	}
	
	@Override 
	public String compileFunctionCallOfTypeInstance(FunctionCall fc, Boolean asPred, TypedVariable typedVar) throws Exception {
		String result = compiledTypeVariable(typedVar);
		
		List<FuncCallArgs> fcas = fc.getFuncCallArgs();
		Iterator<FuncCallArgs> iter = fcas.iterator();
		
		while (iter.hasNext()) {
			List<Expression> args = iter.next().getArguments();
			String next = null;
			if (args != null && !args.isEmpty()) {
				try {
					next += "(" + CompilationUtil.compileExpressionListWithSeperator(args, " ↦ ") + ")";
				} catch (Exception e) {
					next = "Erorr compiling args";
					System.err.println("unable to compile variable list with error: " + e.getLocalizedMessage());
				}
				
				if (iter.hasNext()) {
					result += next;
				} else if (asPred) {
					result = next + "∈" + result;
				}
			}
		}
		
		return result;
	}
	
	@Override
	public String nameForFunctionDecl(FunctionDecl functionDecl) {
		return null;
	}
}
