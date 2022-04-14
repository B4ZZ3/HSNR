package huellklassen;

public class HuellTest1 {
	public static void main(String[] args) {
		// Zeichenkette in Zahl umwandeln

		String s = "10500";
		Integer intObj = Integer.valueOf(s);
		int x = intObj.intValue();
		System.out.println(x);

		// oder kuerzer
		x = Integer.valueOf(s).intValue();
		System.out.println(x);

		// oder
		x = Integer.parseInt(s);
		System.out.println(x);
	}
}
