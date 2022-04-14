package Aufgabe_1;

import java.text.DateFormatSymbols;


public class Monat {

	private int monat;
	
	public Monat(int monat) throws MonatAusnahme{
		if(monat >= 1 & monat <=12) {
			this.monat = monat;
		}	
		else {
			throw new MonatAusnahme("Der Monat "+monat+ " exisitiert nicht!");
		}
	}	
	public String getMonatsname() {
		return new DateFormatSymbols().getMonths()[monat-1];
	}
}
