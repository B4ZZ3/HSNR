//Inport alles notwendigen Pakete
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ArtikelTest {
    
    public static void main(String[] args) {

        /*
         *Beginn Aufgabe 1
         */

        Scanner sc1 = new Scanner(System.in); //Scanner zum einlesen der Konsolen-Eingaben

        ArrayList<Artikel> alleArtikel = new ArrayList<Artikel>(); //ArrayList vom Typ Artikel um die erstellten Artikel zu speichern
                                     
        boolean inputEnd = false; //Abbruch-Bedingung der do-while Schleife

        String input = ""; //Input String zum Speichern der Eingabe
        int inputArtikelnummer = 0; //Variable zum Speichern der Artikel-Nummer
        double inputPreis = 0; //Variable zum Speichern des Artikel-Preises

        do {
            try {   
                Artikel tempArtikel = new Artikel(); //Temporaerer Artikel um spaeter in der ArrayList gespeichert zu werden          
                
                System.out.println("Bitte geben Sie eine Artikelnummer (Int-Wert) ein:"); 
                input = sc1.nextLine(); //Eingabe der Artikelnummer
                inputArtikelnummer = Integer.valueOf(input); //Eingabe in ein Integer umwandeln
                tempArtikel.setArtikelnummer(inputArtikelnummer); //Eingabe im Artikel-Objekt speichern

                System.out.println("Bitte geben Sie nun den Preis (Double-Wert) ein:");
                input = sc1.nextLine(); //Eingabe des Preises
                inputPreis = Double.valueOf(input); //Eingabe in einen Double umwandeln
                tempArtikel.setArtikelpreis(inputPreis); //Eingabe im Artikel-Objekt speichern

                alleArtikel.add(tempArtikel); //Artikel-Objekt in der ArrayList abspeichern
                System.out.println("Folgendes Objekt wird gespeichert:\nArtikelnummer: "+ tempArtikel.getArtikelnummer() +" \nPreis: "+ tempArtikel.getArtikelpreis() +" €"); //Ausgabe des Objekts fuer den Benutzer

                System.out.println("Moechten Sie ein weiteres Produkt eingeben?");   
                input = sc1.nextLine(); //Eingabe ob weiter gemacht werden soll

                if(input.toLowerCase().equals("nein")) { //Wenn die Benutzer-Eingabe "nein" ist...               
                    inputEnd = true;                     //... dann wird das Programm beendet
                    System.out.println("Das Programm wurde durch die Eingabe 'Nein' beendet!\nUnd die Artikel wurden in der daten.txt Datei gespeichert!");
                    break;                                  
                }
            }
            catch (NumberFormatException e) { //Exception-Handling wenn eine falsche Eingabe gemacht wird
                System.out.println("Der Eingabewert ist kein Double- oder Int-Wert und kann somit nicht gespeichert werden!");
            }
        }
        while(!inputEnd);//Solange inputEnd = true ist lauuft die do-while Schleife weiter   

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("daten.txt")); //Die Datei "daten.txt" wird erstellt

            for(int i = 0; i < alleArtikel.size(); i++) { //Iteration ueber alle Elemente in der ArrayList
                writer.write("Artikelnummer: " + alleArtikel.get(i).getArtikelnummer() + "\nPreis: " + alleArtikel.get(i).getArtikelpreis() + "\n"); //In daten.txt werden die Werte des jeweiligen Artikels geschrieben
            }

            writer.close(); //Der FileWriter wird geschlossen; Alle Daten sind uebertragen
        }
        catch (Exception e) { //Error-Handling (z.B. falls die Datei nicht gefunden werden kann)
            e.printStackTrace(); //Ausgabe des Fehlers in der Konsole
        }

        /*
         *Ende Aufgabe 1
         */

        /*
         *Beginn Aufgabe 2
         */

        File file = new File("daten.txt"); //Neues Datei-Objekt mit dem Datei-Namen "daten.txt" wird initalisiert
        int suchNummer;

        System.out.println("\n\nJetzt bitte die Artikelnummer des gesuchten Artikels eingeben!");
        suchNummer = sc1.nextInt(); //Eingabe der Suchnummer
        
        try {
            Scanner sc2 = new Scanner(file); //Neuer Scanner zum Durchsuchen der txt-Datei

            while(sc2.hasNextLine()) { //Solange etwas in der txt-Datei steht...
                String line = sc2.nextLine(); //... werden alle Reihen der Datei durchgegangen

                if(line.equals("Artikelnummer: " + suchNummer)) {   //Wenn die gesuchte Nummer vorhanden ist...
                    line = sc2.nextLine();                          //... dann wird der darunter stehende Preis genommen...
                    System.out.println("Artikelnummer gefunden!\n" + line + " € zur Artikelnummer: " + suchNummer); ///... und das Ergebnis ausgegeben
                }
            }

            System.out.println("\nAlle Daten durchsucht!");

            sc2.close(); //der 2te Scanner wird geschlossen und keine Eingabe ist mehr möglich
        }
        catch (FileNotFoundException e) { //Error-Handling falls die Datei nicht gefunden wird
            System.err.println("Die Datei konnte leider nicht gefunden und durchsucht werden!");
        }

        sc1.close(); //Scanner wird geschlossen; Keine Konsoleneingaben mehr moeglich

        /*
         *Ende Aufgabe 2
         */
    }
}