package InventoryManagementSystem;

public class Customers {
		private int stock;

	public Customers(int initialStock) {
		this.stock = initialStock;
	}

	public synchronized void purchase(int quantity, String customerName) {
		if (quantity <= stock) {
			stock -= quantity;
			System.out.println(customerName + " purchased " + quantity + " units. Remaining stock: " + stock);
		} else {
			System.out.println(customerName + " failed to purchase " + quantity + " units. Insufficient stock.");
		}
	}

	public int getStock() {
		return stock;
	}
	
}

