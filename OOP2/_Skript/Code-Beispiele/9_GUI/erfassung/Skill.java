// Model
public class Skill {
	private String name;
	private String vorname;
	private String geschlecht;
	private String sprache;

	public Skill(String name, String vorname, String geschlecht, String sprache) {
		this.name = name;
		this.vorname = vorname;
		this.geschlecht = geschlecht;
		this.sprache = sprache;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public String getGeschlecht() {
		return geschlecht;
	}

	public String getSprache() {
		return sprache;
	}

	@Override
	public String toString() {
		return "Skill [name=" + name + ", vorname=" + vorname + ", geschlecht=" + geschlecht + ", sprache=" + sprache
				+ "]";
	}
}
