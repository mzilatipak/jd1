package by.htp.tasks4.p1;

import java.util.Arrays;

public class task05 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, -5, 12, -7, 8, -1, 5, 9 };
		int i, ch;

		for (i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				ch = arr[i];
				int ar2[] = new int[ch];
				System.out.println(Arrays.toString(ar2));
			}
		}
	}
}
