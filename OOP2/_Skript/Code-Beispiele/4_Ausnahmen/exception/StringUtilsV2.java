package exception;

public class StringUtilsV2 {
	public static String clip(String s) throws Exception {
		if (s == null)
			throw new Exception("no string");
		if (s.length() < 2)
			throw new Exception("short string");
		return s.substring(1, s.length() - 1);
	}
}
