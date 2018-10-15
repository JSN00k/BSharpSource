package ac.soton.bsharp.scoping

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import com.google.inject.Inject
import com.google.inject.Singleton
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.resource.IEObjectDescription
import ac.soton.bsharp.bSharp.BSharpBlock

@Singleton
class BSharpResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	
	@Inject extension IQualifiedNameProvider
	
	override createEObjectDescriptions(EObject object, IAcceptor<IEObjectDescription> acceptor) {
		if (object instanceof BSharpBlock) {
			return false
		} else {
			return super.createEObjectDescriptions(object, acceptor)
		}
	}
}