public class Paar<T,U> {
	
	protected T a;
	protected U b;
	
	public Paar(T a, U b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}

	public String toString() {
		return "(" + this.getA() + ", " + this.getB() + ")"; 
	}
}
