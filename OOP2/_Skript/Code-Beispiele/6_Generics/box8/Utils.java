package box8;

public class Utils {
	public static <E> void exchange(Box<E> a, Box<E> b) {
		E value = b.getValue();
		b.setValue(a.getValue());
		a.setValue(value);
	}
}
