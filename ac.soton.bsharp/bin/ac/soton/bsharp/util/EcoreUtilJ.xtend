package ac.soton.bsharp.util

import org.eclipse.xtext.EcoreUtil2
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.lib.Functions.Function1

class EcoreUtilJ extends EcoreUtil2 {
		/* Finds the root of the current context and filters up to the current context using the filter */
	static def ArrayList<? extends EObject> eFilterUpToCurrentWith(EObject context, Function1<EObject, Boolean> filter) {
		val root = EcoreUtil2.getRootContainer(context)
		return eFilterUpToWith(root, [object | object == context], filter)
	}
	
	static def ArrayList<? extends EObject> eFilterUpToIncludingCurrentWith(EObject context, Function1<EObject, Boolean> filter) {
		val root = EcoreUtil2.getRootContainer(context)
		return eFilterUpToIncludingWith(root, [object | object == context], filter)
	}
	
	static def ArrayList<? extends EObject> eFilterUpToWith(EObject tree, Function1<EObject, Boolean> stopFilter,
		Function1<EObject, Boolean> objectFilter) {
		val iterable = tree.eAllContents
		val result = new ArrayList<EObject>()
		if (!iterable.hasNext)
			return result
			
		var EObject next = iterable.next

		while (!stopFilter.apply(next)) {
			if (objectFilter.apply(next))
				result.add(next)

			if (!iterable.hasNext)
				return result
				
			next = iterable.next
		}

		return result
	}
	
	/* This function iterates over the tree from left to right, and depth first. It will stop after
	 * scanning the children of the deepest object that matches the stop filter even if a shallower match has been 
	 * found.
	 */
	static def ArrayList<? extends EObject> eFilterUpToIncludingWith(EObject tree, Function1<EObject, Boolean> stopFilter,
		Function1<EObject, Boolean> objectFilter) {
			var resultArray = new ArrayList<EObject>
			eFilterUpToIncludingWithInternal(tree, stopFilter, objectFilter, resultArray)
			
			return resultArray
		}
	
	private static def Boolean eFilterUpToIncludingWithInternal(EObject tree, Function1<EObject, Boolean> stopFilter,
		Function1<EObject, Boolean> objectFilter, ArrayList<EObject> result) {
		if (objectFilter.apply(tree))
			result.add(tree)
			
		val contents = tree.eContents
		if (contents === null) {
			return stopFilter.apply(tree)
		}
			
		
		val iterable = tree.eContents.iterator
		var EObject next = null

		do {
			if (!iterable.hasNext)
				return false
				
			next = iterable.next

			if (eFilterUpToIncludingWithInternal(next, stopFilter, objectFilter, result)) {					
				return true
			}

		} while (!stopFilter.apply(next))

		return false
	}
	
	/* Does not scan the current object. */
	static def EObject eContainerMatchingLambda(EObject context, Function1<EObject, Boolean> criteria) {
		val parent = context.eContainer
		if (parent === null) {
			return null
		}
		
		if (criteria.apply(parent)) {
			return parent
		}
		
		eContainerMatchingLambda(parent, criteria)
	}
	
	static def EObject getObjectMatchingLambda(EObject context, Function1<EObject, Boolean> criteria) {
		if (criteria.apply(context))
			return context;
			
		if (context.eContents === null)
			return null;
			
		for (child : context.eContents) {
			val res = getObjectMatchingLambda(child, criteria)
			if (res !== null)
				return res;
				
		}
		
		return null;
	}
}