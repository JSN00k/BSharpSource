package ac.soton.bsharp.scoping

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.EcoreUtil2
import ac.soton.bsharp.bSharp.TopLevelInstance

@Singleton
class BSharpResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	override createEObjectDescriptions(EObject object, IAcceptor<IEObjectDescription> acceptor) {
		val topLevelInstance = EcoreUtil2.getContainerOfType(object.eContainer, TopLevelInstance)
		if (topLevelInstance !== null) {
			return false
		} else {
			return super.createEObjectDescriptions(object, acceptor)
		}
	}
}