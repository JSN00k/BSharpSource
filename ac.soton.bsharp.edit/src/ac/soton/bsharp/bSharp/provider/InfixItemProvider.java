/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.provider;


import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.Infix;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ac.soton.bsharp.bSharp.Infix} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InfixItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfixItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFuncNamePropertyDescriptor(object);
			addOpNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Func Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFuncNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Infix_funcName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Infix_funcName_feature", "_UI_Infix_type"),
				 BSharpPackage.Literals.INFIX__FUNC_NAME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Op Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Infix_opName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Infix_opName_feature", "_UI_Infix_type"),
				 BSharpPackage.Literals.INFIX__OP_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BSharpPackage.Literals.INFIX__LEFT);
			childrenFeatures.add(BSharpPackage.Literals.INFIX__RIGHT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Infix.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Infix"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Infix)object).getOpName();
		return label == null || label.length() == 0 ?
			getString("_UI_Infix_type") :
			getString("_UI_Infix_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Infix.class)) {
			case BSharpPackage.INFIX__OP_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BSharpPackage.INFIX__LEFT:
			case BSharpPackage.INFIX__RIGHT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__LEFT,
				 BSharpFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__LEFT,
				 BSharpFactory.eINSTANCE.createMatchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__LEFT,
				 BSharpFactory.eINSTANCE.createQuantLambda()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__LEFT,
				 BSharpFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__LEFT,
				 BSharpFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__LEFT,
				 BSharpFactory.eINSTANCE.createBracket()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__LEFT,
				 BSharpFactory.eINSTANCE.createInfix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__RIGHT,
				 BSharpFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__RIGHT,
				 BSharpFactory.eINSTANCE.createMatchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__RIGHT,
				 BSharpFactory.eINSTANCE.createQuantLambda()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__RIGHT,
				 BSharpFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__RIGHT,
				 BSharpFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__RIGHT,
				 BSharpFactory.eINSTANCE.createBracket()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.INFIX__RIGHT,
				 BSharpFactory.eINSTANCE.createInfix()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BSharpPackage.Literals.INFIX__LEFT ||
			childFeature == BSharpPackage.Literals.INFIX__RIGHT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}