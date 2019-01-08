package by.htp.tasks4.p1;

import java.util.Scanner;

public class task11 {
	public static void main(String[] args) {
		int i, l, m;
		System.out.println("Vvedite M: ");
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		System.out.println("Vvedite L: ");
		l = sc.nextInt();
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		if (l > 0 && l < (m-1)); {
		for (i=0; i < arr.length; i++) {
			if ((arr[i]%m == l)) { 
				System.out.println("->" + arr[i]);
				} else {
					System.out.println("smth wrong");	
				}
			} 
		}
	}
}
