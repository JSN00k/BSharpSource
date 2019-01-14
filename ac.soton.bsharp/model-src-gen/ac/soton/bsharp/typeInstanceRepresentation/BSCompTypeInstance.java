package ac.soton.bsharp.typeInstanceRepresentation;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.util.CompilationUtil;
import ac.soton.bsharp.bSharp.util.Tuple2;

/* This is for when compiling a type class. Any type that requested that is of the supertype uses the 
 * super type to find the definition of the instance. Any instance of the top most type simply returns 
 * the name of the instance.
 */
public class BSCompTypeInstance extends TypeInstanceAbstract {
	
	protected ITypeInstance superInstance;
	protected ClassDecl classDecl;

	public BSCompTypeInstance(BSClass decl, ArrayList<Tuple2<String, String>> constrTypes, String instName, EObject context) {
		this.context = context;
		ClassDecl superType = decl.getFirstSupertypeTypeClass();
		classDecl = decl;
		superInstance = new StringTypeInstance(superType, constrTypes, instName, context);
	}
	
	@Override
	public ClassDecl bSharpType() {
		return classDecl;
	}

	@Override
	public ArrayList<String> typeConstructionTypes() {
		return superInstance.typeConstructionTypes();
	}

	@Override
	public ArrayList<Tuple2<String, String>> typingStatementForInstance() {
		/* This won't be used. */
		return null;
	}

	@Override
	public String eventBTypeInstance() {
		// This won't be called, as we won't use the instance of the type class within the declaration of the type class. */
		return null;
	}

	@Override
	public ArrayList<String> typeAndVariableNames() {
		// Again I don't believe that this will be used.
		return null;
	}

	@Override
	public String eventBTypeInstanceForType(ClassDecl type) {
		return superInstance.eventBTypeInstanceForType(type);
	}
	
	@Override
	public String baseTypeDeconstructedToPrimativeTypes(TypeBuilder baseTypeOfPoly) {
		return superInstance.baseTypeDeconstructedToPrimativeTypes(baseTypeOfPoly);
	}
	
	@Override
	public String baseTypeString() {
		return superInstance.baseTypeString();
	}
	
	@Override
	public String compiledTypeVariable(TypedVariable typedVariable) {
		ClassDecl variableContainer = EcoreUtil2.getContainerOfType(typedVariable, ClassDecl.class);
		if (variableContainer == classDecl) {
			return typedVariable.getName();
		}
		
		return superInstance.compiledTypeVariable(typedVariable);
	}
}
