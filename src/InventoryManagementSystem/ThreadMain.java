package InventoryManagementSystem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadMain {

	public static void main(String[] args) {
		Customers customers = new Customers(10);
		ExecutorService e = Executors.newFixedThreadPool(10);

		for (int i = 1; i <= 5; i++) {
			final int customerId = i;
			e.submit(() -> {
				customers.purchase(2, "Customer " + customerId);
			});
			
		}
		try {
			e.awaitTermination(5, TimeUnit.SECONDS);
		}
		catch(InterruptedException i) {
			i.printStackTrace();
		}
		e.shutdown();
		System.out.println("final stock"+ customers.getStock());
	}
}
