package task37;
import java.util.Scanner;

public class func {
	public static void main(String[] args) {
		double x, rez1, rez2;
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite x ");
		x = sc.nextDouble();

		if (x >= 3) {
			rez1 = Math.pow(-x, 2) + 3*x +9;
			System.out.println(rez1);
		}else {
			rez2 = 1/(Math.pow(x, 3) - 6);
			System.out.println(rez2);
		} 
	}

}


