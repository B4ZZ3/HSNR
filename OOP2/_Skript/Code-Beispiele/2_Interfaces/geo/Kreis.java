package geo;

public class Kreis implements Geo {
	private double radius;

	public Kreis(double radius) {
		this.radius = radius;
	}

	public double getUmfang() {
		return 2 * Math.PI * radius;
	}

	public double getFlaeche() {
		return Math.PI * radius * radius;
	}
}
