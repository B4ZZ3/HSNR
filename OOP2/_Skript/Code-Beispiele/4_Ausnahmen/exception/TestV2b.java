package exception;

public class TestV2b {
	public static void main(String[] args) {
		String s = "\"Das ist ein Test.\"";
		System.out.println(s);
		
		try {
			String t = StringUtilsV2.clip(s);
			System.out.println(t);
			
//			System.out.println(StringUtilsV2.clip("x"));
//			System.out.println(StringUtilsV2.clip(null));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
