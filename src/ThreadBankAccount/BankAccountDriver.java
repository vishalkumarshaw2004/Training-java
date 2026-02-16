package ThreadBankAccount;

public class BankAccountDriver {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000);
		Runnable r1 = () -> {
			account.withdraw(300);
		};
		Runnable r2 = () -> {
			account.withdraw(400);
		};
		Thread t1 = new Thread(r1, "Thread-1");
		Thread t2 = new Thread(r2, "Thread-2");
		t1.start();
		t2.start();
	}
}
