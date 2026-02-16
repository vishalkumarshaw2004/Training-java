package Thread;

public class NumberThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println("Current thread is : "+Thread.currentThread().getName()+"-"+i);
		}
	}

}
