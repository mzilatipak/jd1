package by.htp.tasks4.p1;

public class task14 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int i, max = 0, min = 0, tempmx, tempmn, sum = 0;
		
		for (i = 0; i < arr.length; i++) {
			if (i%2 == 0) {
				tempmx = arr[i];
				max = Math.max(arr[i], tempmx);
			}else {
				tempmn = arr[i];
				min = Math.min(arr[i], tempmn);
			}
			sum = max + min;
		}
		System.out.println("-> " + sum);
	}
}
