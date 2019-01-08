package by.htp.tasks3.task01;

public class task18 {

	public static void main(String[] args) {
		double a, b = 0, sum = 0, e = -1, n;

		for (n = 1; n < 9; n++) {
			a = (Math.pow(-1, (n - 1))) / n;
			System.out.println("a=" + a + "\n" + "n=" + n);
			if (Math.abs((Math.pow(-1, (n - 1))) / n) >= e) {
				sum = sum + a;
				System.out.println("itog " + sum);
			}
		}
	}
}
