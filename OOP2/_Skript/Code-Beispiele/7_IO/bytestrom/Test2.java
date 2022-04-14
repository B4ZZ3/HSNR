package bytestrom;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		// Optimierung der Zugriffe durch Verwendung interner Puffer

		// public BufferedInputStream(InputStream in)
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(
				"tomcat.gif"));

		// public BufferedOutputStream(OutputStream out)
		BufferedOutputStream out = new BufferedOutputStream(
				new FileOutputStream("tomcat_copy.gif"));

		int c;
		int anz = 0;
		while ((c = in.read()) != -1) {
			out.write(c);
			anz++;
		}

		in.close();
		out.close(); // Hier ist flush() enthalten
		System.out.println("Anzahl der Bytes: " + anz);
	}
}
