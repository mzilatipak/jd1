package by.htp.tasks4.p2;

public class task01 {

	public static void main(String[] args) {
		int[] ar1 = { 1, 4, 2, 6, 11 };
		int[] ar2 = { 1, 6, 1, 7 };
		int[] ar3 = new int[ar1.length + ar2.length];
		int t = 0, k = 2;

		for (int i = 0; i < ar3.length; i++) {
			if (i == k) {
				for (int j = 0; j < ar2.length; j++) {
					ar3[i] = ar2[j];
					i++;
				}
			}
			ar3[i] = ar1[t];
			t++;
		}
		for (int i = 0; i < ar3.length; i++) {

			System.out.print(" " + ar3[i]);
		}
	}
}
