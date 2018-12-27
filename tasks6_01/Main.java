package by.htp.tasks6_01;

import java.util.Scanner;

public class Main {
	public static int x;
	public static int y;
	private static int s;
	private static int max;

	public static void main(String[] args) {
		System.out.println("vvedite x:");
		x = getNum();
		System.out.println("vvedite y:");
		y = getNum();
		s = sum(x, y);
		max = minMax(max);
		print(s, max);
		}
	
	public static int getNum() {
		Scanner sc = new Scanner(System.in); //dalee chestno spisano)))
		if(sc.hasNextDouble()) { 
			return sc.nextInt();
		} else {
			System.out.println("Ошибка при вводе. Повторите ввод"); 
			return getNum(); //на самом деле я весь гетНам списал, т.к. я и на х и на у писал отдельный ввод. позже разобрался немного и вот)
		}
	}
	
	public static void print(int s, int max) {
		s = sum(x, y);
		System.out.println("summa x+y=" + s);
		max = minMax(max);
		System.out.println("bOlshee znachenie: " + max);
	}

	public static int sum(int x, int y) {
		int s;
		s = x + y;
		return s;
	}
	
	public static int minMax(int max) {
		if (x > y) {
			max = x;
		}else {
			max = y;
		}
		return max;
	}		
}