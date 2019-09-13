package it.xpug.customerbase;

public class Customer {

	private String firstName;
	private String lastName;
	private int credit;

	public Customer(String firstName, String lastName, int credit) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.credit = credit;
	}

	@Override
	public String toString() {
		return String.format("(Customer %s %s)", firstName, lastName);
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getCredit() {
		return credit;
	}

}
