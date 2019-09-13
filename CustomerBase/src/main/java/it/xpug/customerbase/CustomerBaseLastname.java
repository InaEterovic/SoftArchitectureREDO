package it.xpug.customerbase;

import java.util.ArrayList;
import java.util.List;

public class CustomerBaseLastname extends CustomerBase{
	int credit;
	public CustomerBaseLastname(int credit) {
		this.credit = credit;
	}
	
	public List<Customer> findBy(){
		System.out.print(credit);
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.getCredit() > credit) {
				result.add(customer);
			}
		}
		return result;
	}
	
}
