package by.htp.tasks6_03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] effS1 = { 6, 6, 8, 8, 8 };
		Student s01 = new Student("ivanov a.v.", "gr0123", effS1);
		int[] effS2 = { 5, 10, 8, 7, 9 };
		Student s02 = new Student("petrov v.d.", "gr0423", effS2);
		int[] effS3 = { 6, 5, 9, 8, 10 };
		Student s03 = new Student("sidoro i.o.", "gr0145", effS3);
		int[] effS4 = { 10, 9, 8, 9, 7 };
		Student s04 = new Student("kozlov i.k.", "gr0642", effS4);
		int[] effS5 = { 5, 9, 10, 8, 8 };
		Student s05 = new Student("chapav v.i.", "gr0413", effS5);
		int[] effS6 = { 6, 9, 7, 7, 10 };
		Student s06 = new Student("gromov a.d.", "gr0123", effS6);
		int[] effS7 = { 4, 7, 9, 9, 9 };
		Student s07 = new Student("rogova e.u.", "gr0423", effS7);
		int[] effS8 = { 9, 10, 9, 6, 8 };
		Student s08 = new Student("stogov k.p.", "gr0461", effS8);
		int[] effS9 = { 8, 6, 8, 8, 8 };
		Student s09 = new Student("sbolev f.k.", "gr0482", effS9);
		int[] effS10 = { 7, 3, 7, 8, 6 };
		Student s10 = new Student("kraeva a.g.", "gr0387", effS10);

		ArrayList<Student> students = new ArrayList<>();

		students.add(s01);
		students.add(s02);
		students.add(s03);
		students.add(s04);
		students.add(s05);
		students.add(s06);
		students.add(s07);
		students.add(s08);
		students.add(s09);
		students.add(s10);

		for (int i = 0; i < students.size(); i++) {
			Student s;
			s = students.get(i);

			if (search(s.getEff())) {
				System.out.println(s.getFio() + " " + s.getGroup());
			}
		}
	}

	private static boolean search(int[] eff) {
		boolean srch = false;
		for (int i = 0; i < eff.length; i++) {
			if (eff[i] > 8) {
				srch = true;
			} else {}
		}
		return srch;
	}
}
