package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.List;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.typesystem.internal.NoExpectation;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.Expression;
import ac.soton.bsharp.bSharp.FunctionCall;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.mapletTree.IMapletNode;
import ac.soton.bsharp.mapletTree.MapletExpressionLeaf;
import ac.soton.bsharp.mapletTree.MapletTree;

public abstract class TypeInstanceTreeAbstract extends TypeInstanceAbstract implements ITypeInstanceTree {
	@Override
	public IMapletNode treeForType(ClassDecl type) {
		ClassDecl classDecl = bSharpType();
		IMapletNode tree = getTree();
		
		if (type instanceof Datatype && classDecl instanceof Datatype)
			return tree;
		
		int prjsRequired;
		if (type instanceof Datatype) {
			prjsRequired = ((BSClass)classDecl).prjsRequiredForBaseType();
		} else {
			prjsRequired = ((BSClass)classDecl).prjsRequiredForSupertype((BSClass)type);
		}
		
		IMapletNode t = tree;
		for (int i = 0; i < prjsRequired; ++i) {
			t = ((MapletTree)t).left;
		}
		
		return t;
	}
	
	@Override
	public String eventBTypeInstanceForType(ClassDecl type) {
		return treeForType(type).compileToString();
	}
	
	public IMapletNode nodeForTypedVariable(TypedVariable typedVariable) {
		ClassDecl variableContainer = EcoreUtil2.getContainerOfType(typedVariable, ClassDecl.class);
		IMapletNode tree = treeForType(variableContainer);
		
		if (tree == null)
			return null;
		
		if (variableContainer instanceof Datatype)
			return tree;
		
		List<Integer> prjs = ((BSClass)variableContainer).prjsForTypedVariable(typedVariable);
		for (int i = prjs.size() - 1; i >= 0; --i) {
			int direction = prjs.get(i);
			
			if (direction == 1) {
				tree = ((MapletTree)tree).left;
			} else {
				tree = ((MapletTree)tree).right;
			}
		}
		
		return tree;
	}
	
	@Override
	public String compiledTypeVariable(TypedVariable typedVariable) {
		return nodeForTypedVariable(typedVariable).compileToString();
	}
	
	public IMapletNode nodeForBaseType() {
		ClassDecl classDecl = bSharpType();
		
		IMapletNode tree = treeForType(classDecl);
		
		if (classDecl instanceof Datatype) {
			return tree;
		} else {
			int prjsForBaseType = ((BSClass)classDecl).prjsRequiredForBaseType();
			for (int i = 0; i < prjsForBaseType; ++i) {
				tree = ((MapletTree)tree).left;
			}
		}
		
		return tree;
	}
	
	@Override
	public String baseTypeString() {
		return nodeForBaseType().compileToString();
	}
	
	@Override 
	public String compileFunctionCallOfTypeInstance(FunctionCall fc, Boolean asPred, TypedVariable typedVar) throws Exception {
		IMapletNode node = nodeForTypedVariable(typedVar);
		List<Expression> args = fc.getArguments();
		
		if (args == null || args.isEmpty() || !(node instanceof MapletExpressionLeaf)) {
			return super.compileFunctionCallOfTypeInstance(fc, asPred, typedVar);
		}
		
		Expression expr = ((MapletExpressionLeaf)node).expression();
		if (expr instanceof FunctionCall) {
			return ((FunctionCall)expr).compileToStringWithContextAndArguments(fc, asPred);
		}
		
		return super.compileFunctionCallOfTypeInstance(fc, asPred, typedVar);
	}
}