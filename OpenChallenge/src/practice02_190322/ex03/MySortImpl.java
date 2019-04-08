package practice02_190322.ex03;

public class MySortImpl implements MySort {

	public String[] sort(String[] strArray) {
		for (int i = 0; i <= strArray.length - 1; i++) {
			if (strArray[i] == null)
				break;
			else {
				for (int j = i + 1; j < strArray.length; j++) {
					if (strArray[i].compareTo(strArray[j]) > 0) {
						String temp = strArray[i];
						strArray[i] = strArray[j];
						strArray[j] = temp;
					}
				}
			}
		}
		return strArray;
	}

	public String[] sort(String[] strArray, boolean descOrder) {
		if (descOrder) {
			for (int i = 0; i <= strArray.length - 1; i++) {
				if (strArray[i] == null)
					break;
				else {
					for (int j = i + 1; j < strArray.length; j++) {
						if (strArray[i].compareTo(strArray[j]) < 0) {
							String temp = strArray[i];
							strArray[i] = strArray[j];
							strArray[j] = temp;
						}
					}
				}
			}
		} else 
			sort(strArray);		
		return strArray;
	}
}
