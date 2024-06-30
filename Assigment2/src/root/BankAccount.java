package root;

public class BankAccount {
	
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited Tk." + amount + ". New balance: Tk." + balance);
	    }

	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrew Tk." + amount + ". New balance: Tk." + balance);
	        } else {
	            System.out.println("Insufficient funds!");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}