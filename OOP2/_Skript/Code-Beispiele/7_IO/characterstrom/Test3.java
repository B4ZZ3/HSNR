package characterstrom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("Test2.java"));

		// true als zweites Argument im Konstruktor von PrintWriter bewirkt,
		// dass der Puffer immer dann geleert wird, wenn println aufgerufen
		// wird.
		PrintWriter out = new PrintWriter(new FileWriter("aus.txt"), true);

		int c = 0;
		String line;
		while ((line = in.readLine()) != null) {
			out.print(++c);
			out.print(": ");
			out.println(line);
		}

		in.close();
		out.close();
	}
}
