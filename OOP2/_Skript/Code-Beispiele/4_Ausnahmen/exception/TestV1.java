package exception;

public class TestV1 {
	public static void main(String[] args) {
		String s = "\"Das ist ein Test.\"";
		System.out.println(s);
		
		String t = StringUtilsV1.clip(s);
		System.out.println(t);
		
		System.out.println(StringUtilsV1.clip("x"));
		System.out.println(StringUtilsV1.clip(null));
	}
}
