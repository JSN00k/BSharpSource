/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.ClassDecl;
import ac.soton.bsharp.bSharp.ConstructedType;
import ac.soton.bsharp.bSharp.PolyContext;
import ac.soton.bsharp.bSharp.BSClass;
import ac.soton.bsharp.bSharp.SuperTypeList;
import ac.soton.bsharp.bSharp.TypeConstructor;
import ac.soton.bsharp.bSharp.TypeStructure;
import ac.soton.bsharp.bSharp.TypedVariable;
import ac.soton.bsharp.bSharp.Where;
import ac.soton.bsharp.theory.util.TheoryImportCache;
import ac.soton.bsharp.theory.util.TheoryUtils;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.eventb.core.ast.extension.IOperatorProperties.FormulaType;
import org.eventb.core.ast.extension.IOperatorProperties.Notation;
import org.eventb.theory.core.INewOperatorDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bpp Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BSClassImpl#getSupertypes <em>Supertypes</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BSClassImpl#getVarList <em>Var List</em>}</li>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.BSClassImpl#getWhere <em>Where</em>}</li>
 * </ul>
 */
public class BSClassImpl extends ClassDeclImpl implements BSClass {
	/**
	 * The cached value of the '{@link #getSupertypes() <em>Supertypes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypes()
	 * @generated
	 * @ordered
	 */
	protected SuperTypeList supertypes;

	/**
	 * The cached value of the '{@link #getVarList() <em>Var List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarList()
	 * @generated
	 * @ordered
	 */
	protected TypeStructure varList;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Where where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BSClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.BS_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperTypeList getSupertypes() {
		return supertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertypes(SuperTypeList newSupertypes, NotificationChain msgs) {
		SuperTypeList oldSupertypes = supertypes;
		supertypes = newSupertypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__SUPERTYPES, oldSupertypes, newSupertypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertypes(SuperTypeList newSupertypes) {
		if (newSupertypes != supertypes) {
			NotificationChain msgs = null;
			if (supertypes != null)
				msgs = ((InternalEObject)supertypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__SUPERTYPES, null, msgs);
			if (newSupertypes != null)
				msgs = ((InternalEObject)newSupertypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__SUPERTYPES, null, msgs);
			msgs = basicSetSupertypes(newSupertypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__SUPERTYPES, newSupertypes, newSupertypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeStructure getVarList() {
		return varList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarList(TypeStructure newVarList, NotificationChain msgs) {
		TypeStructure oldVarList = varList;
		varList = newVarList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__VAR_LIST, oldVarList, newVarList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarList(TypeStructure newVarList) {
		if (newVarList != varList) {
			NotificationChain msgs = null;
			if (varList != null)
				msgs = ((InternalEObject)varList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__VAR_LIST, null, msgs);
			if (newVarList != null)
				msgs = ((InternalEObject)newVarList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__VAR_LIST, null, msgs);
			msgs = basicSetVarList(newVarList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__VAR_LIST, newVarList, newVarList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Where newWhere, NotificationChain msgs) {
		Where oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Where newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.BS_CLASS__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.BS_CLASS__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				return basicSetSupertypes(null, msgs);
			case BSharpPackage.BS_CLASS__VAR_LIST:
				return basicSetVarList(null, msgs);
			case BSharpPackage.BS_CLASS__WHERE:
				return basicSetWhere(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				return getSupertypes();
			case BSharpPackage.BS_CLASS__VAR_LIST:
				return getVarList();
			case BSharpPackage.BS_CLASS__WHERE:
				return getWhere();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				setSupertypes((SuperTypeList)newValue);
				return;
			case BSharpPackage.BS_CLASS__VAR_LIST:
				setVarList((TypeStructure)newValue);
				return;
			case BSharpPackage.BS_CLASS__WHERE:
				setWhere((Where)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				setSupertypes((SuperTypeList)null);
				return;
			case BSharpPackage.BS_CLASS__VAR_LIST:
				setVarList((TypeStructure)null);
				return;
			case BSharpPackage.BS_CLASS__WHERE:
				setWhere((Where)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BSharpPackage.BS_CLASS__SUPERTYPES:
				return supertypes != null;
			case BSharpPackage.BS_CLASS__VAR_LIST:
				return varList != null;
			case BSharpPackage.BS_CLASS__WHERE:
				return where != null;
		}
		return super.eIsSet(featureID);
	}

	public Collection<EObject> getVariablesNames() {		
		ArrayList<EObject> result = new ArrayList<EObject>();
		
		result.add(this);
		if (varList == null) {
			return result;
		}
		
		result.addAll(EcoreUtil2.getAllContentsOfType(varList, TypedVariable.class));
		return result;
	}
	
	private TheoryImportCache thyCache;
	protected IProgressMonitor nullMonitor = new NullProgressMonitor();
	private ArrayList<String> inferredTypes = null;
	
	public void setupCompilation(TheoryImportCache theoryCache) {
		thyCache = theoryCache;
	}
	
	/* This get's the number of polymorhic types required to construct the type class */
	public Integer eventBRequiredPolyTypes() {
		if (context != null) {
			return context.eventBPolyVarCount();
		} else if (supertypes != null) {
			/* The polyContext is inferred from the supertype. */
			ConstructedType superclass = supertypes.getFirst();
			if (superclass == null)
				return 1;
			
			BSClass sup = (BSClass)((TypeConstructor)superclass).getTypeName();
			return sup.eventBRequiredPolyTypes();
		}
		
		return 1;
	}
	
	/* Compiles the operator used to create an instance of this type class. */
	public void compileOp() throws Exception {
		INewOperatorDefinition op;
		try {
			op = TheoryUtils.createOperator(thyCache.theory,
					getName(), false, false, FormulaType.EXPRESSION, Notation.POSTFIX, null, nullMonitor);
		} catch (Exception e) {
			System.err.println(" Unable to crate EventB operator " + e.getLocalizedMessage());
			return;
		}
		
		/* This creates the type variables for the EventB operator and creates arguments on
		 * the EventB operator so these type variables can then be used.
		 */
		if (context != null) {
			context.setupCompilation(thyCache);
			context.compileToBSClassOpArgs(op);
		}
		
		String instName = name + "Inst";
		
		String opString = "{ " + instName;
		
		if (varList != null) {
			opString += varList.stringForArgsToSetCompVarList();
		}
		
		opString += "| ";
		
		EList<ConstructedType> supertypeList = null;
		if (supertypes != null) {
			supertypeList = supertypes.getSuperTypes();
		}
		
		if (supertypeList != null && !supertypeList.isEmpty()) {
			Boolean first = true;
			for (ConstructedType constType : supertypeList) {
				if (!first) {
					opString += "∧";
				}				
				first = false;
				
				int inferredTypeCount = constType.inferredTypeCount();
				if (inferredTypeCount != 0) {
					/* We shouldn't be inferring types if there are declared types. */
					if (context.polyTypesCount() != 0)
						throw new Exception("Classes which infer types should not also have polyTypes," +
								"this should be checked for during validation");
					
					if (inferredTypes == null)
						inferredTypes = new ArrayList<String>();
					
					/* This adds extra inferred types to the inferredTypes array. if there aren't enough
					 * inferred types it adds extra, I'm not sure this is a possible situation, as I think
					 * we should validate against it.
					 */
					for (int i = inferredTypes.size(); i < inferredTypeCount; ++i) {
						// As there aren't any types in the polytype variable I can name these whatever
						// I like
						String inferredTypeName = "Ty" + String.valueOf(i);
						String eventBTypeParamName = thyCache.getEventBTypeParamNameForName(inferredTypeName);

						TheoryUtils.createArgument(op, inferredTypeName, "ℙ(" + eventBTypeParamName + ")", null,
								nullMonitor);
						
						inferredTypes.add(inferredTypeName);
					}
				}
				
				opString += instName + " ∈ " + constType.buildEventBType(inferredTypes);
			}
		}
		
		TheoryUtils.createDirectDefinition(op, opString, null, nullMonitor);
	}

	@Override
	public String constructWithEventBPolytypes(ArrayList<String> eventBPolytypes) {
		String result = name +  "(";
		if (context == null) {
			result += eventBPolytypes.get(0) + ")";
			return result;
		}
		
		result += context.constructCallArgsForBSClassWithTypes(eventBPolytypes) + ")";
		return result;
	}	
} //BppClassImpl
