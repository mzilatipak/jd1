package task21;

public class task21 {
	public static void main(String[] args) {
	
		double a=123.456;
		long cel;
		double drob, rez;
			
		
			cel = (int) a;
			drob = (int) (1000*(a-cel));
			float cd = ((float)cel/1000);
			rez = cd+drob;
			
		System.out.println(a);	
		System.out.printf("%.3f", rez);
	}
}
