package by.htp.tasks3.task01;

public class task13 {
	public static void main(String[] args) {
		double x = -5, y; 
		double a=(double) 0.5;
				
		while (x<=5) {
			y=(double) (5 - Math.pow(x, 2)); 
			System.out.println("Y=" + y);
			x=x+a;
		}
	} 
}
