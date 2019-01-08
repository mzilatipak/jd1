package task21;

import java.util.Scanner;

public class lstec {
	public static void main(String[] args) {
		String md;
		Scanner sc = new Scanner(System.in);
		System.out.println("kto ti? mal ili dev? vvedite m ili d: ");
		md = sc.nextLine();

		if (md.equals("m")) {
			System.out.println("mne nra devochki");
		} else if (md.equals("d")) {
			System.out.println("mne nra devochki");
		}else {System.out.println("chto ti takoe"); }
		/*
		 * if (md == "m" || md == "M") { System.out.println("mne nra malchiki"); }
		 * 
		 * else if (md == "d" || md == "D") { System.out.println("mne nra devochki"); }
		 * 
		 * else { System.out.println("chto ti takoe"); }
		 */

	}

}
