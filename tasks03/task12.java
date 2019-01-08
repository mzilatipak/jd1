package by.htp.tasks3.task01;

public class task12 {
	public static void main(String[] args) {
		long sum=1, a=1;
		
		//sum=((a1+an)/2)*n
		
		for (int n = 1; n <= 10; n++) {
			a = a+6;	
			sum *= 6;
		}
		System.out.print(sum);
	}
}
