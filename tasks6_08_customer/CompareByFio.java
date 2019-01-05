package by.htp.tasks6_08_customer;

import java.util.Comparator;

public class CompareByFio implements Comparator<Customer> {

	@Override
	public int compare(Customer cust1, Customer cust2) {
		return cust1.getFio().compareTo(cust2.getFio());
	}
}
