package task16;

import java.util.Scanner;

public class mass {
	public static void main(String[] args ) {
		int a, x1, x2, x3, x4, mult;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("введите 4-х значное целое число: ");
		a = sc.nextInt();
			x1 = a/1000;
			x2 = a%1000/100;
			x3 = a%100/10;
			x4 = a%10;
		mult = x1*x2*x3*x4;
		System.out.println("произведение чисел равно= " + mult);
				
	}
}
