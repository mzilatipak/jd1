package by.htp.tasks6_01;

public class Actions {
	private int x;
	private int y;
	private int s;
	
	public void print(int x, int y) {
		System.out.println("x= " + x + ", " + "y= " + y);
	}

	public void sum(int x, int y) {
		int s;
		s = x + y;
		System.out.println("x+y=" + s);
	}
	
	public void minMax(int x, int y) {
		if (x > y) {
			System.out.println("x > y");
		}else {
			System.out.println("y > x");
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

}
