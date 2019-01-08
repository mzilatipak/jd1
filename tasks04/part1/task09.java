package by.htp.tasks4.p1;

public class task09 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -5, 6, 7, 6, 8, 9};
		int i, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int imin = 0, imax = 0, temp;
			      
		for (i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				imin = i;
			}else if (arr[i] > max) {
				max = arr[i];
				imax = i;
				}			
			}
		temp = arr[imin];
		arr[imin] = arr[imax];
		arr[imax] = temp;
		System.out.println("noviy massiv: ");
		for (i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		} 
	}
}
