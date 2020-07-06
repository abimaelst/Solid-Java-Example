package bank;

public class Sms { 
	
	public void sendSMS(BankAccount BankAccount) {
		if(BankAccount.getBalance() > 0) {
			System.out.println(BankAccount.getBalance());
		}
	}

};
