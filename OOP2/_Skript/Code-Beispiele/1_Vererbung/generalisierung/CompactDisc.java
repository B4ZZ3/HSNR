package generalisierung;

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
}
