package fallbeispiel;

public class Ueberweisung extends Zahlungsmittel {
	private String iban;
	private String bic;

	public Ueberweisung(String kontoinhaber, String iban, String bic) {
		super(kontoinhaber); // an Superklasse delegiert
		this.iban = iban;
		this.bic = bic;
	}

	public String getIBAN() {
		return iban;
	}

	public String getBIC() {
		return bic;
	}

	// Implementierung der geerbten abstrakten Methode
	public void bezahlen(Rechnung rechnung) {
		String s = getInhaber() + " zahlt den Betrag von ";
		s += rechnung.getBetrag();
		s += " per Ueberweisung (IBAN: ";
		s += iban;
		s += " BIC: ";
		s += bic;
		s += ").";
		System.out.println(s);
	}
}
