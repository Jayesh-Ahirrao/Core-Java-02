package utils;

public class Student {
	int rollNum;
	String name;
	int marks;

	static int studentCount;

	static {
		studentCount = 0;
	}

	public Student(int rollNum, String name, int marks) {
		super();
		studentCount++;
		this.rollNum = rollNum;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
		this.rollNum = ++studentCount;
		this.name = ("student " + rollNum);
		this.marks = 100;
	}

	@Override
	public String toString() {
		return "Student \n\tRoll number: " + rollNum + ", \n\tname: " + name + ", \n\tmarks: " + marks;
	}

	public char calcGrade() {
		if (marks > 90 && marks <= 100) {
			return 'A';
		} else if (marks > 80 && marks <= 90) {
			return 'B';
		} else if (marks > 70 && marks <= 80) {
			return 'C';
		}

		return 'D';
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}
	

}
