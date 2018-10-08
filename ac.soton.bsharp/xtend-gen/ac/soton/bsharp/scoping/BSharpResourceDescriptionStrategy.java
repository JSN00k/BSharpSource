package ac.soton.bsharp.scoping;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Extension;

@Singleton
@SuppressWarnings("all")
public class BSharpResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public boolean createEObjectDescriptions(final EObject object, final IAcceptor<IEObjectDescription> acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \'}\'"
      + "\nTypeBodyElements cannot be resolved to a type."
      + "\nThe method or field eObject is undefined"
      + "\nType mismatch: cannot convert from null to boolean");
  }
}
