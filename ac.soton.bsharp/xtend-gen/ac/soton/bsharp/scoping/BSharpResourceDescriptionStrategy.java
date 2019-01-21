package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.TopLevelInstance;
import com.google.inject.Singleton;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

@Singleton
@SuppressWarnings("all")
public class BSharpResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
  @Override
  public boolean createEObjectDescriptions(final EObject object, final IAcceptor<IEObjectDescription> acceptor) {
    final TopLevelInstance topLevelInstance = EcoreUtil2.<TopLevelInstance>getContainerOfType(object.eContainer(), TopLevelInstance.class);
    if ((topLevelInstance != null)) {
      return false;
    } else {
      return super.createEObjectDescriptions(object, acceptor);
    }
  }
}
