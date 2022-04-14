package hashtable;

import java.util.*;

public class Federmaeppchen {
	@SuppressWarnings("rawtypes")
	private Map inhalt = new Hashtable();

	@SuppressWarnings("unchecked")
	public void setAnzahl(String utensil, int anzahl) {
		inhalt.put(utensil, anzahl);
	}

	public int getAnzahl(String utensil) {
		return (Integer) inhalt.get(utensil);
	}

	public boolean contains(String utensil) {
		return inhalt.containsKey(utensil);
	}

	public static void main(String[] args) {
		Federmaeppchen inhalt = new Federmaeppchen();

		inhalt.setAnzahl("Bleistift", 2);
		inhalt.setAnzahl("Buntstift", 9);
		inhalt.setAnzahl("Filzstift", 14);
		inhalt.setAnzahl("Kuli", 3);
		inhalt.setAnzahl("Radiergummi", 1);
		inhalt.setAnzahl("Lineal", 2);
		inhalt.setAnzahl("Spitzer", 1);

		System.out.println("Im Maeppchen sind " + inhalt.getAnzahl("Buntstift")
				+ " Buntstifte.");
		System.out.println("Ist ein Spickzettel drin? "
				+ inhalt.contains("Spickzettel"));
		System.out.println("Ist ein Spitzer drin? "
				+ inhalt.contains("Spitzer"));
		System.out.println("Im Maeppchen sind " + inhalt.getAnzahl("Filzstift")
				+ " Filzstifte.");

		inhalt.setAnzahl("Filzstift", 10);
		System.out.println("Im Maeppchen sind " + inhalt.getAnzahl("Filzstift")
				+ " Filzstifte.");
	}
}
