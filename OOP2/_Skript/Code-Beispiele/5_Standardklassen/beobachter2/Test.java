package beobachter2;

public class Test {
	public static void main(String[] args) {
		Aktie vw = new Aktie("VW", 300);
		Aktie bmw = new Aktie("BMW", 548);

		Beobachter peter = new Boersianer1();
		vw.anmelden(peter);

		Beobachter georg = new Boersianer2();
		vw.anmelden(georg);
		bmw.anmelden(georg);

		while (true) {
			System.out.print("VW: " + vw.getKursWert());
			System.out.println("\t\tBMW: " + bmw.getKursWert());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			vw.setKursWert(vw.getKursWert() + (int) (Math.random() * 11) - 5);
			bmw.setKursWert(bmw.getKursWert() + (int) (Math.random() * 11) - 5);
		}
	}
}
