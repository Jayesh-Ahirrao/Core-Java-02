package staff;

import utility.Employee;

public class Test {
	static void showMoreDetails(Employee[] arr) {
		for (Employee emp : arr) {
			System.out.println(emp.getName());
			System.out.println(emp.getDob());
			System.out.println(emp.getEmpID());
			System.out.println(emp.getBasicSalary());
//			above methods are accesible cus they are present in emp type 
//			to access methods in the obj to which emp reffering
//			it should either be overridden, or downcasted
//			doing intelligent casting to avoid class cast exception at runtime
			if (emp instanceof Administrator) {
				System.out.println("Instance of admin");
				System.out.println(((Administrator) emp).getAllowance());
			} else if (emp instanceof SalesManager) {
				System.out.println("Instance of salesManager");
				System.out.println(((SalesManager) emp).getSalesTarget());
			} else if (emp instanceof Programmer) {
				System.out.println("Instance of programmer");
				System.out.println(((Programmer) emp).getExtraHours());
			}

			System.out.println("****************************************");
		}
	}
}
