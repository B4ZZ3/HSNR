package autoboxing;

public class BoxingTest {
	public static void main(String[] args) {
		Integer integer = 1234; // boxing
		int i = integer; // unboxing

		IntegerBox box = new IntegerBox();

		// Lösung vor Java SE 5.0
		box.setValue(new Integer(4711));
		i = box.getValue().intValue();
		System.out.println(i);

		// Lösung ab Java SE 5.0
		box.setValue(4711);
		i = box.getValue();
		System.out.println(i);

		// 1. unboxing
		// 2. Ausführung der Rechenoperation
		// 3. boxing
		integer++;
		System.out.println(integer);
		integer += 10;
		System.out.println(integer);
	}
}
