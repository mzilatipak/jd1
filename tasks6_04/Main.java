package by.htp.tasks6_04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Train tr1 = new Train("Brest", "tr0274", 8, 00);
		Train tr2 = new Train("Grodno", "tr2654", 12, 30);
		Train tr3 = new Train("Gomel", "tr2354", 11, 00);
		Train tr4 = new Train("Vitebsk", "tr0125", 13, 00);
		Train tr5 = new Train("Brest", "tr0727", 15, 30);
		
/*		ArrayList<Train> trains = new ArrayList<>();
		trains.add(tr1);
		trains.add(tr2);
		trains.add(tr3);
		trains.add(tr4);
		trains.add(tr5);
*/		
		Train[] trains = new Train[5];
		trains[0] = tr1;
		trains[1] = tr2;
		trains[2] = tr3;
		trains[3] = tr4;
		trains[4] = tr5;
		
	SortByTarget sort = new SortByTarget();
		Train[] trainsNew = new Train[5];
		trainsNew =sort.sortByTarget(trains); 

		for (Train train : trainsNew){ 
		System.out.println (train.getToString());
		}
	}
}
