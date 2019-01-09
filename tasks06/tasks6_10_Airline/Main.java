package by.htp.tasks6_10_Airline;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
						//(target, ¹ of plane, type of plane, hour, minute, day)
		Airline plane01 = new Airline("Kishinev", 147, "cargo", 12, 00, "monday");
		Airline plane02 = new Airline("Belgrad", 235, "civil", 13, 40, "wendsday");
		Airline plane03 = new Airline("Moscow", 742, "civil", 9, 20, "saturday");
		Airline plane04 = new Airline("Belgrad", 487, "cargo", 12, 00, "tusday");
		Airline plane05 = new Airline("Belfast", 122, "civil", 17, 00, "friday");
		Airline plane06 = new Airline("Madrid", 738, "civil", 17, 40, "monday");
		Airline plane07 = new Airline("Vien", 542, "cargo", 11, 00, "friday");
		Airline plane08 = new Airline("Belfast", 926, "civil", 14, 00, "thursday");
		Airline plane09 = new Airline("Vien", 930, "cargo", 14, 40, "tusday");
		Airline plane10 = new Airline("Vien", 263, "civil", 12, 00, "wendsday");

		ArrayList<Airline> planes = new ArrayList<>();
		planes.add(plane01);
		planes.add(plane02);
		planes.add(plane03);
		planes.add(plane04);
		planes.add(plane05);
		planes.add(plane06);
		planes.add(plane07);
		planes.add(plane08);
		planes.add(plane09);
		planes.add(plane10);
		
		AirlineActions actFindTarget = new AirlineActions();
		actFindTarget.actFindTarget(planes);
		
		AirlineActions actFindDay = new AirlineActions();
		actFindDay.actFindDay(planes);
		
		AirlineActions actFindDayTime = new AirlineActions();
		actFindDayTime.actFindDayTime(planes);
	}
}
