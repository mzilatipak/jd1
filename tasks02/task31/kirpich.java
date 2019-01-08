package task31;

public class kirpich {
	public static void main(String[] args) {
		int a = 23, b = 12, x = 18, y = 12, z = 42;
		if (a>=x && b>=y || a>=y && b>=z) {
			System.out.println("vlezet");
		}else {
			System.out.println("ne vlezet");
		}
		
	}
}
