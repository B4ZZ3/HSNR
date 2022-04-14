package fallbeispiel;

public class Kreditkarte extends Zahlungsmittel {
	private String nummer;
	private int verfallsdatum;

	public Kreditkarte(String besitzer, String nummer, int verfallsdatum) {
		super(besitzer); // an Superklasse delegiert
		this.nummer = nummer;
		this.verfallsdatum = verfallsdatum;
	}

	public String getNummer() {
		return nummer;
	}

	public int getVerfallsdatum() {
		return verfallsdatum;
	}

	// Implementierung der geerbten abstrakten Methode
	public void bezahlen(Rechnung rechnung) {
		String s = getInhaber() + " zahlt den Betrag von ";
		s += rechnung.getBetrag();
		s += " mit Kreditkarte (KartenNr: ";
		s += nummer;
		s += " Verfallsdatum: ";
		s += verfallsdatum;
		s += ").";
		System.out.println(s);
	}
}
