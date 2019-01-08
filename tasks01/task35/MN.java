package task35;

public class MN {
	public static void main(String[] args) {
		float M = 14, N=3;
		float mn=M/N;
		int x = (int) (mn%10);
		float y= (mn - (int) mn)*10;
		y =(int) (y);
		
		System.out.println(x);
		System.out.println(y);
	}
}
