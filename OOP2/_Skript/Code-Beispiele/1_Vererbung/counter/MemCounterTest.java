package counter;

public class MemCounterTest {
	public static void main(String[] args) {
		MemCounter c = new MemCounter();

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
		System.out.println();

		c.mark();

		for (int i = 0; i < 10; i++) {
			System.out.println(c.read());
			c.step();
		}
		System.out.println();

		c.recall();
		for (int i = 0; i < 10; i++) {
			System.out.println(c.read());
			c.step();
		}
	}
}
