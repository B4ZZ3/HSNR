package fallbeispiel;

public class Szenario {
	public static void main(String[] args) {
		Rechnung r1 = new Rechnung(1, "Grafikkarte", 299);
		Rechnung r2 = new Rechnung(2, "Staubsauger", 129);
		Rechnung r3 = new Rechnung(3, "Fernseher", 500);

		Kreditkarte k = new Kreditkarte("Max Mueller", "4850 9339 8128 6136", 2022);

		r1.setZahlungsmittel(k);
		r2.setZahlungsmittel(k);

		Ueberweisung u = new Ueberweisung("Max Mueller", "DE74 3105 0000 0123 4567 89", "MGLSDE33XXX");

		r3.setZahlungsmittel(u);

		System.out.println(r1); // Kurzform von: System.out.println(r1.toString());
		System.out.println(r2);
		System.out.println(r3);

		r1.bezahlen();
		r2.bezahlen();
		r3.bezahlen();
	}
}
