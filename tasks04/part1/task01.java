package by.htp.tasks4.p1;

public class task01 {
	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 5, 9, 3};
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println(sum);
		}
	}
}
