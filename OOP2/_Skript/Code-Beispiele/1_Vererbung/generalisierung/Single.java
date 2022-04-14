package generalisierung;

public class Single extends Schallplatte {
	public Single(String titel, int dauerA, int dauerB) {
		super(titel, dauerA, dauerB);
	}

	public int getAnzahlTracks() {
		return 2;
	}
}
