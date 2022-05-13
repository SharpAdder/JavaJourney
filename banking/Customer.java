package banking;
/**
 * Represents a customer of a bank.
 * @author Adellaide
 *
 */

public class Customer {
	//instance variables
	
	/**
	 * Name of customer
	 */
	String name;
	
	/**
	 * Address of customer
	 */
	String address;
	
	//constructor -> same name as class
	/**
	 * Creates a customer with the given name
	 * @param name of customer
	 */
	public Customer(String name) {
		//sets instance variable name to given name (param)
		this.name = name;
		
	}
	
	//methods
	/**
	 * Sets the address of customer to the given address
	 * @param address for customer
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Returns customer name
	 * @return name of customer -> type String
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Returns customer's address
	 * @return address of customer
	 */
	public String getAddress() {
		return this.address;
	}
}
