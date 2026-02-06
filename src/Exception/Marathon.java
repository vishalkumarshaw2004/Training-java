package Exception;

import java.util.Scanner;

public class Marathon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- Register Yourself ----");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        if (!nameValidation(name)) {
            System.out.println("Name should be minimum 4 characters and only alphabets");
            return;
        }
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (!ageValidation(age)) {
            System.out.println("Age should be between 18 and 60");
            return;
        }
        sc.nextLine(); 
        System.out.print("Enter your gender: ");
        String gender = sc.nextLine();
        if (!genderValidation(gender)) {
            System.out.println("Gender must be Male / Female / Others");
            return;
        }
        System.out.print("Enter your contact number: ");
        String contact = sc.nextLine();
        if (!contactValidation(contact)) {
            System.out.println("Name should be minimum 10 digits only");
            return;
        }
        System.out.println("\n--- Registration Successful ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Contact : " + contact);
    }

    public static boolean ageValidation(int age) {
        return age >= 18 && age <= 60;
    }

    public static boolean genderValidation(String gender) {
        return gender.equalsIgnoreCase("male")
                || gender.equalsIgnoreCase("female")
                || gender.equalsIgnoreCase("others");
    }

    public static boolean nameValidation(String name) {
        if (name == null || name.length() < 4) {
            return false;
        }
        for (char ch : name.toCharArray()) {
            if (!Character.isLetter(ch) && ch != ' ') {
                return false;
            }
        }
        return true;
    }
    public static boolean contactValidation(String contact) {
        if (contact == null || contact.length() != 10  ) {
            return false;
        }
        for (char ch : contact.toCharArray()) {
            if (!Character.isDigit(ch) ) {
                return false;
            }
        }
        return true;
    }
}
