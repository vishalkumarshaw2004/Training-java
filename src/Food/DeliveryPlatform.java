package Food;

import java.util.Scanner;

public class DeliveryPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Order order = null;

        System.out.println("1. Restaurant");
        System.out.println("2. Cloud Kitchen");
        System.out.println("3. Grocery");
        System.out.print("Enter your choice: ");

        int ch = sc.nextInt();
        sc.nextLine(); 

        switch (ch) {

            case 1:
                System.out.print("Enter Customer Name: ");
                String rName = sc.nextLine();

                System.out.print("Enter Dish Name: ");
                String rDish = sc.nextLine();

                System.out.print("Enter Order Amount: ");
                double rAmount = sc.nextDouble();

                System.out.print("Enter GST Percentage: ");
                double gst = sc.nextDouble();

                order = new ResturantOrder(rName, rDish, rAmount, gst);
                break;

            case 2:
                System.out.print("Enter Customer Name: ");
                String cName = sc.nextLine();

                System.out.print("Enter Dish Name: ");
                String cDish = sc.nextLine();

                System.out.print("Enter Order Amount: ");
                double cAmount = sc.nextDouble();

                System.out.print("Enter Distance (km): ");
                double distance = sc.nextDouble();

                order = new CloudKitchen(cName, cDish, cAmount, distance);
                break;

            case 3:
                System.out.print("Enter Customer Name: ");
                String gName = sc.nextLine();

                System.out.print("Enter Order Amount: ");
                double gAmount = sc.nextDouble();

                System.out.print("Do you have membership? (true/false): ");
                boolean membership = sc.nextBoolean();

                order = new Grocery(gName, gAmount, membership);
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        System.out.println("\n ORDER DETAILS ");
        System.out.println(order.getOrderDetails());
        System.out.println("Final Amount: " + order.calculateFinalAmount());

        sc.close();
    }
}
