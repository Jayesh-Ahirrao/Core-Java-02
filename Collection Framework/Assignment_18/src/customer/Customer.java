package customer;

public class Customer implements Comparable<Customer> {
	String name;
	int id;

	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Name: " + name + " id: " + id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Customer o) {
		return this.id - o.id;
	}

}
