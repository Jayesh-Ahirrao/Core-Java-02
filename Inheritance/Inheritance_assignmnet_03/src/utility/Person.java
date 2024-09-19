package utility;

public class Person {
	private Date dob;
	private String name;

	@Override
	public String toString() {
		return "\nname= " + name + ", \ndob= " + dob;
	}

	public Person() {
		this.dob = new Date();
		this.name = "Person";
	}

	public Person(int d, int m, int y, String name) {
		this.dob = new Date(d, m, y);
		this.name = name;
	}

}
