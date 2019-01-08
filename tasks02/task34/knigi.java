package task34;
import java.util.Scanner;

public class knigi {
	public static void main(String[] args) {
		float st = 0, sum, sda, ned;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("vvedite stoimost knigi" +st);
		st = sc.nextFloat();
		System.out.println("vnesite summu deneg: ");
		sum = sc1.nextFloat();
		System.out.println("vi vnesli: " + sum + "bynov");
		
		if (st>sum) {
			ned = st - sum;
			System.out.println("ne hvataet:" + ned);
		}else if (st<sum) {
			sda = sum - st;
			System.out.println("sdacha:" + sda);
		}else {
			System.out.println("vse OK");
		} 
	}
}
