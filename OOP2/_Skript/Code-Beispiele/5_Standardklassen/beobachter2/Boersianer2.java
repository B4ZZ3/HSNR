package beobachter2;

public class Boersianer2 implements Beobachter {
	private int max;

	public void fallen(Aktie a) {
	}

	public void steigen(Aktie a) {
		if (a.getKursWert() > max) {
			max = a.getKursWert();
			System.out.println("Boersianer2: Neues Max " + a.getName() + ": " + max);
		}
	}
}
