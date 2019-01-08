package task13;

public class triangle {
	public static void main(String[] args) {
		double x1 = 2, y1 = 13, x2 = -8;
		double y2 = 4, x3 = 17, y3 = -2;
		double a = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y3-y1, 2));
		double b = Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		double c = Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
		double P = a+b+c;
		double p = P/2; //полупериметр 
		double s = Math.sqrt(p*(p-a)*(p-b)*(p-c)); //формула герона
			
		System.out.println("периметр");
		System.out.println(P);
		System.out.println("площадь");
		System.out.println(s);
		
	}
}
