package PolicyManagement;

import java.util.Scanner;

public class PolicyDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PolicyService service = new PolicyService();

        while (true) {
        	System.out.println("----Policy Management System---- ");
            System.out.println("1. Add Policy");
            System.out.println("2. Display Active Policies");
            System.out.println("3. Highest Premium Policy");
            System.out.println("4. Group Policy Count");
            System.out.println("5. Remove Expired Policies");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.println("Policy Number:");
                        int no = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Customer Name:");
                        String name = sc.nextLine();

                        System.out.println("Policy Type (HEALTH/LIFE/VEHICLE/TRAVEL):");
                        String type = sc.nextLine().toUpperCase();
                        service.validatePolicyType(type);

                        System.out.println("Age:");
                        int age = sc.nextInt();

                        System.out.println("Base Premium:");
                        double base = sc.nextDouble();

                        System.out.println("Status (ACTIVE/EXPIRED):");
                        String status = sc.next().toUpperCase();

                        double finalPremium =
                                service.calculatePremium(type, base);

                        InsurancePolicy policy =
                                new InsurancePolicy(no, name, type,
                                        age, finalPremium, status);

                        service.addPolicy(policy);
                    }
                    
                    case 2 -> service.displayActivePolicies();
                    case 3 -> service.highestPremiumPolicy();
                    case 4 -> service.groupPolicyCount();
                    case 5 -> service.removeExpiredPolicies();
                    case 6 -> System.exit(0);
                    default -> System.out.println("Invalid choice");
                }
            } catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
}}}
