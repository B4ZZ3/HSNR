package Aufgabe_4;

import java.util.Scanner;

public class Zahl {
	
	private int anzahl;
	private int zahl;
	private int zufallsZahl = (int)(Math.random() * 100 ) + 1;
	
	Scanner scan = new Scanner(System.in);
	
	public void input() {
		
		if(anzahl == 0)
			System.out.println("Der Computer hat eine Zahl zwischen 1 und 100 gezogen. ");
			
		zahl = scan.nextInt();
		anzahl++;

		try {
			try {
				if (zufallsZahl != zahl)
					throw new ZahlException();
				treffer();
			}
			catch (ZahlException e) {
				if(zufallsZahl < zahl)
					throw e;
				System.out.println(">" + zahl + "\n"+ anzahl + ". Versuch: Die gesuchte Zahl ist groesser.");
				 
				input();
			}	
		}
		catch (ZahlException e){
			System.out.println(">" + zahl + "\n"+ anzahl + ". Versuch: Die gesuchte Zahl ist kleiner.");
			
			input();		
		}
	}
	
	public void treffer() {
		System.out.println(anzahl +". Versuch: Treffer");
	}
}
