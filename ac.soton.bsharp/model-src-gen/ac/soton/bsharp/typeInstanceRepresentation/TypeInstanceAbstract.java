package ac.soton.bsharp.typeInstanceRepresentation;

import org.eclipse.emf.ecore.EObject;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.Datatype;
import ac.soton.bsharp.bSharp.TypeBuilder;
import ac.soton.bsharp.bSharp.util.CompilationUtil;

public abstract class TypeInstanceAbstract implements ITypeInstance {

	@Override
	public String eventBTypeInstanceForType(ClassDecl type) {
		ClassDecl classDecl = bSharpType();
		
		if (type instanceof Datatype && classDecl instanceof Datatype) {
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
		
		if (classDecl instanceof Datatype) {
			return instanceString;
		}
		
		int prjsRequired = ((BSClass)classDecl).prjsRequiredForBaseType();
		
		return CompilationUtil.wrapNameInPrj1s(instanceString, prjsRequired);
	}
}
