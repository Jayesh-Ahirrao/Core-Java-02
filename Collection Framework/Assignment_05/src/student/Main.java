package student;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Student> studSet = new HashSet<>();

		studSet.add(new Student(101, "Jayesh", "nashik", 100));
		studSet.add(new Student(101, "Satyam", "mumbai", 100));
		studSet.add(new Student(101, "Rohit", "nagpur", 100));
		studSet.add(new Student(101, "Tejas", "pune", 100));
		studSet.add(new Student(101, "kunal", "pune", 100));
		
		
		System.out.println(studSet);
	}
}
