package geo;

public class Rechteck implements Geo {
	private double breite;
	private double hoehe;

	public Rechteck(double breite, double hoehe) {
		this.breite = breite;
		this.hoehe = hoehe;
	}

	public double getUmfang() {
		return 2 * (breite + hoehe);
	}

	public double getFlaeche() {
		return breite * hoehe;
	}
}
