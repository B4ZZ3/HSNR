package counter;

public class CounterTest {
	public static void main(String[] args) {
		Counter c = new Counter();

		for (int i = 0; i < 10; i++) {
			System.out.println(c.read());
			c.step();
		}
		System.out.println();

		c.reset();

		for (int i = 0; i < 10; i++) {
			System.out.println(c.read());
			c.step();
		}
	}
}
