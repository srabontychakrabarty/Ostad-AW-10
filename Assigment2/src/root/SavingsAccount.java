package root;

public class SavingsAccount extends BankAccount {
	
	private static final double WITHDRAWAL_LIMIT = 500.0;
    private static final double WITHDRAWAL_FEE = 2.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal limit exceeded! Maximum withdrawal allowed is Tk." + WITHDRAWAL_LIMIT);
        } else if (getBalance() >= amount) {
            super.withdraw(amount + WITHDRAWAL_FEE);
            System.out.println("Withdrawal fee: Tk." + WITHDRAWAL_FEE);
        } else {
            System.out.println("Insufficient funds!");
        }
    }


}
