package Thread;

public class ThreadDemo {
	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 1; i < 6; i++) {
				System.out.println("Current thread is : " + Thread.currentThread().getName() + "-" + i);
			}
		};
		Thread t1 = new Thread(r, "Thread-1");
		Thread t2 = new Thread(r, "Thread-2");
		t1.start();
		t2.start();
	}
	
	
	
}
