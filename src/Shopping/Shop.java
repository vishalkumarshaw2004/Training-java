package Shopping;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of products");
        int size = sc.nextInt();

        sc.nextLine(); 

        
        String[] s = new String[size];

        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter the name of product " + (i + 1));
            s[i] = sc.nextLine();
        }

        
        System.out.println("Enter the product which you want to see");
        String st = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < s.length; i++) {
            if (s[i].equalsIgnoreCase(st)) {
                found = true;
                break;
            }
        }

       
        if (found) {
            System.out.println("Product found");
        } else {
            System.out.println("Product not found");
        }

        sc.close();
    }
}
