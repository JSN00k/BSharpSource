package ac.soton.bsharp.scoping

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import ac.soton.bsharp.bSharp.Extend
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.util.Strings
import java.util.ArrayList
import ac.soton.bsharp.bSharp.FileImport
import ac.soton.bsharp.bSharp.TopLevelFile
import org.eclipse.emf.ecore.util.EcoreUtil

class BSharpQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	
	def QualifiedName defaultQualifiedName(EObject obj) {
		/* copied from the DefaultDeclarativeQualifiedNameProvider. didn't want to call the 
		 * method on DefaultDeclarativeQualifiedNameProvider as it cached the result. In future
		 * I don't it to accidentally get the cached result.
		 */
		var temp = obj;
		var qualifiedNameFromDispatcher = qualifiedName
				if (qualifiedNameFromDispatcher !== null)
					return qualifiedNameFromDispatcher;
				var name = getResolver().apply(temp);
				if (Strings.isEmpty(name))
					return null;
				var qualifiedNameFromConverter = converter.toQualifiedName(name);
				while (temp.eContainer() !== null) {
					temp = temp.eContainer();
					var parentsQualifiedName = getFullyQualifiedName(temp);
					if (parentsQualifiedName !== null)
						return parentsQualifiedName.append(qualifiedNameFromConverter);
				}
				return qualifiedNameFromConverter;
	}
	
	override QualifiedName qualifiedName(Object ele) {
		if (ele instanceof Extend) {
			var qualName = defaultQualifiedName(ele)
			var segments = new ArrayList(qualName.segments)
			segments.remove(segments.size - 1)
			segments += (ele as Extend).extendedClassName
			segments += "Extend"
			
			return QualifiedName.create(segments)
		} else if (ele instanceof TopLevelFile) {
			var topLevelFile = ele as TopLevelFile
			if (topLevelFile.name === null) {
				val URI = EcoreUtil.getURI(topLevelFile)
				val fileName = URI.trimFileExtension.lastSegment
				topLevelFile.name = fileName
			}
			return super.qualifiedName(ele)
		}
		
		return super.qualifiedName(ele)
	}
}