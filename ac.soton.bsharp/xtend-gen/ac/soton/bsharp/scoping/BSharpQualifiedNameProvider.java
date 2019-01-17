package ac.soton.bsharp.scoping;

import ac.soton.bsharp.bSharp.Extend;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;

@SuppressWarnings("all")
public class BSharpQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  public QualifiedName defaultQualifiedName(final EObject obj) {
    EObject temp = obj;
    QualifiedName qualifiedNameFromDispatcher = this.qualifiedName(this);
    if ((qualifiedNameFromDispatcher != null)) {
      return qualifiedNameFromDispatcher;
    }
    String name = this.getResolver().apply(temp);
    boolean _isEmpty = Strings.isEmpty(name);
    if (_isEmpty) {
      return null;
    }
    QualifiedName qualifiedNameFromConverter = this.getConverter().toQualifiedName(name);
    while ((temp.eContainer() != null)) {
      {
        temp = temp.eContainer();
        QualifiedName parentsQualifiedName = this.getFullyQualifiedName(temp);
        if ((parentsQualifiedName != null)) {
          return parentsQualifiedName.append(qualifiedNameFromConverter);
        }
      }
    }
    return qualifiedNameFromConverter;
  }
  
  @Override
  public QualifiedName qualifiedName(final Object ele) {
    if ((ele instanceof Extend)) {
      QualifiedName qualName = this.defaultQualifiedName(((EObject)ele));
      List<String> _segments = qualName.getSegments();
      ArrayList<String> segments = new ArrayList<String>(_segments);
      int _size = segments.size();
      int _minus = (_size - 1);
      segments.add(_minus, ((Extend)ele).getExtendedClassName());
      int _size_1 = segments.size();
      int _minus_1 = (_size_1 - 1);
      segments.add(_minus_1, "Extend");
      return QualifiedName.create(segments);
    }
    return super.qualifiedName(ele);
  }
}
