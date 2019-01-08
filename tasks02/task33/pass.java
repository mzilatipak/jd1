package task33;

import java.util.Scanner;

public class pass {
	public static void main(String[] args) {
		int pass = 0 /*1 = 9583, pass2 = 1747, pass3 = 3331, pass4 = 7922, pass5 = 9455, pass6 = 8997*/;
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite pass: ");
		pass = sc.nextInt();
		
		if (pass == 9583 || pass == 1747) {
			System.out.println("dostupnie moduli bd A, B, C");
		}else if (pass == 3331 || pass == 7922) {
			System.out.println("dostupnie moduli bd B, C");
		}else if (pass == 9455 || pass == 8997) {
			System.out.println("dostupnie moduli bd C");
		}else {
			System.out.println("net dostupa");
		}
		
	}
}
