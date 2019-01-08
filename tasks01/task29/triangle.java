package task29;

import java.util.Scanner;
/* import java.lang.Math.pow;
import java.lang.Math.acos; */

public class triangle {
	public static void main(String[] args) {
		double a, b, c, ag1, ar1, ar2, ag2, ag3, ar3;
		Scanner sc = new Scanner(System.in);
		System.out.println("введите сторону a: ");
		a = sc.nextInt();
		System.out.println("введите сторону b: ");
		b = sc.nextInt();
		System.out.println("введите сторону c: ");
		c = sc.nextInt(); 
		
		ag1=Math.acos((b*b+c*c-a*a)/(2*b*c));
		ar1=(ag1*(Math.PI/180));
		ag2=Math.acos((a*a+c*c-b*b)/(2*a*c));
		ar2=(int) (ag2*Math.PI/180);
		ag3=180-(ag1+ag2);
		ar3=ag3/60;
		
		System.out.println("gradus ugla 1= " + ag1 + " , " + "radian ugla 1= " + ar1);
		System.out.println("gradus ugla 2= " + ag2 + " , " + "radian ugla 2= " + ar2);
		System.out.println("gradus ugla 3= " + ag3 + " , " + "radian ugla 3= " + ar3);
		
		
	}
}
