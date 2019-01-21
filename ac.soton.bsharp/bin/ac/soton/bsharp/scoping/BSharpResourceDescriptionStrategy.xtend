package ac.soton.bsharp.scoping

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import com.google.inject.Singleton
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.EcoreUtil2
import ac.soton.bsharp.bSharp.TopLevelInstance
import ac.soton.bsharp.bSharp.FunctionDecl
import ac.soton.bsharp.bSharp.Instance
import ac.soton.bsharp.bSharp.Extend

@Singleton
class BSharpResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	override createEObjectDescriptions(EObject object, IAcceptor<IEObjectDescription> acceptor) {
		
		
		/* I'd rather find the relevant extends when scoping and get the functions within them
		 * as there is never a reference to the extend I believe these are being automatically removed
		 * from the scope or index. Instead any function/Instance within an Extend is added to the 
		 * to the index, then I will filter them out based on the type.
		 */
		if (object instanceof FunctionDecl || object instanceof Instance) {
			val extend = EcoreUtil2.getContainerOfType(object, Extend)
			if (extend !== null)
				return super.createEObjectDescriptions(object, acceptor)
			else 
				return false
		}
		
		val topLevelInstance = EcoreUtil2.getContainerOfType(object.eContainer, TopLevelInstance)
		if (topLevelInstance !== null && !(topLevelInstance instanceof Extend)) {
			return false
		} else {
			return super.createEObjectDescriptions(object, acceptor)
		}
	}
}