package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 * @author Adellaide
 *
 */

public class Bank {

	public static void main(String[] args) {
		
		//creates new instance of Bank class
		Bank bank = new Bank();
		
		
		//calls the run method in the Bank class
		bank.run();

	}

	/**
	 * Runs the program by initializing and managing, bank accounts and customers.
	 */
	public void run() {
		System.out.println("Welcome to the Bank! What is your name?");
		
		//create scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		//get the next token (word) = customer's name & store in name var
		String name = scanner.next();
		
		//greet user
		System.out.println("Hello " + name + "! We are creating checking and savings accounts for you.");
		
		//create customer with given name
		Customer customer = new Customer(name);
		
		//get address from user
		System.out.println("What is your address?");
		
		//get the next token (word) = customer's address
		String address = scanner.next();
		
		//set the customer's address
		customer.setAddress(address);
		
		//create a checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		//create a savings account for customer
		BankAccount savingsAccount = new BankAccount("savings", customer);
		
		//gets and prints the customer info associated with the checking account
		System.out.println(); //blank line
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		//get and print account info for the checking account
		System.out.println("Checking account");
		System.out.println(checkingAccount.getAccountInfo());
		
		System.out.println("Savings account");
		System.out.println(savingsAccount.getAccountInfo());
		
		//deposits
		
		//into checking account
		System.out.println();
		System.out.println("Enter a (decimal) value to deposit into your checking account");
		double amount = scanner.nextDouble(); // the value/ token is casted as double (not string)
		checkingAccount.deposit(amount); //deposits amount entered by user into checking acct
		
		//into savings account
		System.out.println();
		System.out.println("Enter a (decimal) value to deposit into your savings account");
		amount = scanner.nextDouble(); // the value/ token is casted as double
		savingsAccount.deposit(amount); //deposit into savings account
		
		//print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		//withdrawals
		
		//from checking account
		System.out.println(); //blank line
		System.out.println("Enter a (decimal) value to withdraw from your checking account");
		amount = scanner.nextDouble(); //get next token as a double
		
		//withdraw from checking account
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			//e.printStackTrace();
			//prints custom error message from withdraw method
			System.out.println(e.getMessage());
			
		} 
		
		//from savings account
		System.out.println(); //blank line
		System.out.println("Enter a (decimal) value to withdraw from your savings account");
		amount = scanner.nextDouble(); //get next token as a double
		
		//withdraw from savings account
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			//e.printStackTrace();
			//prints custom error message from withdraw method
			System.out.println(e.getMessage());
					
		} 
		
		//print new balances
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close(); //close the scanner -> no input is expected anymore
		
	}
	
}
