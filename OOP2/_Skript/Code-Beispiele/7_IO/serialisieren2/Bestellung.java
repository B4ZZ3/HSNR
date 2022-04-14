package serialisieren2;

import java.util.List;
import java.util.Vector;

public class Bestellung implements java.io.Serializable {
	private int bnr;
	private Kunde kunde;
	@SuppressWarnings("rawtypes")
	private List positionen;

	@SuppressWarnings("rawtypes")
	public Bestellung(int bnr, Kunde kunde) {
		this.bnr = bnr;
		this.kunde = kunde;
		this.positionen = new Vector();
	}

	public int getBnr() {
		return bnr;
	}

	public void setBnr(int bnr) {
		this.bnr = bnr;
	}

	public Kunde getKunde() {
		return kunde;
	}

	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}

	@SuppressWarnings("rawtypes")
	public List getPositionen() {
		return positionen;
	}

	@SuppressWarnings("rawtypes")
	public void setPositionen(List positionen) {
		this.positionen = positionen;
	}

	@SuppressWarnings("unchecked")
	public void addPosition(Position pos) {
		positionen.add(pos);
	}

	public String toString() {
		return "bnr: " + bnr + ", kunde: [" + kunde + "]";
	}
}
