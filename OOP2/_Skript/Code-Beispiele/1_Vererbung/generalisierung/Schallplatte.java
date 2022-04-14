package generalisierung;

public class Schallplatte extends TonTraeger {
	protected int dauerA;
	protected int dauerB;

	public Schallplatte(String titel, int dauerA, int dauerB) {
		super(titel);
		this.dauerA = dauerA;
		this.dauerB = dauerB;
	}

	public int getSpieldauer() {
		return dauerA + dauerB;
	}
}
