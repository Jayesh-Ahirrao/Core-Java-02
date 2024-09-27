package customer;

import java.util.Scanner;

public class RegCustomer extends Customer {
	private int regNumber;

	public RegCustomer(String name, String email, String contactNumber, int regNumber) {
		super(name, email, contactNumber);
		this.regNumber = regNumber;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		setName(sc.nextLine());

		System.out.println("Enter email:");
		setEmail(sc.nextLine());

		System.out.println("Enter contact number:");
		setContactNumber(sc.nextLine());

		System.out.println("Enter Registration Number: ");
		this.regNumber = sc.nextInt();
	}

	@Override
	public String toString() {
		return super.toString() + " RegNumber= " + regNumber;
	}

}
