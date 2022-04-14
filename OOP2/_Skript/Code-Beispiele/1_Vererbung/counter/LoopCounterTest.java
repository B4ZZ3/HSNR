package counter;

public class LoopCounterTest {

	public static void main(String[] args) {
		LoopCounter c = new LoopCounter(5);
		//Counter c = new LoopCounter(5);
		//LoopCounter c = new Counter(5);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(c.read());
			c.step();
		}
	}
}
