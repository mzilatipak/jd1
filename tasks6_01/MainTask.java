package by.htp.tasks6_01;

public class MainTask {
	
	public static void main(String[] args) {
	
	Actions act = new Actions();
	
	act.setX(2);	
	act.setY(3);
	
	act.print(act.getX(), act.getY());
	act.minMax(act.getX(), act.getY());
	act.sum(act.getX(), act.getY());
	
	}		
}
