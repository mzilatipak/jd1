package by.htp.tasks6_04_trains;

public class SortByTarget {

	public int compareByStrings(String str1, String str2) {
		int min;
		if (str1.length() < str2.length()) {
			min = str1.length();
		} else {
			min = str2.length();
		}

		int i = 0;
		while (i < min) {
			if (str1.charAt(i) < str2.charAt(i)) {
				return -1;
			} else if (str1.charAt(i) > str2.charAt(i)) {
				return 1;
			} else {
			}
			i++;
		}
		if (str1.charAt(i) < str2.charAt(i)) {
			return -1;
		} else if (str1.charAt(i) > str2.charAt(i)) {
			return 1;
		} else {
			return 0;
		}
	}

	public Train[] sortByTarget(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			for (int j = 0; j < trains.length - 1 - i; j++) {

				if (compareByStrings(trains[j].getTarget(), trains[j + 1].getTarget()) > 0) {
					Train tmp = trains[j];
					trains[j] = trains[j + 1];
					trains[j + 1] = tmp;
				} else if (compareByStrings(trains[j].getTarget(), trains[j + 1].getTarget()) == 0) {
					if (trains[j].getHour() > trains[j + 1].getHour()) {
						Train tmp = trains[j];
						trains[j] = trains[j + 1];
						trains[j + 1] = tmp;
					} else if (trains[j].getHour() == trains[j + 1].getHour()) {
						if (trains[j].getMin() > trains[j + 1].getMin()) {
							Train tmp = trains[j];
							trains[j] = trains[j + 1];
							trains[j + 1] = tmp;
						}
					}
				}
			}
		}
		return trains;
	}
}
