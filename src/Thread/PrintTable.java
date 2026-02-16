package Thread;

public class PrintTable {

	public static void main(String[] args) {
		Table table = new Table();
		
		Thread t1 = new Thread(() -> {
			table.printTable(2);
		});
		
		Thread t2 = new Thread(() -> {
			table.printTable(5);
		});
		
		t1.start();
		try {
			t2.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}