package beobachter1;

public class Abonnent implements Beobachter {
	private String name;

	public Abonnent(String name) {
		this.name = name;
	}

	public void aktualisieren(Beobachtbar b) {
		System.out.println("Neue Nachricht für " + name + ".");
		System.out.println("Nachricht: " + b.gibZustand());
	}
}
