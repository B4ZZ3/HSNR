import java.util.Scanner;

public class NotenGenerator {

	public static void main(String[] args) {
		//Definitionen
		int anzahlSchueler = 0;
		String tempNote = new String();
		
		//Anzahl der Schuler eingeben
		System.out.println("Für wie viele Schüler wollen Sie Noten generieren?\nNach der Eingabe mit Return bestätigen!");
		Scanner scannerEingabe = new Scanner(System.in); //Eigaben-Scanner
		
		//Eingabe der Zahl überprüfen
		try //Richtig: Eine Zahl eingeben
		{
			anzahlSchueler = scannerEingabe.nextInt(); 
		}
		catch(java.util.InputMismatchException e) 
		{
			System.out.println("Ungültige Eingabe!"); //Info an den Benutzer über falsche Eingabe
			return; //Programm-Abbruch
		}
		
		//Noten-Array mit der erforderlichen Länge deklarieren
		String[] notenSchueler = new String[anzahlSchueler];
		
		//Die eigentlichen Noten generieren
		for (int i = 0; i < anzahlSchueler; i++)
		{
			int noteGeneriert = (int)(Math.random() * 6 + 1); //Zahl zwischen 1 und 6
			int notenZeichenGeneriert = (int)(Math.random() * 3 + 1); //Zahl zwischen 1 und 3
			
			switch (notenZeichenGeneriert) { //Noten Zusätze (+/-) hinzufügen
			case 1:
				tempNote = noteGeneriert + "+";
				break;
			case 2: 
				tempNote = noteGeneriert + "-";
				break;
			default:
				tempNote = String.valueOf(noteGeneriert); // Kein + oder -, und dann int zu einem String umwandeln
				break;
			}
			
			//Note im Array abspeichern
			notenSchueler[i] = tempNote;
		}
		
		//Ausgabe des Arrays
		System.out.println("Jetzt werden die Noten ausgegeben!");
		for (int u = 0; u < notenSchueler.length; u++) 
		{
			System.out.println("Schüler " + (u+1) +": " + notenSchueler[u] );
			//u+1 da es keinen 0ten-Schüler gibt, das Array aber mit dem Index 0 beginnt
		}
	}
}
