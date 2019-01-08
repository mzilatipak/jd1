package task17;

public class task17 {
	public static void main(String[] args) {
		double a = 12, b = 4, sa, sg;
		sa = (Math.pow(a,  3)+Math.pow(b, 3 ))/2;
		sg = Math.sqrt(Math.abs(a)*Math.abs(b));
		
		System.out.println("среднее арифметическое чисел а и б = " + sa + ", среднее геометрическое модулей чисел а и б = " + sg);
		
	}
}
