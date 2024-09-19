package staff;

import utility.Date;
import utility.Employee;
import utility.ITraveller;

public class Programmer extends Employee implements ITraveller {
	private String projectTitle;
	private int extraHours;
	private double chargesPerExtraHour;
	
	String passportDetails;
	int travelHours;

	public Programmer(String projectTitle, int extraHours, double chargesPerExtraHour, String passportDetails, int travelHours) {
		super();
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
		this.passportDetails = passportDetails;
		this.travelHours = travelHours;
	}

	public Programmer() {
	}

	public Programmer(Date dob, String name, int empID, double basicSalary, String projectTitle, int extraHours,
			double chargesPerExtraHour, String passportDetails, int travelHours) {
		super(dob, name, empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
		this.passportDetails = new String(passportDetails);
		this.travelHours = travelHours;
	}

	public Programmer(int empID, double basicSalary, String projectTitle, int extraHours, double chargesPerExtraHour, String passportDetails, int travelHours) {
		super(empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
		this.passportDetails = passportDetails;
		this.travelHours = travelHours;
	}

	public Programmer(int d, int m, int y, String name, int empID, double basicSalary, String projectTitle,
			int extraHours, double chargesPerExtraHour, String passportDetails, int travelHours) {
		super(d, m, y, name, empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
		this.passportDetails = passportDetails;
		this.travelHours = travelHours;
	}

	public void setPassportDetails(String passportDetails) {
		this.passportDetails = passportDetails;
	}

	public void setTravelHours(int travelHours) {
		this.travelHours = travelHours;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public int getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(int extraHours) {
		this.extraHours = extraHours;
	}

	public double getChargesPerExtraHour() {
		return chargesPerExtraHour;
	}

	public void setChargesPerExtraHour(double chargesPerExtraHour) {
		this.chargesPerExtraHour = chargesPerExtraHour;
	}

	@Override
	public String toString() {
		return super.toString() + "\nproject title= " + projectTitle + ", \nextra hours= " + extraHours
				+ ", \ncharges per extra hour= " + chargesPerExtraHour + " \npassport details: " + passportDetails + " \nhours travelled: " + travelHours;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return basicSalary + (extraHours * chargesPerExtraHour);
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
