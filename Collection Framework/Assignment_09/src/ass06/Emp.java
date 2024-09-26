package ass06;

public class Emp implements Comparable<Emp> {
	private int empId;
	private String name;
	private double salary;
	private String dept;

	@Override
	public String toString() {
		return "EmpId: " + empId + "\tname: " + name + "\tsalary: " + salary + "\tdept: " + dept + "\n";
	}

	public Emp(int empId, String name, double salary, String dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public Emp() {
		super();
		this.empId = 101;
		this.name = ("emp" + empId);
		this.salary = 1000000.0;
		this.dept = "tech";
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
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
		// sorting based on alph order of dept
		int diff = this.dept.compareTo(o.dept);

		if (diff == 0) {
			// if dept same sorting based on salary from high to low
			diff = Double.compare(o.salary, this.salary);
		}

		if (diff == 0) {
			// if salary same then sorting based on name by alph order
			diff = this.name.compareTo(o.name);
		}

		if (diff == 0) {
			diff = this.empId - o.empId;
		}

		return diff;
	}

}
