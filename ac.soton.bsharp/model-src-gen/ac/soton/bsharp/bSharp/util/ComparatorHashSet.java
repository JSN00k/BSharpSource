package ac.soton.bsharp.bSharp.util;

import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.xtext.xbase.lib.Functions.Function2;



public class ComparatorHashSet<E extends Comparable<E>> extends HashSet<E> {
	/** Never allows two objects that compare equal (via the Comparable type) to
	 * go into the array, also stops objects that the comparator function thinks are
	 * equal. Does not override the equals method to use the comparator. The comparator
	 * need not be symetric, in add(other) if (current comp other) is true other is not added
	 * if (other comp current) is true current is removed and other is added. 
	 */
	private static final long serialVersionUID = 4196226612689235839L;
	/* The object in the collection is always the first object. */
	private Function2<E, Object, Boolean> comparator;
	
	public ComparatorHashSet(Function2<E, Object, Boolean> comparator) {
		this.comparator = comparator;
	}
	
	@Override
	public boolean add(E other) {
		if (!contains(other)) {
			Iterator<E> iter = iterator();
			while(iter.hasNext()) {
				if (comparator.apply(other, iter.next())) {
					iter.remove();
				}
			}
			
			return super.add(other);
		}
		
		return false;
	}
	
	@Override
	public boolean contains(Object other) {		
		Iterator<E> iter = iterator();
		
		while(iter.hasNext()) {
			if (comparator.apply(iter.next(), other))
				return true;
		}
		
		return false;
	}
}
