package by.htp.tasks6_04;

public class Train {
	private String target;
	private String trainNum;
	private int hour;
	private int min;
	private char[] toString;//?

	public Train(String target, String trainNum, int hour, int min) {
		this.target = target;
		this.trainNum = trainNum;
		this.hour = hour;
		this.min = min;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getTrainNum() {
		return trainNum;
	}

	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
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

	@Override
	public String toString() {
		return "Train [target=" + target + ", trainNum=" + trainNum + ", hour=" + hour + ", min=" + min + "]";
	}

	public char[] getToString() {
		return toString;
	}

	public void setToString(char[] toString) {
		this.toString = toString;
	}
}
