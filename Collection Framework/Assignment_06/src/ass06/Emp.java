package ass06;

public class Emp implements Comparable<Emp> {
	private int empId;
	private String name;
	private double salary;

	@Override
	public String toString() {
		return "EmpId=\t" + empId + " name=\t" + name + " salary=\t" + salary + "\n";
	}

	public Emp(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public Emp() {
		super();
		this.empId = 101;
		this.name = ("emp" + empId);
		this.salary = 1000000.0;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		if (this.salary < o.salary) {
			return -1;
		} else if (this.salary > o.salary) {
			return 1;
		}

		return this.empId - o.empId;
	}

}
