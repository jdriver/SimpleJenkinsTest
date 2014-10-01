package de.jdriver.test;

import static org.junit.Assert.*;

import org.junit.Test;

import de.jdriver.code.Customer;

public class CustomerTest {

	@Test
	public void testCustomerName() {
		
		Customer c = new Customer();
		c.setFirstName("firstName");
		c.setLastName("lastName");
		
		assertEquals("firstNamelastName", c.getCustomerName());
	}

}
