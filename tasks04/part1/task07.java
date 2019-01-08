package by.htp.tasks4.p1;

import java.util.Arrays;

public class task07 {

	public static void main(String[] args) {
		int[] ar = { 1, 3, 8, 12, 14, 15, 8, 9 };
		int i, z = 9, cnt = 0;

		for (i = 0; i < ar.length; i++) {
			if (ar[i] > z) {
				ar[i] = z;
				//cnt++;
	
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
