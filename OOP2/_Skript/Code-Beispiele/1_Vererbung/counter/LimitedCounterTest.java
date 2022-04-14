package counter;

public class LimitedCounterTest {
	public static void main(String[] args) {
		LimitedCounter c = new LimitedCounter(5);
		// Counter c = new LimitedCounter(5);

		for (int i = 0; i < 10; i++) {
			System.out.println(c.read());
			c.step();
		}
	}
}
