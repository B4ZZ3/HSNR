package characterstrom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while (true) {
			System.out.print("> ");

			// readLine() liest eine komplette Textzeile
			line = in.readLine();
			if (line == null || line.length() == 0)
				break;

			System.out.println(line);
		}

		in.close();
	}
}