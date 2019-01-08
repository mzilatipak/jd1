package by.htp.tasks3.task01;

import java.util.Scanner;

public class task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite chislo n: ");
		int n = sc.nextInt();
		int i = 0, x = 0, nei = 0;
		
		while (n != 0) {
			 i = n % 10;
			 n /= 10;
			 nei = nei*10+i%10;
			 if ((i%2) == 0) {
				 x += i;
			 	}
			System.out.println("i= " + i);
			}
		System.out.println("summa chetnih= " + x);
		System.out.println("ne n= " + nei);
	}

}
