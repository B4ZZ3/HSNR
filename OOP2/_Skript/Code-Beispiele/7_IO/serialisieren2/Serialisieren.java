package serialisieren2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Serialisieren {
	public static void main(String[] args) throws Exception {
		Kunde k = new Kunde(1001, "Hugo Meier");

		Artikel a1 = new Artikel(4711, 5.99);
		Artikel a2 = new Artikel(4712, 10.);
		Artikel a3 = new Artikel(4713, 20.);

		Position p1 = new Position(1, a1, 10);
		Position p2 = new Position(2, a2, 5);
		Position p3 = new Position(3, a3, 8);

		Bestellung b = new Bestellung(101, k);
		b.addPosition(p1);
		b.addPosition(p2);
		b.addPosition(p3);

		print(b);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
				"bestellung.dat"));
		out.writeObject(b);
		out.flush();
		out.close();
	}

	@SuppressWarnings("rawtypes")
	private static void print(Bestellung b) {
		System.out.println(b);
		List positionen = b.getPositionen();
		int size = positionen.size();
		for (int i = 0; i < size; i++) {
			System.out.println(positionen.get(i));
		}
	}
}
