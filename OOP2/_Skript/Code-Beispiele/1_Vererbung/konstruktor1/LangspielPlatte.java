package konstruktor1;

public class LangspielPlatte extends Schallplatte {
	private int tracksA;
	private int tracksB;

	public LangspielPlatte(String titel, int dauerA, int dauerB) {
		super(titel, dauerA, dauerB);
		tracksA = 1;
		tracksB = 1;
	}

	public LangspielPlatte(String titel, int dauerA, int dauerB, int tracksA,
			int tracksB) {
		this(titel, dauerA, dauerB);
		this.tracksA = tracksA;
		this.tracksB = tracksB;
	}

// Fehler beim Compilieren: Konstruktor Schallplatte() nicht vorhanden

//	public LangspielPlatte(String titel, int dauerA, int dauerB, int tracksA, int tracksB) {
//		this.titel = titel;
//		this.dauerA = dauerA;
//		this.dauerB = dauerB;
//		this.tracksA = tracksA;
//		this.tracksB = tracksB;
//	}

	public int getAnzahlTracks() {
		return tracksA + tracksB;
	}

	public void print() {
		System.out.println("*** Langspielplatte ***");
		super.print();
		System.out.println("Tracks: " + getAnzahlTracks());
	}
}
