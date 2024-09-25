package customer;

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
		
	@Override
	public String toString() {
		return super.toString() + " RegNumber= " + regNumber;
	}

}
