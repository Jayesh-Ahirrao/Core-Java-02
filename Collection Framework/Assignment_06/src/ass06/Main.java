package ass06;

import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Emp> set = new TreeSet<>();
		
		set.add(new Emp(101, "one", 1800000));
		set.add(new Emp(102, "two", 1600000));
		set.add(new Emp(103, "three", 1700000));
		set.add(new Emp(104, "four", 1800000));
		
		for(Emp e: set) {
			System.out.println(e);
		}
	}
}
