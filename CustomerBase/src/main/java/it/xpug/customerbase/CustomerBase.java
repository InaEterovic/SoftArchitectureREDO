package it.xpug.customerbase;
import java.util.*;


public class CustomerBase {

	protected List<Customer> customers= new ArrayList<Customer>();

	public void add(Customer customer) {
		customers.add(customer);
	}
	public List<Customer> findBy(){
		 throw new Error("Should be unreachable");
	}

	public List<Customer> findByLastName(String lastName) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (isSameLastName(lastName, customer)) 
				result.add(customer);
		}
		return result;
	}

	private boolean isSameLastName(String lastName, Customer customer) {
		return customer.getLastName()==lastName;
	}

	public List<Customer> findByFirstAndLastName(String firstName, String lastName) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (isSameFullName(firstName, lastName, customer) )
				result.add(customer);			
		}
		return result;
	}
	private boolean isSameFullName(String firstName, String lastName, Customer customer) {
		return customer.getFirstName()==firstName && isSameLastName(lastName, customer);
	}

//	public List<Customer> findByCreditGreaterThan(int credit) {
//		List<Customer> result = new ArrayList<Customer>();
//		for (Customer customer : customers) {
//			if (customer.getCredit() > credit) {
//				result.add(customer);
//			}
//		}
//		return result;
//	}

}
