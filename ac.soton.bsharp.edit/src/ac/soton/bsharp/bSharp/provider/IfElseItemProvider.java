/**
 * generated by Xtext 2.14.0
 */
package ac.soton.bsharp.bSharp.provider;


import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.BSharpPackage;
import ac.soton.bsharp.bSharp.IfElse;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ac.soton.bsharp.bSharp.IfElse} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfElseItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfElseItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(BSharpPackage.Literals.IF_ELSE__CONDITION);
			childrenFeatures.add(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR);
			childrenFeatures.add(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR);
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
	 * This returns IfElse.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfElse"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_IfElse_type");
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

		switch (notification.getFeatureID(IfElse.class)) {
			case BSharpPackage.IF_ELSE__CONDITION:
			case BSharpPackage.IF_ELSE__IF_TRUE_EXPR:
			case BSharpPackage.IF_ELSE__IF_FALSE_EXPR:
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
				(BSharpPackage.Literals.IF_ELSE__CONDITION,
				 BSharpFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__CONDITION,
				 BSharpFactory.eINSTANCE.createBracket()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__CONDITION,
				 BSharpFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__CONDITION,
				 BSharpFactory.eINSTANCE.createIfElse()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__CONDITION,
				 BSharpFactory.eINSTANCE.createInfix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__CONDITION,
				 BSharpFactory.eINSTANCE.createMatchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__CONDITION,
				 BSharpFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__CONDITION,
				 BSharpFactory.eINSTANCE.createQuantLambda()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR,
				 BSharpFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR,
				 BSharpFactory.eINSTANCE.createBracket()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR,
				 BSharpFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR,
				 BSharpFactory.eINSTANCE.createIfElse()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR,
				 BSharpFactory.eINSTANCE.createInfix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR,
				 BSharpFactory.eINSTANCE.createMatchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR,
				 BSharpFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR,
				 BSharpFactory.eINSTANCE.createQuantLambda()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR,
				 BSharpFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR,
				 BSharpFactory.eINSTANCE.createBracket()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR,
				 BSharpFactory.eINSTANCE.createFunctionCall()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR,
				 BSharpFactory.eINSTANCE.createIfElse()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR,
				 BSharpFactory.eINSTANCE.createInfix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR,
				 BSharpFactory.eINSTANCE.createMatchStatement()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR,
				 BSharpFactory.eINSTANCE.createPrefix()));

		newChildDescriptors.add
			(createChildParameter
				(BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR,
				 BSharpFactory.eINSTANCE.createQuantLambda()));
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
			childFeature == BSharpPackage.Literals.IF_ELSE__CONDITION ||
			childFeature == BSharpPackage.Literals.IF_ELSE__IF_TRUE_EXPR ||
			childFeature == BSharpPackage.Literals.IF_ELSE__IF_FALSE_EXPR;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
