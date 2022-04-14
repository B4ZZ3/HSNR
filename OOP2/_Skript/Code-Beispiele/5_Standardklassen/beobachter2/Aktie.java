package beobachter2;

import java.util.List;
import java.util.Vector;

public class Aktie {
	private String name;
	private int kursWert;
	@SuppressWarnings("rawtypes")
	private List beobachterListe;

	@SuppressWarnings("rawtypes")
	public Aktie(String name, int kursWert) {
		this.name = name;
		this.kursWert = kursWert;
		beobachterListe = new Vector();
	}

	@SuppressWarnings("unchecked")
	public void anmelden(Beobachter b) {
		beobachterListe.add(b);
	}

	public String getName() {
		return name;
	}

	public int getKursWert() {
		return kursWert;
	}

	public void setKursWert(int neuerWert) {
		int alterWert = kursWert;
		kursWert = neuerWert > 0 ? neuerWert : 1;
		int size = beobachterListe.size();
		if (kursWert > alterWert) {
			for (int i = 0; i < size; i++) {
				Beobachter b = (Beobachter) beobachterListe.get(i);
				b.steigen(this);
			}
		} else {
			for (int i = 0; i < size; i++) {
				Beobachter b = (Beobachter) beobachterListe.get(i);
				b.fallen(this);
			}
		}
	}
}
