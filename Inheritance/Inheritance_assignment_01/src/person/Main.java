package person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person emp = new Employee();
		Person emp2 = new Employee(new Date(1, 2,1999),"amit", 101, 100000.0);
		Person emp3 = new Employee(1, 12, 1999,"amit", 102, 100000.0);
		
		
		System.out.println(emp);
		System.out.println(emp2);
		System.out.println(emp3);
	}

}
