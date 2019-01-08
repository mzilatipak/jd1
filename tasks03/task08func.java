package by.htp.tasks3.task01;

public class task08func {
	public static void main(String[] args) {
		int a=0, b=20, c=2, h=3, x, y;
		
		for (x=a; x<=b-h; x+=h); {
		System.out.print("x= " +x+",");
			if (x==15) {
				y=(x+c)*2;
				System.out.println("y=" + y);
			}else if (x != 15) {
				y=(x-c)+6;
				System.out.println("y=" + y);
			}
		}
	}
}
