package PaymentReceipt;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

public class PaymentCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter paymentId:");
        String id = sc.nextLine();

        System.out.println("Enter amount:");
        double amount = sc.nextDouble();

        Payment p = new Payment(id, false, amount);

        Predicate<Double> validateAmount = amt -> amt >= 0;

        Consumer<Payment> logPayment = pay -> {
            System.out.println("Logging Payment...");
            System.out.println("Amount: " + pay.paymentAmount);
        };

        Random r = new Random();
        Supplier<String> generateRef = () -> "REF" + (100000 + r.nextInt(900000));

        Function<Payment, String> generateReceipt = pay ->
                " PAYMENT RECEIPT " +
                "\nPayment ID: " + pay.paymentId +
                "\nReference No: " + generateRef.get() +
                "\nAmount: " + pay.paymentAmount +
                "\nStatus: " + (pay.paymentStatus ? "SUCCESS" : "FAILED");

        p.paymentStatus = validateAmount.test(p.paymentAmount);

        logPayment.accept(p);

        System.out.println(generateReceipt.apply(p));

       
    }
}
