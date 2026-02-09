package PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PerformOperation {

	private static Scanner sc = new Scanner(System.in);
	static boolean run = true;

	public static void main(String[] args) {
		while (run) {
			System.out.println("press 1. to add Contact ");
			System.out.println("press 2. to view all Contact ");
			System.out.println("press 3. to view specific Contact ");
			System.out.println("press 4. to delete Contact ");
			System.out.println("press 5. to Exit ");
			System.out.println("Enter your choice ");
			int ch = sc.nextInt();
			PhoneBook p = new PhoneBook();

			switch (ch) {
			case 1:
				p.addContact();
				break;
			case 2:
				p.viewContact();
				break;
			case 3:
				p.viewSpecificContact();
				break;
			case 4:
				p.deleteContact();
				break;
			case 5:
				run = false;
				break;

			default:
				break;
			}
		}

	}

}
