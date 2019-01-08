package task18;
import java.util.Scanner;

public class task18 {
	public static void main(String[] args) {
		double a, sg, sf, v;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("введите ддлинну грани куба");
		a = sc.nextInt();
		
		sg = Math.pow(a, 2);
		sf =  sg*6;
		v = Math.pow(a, 3);
		
		System.out.println("площадь грани куба равна " +sg + ", площадь плной поверхности куба равна " + sf + ", объем куба равен " + v);		
		
	}
}
