package Volatile;

import java.util.Scanner;

public class VolatileMain {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();
        Scanner sc = new Scanner(System.in);
        
        Thread producer = new Thread(() -> {
            try {
            	System.out.println("Enter data :");
                while (true) {
                	
                    resource.produce(sc.nextLine());
                }  } catch (Exception e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    resource.consume();
                } } catch (Exception e) {}
        });

        producer.start();
        consumer.start();
    }
}
