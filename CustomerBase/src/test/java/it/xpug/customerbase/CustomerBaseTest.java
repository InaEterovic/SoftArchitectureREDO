package it.xpug.customerbase;

import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.*;

import org.junit.*;

import it.xpug.customerbase.Customer;
import it.xpug.customerbase.CustomerBase;


public class CustomerBaseTest {

	private Customer alice = new Customer("Alice", "Rossi", 10000);
	private Customer bob = new Customer("Bob", "Rossi", 20000);
	private Customer charlie = new Customer("Charlie", "Bianchi", 30000);

	private CustomerBase customerBase = new CustomerBase();
	CustomerBase customerBaseLastName = new CustomerBaseLastname(20000);

	@Before
	public void setUp() throws Exception {
		customerBase.add(alice);
		customerBase.add(bob);
		customerBase.add(charlie);
	}

	@Test
	public void findByLastName() throws Exception {
		List<Customer> found = customerBase.findByLastName("Rossi");
		assertThat(found, is(asList(alice, bob)));
	}

	@Test
	public void findByFirstAndLastName() throws Exception {
		List<Customer> found = customerBase.findByFirstAndLastName("Alice", "Rossi");
		assertThat(found, is(asList(alice)));
	}

	@Test
	public void findWithCreditGreaterThan() throws Exception {
		
		List<Customer> found = customerBase.findBy();
		assertThat(found, is(asList(charlie)));
	}

	//TODO:
	@Test
	public void findWithCreditLessThan() throws Exception {
	
	}


}
