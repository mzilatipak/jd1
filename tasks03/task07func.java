package by.htp.tasks3.task01;

public class task07func {
	public static void main(String[] args) {
		int a = 4, b = 12, h = 2, x, y;

		for (x = a; x <= b - h; x += h) {
			System.out.print("x= " + x + ",");
			if (x > 2) {
				y = x;
				System.out.println("y =" + y);
			} else if (x <= 2) {
				y = -x;
				System.out.println("y =" + y);
			}
		}
	}
}
