package characterstrom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("Test2.java"));
		BufferedWriter out = new BufferedWriter(new FileWriter("aus.txt"));

		int c = 0;
		String line;
		while ((line = in.readLine()) != null) {
			out.write(++c + ": ");
			out.write(line);
			out.newLine(); // schreibt den Zeilentrenner
		}

		in.close();
		out.close();
	}
}
