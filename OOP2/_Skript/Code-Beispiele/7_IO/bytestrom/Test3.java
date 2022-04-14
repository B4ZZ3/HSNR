package bytestrom;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Test3 {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream(
				"zahlen.txt"));

		Random random = new Random();
		// 1000 Integer-Zahlen werden geschrieben
		for (int i = 0; i < 1000; i++) {
			out.writeInt(random.nextInt(100));
		}
		out.close();

		DataInputStream in = new DataInputStream(new FileInputStream(
				"zahlen.txt"));

		// EOFException signalisiert das Dateiende
		try {
			while (true) {
				System.out.print(in.readInt() + " ");
			}
		} catch (EOFException e) {
		}
		in.close();
	}
}
