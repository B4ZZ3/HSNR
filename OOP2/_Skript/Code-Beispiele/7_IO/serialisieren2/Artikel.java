package serialisieren2;

public class Artikel implements java.io.Serializable {
	private int artnr;
	private double preis;

	public Artikel(int artnr, double preis) {
		this.artnr = artnr;
		this.preis = preis;
	}

	public int getArtnr() {
		return artnr;
	}

	public void setArtnr(int artnr) {
		this.artnr = artnr;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public String toString() {
		return "artnr: " + artnr + ", preis: " + preis;
	}
}
