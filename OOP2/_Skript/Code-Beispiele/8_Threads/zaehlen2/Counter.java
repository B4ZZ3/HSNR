package zaehlen2;

public class Counter {
	private long count;

//	public synchronized void increment() {
	public void increment() {
		count++;
	}

	public long getCount() {
		return count;
	}
}
