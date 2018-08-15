package ac.soton.bsharp.bSharp.abstractInterfaces;

import java.util.Collection;

import ac.soton.bsharp.bSharp.PolymorphicTypeName;

public interface IPolyTypeProvider {
	public Collection<PolymorphicTypeName> getPolyTypeNames();
}
