package Aufgabe_2;

public abstract class Mitarbeiter {
	
	protected String nachname;
	protected String vorname;
	protected double gehalt;
	
	public Mitarbeiter(String nachname, String vorname, double gehalt) {
		this.nachname = nachname;
		this.vorname = vorname;
		this.gehalt = gehalt;
	}	
	public void erhoeheGehalt(double n) {
		gehalt += n;
		System.out.println("Gehaltserhoehung: " + n);
	}	
	public void zeigeDaten() {
		System.out.println("Nachname: " +nachname+"\nVorname: " +vorname+ "\nGehalt: " +gehalt);
	}
	
	public abstract void addZulage(double zulage);
		
	
}
