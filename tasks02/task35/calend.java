package task35;
import java.util.Scanner;

public class calend {
	public static void main(String[] args) {
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite den");
		d = sc.nextInt();
		
		if (d >= 1 && d <= 31) {
			System.out.println("jan date" + d);
		}else if (d > 31 && d <= 59) {
			System.out.println("feb date" + (d-31));
		}else if (d > 59 && d <= 90) {
			System.out.println("mar date" + (d-59));
		}
				
	}
}
