package by.htp.tasks3.task01;

import java.util.Scanner;

public class task14 {
	public static void main(String[] args) {
		float n = 1, N;
		float y;
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite N: ");
		N = sc.nextInt();

		for (n = 1; n <= N; n++) {
			y = 1 + 1 / n;
			System.out.println(y);
		}
	}
}
