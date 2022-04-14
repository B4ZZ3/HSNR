package zaehlen2;

public class Test extends Thread {
	private Counter counter;
	
	public Test(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		for (int i = 0; i < 100000000; i++) {
			counter.increment();
		}
	}

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Test t1 = new Test(counter);
		Test t2 = new Test(counter);
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}

		System.out.println(counter.getCount());
	}
}
