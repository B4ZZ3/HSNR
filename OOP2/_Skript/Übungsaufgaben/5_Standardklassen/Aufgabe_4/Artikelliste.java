package Aufgabe_04;

import java.util.Vector;

public class Artikelliste {
	
	Vector<Artikel> liste = new Vector<Artikel>();
	
	public void add(Artikel a) {
		liste.add(a);
	}
	
	public void erhoehePreise(int prozent) {
		
		for(int i = 0; i < liste.size(); i++) {
	
			liste.get(i).artikelpreis += (liste.get(i).artikelpreis * prozent)/100;
		}
	}
	
	public void gibListeAus() {
		
		for(int i = 0; i < liste.size(); i++) {
			
			System.out.println("Artikelnummer: " +liste.get(i).artikelnummer + " Artikelpreis: " +liste.get(i).artikelpreis);
		}
	}	
}
