package huellklassen;

public class HuellTest2 {
	public static void main(String[] args) {
		// Zahl in Zeichenkette umwandeln

		byte x = 123;
		Byte byteObj = new Byte(x);
		String s = byteObj.toString();
		System.out.println(s);

		// oder kuerzer
		s = String.valueOf(x);
		System.out.println(s);

		// oder
		s = "" + x;
		System.out.println(s);
	}
}
