package Map;

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
				PhoneBook.addContact();
				break;
			case 2:
				PhoneBook.viewContact();
				break;
			case 3:
				PhoneBook.viewSpecificContact();
				break;
			case 4:
				PhoneBook.deleteContact();
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
