package Food;

public class ResturantOrder implements Order{
	String customerName;
	double orderAmount;
	double gstPercentage;

	String dish;
	
	public ResturantOrder(String customerName, String dish, double orderAmount, double gstPercentage) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.gstPercentage = gstPercentage;
		this.dish=dish;
	}

	public double calculateFinalAmount() {
		double gstAmount= (orderAmount *gstPercentage) /100;
		 double finalAmount = orderAmount + gstAmount;

		return finalAmount;
	}

	public String getOrderDetails() {
		System.out.println("Your order details are");
		return "Customer Name: " + customerName +
	               "\nDish: " + dish +
	               "\nOrder Amount: " + orderAmount +
	               "\nGST: " + gstPercentage + "%";
	}



}
