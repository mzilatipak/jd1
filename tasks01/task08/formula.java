package task08;

public class formula {
	public static void main(String[] args) {
		float a = 47;
		float b = 12;
		float c = 8;
		double rez;
		
		rez = (b +Math.sqrt(Math.pow(b,2)+4*a*c))-(Math.pow(a, 3)*c)+Math.pow(b,  -2);
		
		System.out.println("Результат: ");
		System.out.println(rez);
		
	}
}
