package konstruktor2;

public class B extends A {
	private int b;
	private int c;

	public B(int a, int b, int c) {
		super(a);
//		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Konstruktor B(int a, int b, int c) ausgefuehrt");
	}

	public B(int a, int b) {
		this(a, b, 0);
		System.out.println("Konstruktor B(int a, int b) ausgefuehrt");
	}

	public void print() {
		super.print();
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}