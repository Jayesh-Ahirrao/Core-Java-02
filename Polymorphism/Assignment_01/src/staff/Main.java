package staff;

import utility.Employee;

public class Main {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[3];

		empArr[0] = new SalesManager();
		empArr[1] = new Programmer();
		empArr[2] = new Administrator();

		for (Employee emp : empArr) {
			System.out.println(emp);
		}
	}

}
