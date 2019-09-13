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
			if (customer.getLastName()==lastName) 
				result.add(customer);
		}
		return result;
	}

	public List<Customer> findByFirstAndLastName(String firstName, String lastName) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.getFirstName()==firstName && customer.getLastName()==lastName )
				result.add(customer);			
		}
		return result;
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
