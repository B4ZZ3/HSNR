package spezialisierung;

public class Schallplatte {
	protected String titel;
	protected int dauerA;
	protected int dauerB;

	public Schallplatte(String titel, int dauerA, int dauerB) {
		this.titel = titel;
		this.dauerA = dauerA;
		this.dauerB = dauerB;
	}

	public String getTitel() {
		return titel;
	}

	public int getSpieldauer() {
		return dauerA + dauerB;
	}
}
