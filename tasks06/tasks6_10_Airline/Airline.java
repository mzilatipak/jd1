package by.htp.tasks6_10_Airline;

public class Airline {
	public String target;
	public int flightNum;
	public String planeType;
	public int hour;
	public int min;
	public String day;
	
	public Airline(String target, int flightNum, String planeType, int hour, int min, String day) {
		this.target = target;
		this.flightNum = flightNum;
		this.planeType = planeType;
		this.hour = hour;
		this.min = min;
		this.day = day;		
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(int flightNum) {
		this.flightNum = flightNum;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
}
