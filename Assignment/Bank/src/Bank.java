import java.util.Scanner;

import com.bank.account.Account;

public class Bank {
	
	public static void printMenu() {
		
		System.out.println("1. Show Balance");
		System.out.println("2. Show Account Details");
		System.out.println("3. Deposit money");
		System.out.println("4. Withdraw Money");
		System.out.println("5. Exit");
	}

	public static void main(String[] args) {
		
		Account account = new Account();
		account.createAccount();
		float amount;
		int choice = -1;
		
		while(true) {
			printMenu();
			Scanner scanner = new Scanner(System.in);
			choice  = scanner.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Balance - " + account.getAmount());
				break;
			
			case 2:
				account.showAccountDetails();
				break;
				
			case 3:
				
				System.out.println("Enter amount t0 deposit");
				amount = scanner.nextFloat();
				account.deposit(amount);
				break;
				
			case 4:
				
				System.out.println("Enter amount to withdraw");
				amount = scanner.nextFloat();
				account.withdraw(amount);
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid Input");
				
			
			
		}

		
	}
		
		
		
		
		
	}
}

