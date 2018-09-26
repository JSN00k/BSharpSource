package ac.soton.bsharp.util

import ac.soton.bsharp.bSharp.BSharpFactory
import java.util.ArrayList
import ac.soton.bsharp.bSharp.InbuiltType

class BSharpInbuiltTypeProvider {
	public static val predType = 
		BSharpFactory::eINSTANCE.createInbuiltType => [name = 'Pred']
		
		static def allInbuiltTypes(){
			val ArrayList<InbuiltType> list = new ArrayList
			list.add(predType)
			return list
		}
}