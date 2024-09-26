package customer;

import java.util.Set;
import java.util.TreeSet;

public class CustomerDemo {
	public static void main(String[] args) {
		Set<Customer> set = new TreeSet<>();

		set.add(new Customer("CCC", 7500));
		set.add(new Customer("BBB", 12000));
		set.add(new Customer("GGG", 14300));
		set.add(new Customer("DDD", 17500));
		set.add(new Customer("AAA", 15000));

		set.add(new Customer("FFF", 29000));
		set.add(new Customer("EEE", 21500));

		for (Customer c : set) {
			System.out.println(c);
		}
	}
}
