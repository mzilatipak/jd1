package by.htp.tasks4.p1;

public class task12 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int i, sum = 0, temp = 0;
		
		for (i=0; i < arr.length; i++) {
			if (i < 1 || i%2 == 0 || i%3 == 0) {
					System.out.println("smth wrong");
			}else {
				temp += arr[i];
				sum = temp;
			}
		}
		System.out.println("summa ravna: " + sum);
	}
}
