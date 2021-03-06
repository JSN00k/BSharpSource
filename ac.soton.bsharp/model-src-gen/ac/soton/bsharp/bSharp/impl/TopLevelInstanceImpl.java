/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.impl;

import ac.soton.bsharp.bSharp.BSharpBlock;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Import;
import ac.soton.bsharp.bSharp.TopLevelFile;
import ac.soton.bsharp.bSharp.TopLevelImport;
import ac.soton.bsharp.bSharp.TopLevelInstance;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.xtext.EcoreUtil2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.bsharp.bSharp.impl.TopLevelInstanceImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TopLevelInstanceImpl extends NamedObjectImpl implements TopLevelInstance {
	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected BSharpBlock block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopLevelInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BSharpPackage.Literals.TOP_LEVEL_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSharpBlock getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(BSharpBlock newBlock, NotificationChain msgs) {
		BSharpBlock oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlock(BSharpBlock newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK:
				return basicSetBlock(null, msgs);
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
			case BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK:
				return getBlock();
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
			case BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK:
				setBlock((BSharpBlock)newValue);
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
			case BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK:
				setBlock((BSharpBlock)null);
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
			case BSharpPackage.TOP_LEVEL_INSTANCE__BLOCK:
				return block != null;
		}
		return super.eIsSet(featureID);
	}
	
	/* Returns null if there doesn't need to be an index suffix on the EventB file (i.e., the main file is
	 * imported). */
	@Override
	public Integer eventBImportIndex() {
		/* The index starts from zero, and is an enumberation of the bodyelements blocks. Body elements are
		 * either contained in the TopLevelFile (if no imports are made), or in a TopLevelImports declaration. */
		
		TopLevelFile topLevelFile = EcoreUtil2.getContainerOfType(this, TopLevelFile.class);
		
		List<TopLevelImport> topLevelImports = topLevelFile.getTopLevelImports();
		if (topLevelImports == null || topLevelImports.isEmpty()) {
			/* If there are no topLevelImports then there must only be on set of import elements
			 * so there is no need for an index.
			 */
			return null;
		}
		
		Integer firstNdx = 0;
		List<TopLevelInstance> noImportElements = topLevelFile.getNoImportElements();
		if (noImportElements != null && !noImportElements.isEmpty()) {
			if (noImportElements.contains(this))
				return 0;
			
			firstNdx++;
		}
		
		TopLevelImport myImport = EcoreUtil2.getContainerOfType(this, TopLevelImport.class);
		Integer myIndex = topLevelImports.indexOf(myImport);
		
		if (myIndex == topLevelImports.size() - 1) {
			return null;
		}
		
		return myIndex + firstNdx;
	}

} //TopLevelInstanceImpl
