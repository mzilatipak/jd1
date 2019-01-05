package by.htp.tasks6_08_customer;

import java.util.ArrayList;
import java.util.Scanner;

public class CardActs {
	
	public void cardActs(ArrayList<Customer> customers) {
		long a, z; 
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Vvedite nachalo diapozona poiska cards: ");
		a = sc.nextLong();
		System.out.println("Vvedite konec diapozona poiska cards: ");
		z = sc.nextLong();
		
		for (int i = 0; i < customers.size(); i++) {
			Customer card = customers.get(i);
			
			if (card.getCardNum() >= a && card.getCardNum() <= z) {
//				System.out.println("Customers ch'i cards v zadannom diapozone: ");
				System.out.println(card.getId() + " / " + card.getFio() + " / " + card.getAddress() + " / " + card.getCardNum() + " / " + card.getBankNum());
			}
		}
	}
}
