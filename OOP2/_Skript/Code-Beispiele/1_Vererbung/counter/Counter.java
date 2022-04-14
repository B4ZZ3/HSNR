package counter;

public class Counter {
	protected int count;

	public void step() {
		count++;
	}

	public int read() {
		return count;
	}

	public void reset() {
		count = 0;
	}
}