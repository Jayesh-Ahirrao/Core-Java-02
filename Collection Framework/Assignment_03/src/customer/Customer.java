package customer;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String contactNumber;

	public Customer() {
		this.name = "Customer";
		this.email = "cus@s.com";
		this.contactNumber = "1234567890";
	}

	public Customer(String name, String email, String contactNumber) {
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		this.name = sc.nextLine();

		System.out.println("Enter email:");
		this.email = sc.nextLine();

		System.out.println("Enter contact number:");
		this.contactNumber = sc.nextLine();
	}

	@Override
	public String toString() {
		return "name= " + name + ", email= " + email + ", contactNumber= " + contactNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
