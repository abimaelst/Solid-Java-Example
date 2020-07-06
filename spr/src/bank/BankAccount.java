package bank;

public class BankAccount {
	private String description;
	
	private double balance = 1500;
	
	public void moneysum100() {
		balance += 100;
	}
	
	public void moneysub100() {
		balance -= 100;
	}
	
	public void withdrawal(double value) {
		balance -= value;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "BankAccount [description=" + description + ", balance=" + balance + "]";
	}
	
}
