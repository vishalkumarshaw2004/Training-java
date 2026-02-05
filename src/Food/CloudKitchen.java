package Food;

public class CloudKitchen implements Order {
	String customerName;
	double orderAmount;
	double distance;
	String name;
	String dish;
	


	public double calculateFinalAmount() {
	    if(distance<5) {
	    	double finalAmount = orderAmount+30;
	    	return finalAmount;
	    }
	    else {
	    	double finalAmount = orderAmount+60;
	    
		return finalAmount;
	    }
	}

	public String getOrderDetails() {
		System.out.println("Your order details are");
		return "Customer Name: " + customerName +
	               "\nDish: " + dish +
	               "\nOrder Amount: " + orderAmount 
	               ;
	}

	public CloudKitchen(String customerName,String dish, double orderAmount, double distance ) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.distance = distance;
		
		this.dish = dish;
	}

	
	
}
