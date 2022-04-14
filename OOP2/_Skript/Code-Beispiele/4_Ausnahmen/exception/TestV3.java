package exception;

public class TestV3 {
	public static void main(String[] args) {
		String s = "\"Das ist ein Test.\"";
		System.out.println(s);

		try {
			String t = StringUtilsV3.clip(s);
			System.out.println(t);

//			System.out.println(StringUtilsV3.clip("x"));
//			System.out.println(StringUtilsV3.clip(null));
		} catch (StringClipException e) {
			System.out.println(e.getMessage());
		}
	}
}
