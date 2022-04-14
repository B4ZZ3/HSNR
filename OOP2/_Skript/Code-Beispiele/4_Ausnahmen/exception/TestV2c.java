package exception;

public class TestV2c {
	public static void main(String[] args) {
		String s = "\"Das ist ein Test.\"";
		System.out.println(s);

		try {
			String t = StringUtilsV2.clip(s);
			System.out.println(t);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(StringUtilsV2.clip("x"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(StringUtilsV2.clip(null));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
