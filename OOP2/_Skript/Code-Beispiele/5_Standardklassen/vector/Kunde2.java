package vector;

public class Kunde2 {
	private String name;
	private String adresse;

	public Kunde2() {
	}

	public Kunde2(String name, String adresse) {
		this.name = name;
		this.adresse = adresse;
	}

	public Kunde2(Kunde2 other) {
		this.name = other.name;
		this.adresse = other.adresse;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Kunde2))
			return false;
		
		Kunde2 other = (Kunde2) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
