package exception;

public class StringUtilsV3 {
	public static String clip(String s) throws StringClipException {
		if (s == null)
			throw new StringClipException("no string");
		if (s.length() < 2)
			throw new StringClipException("short string");
		return s.substring(1, s.length() - 1);
	}
}
