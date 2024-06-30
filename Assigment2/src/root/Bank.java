package root;

public class Bank {

	public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        savingsAccount.withdraw(200.0);
        savingsAccount.withdraw(600.0);

        CheckingAccount checkingAccount = new CheckingAccount(2000.0);
        checkingAccount.withdraw(500.0);
        checkingAccount.withdraw(1500.0);
    }
}
