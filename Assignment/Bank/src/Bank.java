import com.bank.account.Account;

public class Bank {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.createAccount();
		account.deposit(1000.98f);
		account.withdraw(261532.98f);
		account.withdraw(500.53f);
		account.getAmount();
		account.showAccountDetails();
	}
}
