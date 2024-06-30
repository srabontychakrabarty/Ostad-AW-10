package root;

public class CheckingAccount extends BankAccount {
	
	 private static final double WITHDRAWAL_LIMIT = 1000.0;
	    private static final double WITHDRAWAL_FEE = 5.0;

	    public CheckingAccount(double initialBalance) {
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
