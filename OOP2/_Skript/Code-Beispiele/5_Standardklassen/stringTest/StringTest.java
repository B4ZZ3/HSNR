package stringTest;

public class StringTest { 
	public static void main(String[] args) { 
		String nachname = "Schmitz", vorname = "Hugo";

		// Verketten
		String name = nachname + ", " + vorname;
		name = name.concat(" Egon");
		// alternativ: name += " Egon";
		System.out.println("Name: " + name);

		// Länge
		System.out.println("Länge des Namens: " + name.length()); // Extrahieren
		System.out.println("Teilstring: " + name.substring(0, 13));

		// Vergleichen
		if (name.endsWith("Egon"))
			System.out.println("Name endet mit: \"Egon\""); 
		if (nachname.equals("Schmitz"))
			System.out.println("Nachname ist \"Schmitz\""); 
		if (vorname.compareTo("Egon") > 0)
			System.out.println("\"" + vorname + "\" ist größer als \"Egon\"");

		// Suchen
		if (name.indexOf("Hugo") >= 0)
			System.out.println("Name enthält \"Hugo\""); 
		
		// Ersetzen
		System.out.println("Name in Kleinbuchstaben: \"" + name.toLowerCase() + "\""); 

		// Konvertieren
		String s = String.valueOf(3.57);
		System.out.println("Zahl mit Dezimalkomma: " + s.replace('.', ',')); 
		
		// Split und Join
		String data = "Hugo Meier;12345;Musterdorf";
		String[] words = data.split(";");
		for (String str : words) System.out.println(str);
	}
}
