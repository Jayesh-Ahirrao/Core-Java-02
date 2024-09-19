package staff;

import utility.Employee;

public class Main {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[3];

		empArr[0] = new SalesManager(101, 100000, 100, 5);
		empArr[1] = new Programmer(102, 200000, "Ecom", 20, 2);
		empArr[2] = new Administrator(103, 50000, 8000);
		
		Test.showMoreDetails(empArr);
	}
}