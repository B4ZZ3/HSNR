package hashtable;

import java.util.Hashtable;
import java.util.Map;

public class MapTest {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map map = new Hashtable();

		Kunde k1 = new Kunde("Hugo Meier", "Hauptstr. 12, 40880 Ratingen");
		Kunde k2 = new Kunde("Otto Schmitz", "Dorfstr. 5, 40880 Ratingen");
		Kunde k3 = new Kunde("Willi Peters", "Hauptstr. 22, 40880 Ratingen");

		map.put(k1.getName(), k1);
		map.put(k2.getName(), k2);
		map.put(k3.getName(), k3);

		Kunde k = (Kunde) map.get("Otto Schmitz");
		System.out.println(k.getAdresse());
	}
}