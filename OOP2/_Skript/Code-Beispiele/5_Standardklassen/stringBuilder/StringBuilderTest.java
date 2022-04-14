package stringBuilder;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Ich");

		s.append("was soll es bedeuten ...");
		System.out.println(s);
		s.insert(3, " weiss nicht, ");
		System.out.println(s);

		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == 'e')
				s.setCharAt(i, 'u');
			if (s.charAt(i) == 'E')
				s.setCharAt(i, 'U');
		}
		System.out.println(s);
	}
}
