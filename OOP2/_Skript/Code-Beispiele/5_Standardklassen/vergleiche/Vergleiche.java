package vergleiche;

public class Vergleiche { 
	public static void main(String[] args) { 
		String a = "Hallo";
		String b = new String(a);
		String c = "Hallo";
		System.out.println(a.equals(b)); // true
		System.out.println(a == b); // false
		System.out.println(a == c); // true
	}
}