package task33;

import java.util.Scanner;

public class charr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Введите символ: ");
		char s = (char) sc.next().charAt(0);
		
		//char s = 'g';
		int x = (int) s;
		int ascii = (int) s; 
		
		int xn, xp;
		xn = x + 1;
		xp = x - 1;
		
		char chn, chp;
		
		chn = (char)xn;
		chp = (char)xp;
		
		System.out.println("poryadkoviy nomer " + ascii + " , sled symb " + chn + " , past symb " + chp);
		

		
		
	}
}
