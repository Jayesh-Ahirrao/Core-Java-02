package staff;

import utility.Date;
import utility.Employee;

public class Programmer extends Employee {
	private String projectTitle;
	private int extraHours;
	private double chargesPerExtraHour;
	
	public Programmer(String projectTitle, int extraHours, double chargesPerExtraHour) {
		super();
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
	}

	public Programmer() {
	}

	public Programmer(Date dob, String name, int empID, double basicSalary, String projectTitle, int extraHours, double chargesPerExtraHour) {
		super(dob, name, empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
	}

	public Programmer(int empID, double basicSalary, String projectTitle, int extraHours, double chargesPerExtraHour) {
		super(empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
	}

	public Programmer(int d, int m, int y, String name, int empID, double basicSalary, String projectTitle, int extraHours, double chargesPerExtraHour) {
		super(d, m, y, name, empID, basicSalary);
		// TODO Auto-generated constructor stub
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargesPerExtraHour = chargesPerExtraHour;
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
		return super.toString()  + "\nproject title= " + projectTitle + ", \nextra hours= " + extraHours + ", \ncharges per extra hour= "
				+ chargesPerExtraHour;
	}
	
		
	
	
}
