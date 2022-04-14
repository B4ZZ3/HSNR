package system;

import java.util.Properties;

public class SystemProperties {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.list(System.out);

		System.out.println();
		String home = System.getProperty("user.home");
		System.out.println(home);
		String javahome = System.getProperty("java.home");
		System.out.println(javahome);
		String libpath = System.getProperty("java.library.path");
		System.out.println(libpath);
	}
}
