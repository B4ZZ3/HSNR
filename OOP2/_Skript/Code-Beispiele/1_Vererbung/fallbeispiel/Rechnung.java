package fallbeispiel;

public class Rechnung {
	private int nummer;
	private String artikel;
	private int betrag;
	private Zahlungsmittel zahlungsmittel;

	public Rechnung(int nummer, String artikel, int betrag) {
		this.nummer = nummer;
		this.artikel = artikel;
		this.betrag = betrag;
	}

	public int getNummer() {
		return nummer;
	}

	public String getArtikel() {
		return artikel;
	}

	public int getBetrag() {
		return betrag;
	}

	public void setZahlungsmittel(Zahlungsmittel zahlungsmittel) {
		this.zahlungsmittel = zahlungsmittel;
	}

	public String toString() {
		String s = "RECHNUNG:\n";
		s += ("Nummer: " + nummer + "\n");
		s += ("Artikel: " + artikel + "\n");
		s += ("Betrag: " + betrag + "\n");
		return s;
	}

	public void bezahlen() {
		if (zahlungsmittel != null) {
			// Hier wird die für den aktuellen Typ spezifischste Methode ausgewählt.
			zahlungsmittel.bezahlen(this);
		}
	}
}
