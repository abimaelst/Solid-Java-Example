package bank;

public class App {

	public static void main(String[] args) {
		BankAccount account01 = new BankAccount();
		
		account01.setDescription("Conta bancaria do Abimael");
		
		System.out.println(account01);
		
		account01.moneysum100();
		
		account01.deposit(400);
		
		account01.withdrawal(1000);
		
		System.out.println(account01);
		
		System.out.println(account01.getBalance());
		
		
	}

}
