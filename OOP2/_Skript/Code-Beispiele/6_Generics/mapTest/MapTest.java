import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Double> map = new TreeMap<>();
		map.put("Meier, August", 5000.);
		map.put("Schmitz, Anton", 4500.);
		map.put("Balder, Hugo", 4700.);
		map.put("Schulze, Wolfgang", 4500.);
		// Variante 1
		for (String key : map.keySet())
			System.out.println(key + ": " + map.get(key));
		System.out.println();
		// Variante 2
		for (Map.Entry<String, Double> e : map.entrySet())
			System.out.println(e.getKey() + ": " + e.getValue());
	}
}
