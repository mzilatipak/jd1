package by.htp.tasks3.task01;

import java.util.Scanner;

public class task06 {
	public static void main(String[] args) {
		int a, i = 1, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("vvedite celoe polojitelnoe 4islo:");
		a = sc.nextInt();

		for (i=1; i <= a; i++) {
			sum = sum + i;
		}
		System.out.print(sum);
	}
}
