package parkhaus;

public class Auto extends Thread {
	private static int nextId;
	private final int id;
	private final Parkhaus parkhaus;
	private final int anfahrt;
	private final int parkzeit;

	public Auto(Parkhaus parkhaus, int anfahrt, int parkzeit) {
		this.parkhaus = parkhaus;
		this.anfahrt = anfahrt;
		this.parkzeit = parkzeit;
		this.id = ++nextId;
	}

	public void run() {
		try {
			System.out.println(this + " faehrt los");
			Thread.sleep(anfahrt);
			System.out.println(this + " kommt an, will einfahren");
			parkhaus.enter(this);
			System.out.println(this + " ist drin, parkt");
			Thread.sleep(parkzeit);
			System.out.println(this + " ist fertig, will ausfahren");
			parkhaus.leave(this);
			System.out.println(this + " ist draussen, faehrt weg");
		} catch (InterruptedException e) {
		}
	}

	public String toString() {
		return "Auto#" + id;
	}
}
