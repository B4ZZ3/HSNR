package counter;

public class LoopCounter extends LimitedCounter {
	
	public LoopCounter(int limit) {
		super(limit);
	}

	public void step() {
		if (count == limit)
			count = 0;
		else
			count++;
	}
}