package student;

import java.util.Objects;

public class Student {
	private int studentId;
	private String name;
	private String city;
	private double percentage;

	public Student() {
		super();
		this.studentId = 101;
		this.name = "stud 01";
		this.city = "Nashik";
		this.percentage = 100.0;
	}

	public Student(int studentId, String name, String city, double percentage) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "studentId:  " + studentId + " name: " + name + " city: " + city + " percentage: " + percentage + "\n";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public int hashCode() {
		if (city.equals("pune")) {
			return 10;
		}
		if (city.equals("mumbai")) {
			return 20;
		}
		if (city.equals("nagpur")) {
			return 400;
		}

		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(percentage) == Double.doubleToLongBits(other.percentage)
				&& studentId == other.studentId;
	}
}
