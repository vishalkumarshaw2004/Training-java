package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneBook {
	private static Map<String, Long> contacts = new HashMap<>();
	private static Scanner sc = new Scanner(System.in);

	public static void addContact() {

		System.out.println("Enter name");
		String name = sc.nextLine();

		System.out.println("Enter Phone no");
		long no = sc.nextLong();
		contacts.put(name, no);
		System.out.println("Contact Added");
	}

	public static void viewContact() {
		if (contacts.isEmpty()) {
			System.out.println("Phone book is empty");
		} else {
			for (Map.Entry<String, Long> entry : contacts.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}

		}
	}

	public static void viewSpecificContact() {
		System.out.print("Enter name to Search :");
		sc.nextLine();
		String s = sc.nextLine();

		if (contacts.containsKey(s)) {
			System.out.println("Found :" + contacts.get(s));

		} else
			System.out.println("Contact not found");

	}

	public static void deleteContact() {
		sc.nextLine();
		System.out.print("Enter name to delete : ");
		String name = sc.nextLine();

		if (contacts.containsKey(name)) {
			System.out.println("Deleted : " + contacts.get(name));
			contacts.remove(name);

		}

		else {
			System.out.println("Contact not found");
		}
	}

}
