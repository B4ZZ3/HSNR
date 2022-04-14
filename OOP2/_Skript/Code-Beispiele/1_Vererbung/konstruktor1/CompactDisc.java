package konstruktor1;

public class CompactDisc extends TonTraeger {
	private int spieldauer;
	private int anzahlTracks;

	public CompactDisc(String titel, int spieldauer, int anzahlTracks) {
		super(titel);
		this.spieldauer = spieldauer;
		this.anzahlTracks = anzahlTracks;
	}

	public int getSpieldauer() {
		return spieldauer;
	}

	public int getAnzahlTracks() {
		return anzahlTracks;
	}

	public void print() {
		System.out.println("*** CD ***");
		System.out.println("Titel: " + titel);
		System.out.println("Spieldauer: " + spieldauer);
		System.out.println("Tracks: " + anzahlTracks);
	}
}
