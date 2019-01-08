package task09;

import java.util.Scanner;

public class ravnstrTriangle {
	public static void main(String[] args) {
		int a, b, c;
		
		System.out.println("vvedite storoni trangle: ");
		
		Scanner sca = new Scanner(System.in);
		a = sca.nextInt();
		
		Scanner scb = new Scanner(System.in);
		
		b = scb.nextInt();
		
		Scanner scc = new Scanner(System.in);
		c = scc.nextInt();
		
		
		
		if (a == b || a == c || b == c) {
			System.out.println("triangle ravnosotor");
			
		}
		else {
			System.out.println("triangle ne ravnostor");
		}
		
	}
}
