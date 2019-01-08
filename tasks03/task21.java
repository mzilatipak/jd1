package by.htp.tasks3.task01;

public class task21 {
	public static void main(String[] args) {
		double a = -5, b = 5, h = 1, x, fx;

		for (x = a; x <= b - h; x += h) {
			fx = x - Math.sin(x);
			System.out.println("x=" + "   " + "fx=");
			System.out.println(x + " " + fx);

		}
	}
}
