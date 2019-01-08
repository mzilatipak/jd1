package task13;

public class rasstoyanie {
	public static void main(String[] args) {
		double o1 = 0, o2 = 0, x1 = 2, y1 = 3, x2 = -4, y2 = 7; //koordinati tochek
		double oa = Math.sqrt(Math.pow(y1-o2, 2)+Math.pow(x1-o1, 2)); //rasstoyanie 0 - a
		double ob = Math.sqrt(Math.pow(y2-o2, 2)+Math.pow(x2-o2, 2)); //rasstoyanie 0 - b
			
		if (oa > ob) {
			
			System.out.println("tochka b blizhe k 0");
		}
		else {
			System.out.println("tochka a blizhe k 0");
		}
		
	}
}
