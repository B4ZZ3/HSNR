package vector;

import java.util.Vector;

public class VectorGenericTest {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add("Flick");
		v1.add("Schmitz");
		v1.add("Müller");
		
		for (Object obj : v1) {
			String s = (String) obj;
			System.out.println(s.length());
		}
		
		System.out.println();
		
		Vector<String> v2 = new Vector<>();
		v2.add("Flick");
		v2.add("Schmitz");
		v2.add("Müller");
		
		for (String s : v2) {
			System.out.println(s.length());
		}
	}
}
