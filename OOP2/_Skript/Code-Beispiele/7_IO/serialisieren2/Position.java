package serialisieren2;

public class Position implements java.io.Serializable {
	private int posnr;
	private Artikel artikel;
	private int menge;

	public Position(int posnr, Artikel artikel, int menge) {
		this.posnr = posnr;
		this.artikel = artikel;
		this.menge = menge;
	}

	public int getPosnr() {
		return posnr;
	}

	public void setPosnr(int posnr) {
		this.posnr = posnr;
	}

	public Artikel getArtikel() {
		return artikel;
	}

	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	public String toString() {
		return "posnr: " + posnr + ", artikel: [" + artikel + "], menge: "
				+ menge;
	}
}
