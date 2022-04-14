package vector;

import java.util.List;
import java.util.Vector;

public class RemoveTest2 {
	public static void main(String[] args) {
		List kunden = new Vector();
		kunden.add(new Kunde2("Hugo Meier", "Hauptstr. 12, 40880 Ratingen"));
		kunden.add(new Kunde2("Otto Schmitz", "Dorfstr. 5, 40880 Ratingen"));
		kunden.add(0, new Kunde2("Willi Peters", "Hauptstr. 22, 40880 Ratingen"));

		Kunde2 kunde = (Kunde2) kunden.get(1);
		System.out.println(kunde.getName() + ", " + kunde.getAdresse());
		System.out.println();

		boolean removed = kunden.remove(kunde);
		System.out.println(removed);

		for (Object obj : kunden) {
			Kunde2 k = (Kunde2) obj;
			System.out.println(k.getName() + ", " + k.getAdresse());
		}
		System.out.println();

		kunde = new Kunde2("Willi Peters", "Hauptstr. 22, 40880 Ratingen");
		removed = kunden.remove(kunde);
		System.out.println(removed);

		for (Object obj : kunden) {
			Kunde2 k = (Kunde2) obj;
			System.out.println(k.getName() + ", " + k.getAdresse());
		}
	}
}
