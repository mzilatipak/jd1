package task28;

public class radian {
	public static void main(String[] args) {
		double rad=90, ang=0, min=0, sec=0;
		ang=Math.toDegrees(rad);
		min=ang/60;
		sec=min/60;
		
		
		
		System.out.println("rad= " + rad + ", angle= " + ang + ", minut= " + min + ", secund= " + sec);
	}
}
