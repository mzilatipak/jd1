package by.htp.tasks4.p1;

public class task10 {

	public static void main(String[] args) {
		int i;
		int[] arr = {-1, 0, 2, 4, 5, 6, 7};

		for (i = 0; i<arr.length; i++) {
			if (i > arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}
}
