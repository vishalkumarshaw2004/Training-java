package TelecomManagementSystem;

public class Customer {
   private int customerId;
   private String name;
   private Long phoneNo;
   private double walletBalance;
   
   
    
    public Customer(int customerId, String name, Long phoneNo, double walletBalance) {
	super();
	this.customerId = customerId;
	this.name = name;
	this.phoneNo = phoneNo;
	this.walletBalance = walletBalance;
}



	public int getCustomerId() {
		return customerId;
	}



	public String getName() {
		return name;
	}



	public Long getPhoneNo() {
		return phoneNo;
	}



	public double getWalletBalance() {
		return walletBalance;
	}



	public synchronized void makeCall(int minutes) throws InsufficientBalanceException {
    	double cost = minutes*2;
    	if(walletBalance>=cost) {
    		walletBalance -=cost;
    		System.out.println("Calling +91 xxxxx xxxxx");
    	}
    	else {
    		
    		throw new InsufficientBalanceException("Insufficient Balance Exception");
    	}
    }
	public synchronized void recharge(double amount) {
		walletBalance+=amount;
		System.out.println("your recharge was successful");
	}
}
