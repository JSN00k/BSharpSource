package ac.soton.bsharp.bSharp.util;

import com.google.common.hash.HashCode;

public class EventBFQNImport implements Comparable<EventBFQNImport> {
	private String packageName;
	private String filePrefix;
	private Integer numberSuffix;
	
	public EventBFQNImport(String packageName, String BSharpFileName) {
		this.packageName = packageName + "-gen";
		this.filePrefix = BSharpFileName;
		numberSuffix = null;
	}
	
	public EventBFQNImport(String packageName, String BSharpFileName, Integer fileNumber) {
		this.packageName = packageName + "-gen";
		this.filePrefix = BSharpFileName;
		numberSuffix = fileNumber;
	}
	
	public boolean isInferredImporterOf(EventBFQNImport other) {
		if (packageName.equals(other.packageName) && filePrefix.equals(other.filePrefix)) {
			if (numberSuffix == null)
				return true;
			
			if (other.numberSuffix == null)
				return false;
			
			if (numberSuffix >= other.numberSuffix)
				return true;
		}
		
		return false;
	}


	@Override
	public int compareTo(EventBFQNImport o) {
		if (packageName.equals(o.packageName) && filePrefix.equals(o.filePrefix)) {
			if (numberSuffix == null && o.numberSuffix == null)
				return 0;
			
			if (numberSuffix == null)
				return 1;
			
			if (o.numberSuffix == null) {
				return -1;
			}
			
			if (numberSuffix == o.numberSuffix)
				return 0;
			
			if (numberSuffix > o.numberSuffix)
				return 1;
			else
				return -1;
		}
		
		return -1;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof EventBFQNImport))
			return false;
		
		return toString().equals(o.toString());
	}

	public String getProjName() {
		return packageName;
	}
	
	public String fileName() {
		if (numberSuffix != null) {
			return filePrefix + numberSuffix.toString();
		}
		
		return filePrefix;
	}
	
	public String toString() {
		String result = packageName + "." + filePrefix;
		if (numberSuffix != null)
			result += numberSuffix.toString();
		
		return result;
	}
	
	public int hashCode() {
		return toString().hashCode();
	}
	
}
