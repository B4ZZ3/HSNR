package beobachter1;

import java.util.Vector;

public class Newsletter implements Beobachtbar {
	@SuppressWarnings("rawtypes")
	private Vector abonnenten = new Vector();

	private String nachricht;

	public void aendereNachricht(String neueNachricht) {
		nachricht = neueNachricht;
		benachrichtigen();
	}

	public void abmelden(Beobachter beobachter) {
		abonnenten.remove(beobachter);
	}

	@SuppressWarnings("unchecked")
	public void anmelden(Beobachter beobachter) {
		abonnenten.add(beobachter);
	}

	private void benachrichtigen() {
		for (Object beobachter : abonnenten) {
			((Beobachter) beobachter).aktualisieren(this);
		}
	}

	public String gibZustand() {
		return nachricht;
	}
}
