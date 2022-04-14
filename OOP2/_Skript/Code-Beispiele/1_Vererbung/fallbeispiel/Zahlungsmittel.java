package fallbeispiel;

// Abstrakte Klasse
public abstract class Zahlungsmittel {
	// Auf diese Variable kann in Subklassen nicht direkt zugegriffen werden.
	private String inhaber;

	public Zahlungsmittel(String inhaber) {
		this.inhaber = inhaber;
	}

	// Teilimplementierung in der abstrakten Klasse
	public String getInhaber() {
		return inhaber;
	}

	// Abstrakte Methode
	public abstract void bezahlen(Rechnung rechnung);
}
