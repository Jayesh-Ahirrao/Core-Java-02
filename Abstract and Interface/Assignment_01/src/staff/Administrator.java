package staff;

import utility.Date;
import utility.Employee;

public class Administrator extends Employee {
	private double allowance;

	public Administrator(double allowance) {
		super();
		this.allowance = allowance;
	}

	public Administrator() {
	}

	public Administrator(Date dob, String name, int empID, double basicSalary, double allowance) {
		super(dob, name, empID, basicSalary);
		this.allowance = allowance;
	}

	public Administrator(int empID, double basicSalary, double allowance) {
		super(empID, basicSalary);
		this.allowance = allowance;
	}

	public Administrator(int d, int m, int y, String name, int empID, double basicSalary, double allowance) {
		super(d, m, y, name, empID, basicSalary);
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return super.toString() + "\nallowance= " + allowance;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return basicSalary + allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
}
