package staff;

import utility.Date;
import utility.Employee;

public class Main {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[3];

		empArr[0] = new SalesManager(new Date(1, 1, 2001), "Amit", 101, 50000, 500000, 5);
		empArr[1] = new Programmer(new Date(2, 2, 2002), "Jayesh", 102, 400000, "Bank App", 10, 25000);
		empArr[2] = new Administrator(new Date(3, 3, 2003), "rahul", 103, 80000, 25000);

		double totalSalaryExpense = 0;
		double currentSalary = 0;
		for (Employee emp : empArr) {
			currentSalary = emp.calculateSalary();
			totalSalaryExpense += currentSalary;
			System.out.println(emp.getName() + ": " + currentSalary);
		}
		
		System.out.println("Total salary org has to pay: " + totalSalaryExpense);
	}
}