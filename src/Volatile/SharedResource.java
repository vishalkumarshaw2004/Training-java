package Volatile;

class SharedResource {

    private String data;
    private boolean available = false;

    public synchronized void produce(String value) throws InterruptedException {
        while (available) {
            wait();
        }	
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}
