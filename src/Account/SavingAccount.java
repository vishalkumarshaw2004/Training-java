package Account;

import java.util.Scanner;

public class SavingAccount extends Account {

	int minbal=200;

	Scanner sc = new Scanner(System.in);

	@Override
	void deposit() {
		
		System.out.println("Enter the amount you want to deposit");
		int d=sc.nextInt();
		  if (d > 0) {
              System.out.println("Deposit Successful.");
              balance = balance +d;
              System.out.println("Updated Balance: " + balance);
          } else {
              System.out.println("Amount must be greater than zero.");
          }
		
	}

	@Override
	void withdraw() {
		System.out.println("Enter the amount you want to withdraw");
		int w=sc.nextInt();
		  if (w <= minbal) {
              System.out.println("Amount must be greater than 200.");
          } else if (w > balance) {
              System.out.println("Insufficient Balance.");
          } else {
              System.out.println("Please collect your cash: " + w);
              balance-=w;
              System.out.println("Remaining Balance: " + balance);
          }
		
	}

}
