package by.htp.tasks4.p2;

import java.util.Arrays;

public class task04 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, 3, 8, 4, 0 };
		int count = 0;
		
		System.out.println("isshodniy massiv: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					count++;

				}
			}
			System.out.print("[" + arr[i] + "]");
		}
//		System.out.print("otsortirovanniy massiv: ");
		System.out.println("\n" + "kolichestvo perestanovok: " + count + " raz");
	}
}
