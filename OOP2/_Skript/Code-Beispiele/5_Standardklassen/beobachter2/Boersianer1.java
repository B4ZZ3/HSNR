package beobachter2;

public class Boersianer1 implements Beobachter {
	private boolean besitzt;

	public void fallen(Aktie a) {
		if (a.getKursWert() < 300 && !besitzt) {
			System.out.println("Boersinaner1: Kauf von " + a.getName());
			besitzt = true;
		}
	}

	public void steigen(Aktie a) {
		if (a.getKursWert() > 310 && besitzt) {
			System.out.println("Boersinaner1: Verkauf von " + a.getName());
			besitzt = false;
		}
	}
}
