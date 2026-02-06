package Account;

import java.util.Scanner;

public class Machine {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = sc.nextLine();
	System.out.println("Enter your Customer ID");
	String id = sc.nextLine();
	System.out.println("Enter your Email");
	String email = sc.nextLine();
	Customer c = new Customer(id,name,email);
	SavingAccount s = new SavingAccount();
	 System.out.println("1. Deposit Money");
     System.out.println("2. Withdraw Money");
     System.out.print("Enter your choice: ");
     int ch = sc.nextInt();
     switch (ch) {
     case 1:
      
      s.deposit();
         break;
     case 2:
    	 try {
    	 s.withdraw();
    	 }
    	 catch (Exception e) {
			System.out.println(e.getMessage());
		}
         break;
     }
}
}
