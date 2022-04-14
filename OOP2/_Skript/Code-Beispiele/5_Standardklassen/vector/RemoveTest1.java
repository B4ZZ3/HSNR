package vector;

import java.util.List;
import java.util.Vector;

public class RemoveTest1 {
	public static void main(String[] args) {
		List kunden = new Vector();
		kunden.add(new Kunde("Hugo Meier", "Hauptstr. 12, 40880 Ratingen"));
		kunden.add(new Kunde("Otto Schmitz", "Dorfstr. 5, 40880 Ratingen"));
		kunden.add(0, new Kunde("Willi Peters", "Hauptstr. 22, 40880 Ratingen"));

		Kunde kunde = (Kunde) kunden.get(1);
		System.out.println(kunde.getName() + ", " + kunde.getAdresse());
		System.out.println();

		boolean removed = kunden.remove(kunde);
		System.out.println(removed);

		for (Object obj : kunden) {
			Kunde k = (Kunde) obj;
			System.out.println(k.getName() + ", " + k.getAdresse());
		}
		System.out.println();

		kunde = new Kunde("Willi Peters", "Hauptstr. 22, 40880 Ratingen");
		removed = kunden.remove(kunde);
		System.out.println(removed);

		for (Object obj : kunden) {
			Kunde k = (Kunde) obj;
			System.out.println(k.getName() + ", " + k.getAdresse());
		}
	}
}
