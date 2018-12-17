package ac.soton.bsharp.bSharp.util;

import java.util.ArrayList;

public interface ITypeInstanceOpArgs extends ITypeInstance {
	/* This statement won't return anything of the form op |-> ident : Monoid, instead it would 
	 * return op : AssocOp(T), ident : T. In the long term I hope all ITypeInstances will
	 * be able to do this, however, this is currently not the case.
	 */
	ArrayList<Tuple2<String, String>> individuallyTypedConstructionArgs();
}
