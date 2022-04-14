package exception;

public class TestV2a {
	public static void main(String[] args) throws Exception {
		String s = "\"Das ist ein Test.\"";
		System.out.println(s);
		
		String t = StringUtilsV2.clip(s);
		System.out.println(t);
		
//		System.out.println(StringUtilsV2.clip("x"));
//		System.out.println(StringUtilsV2.clip(null));
	}
}
