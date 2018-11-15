/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.TypeBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TypeBuilderImpl extends MinimalEObjectImpl.Container implements TypeBuilder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.TYPE_BUILDER;
	}
	
	@Override
	public Integer inferredTypeCount() {
		return 0;
	}
	

	@Override
	public boolean isAbstractTypeClass() {
		return false;
	}
	
	@Override
	public BSClass getTypeClass() {
		return null;
	}
	
	@Override
	public boolean isBoolType() {
		return false;
	}
	
	protected boolean isOrdered;
	
	/* Iterates through the type tree finding the paths to primative types (Types contained in TypeConstructors)
	 * These are stored in the paths HashMap
	 */
	void getPrimativeTypePathsByDeconstructionInternal( 
			ArrayList<Integer> currentPath, LinkedHashMap<String, ArrayList<Integer>> paths) {
		/* Handled by the subtypes. */
	}
	
	@Override
	public String getPrimativeTypesListByDeconstruction(String baseTypeOfPoly) {
		reorderTypeTree();
		LinkedHashMap<String, ArrayList<Integer>> paths = new LinkedHashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> currentPath = new ArrayList<Integer>();
		
		getPrimativeTypePathsByDeconstructionInternal(currentPath, paths);
		String result = "";
		
		Boolean first = true;
		for (Map.Entry<String, ArrayList<Integer>> entry : paths.entrySet()) {
			if (!first) {
				result += ", ";
			}
			first = false;
			
			ArrayList<Integer> path = entry.getValue();
			
			for (Integer i : path) {
				result += "prj" + i.toString() + "(";
			}
			
			result += baseTypeOfPoly;
			
			for (int i = 0; i < path.size(); ++i) {
				result += ")";
			}
		}
		
		return result;
	}
	
	@Override
	public String constructWithTypes(ArrayList<String> requiredEBTypes) {
		reorderTypeTree();
		HashMap<String, String> typeNameMap = new HashMap<String, String>();
		return constructWithTypesInternal(requiredEBTypes, typeNameMap);
	}

	String constructWithTypesInternal(ArrayList<String> requiredEBTypes, HashMap<String, String> typeNameMap) {
		/* Implemented by sub-types. */
		return null;
	}
	
} //TypeBuilderImpl