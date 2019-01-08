package by.htp.tasks3.task01;

public class task09 {
	public static void main(String[] args) {
		double sum = 0;
		// int i = 0;

		/*
		 * do { sum += Math.pow(i, 2); i++; }while (i<3);
		 */
		for (int i = 0; i <= 3; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println(sum);
	}
}
