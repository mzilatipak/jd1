package by.htp.tasks4.p1;

public class task02 {

	public static void main(String[] args) {
		int[] arr = {1, 6, 0, 12, 4, 7, 0, 0, 9};
		int i, j = 0;
		
		for (i=0; i<arr.length; i++) {
			if (arr[i] == 0) {
				j = arr[i];
				int ar2[] = {i}; 
				System.out.println(ar2[j]);
			}
		}
	}
}
