package PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBook {
	private static ArrayList<Contact> contacts = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	public static void addContact() {

		System.out.println("Enter name");
		String name = sc.nextLine();

		System.out.println("Enter Phone no");
		long no = sc.nextLong();
		contacts.add(new Contact(name, no));
		System.out.println("Contact Added");
	}

	public static void viewContact() {
		if (contacts.isEmpty()) {
			System.out.println("Phone book is empty");
		} else {
			for (Contact contact : contacts) {
				System.out.println(contact);
			}
		}
	}

	public static void viewSpecificContact() {
		System.out.print("Enter name to Search :");
		sc.nextLine();
		String s = sc.nextLine();
		boolean f = false;
		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(s)) {
				System.out.println("Found :" + contact);
				f = true;
			}
		}
		if (!f)
			System.out.println("Contact not found");
	}

	public static void deleteContact() {
		sc.nextLine();
		System.out.print("Enter name to delete : ");
		String name = sc.nextLine();

		boolean deleted = false;

		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equalsIgnoreCase(name)) {
				System.out.println("Deleted : " + contacts.get(i));
				contacts.remove(i);
				deleted = true;
				break;
			}
		}

		if (!deleted) {
			System.out.println("Contact not found");
		}
	}

}
