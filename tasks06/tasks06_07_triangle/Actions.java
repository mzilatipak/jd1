package by.htp.tasks6_07_triangle;

public class Actions {
	int x1 = 12, x2 = 4, x3 = 7, y1 = -2, y2 = 9, y3 = 11; 
	int med;
	
	int a = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y3 - y1, 2));
	int b = (int) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
	int c = (int) Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
	int p = a + b + c;
	int s = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
	
	public int getMed() {
		return med;
	}
	public void setMed(int med) {
		this.med = med;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
}
