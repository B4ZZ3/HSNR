package Aufgabe_2;

public class Angestellter extends Mitarbeiter {
	
	final private int MAX_STUFE = 5;
	private int stufe;
	
	public  Angestellter(String nachname, String vorname, double gehalt) {
		super(nachname, vorname, gehalt);
	}
	public void befoerdere(int x) {
		if(x < 5 & stufe + x < MAX_STUFE) {
				stufe += x;
		}
		else {
			stufe = 5;
			System.out.println("Die maximale Stufe wurde errecht.");
		}
	}	
	public void zeigeDaten() {
		super.zeigeDaten();
		System.out.println("Stufe: " +stufe);
	}
	
	public void addZulage(double zulage) {
		System.out.println("Zulage: " + zulage);
	}
}

