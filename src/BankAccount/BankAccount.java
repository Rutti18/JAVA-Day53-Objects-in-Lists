import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {
	private String accntHolderName;
	private double accntBalance;
	private int accountno;
	static List bankAccounts = new ArrayList();
	
	// constructor with arguments
	public BankAccount(String holderName, double accntBal, int trackAccount) {
		this.accntBalance = accntBal;
		this.accntHolderName = holderName;
		this.accountno = trackAccount;
	}
	
	//no argument constructor
	public BankAccount() {}
	
	
	//Deposit amt
	private void deposit(double depositAmt) {
		accntBalance += depositAmt;
		System.out.println("Account balance after deposit "+accntBalance);
		
	}
	
	//withdraw amt
	private void withdraw(double withdrawAmt) {
		accntBalance -= withdrawAmt;
		System.out.println("Account balance after withdrawl "+accntBalance);
	}

	//print account details
	private void printAccountDetails() {
		System.out.println(accntHolderName+"'s account balance is: "+accntBalance);
	}
	
	//main menu to display to user
	private void mainMenu(BankAccount account) {
		if(account == null ) return;
		System.out.println("Hello "+account.getAccntHolderName() +"!");
		System.out.println("Welcome to the Main Menu, What would you like to do today? \n");

		
		  Scanner scanObj = new Scanner(System.in);
		  String input = "";
		  int acctNum = 0;
		  double amt = 0;
		  
		do {
			System.out.println("1. To check account balance \n");
			System.out.println("2. To make a withdraw \n");
			System.out.println("3. To make a deposit \n");
			System.out.println("4. To make a transfer to another account \n");
			System.out.println("0. To exit \n");
			input = scanObj.nextLine();
			  if(input.equals("1")) {
				  account.printAccountDetails();
				  
			  }else if(input.equals("2")) {
				  System.out.println("Enter the amount to withdraw \n");
				  input = scanObj.nextLine();
				  account.withdraw(Double.parseDouble(input));
			  }else if(input.equals("3")) {
				  System.out.println("Enter the amount to deposit \n");
				  input = scanObj.nextLine();
				  account.deposit(Double.parseDouble(input));
			  }else if(input.equals("4")) {
					System.out.println("Please enter the account number to transfer to \n");
					input = scanObj.nextLine();
					acctNum = Integer.parseInt(input);
					
					if(account.getAccountno() == acctNum) { //account number exists
						  System.out.println("Enter the amount to deposit \n");
						  input = scanObj.nextLine();
						  amt = Double.parseDouble(input);
						  account.transfer(account, amt);
					}else {
						System.out.println("Account number does not exist \n");
					}
				
			  }
		  } while(!input.equals("0"));
	}
	
	public int getAccountno() {
		return accountno;
	}

	private void transfer(BankAccount account, double amount) {
		if(account == null ) return;
		account.deposit(amount);
	}
	
	public String getAccntHolderName() {
		return accntHolderName;
	}

	public double getAccntBalance() {
		return accntBalance;
	}



	public static void main(String[] args) {
		String input = "";
		String name = "";
		BankAccount account = null;
		int accountno = 0;
		double balance = 0.0;
		System.out.println("Hello world! Welcome to the Bank of Matt! \n");
		System.out.println("Are you an existing customer? (-1 to exit) \n");
		System.out.println("1. Yes \n");
		System.out.println("2. No \n");
		
		
		  Scanner scanObj = new Scanner(System.in);
		  input = scanObj.nextLine();
		  
		  while(!input.equals("-1")) {
			  if(input.equals("2")) {
				  System.out.println("Let's make a new account! \n");
				  System.out.println("What is the name for the account?");
				  input = scanObj.nextLine();
				  name = input;
				  System.out.println("What is the beginning balance for the account?");
				  input = scanObj.nextLine();
				  balance = Double.parseDouble(input);
				  accountno +=1;
				  account = new BankAccount(name, balance,accountno);
				  bankAccounts.add(account);
				  account.deposit(balance);
				  account.withdraw(balance);
				  account.printAccountDetails();
				  account.mainMenu(account);
				  break;
			  } else break;
			
		 }

		}
}
