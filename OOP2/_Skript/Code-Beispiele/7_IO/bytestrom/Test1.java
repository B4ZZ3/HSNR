package bytestrom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) throws IOException {
		// Ein- und Ausgabe öffnen
		FileInputStream in = new FileInputStream("tomcat.gif");
		FileOutputStream out = new FileOutputStream("tomcat_copy.gif");

		// Byteweise lesen und schreiben
		// read liefert als reguläres Ergebnis einen Wert zwischen 0 und 255.
		// -1 = 0xFFFFFFFF signalisiert das Ende der Eingabe. Dieser Wert muss
		// sich von den regulären Werten unterscheiden. Deshalb int als
		// Rückgabetyp von read.
		int c;
		int anz = 0;
		while ((c = in.read()) != -1) {
			out.write(c);
			anz++;
		}

		in.close();

		// Schreibt in Puffern enthaltene Daten sofort in den Ausgabestrom
		out.flush();
		out.close();
		System.out.println("Anzahl der Bytes: " + anz);
	}
}
