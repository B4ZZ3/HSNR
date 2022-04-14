package characterstrom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class EncodingTest {
	public static void main(String[] args) throws IOException {
		String s1 = "Alpha \u03b1, Beta \u03b2, Epsilon \u03b5";

		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(
				"data.txt"), "UTF-8");

		System.out.println(out.getEncoding());
		System.out.println(s1);

		out.write(s1);
		out.close();

		InputStreamReader in = new InputStreamReader(new FileInputStream(
				"data.txt"), "UTF-8");

		int c;
		StringBuilder sb = new StringBuilder();
		while ((c = in.read()) != -1) {
			sb.append((char) c);
		}

		in.close();

		String s2 = sb.toString();
		System.out.println(s1.equals(s2));
	}
}
