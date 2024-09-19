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

	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(Date dob, String name) {
		this.dob = dob;
		this.name = name;
	}

	public Person(int d, int m, int y, String name) {
		this.dob = new Date(d, m, y);
		this.name = name;
	}

}
