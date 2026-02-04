package Server;

import java.util.Scanner;

public class BankServer {

   
    public static int getValidInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm();

        System.out.println("Welcome to Children Bank of India");
        System.out.print("Enter PIN to continue: ");

        int enteredPin = getValidInt(sc);

        if (enteredPin != atm.getpin()) {
            System.out.println("Incorrect PIN. Try Again...");
            sc.close();
            return;
        }

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = getValidInt(sc);

            switch (choice) {

                case 1:
                    System.out.println("Your Balance is: " + atm.getbalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = getValidInt(sc);

                    if (deposit > 0) {
                        atm.setbalance(deposit);
                        System.out.println("Deposit Successful.");
                        System.out.println("Updated Balance: " + atm.getbalance());
                    } else {
                        System.out.println("Amount must be greater than zero.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = getValidInt(sc);

                    if (withdraw <= 0) {
                        System.out.println("Amount must be greater than zero.");
                    } else if (withdraw > atm.getbalance()) {
                        System.out.println("Insufficient Balance.");
                    } else {
                        atm.setbalanceWithdraw(withdraw);
                        System.out.println("Please collect your cash: " + withdraw);
                        System.out.println("Remaining Balance: " + atm.getbalance());
                    }
                    break;

                case 4:
                    System.out.println("Exited Successfully.");
                    break;

                default:
                    System.out.println("Please enter a valid option.");
            }

        } while (choice != 4);

        sc.close();
    }
}
