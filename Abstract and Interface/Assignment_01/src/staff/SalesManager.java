package staff;
import utility.*;

public class SalesManager extends Employee {
	private double salesTarget;
	private double perCommision;
	
	public SalesManager() {
	}
	public SalesManager(Date dob, String name, int empID, double basicSalary, double salesTarget, double perCommision) {
		super(dob, name, empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.salesTarget = salesTarget;
		this.perCommision = perCommision;
	}
	public SalesManager(int empID, double basicSalary, double salesTarget, double perCommision) {
		super(empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.salesTarget= salesTarget;
		this.perCommision = perCommision;
	}
	public SalesManager(int d, int m, int y, String name, int empID, double basicSalary, double salesTarget, double perCommision) {
		super(d, m, y, name, empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.salesTarget = salesTarget;
		this.perCommision = perCommision;
	}
	public double getSalesTarget() {
		return salesTarget;
	}
	public void setSalesTarget(double salesTarget) {
		this.salesTarget = salesTarget;
	}
	public double getPerCommision() {
		return perCommision;
	}
	public void setPerCommision(double perCommision) {
		this.perCommision = perCommision;
	}
	@Override
	public String toString() {
		return super.toString() + "\nsales target= " + salesTarget + ", per commision= " + perCommision;
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return basicSalary + (salesTarget * perCommision / 100);
	}
}
