package by.htp.tasks6_10_Airline;

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineActions {

	public void actFindTarget(ArrayList<Airline> planes) {
		Scanner sc = new Scanner(System.in);
		System.out.print("vvedite punkt naznacheniya: ");
		String inpTarget;
		inpTarget = sc.next();

		for (int i = 0; i < planes.size(); i++) {
			Airline plane = planes.get(i);
			if (plane.getTarget().equals(inpTarget)) {
//				System.out.println("v zadanniy punkt naznacheniya est sled reysi: ");
				System.out.println(plane.getTarget() + ", " + plane.getFlightNum() + ", " + plane.getPlaneType() + ", "
						+ plane.getHour() + ", " + plane.getMin() + ", " + plane.getDay());
//			} else {
//				System.out.println("there is no such target! ur sux!");
			}
		}
	}

	public void actFindDay(ArrayList<Airline> planes) {
		Scanner sc = new Scanner(System.in);
		System.out.print("vvedite den vileta: ");
		String inpDay;
		inpDay = sc.next();

		for (int i = 0; i < planes.size(); i++) {
			Airline day = planes.get(i);
			if (day.getDay().equals(inpDay)) {
//				System.out.println("v vibranniy Vami den est sled reysi: ");
				System.out.println(day.getTarget() + ", " + day.getFlightNum() + ", " + day.getPlaneType()
						+ ", " + day.getHour() + ", " + day.getMin() + ", " + day.getDay());
//					} else {
//					System.out.println("there is no such target! ur sux!");
			}
		}
	}

	public void actFindDayTime(ArrayList<Airline> planes) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vvedite den vileta: ");
		String inpDay;
		inpDay = sc.next();
		Scanner sc1 = new Scanner(System.in);
		int inpHour;

		for (int i = 0; i < planes.size(); i++) {
			Airline day = planes.get(i);
			if (day.getDay().equals(inpDay)) {
				System.out.println("vvedite min vremya vileta: ");
				inpHour = sc1.nextInt();
				if (inpHour < 0 || inpHour > 23) {
					System.out.println("ur sux! wrong time!");
				}
				Airline hour = planes.get(i);
				if (hour.getHour() > inpHour) {
					System.out.println("Vashimemu zaprosu podhodyat reysi: ");
					System.out.println(hour.getTarget() + ", " + hour.getFlightNum() + ", " + hour.getPlaneType() + ", "
							+ hour.getHour() + ", " + hour.getMin() + ", " + hour.getDay());
				}
			}
		}
	}
}
