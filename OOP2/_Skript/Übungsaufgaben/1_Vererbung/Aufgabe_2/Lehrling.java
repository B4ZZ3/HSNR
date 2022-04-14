package Aufgabe_2;

public class Lehrling extends Mitarbeiter{

	private int abgelegtePruefung;
	
	public Lehrling(String nachname, String vorname, double gehalt) {
		super(nachname, vorname, gehalt);
	}
	public void setPruefung(int anzahl) {
		abgelegtePruefung += anzahl;
		System.out.println("Der Lehrling hat " +abgelegtePruefung+ " abgelegt.");
	}
	public void zeigeDaten() {
		super.zeigeDaten();
		System.out.println("Prüfungen: " + abgelegtePruefung);
	}
	
	public void addZulage(double zulage) {
		System.out.println("Zulage: " + zulage);
	}
}
