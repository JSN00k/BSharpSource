package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.BSharpBlock;
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
    if ((object instanceof BSharpBlock)) {
      return false;
    } else {
      return super.createEObjectDescriptions(object, acceptor);
    }
  }
}
