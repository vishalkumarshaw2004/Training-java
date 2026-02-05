package Food;

public class Grocery implements Order {
	String customerName;
	double orderAmount;
	boolean membership;
	String name;
	
	
	

	public double calculateFinalAmount() {
	if(membership==true) {
		double amount=orderAmount*0.10;
		double finalAmount = orderAmount- amount;
		return finalAmount;
	}
	else {
		return orderAmount;
	}
		
	}

	public String getOrderDetails() {
		System.out.println("Your order details are");
		return "Customer Name: " + customerName +
	               
	               "\nOrder Amount: " + orderAmount ;
	}

	public Grocery(String customerName, double orderAmount, boolean membership) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.membership = membership;
		this.name = name;
	}
	
}
