package staff;

import utility.Date;
import utility.Employee;
import utility.ITraveller;

public class Main {
	public static void displayTravellersDetails(Employee[] arr) {
		int totalHoursTravelled = 0;

		for (Employee emp : arr) {

			if (emp instanceof ITraveller) {
				ITraveller traveller = (ITraveller) emp;
				System.out.println(emp.getName() + " has passport: " + traveller.getPassportDetails());
				totalHoursTravelled += traveller.getTravelHours();
			}
			

//			if (emp instanceof ITraveller) {
//				System.out.println();
//				System.out.println(emp.getName() + " has passport: " + ((ITraveller) emp).getPassportDetails()); // Giving
//																													// NULL
//
//				System.out.println(((ITraveller) emp).getPassportDetails());
//				totalHoursTravelled += ((ITraveller) emp).getTravelHours();
//			}
		}

		System.out.println("Total hours travlled by all employees are: " + totalHoursTravelled);
	}

	public static void main(String[] args) {
		Employee[] empArr = new Employee[3];

		empArr[0] = new SalesManager(new Date(1, 1, 2001), "Amit", 101, 50000, 500000, 5, "passport 01", 20);
		empArr[1] = new Programmer(new Date(2, 2, 2002), "Jayesh", 102, 400000, "Bank App", 10, 25000, "passport 02",
				50);
		empArr[2] = new Administrator(new Date(3, 3, 2003), "rahul", 103, 80000, 25000);

		displayTravellersDetails(empArr);
	}
}