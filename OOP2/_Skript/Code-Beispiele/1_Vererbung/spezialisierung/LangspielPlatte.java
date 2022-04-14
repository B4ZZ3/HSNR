package spezialisierung;

public class LangspielPlatte extends Schallplatte {
	private int tracksA;
	private int tracksB;

	public LangspielPlatte(String titel, int dauerA, int dauerB, int tracksA,
			int tracksB) {
		super(titel, dauerA, dauerB);
		this.tracksA = tracksA;
		this.tracksB = tracksB;
	}

	public int getAnzahlTracks() {
		return tracksA + tracksB;
	}
}
