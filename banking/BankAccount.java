package banking;

/**
 * represents a checking/savings bank account for a customer.
 * @author Adellaide
 *
 */
public class BankAccount {

	//instance variables
	
	/**
	 * Type of account (checking/savings)
	 */
	String accountType;
	
	/**
	 * Balance for bank account
	 */
	double balance;
	
	/**
	 * Customer for this account. The variable type is the Customer class
	 */
	Customer customer;
	
	//constructor
	/**
	 * Creates a bank account of given type for given customer.
	 * @param accountType for bank account
	 * @param customer for bank account
	 */
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
		
	}
	
	//methods
	/**
	 * Deposits the given amount.
	 * @param amount to add to balance
	 */
	public void deposit(double amount) {
		this.balance = balance + amount;
	}
	/**
	 * Withdraws the given amount from balance
	 * @param amount to withdraw
	 * @throws Exception if given amount is larger than available balance.
	 */
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Amount is greater than available balance.");
		}
		this.balance = balance - amount;
	}
	
	/**
	 * Returns account type and balance for this bank account.
	 * @return string with all the info
	 */
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	/**
	 * Returns the customer name and address for this bank account.
	 * @return returns string with all the info (concatenated)
	 */
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
}
