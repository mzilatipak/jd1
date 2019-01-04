package by.htp.tasks6_08_customer;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Customer cust1 = new Customer(123, "Ivanov Ivan Ivanovich", "Minsk", 1234567890, 123654789);
		Customer cust2 = new Customer(615, "Petrov Petr Petrovich", "Pinsk", 9874560321, 963214785);
		Customer cust3 = new Customer(831, "Denisov Denis Denisovich", "Omsk", 1478502369, 987456321);
		Customer cust4 = new Customer(645, "Sidorov Sidor Sidorovich", "Bryansk", 3609852147, 258741369);
		Customer cust5 = new Customer(163, "Semenov Semen Semenovich", "Minsk", 9630258741, 852147963);
		Customer cust6 = new Customer(152, "Alekseev Aleksey Alekseevich", "brest", 1236908745, 654789321);
		
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		customers.add(cust6);
	}
}
