package ass06;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Emp> set = new TreeSet<>();

		set.add(new Emp(103, "Bob", 1500000, "hr"));
		set.add(new Emp(104, "Charlie", 1800000, "hr"));
		set.add(new Emp(109, "Hannah", 2000000, "hr"));
		set.add(new Emp(116, "John", 1750000, "hr")); // Duplicate name
		set.add(new Emp(121, "Eve", 1800000, "hr")); // Duplicate name
		set.add(new Emp(124, "John", 1750000, "hr")); // Duplicate name

		set.add(new Emp(105, "David", 1700000, "finance"));
		set.add(new Emp(106, "Eve", 1700000, "finance"));
		set.add(new Emp(110, "John", 1900000, "finance")); // Duplicate name
		set.add(new Emp(113, "Michael", 2000000, "finance"));
		set.add(new Emp(118, "Bob", 1650000, "finance")); // Duplicate name
		set.add(new Emp(120, "Charlie", 1600000, "finance")); // Duplicate name
		set.add(new Emp(123, "Olivia", 2000000, "finance")); // Duplicate name
		set.add(new Emp(125, "Frank", 1550000, "finance")); // Duplicate name

		set.add(new Emp(101, "John", 1800000, "tech"));
		set.add(new Emp(102, "Alice", 1600000, "tech"));
		set.add(new Emp(107, "Frank", 1800000, "tech"));
		set.add(new Emp(108, "Grace", 1400000, "tech"));
		set.add(new Emp(111, "Jack", 1600000, "tech"));
		set.add(new Emp(114, "Jack", 1600000, "tech")); // Duplicate name
		set.add(new Emp(117, "Jack", 1600000, "tech"));
		set.add(new Emp(119, "David", 1900000, "tech")); // Duplicate name
		set.add(new Emp(122, "Grace", 1500000, "tech")); // Duplicate name

		for (Emp e : set) {
			System.out.println(e);
		}
	}
}
