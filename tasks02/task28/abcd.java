package task28;
import java.util.Scanner;

public class abcd {
	public static void main(String[] args) {
		float a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite a: ");
		a = sc.nextFloat();
		System.out.println("vvedite b: ");
		b = sc.nextFloat();
		System.out.println("vvedite c: ");
		c = sc.nextFloat();
		System.out.println("vvedite d: ");
		d = sc.nextFloat();
		
		if (a == d || b == d || c == d) {
			System.out.println("odno iz chisel ravno chislu d"); }
		else {
			float max = Math.max((d-a), Math.max((d-b), (d-c)));
			System.out.println(max);
		}
		
	/*	float x = (float) Math.max((d-a), (d-b));
		float y = (float) Math.max((d-b), (d-c));
		float z = (float) Math.max((d-a), (d-c));
		
		if (a == d || b == d || c == d) {
			System.out.println("odno iz chisel ravno chislu d"); }
		
		else if ((x > y) && (x > z)) {
				System.out.println("max= " + x); }
		else if ((y > x) && (y > z)) { 
				System.out.println("max= " + y); }
		else if ((z > x) && (z > y)) {
				System.out.println("max= " + z); }
		else { System.out.println("x3"); }
		}*/
		
	}
}
