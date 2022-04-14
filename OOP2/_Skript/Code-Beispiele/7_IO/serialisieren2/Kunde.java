package serialisieren2;

public class Kunde implements java.io.Serializable {
	private int knr;
	private String kname;

	public Kunde(int knr, String kname) {
		this.knr = knr;
		this.kname = kname;
	}

	public int getKnr() {
		return knr;
	}

	public void setKnr(int knr) {
		this.knr = knr;
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public String toString() {
		return "knr: " + knr + ", kname: " + kname;
	}
}
