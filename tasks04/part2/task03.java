package by.htp.tasks4.p2;

public class task03 {

	public static void main(String[] args) {
		int[] arr = {1, 5, 7, 3, 8, 4, 0};
		
		for (int i = 0; i < arr.length; i++) {
			int max = i;
			for (int j = i + 1; j < arr.length; j++) {
			    if (arr[j] > arr[max]) {
					max = j;
				}
			}
			    int tmp = arr[i];
			    arr[i] = arr[max];
			    arr[max] = tmp;
			    System.out.print(arr[i]);
		}
	}
}
