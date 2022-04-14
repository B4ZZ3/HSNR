package serialisieren3;

public class Kunde extends Person {
	private static final long serialVersionUID = 1L;
	private String adresse;
	
	public Kunde() {
	}

	public Kunde(String name, String adresse) {
		super(name);
		this.adresse = adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}
}
