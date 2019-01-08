package task17;

import java.util.Scanner;

public class task17 {
	public static void main(String[] args) {
		float m = 0, n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite m: ");
		m = sc.nextFloat();
		System.out.println("vvedite n: ");
		n = sc.nextFloat();

		if (m != n) {
			if (m > n) {
				n = m; }
			if (m < n) {
				m = n;	}
			}
		else {
			m = 0;
			n = 0;
		}
		
		System.out.println("m= " + m + ", n= " + n);
		
	}
}
