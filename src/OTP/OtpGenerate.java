package OTP;
import java.util.function.Supplier;

public class OtpGenerate {
    public static void main(String[] args) {
        Supplier<Integer> otp = () -> (int)(Math.random() * 900000) + 100000;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Generated OTP " + i + ": " + otp.get());
        }
    }
}
