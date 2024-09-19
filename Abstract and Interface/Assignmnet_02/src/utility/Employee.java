package utility;

public abstract class Employee extends Person {
	private int empID;
//	private double basicSalary;
	protected double basicSalary;

	public Employee() {

	}

	public Employee(Date dob, String name, int empID, double basicSalary) {
		super(dob, name);
		this.empID = empID;
		this.basicSalary = basicSalary;
	}

	public Employee(int d, int m, int y, String name, int empID, double basicSalary) {
		super(d, m, y, name);
		this.empID = empID;
		this.basicSalary = basicSalary;
	}
	

	public double getBasicSalary() {
		return basicSalary;
	}

	public Employee(int empID, double basicSalary) {
		super();
		this.empID = empID;
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return super.toString()  +  "\nempID= " + empID + ", \nbasicSalary= " + basicSalary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	abstract public double calculateSalary();

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
