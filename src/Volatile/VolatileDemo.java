package Volatile;

public class VolatileDemo {
	static volatile boolean flag = false;

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			while (!flag) {

			}
			System.out.println("Flag is true, exiting thread.");
		}, "Thread-1");

		Thread t2 = new Thread(() -> {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			flag = true;
			System.out.println("Flag set to true by Thread-2.");
		}, "Thread-2");

		t1.start();
		t2.start();
	}
}
