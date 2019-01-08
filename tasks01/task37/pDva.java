package task37;


public class pDva {
	public static void main(String[] args) {
		int a = 1212, x1, x2, x3, x4, s1, s2;
		
			x1 = a/1000; //1 cifra
			x2 = a%1000/100; //2 c
			x3 = a%100/10; //3 c
			x4 = a%10; //4c
		
			s1 = x1 + x2;
			s2 = x3 + x4;
			
			if (s1 == s2) {
				System.out.println("true"); }
				
				else {
					System.out.println("false"); }
					
	}
}
