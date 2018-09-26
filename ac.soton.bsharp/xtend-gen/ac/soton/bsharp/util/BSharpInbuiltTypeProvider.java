package ac.soton.bsharp.util;

import ac.soton.bsharp.bSharp.BSharpFactory;
import ac.soton.bsharp.bSharp.InbuiltType;
import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class BSharpInbuiltTypeProvider {
  public final static InbuiltType predType = ObjectExtensions.<InbuiltType>operator_doubleArrow(
    BSharpFactory.eINSTANCE.createInbuiltType(), ((Procedure1<InbuiltType>) (InbuiltType it) -> {
    it.setName("Pred");
  }));
  
  public static ArrayList<InbuiltType> allInbuiltTypes() {
    final ArrayList<InbuiltType> list = new ArrayList<InbuiltType>();
    list.add(BSharpInbuiltTypeProvider.predType);
    return list;
  }
}
