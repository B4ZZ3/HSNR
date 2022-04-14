package Aufgabe_03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AktuellesDatum {
	
	public static void main(String args[]) {
		
		
		Date heute = new Date();
		
		SimpleDateFormat f1 = new SimpleDateFormat("EEEE");
		SimpleDateFormat f2 = new SimpleDateFormat("dd.M.yyyy");
		
		String ausgabeTag= f1.format(heute);
		String ausgabeDatum= f2.format(heute);
	
		System.out.println(ausgabeTag + ", den " +ausgabeDatum);
	
	}

}
