package by.htp.tasks6_08_customer;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Customer cust1 = new Customer(123, "Ivanov Ivan Ivanovich", "Minsk", 123456789, 123654789);
		Customer cust2 = new Customer(615, "Petrov Petr Petrovich", "Pinsk", 987456321, 963214785);
		Customer cust3 = new Customer(831, "Denisov Denis Denisovich", "Omsk", 147852369, 987456321);
		Customer cust4 = new Customer(645, "Sidorov Sidor Sidorovich", "Bryansk", 369852147, 258741369);
		Customer cust5 = new Customer(163, "Semenov Semen Semenovich", "Minsk", 963258741, 852147963);
		Customer cust6 = new Customer(152, "Alekseev Aleksey Alekseevich", "Brest", 1236908745, 654789321);
		
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		customers.add(cust6);
		
		SortByFio srtByFio = new SortByFio();
		System.out.println("Spisok customerov v alphabet poryadke: ");
		srtByFio.sortByFio(customers);
		
		CardActs cardAct = new CardActs();
//		System.out.println("Customers ch'i cards v zadannom diapozone: ");
		cardAct.cardActs(customers);
	}
	

//	System.out.println(customers.);
}
