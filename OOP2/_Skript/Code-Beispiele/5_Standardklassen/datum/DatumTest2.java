package datum;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DatumTest2 {
	public static void main(String[] args) {
		Date jetzt = new Date();
		SimpleDateFormat f1 = new SimpleDateFormat("EEEE, dd.MMMM.yyyy");
		SimpleDateFormat f2 = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat f3 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

		System.out.println("Datum: " + f1.format(jetzt));
		System.out.println("Uhrzeit: " + f2.format(jetzt));
		System.out.println("Datum und Uhrzeit: " + f3.format(jetzt));
	}
}
