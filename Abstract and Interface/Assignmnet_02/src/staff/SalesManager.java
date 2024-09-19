package staff;

import utility.*;

public class SalesManager extends Employee implements ITraveller {
	private double salesTarget;
	private double perCommision;

	String passportDetails;
	int travelHours;

	public SalesManager() {
	}

	public SalesManager(Date dob, String name, int empID, double basicSalary, double salesTarget, double perCommision,
			String passportDetails, int travelHours) {
		super(dob, name, empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.salesTarget = salesTarget;
		this.perCommision = perCommision;
		this.passportDetails = passportDetails;
		this.travelHours = travelHours;
	}

	public SalesManager(int empID, double basicSalary, double salesTarget, double perCommision, String passportDetails,
			int travelHours) {
		super(empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.salesTarget = salesTarget;
		this.perCommision = perCommision;
		this.passportDetails = passportDetails;
		this.travelHours = travelHours;
	}

	public SalesManager(int d, int m, int y, String name, int empID, double basicSalary, double salesTarget,
			double perCommision, String passportDetails, int travelHours) {
		super(d, m, y, name, empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.salesTarget = salesTarget;
		this.perCommision = perCommision;
		this.passportDetails = passportDetails;
		this.travelHours = travelHours;
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

	public void setPassportDetails(String passportDetails) {
		this.passportDetails = passportDetails;
	}

	public void setTravelHours(int travelHours) {
		this.travelHours = travelHours;
	}

	@Override
	public String toString() {
		return super.toString() + "\nsales target= " + salesTarget + ", \nper commision= " + perCommision + " \nPassport: " + passportDetails + " \nHours travelled: " + travelHours;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return basicSalary + (salesTarget * perCommision / 100);
	}

	@Override
	public String getPassportDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTravelHours() {
		// TODO Auto-generated method stub
		return 0;
	}
}
