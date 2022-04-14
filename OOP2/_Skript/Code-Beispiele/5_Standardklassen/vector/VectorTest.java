package vector;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		List kunden = new Vector();

		kunden.add(new Kunde("Hugo Meier", "Hauptstr. 12, 40880 Ratingen"));
		kunden.add(new Kunde("Otto Schmitz", "Dorfstr. 5, 40880 Ratingen"));
		kunden.add(0, new Kunde("Willi Peters", "Hauptstr. 22, 40880 Ratingen"));

		int size = kunden.size();
		for (int i = 0; i < size; i++) {
			Kunde k = (Kunde) kunden.get(i);
			System.out.println(k.getName() + ", " + k.getAdresse());
		}

		System.out.println();

		// alternativ mit Iterator
		Iterator it = kunden.iterator();
		while (it.hasNext()) {
			Kunde k = (Kunde) it.next();
			System.out.println(k.getName() + ", " + k.getAdresse());
		}

		System.out.println();

		// alternativ mit foreach
		for (Object obj : kunden) {
			Kunde k = (Kunde) obj;
			System.out.println(k.getName() + ", " + k.getAdresse());
		}
	}
}
