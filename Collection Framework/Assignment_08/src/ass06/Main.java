package ass06;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Emp> set = new TreeSet<>((a, b) -> {
			int diff = Double.compare(a.getSalary(), b.getSalary());
			if (diff == 0) {
				diff = a.getEmpId() - b.getEmpId();
			}

			return diff;
		});

		set.add(new Emp(101, "one", 1800000));
		set.add(new Emp(102, "two", 1600000));
		set.add(new Emp(103, "three", 1700000));
		set.add(new Emp(104, "four", 1800000));

		for (Emp e : set) {
			System.out.println(e);
		}
	}
}

/*
 * public class Main { public static void main(String[] args) { Comparator<Emp>
 * c = new Comparator<Emp>() {
 * 
 * @Override public int compare(Emp o1, Emp o2) { // TODO Auto-generated method
 * stub if (o1.getSalary() < o2.getSalary()) { return -1; } if (o1.getSalary() >
 * o2.getSalary()) { return 1; }
 * 
 * return o1.getEmpId() - o2.getEmpId(); } };
 * 
 * Set<Emp> set = new TreeSet<>(c);
 * 
 * set.add(new Emp(101, "one", 1800000)); set.add(new Emp(102, "two", 1600000));
 * set.add(new Emp(103, "three", 1700000)); set.add(new Emp(104, "four",
 * 1800000));
 * 
 * for (Emp e : set) { System.out.println(e); } } }
 * 
 */