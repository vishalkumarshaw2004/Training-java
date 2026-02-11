package PaymentReceipt;

public class Payment {
String paymentId;
boolean paymentStatus;
double paymentAmount;
public Payment(String paymentId, boolean paymentStatus, double paymentAmount) {
	super();
	this.paymentId = paymentId;
	this.paymentStatus = paymentStatus;
	this.paymentAmount = paymentAmount;
}

@Override
public String toString() {
    return "Payment ID: " + paymentId +
            "\nAmount: " + paymentAmount +
            "\nStatus: " + (paymentStatus ? "SUCCESS" : "FAILED");
}


}
