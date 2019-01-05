package by.htp.tasks6_08_customer;

import java.util.ArrayList;

public class SortByFio {
	public void sortByFio(ArrayList<Customer> customers) {
			customers.sort(new CompareByFio());
			for(int i = 0; i < customers.size(); i++) {
				Customer cust;
				cust = customers.get(i);
				System.out.println(cust.getId() + " / " + cust.getFio() + " / " + cust.getAddress() + " / " + cust.getCardNum() + " / " + cust.getBankNum());
			}
	}
}
