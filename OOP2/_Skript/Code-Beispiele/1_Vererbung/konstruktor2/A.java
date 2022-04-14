package konstruktor2;

public class A {
	protected int a;

//	public A() {
//		System.out.println("Konstruktor A() ausgefuehrt");
//	}

	public A(int a) {
		this.a = a;
		System.out.println("Konstruktor A(int a) ausgefuehrt");
	}

	public void print() {
		System.out.println("a = " + a);
	}
}