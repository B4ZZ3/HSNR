package counter;

public class LimitedCounter extends Counter {
	protected int limit;

	public LimitedCounter(int limit) {
		this.limit = limit;
	}

	public int getLimit() {
		return limit;
	}

	public void step() {
		if (count < limit) {
			count++;
		}
	}
}