package task18;
import java.util.Scanner;

public class task18 {
	public static void main(String[] args) {
		double a, sg, sf, v;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������� ������� ����� ����");
		a = sc.nextInt();
		
		sg = Math.pow(a, 2);
		sf =  sg*6;
		v = Math.pow(a, 3);
		
		System.out.println("������� ����� ���� ����� " +sg + ", ������� ����� ����������� ���� ����� " + sf + ", ����� ���� ����� " + v);		
		
	}
}
