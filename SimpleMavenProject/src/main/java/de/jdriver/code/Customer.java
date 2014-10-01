package de.jdriver.code;

public class Customer {
	
	String firstName = null;
	String lastName = null;
	
	public String getCustomerName() {
		
		return (this.firstName + this.lastName); 
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
