package task03;

import java.util.Scanner;

public class sravn3a {
	public static void main(String[] args) {
		int x = 3, a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("введите число: ");
		
		
		a = sc.nextInt();
		
		if (a < x) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
}
