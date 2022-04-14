package konstruktor2;

public class Test {
	public static void main(String[] args) {
		B ref = new B(1, 2, 3);
		ref.print();

		ref = new B(4, 5);
		ref.print();
	}
}