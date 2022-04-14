import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;                                    // Importierung aller notwendigen Pakete

public class Main {
    public static void main(String[] args) {

        Vector<Integer> liste = new Vector<Integer>();      // Vector vom Typ Integer erstellen in dem die Werte gespeichert werden

        Scanner sc = new Scanner(System.in);                // Scanner zum Einlesen der Werte
        String input = "";                                  // Input String wird intialisiert
        boolean inputEnd = false;                           // Abbruch Bedingung der while-Schleife

        do {                                                // Anfang do-while-Schleife

            try {                                           // try-catch Block um Exceptions abzufangen und damit das Programm nicht abbricht
                input = sc.nextLine();                      // Eingabe der Zahl durch den Benutzer in der Konsole

                if(input.equals("end")) {                   // Abfrage ob der Input-String der Abbruch-Bedingung "end" entspricht
                    inputEnd = true;                        // Wenn ja, dann wird das Programm beendet und der Nutzer bekommt eine Mitteilung, dass das Programm beendet wurde.
                    System.out.println("Das Programm wurde durch die Eingabe 'end' beendet!");
                    break;                                  // Die Schleife wird mit break beendet und somit sind keine weiteren Eingaben mehr möglich
                }

                Integer listInput = Integer.valueOf(input); // Die Eingabe wird in einen Integer umgewandelt
                liste.add(listInput);                       // Der neue Integer wird dem Vector angehangen
            }
            catch (NumberFormatException e) {               // Klappt die Umwandlung in einen integer nicht, dann wird die Exception hier aufgefangen und dem Nutzer das Problem in der Konsole ausgegeben
                System.out.println("Der Eingabewert ist kein Integer-Wert und kann somit nicht gespeichert werden!");
            } 
        }
        while(!inputEnd);                                   // Solange die Abbruch-Bedingung nicht erfüllt ist, wird die while-Schleife durchlaufen (vgl. Zeile 20)
        
        sc.close();                                         // Der Scanner wird nach den Benutzer-Eingaben geschlossen

        System.out.println("\nVector-Elemente bevor sie sortiert wurden:");

        for(int i = 0; i < liste.size(); i++) {             // Es wird durch den Vector iteriert
            System.out.println(liste.get(i));               // und jeder Integer wird ausgegeben
        }

        Collections.sort(liste);                            // Der Vector wird sortiert

        System.out.println("\nVector-Elemente nach der Sortierung:");

        for(int i = 0; i < liste.size(); i++) {             // Es wird durch den Vector iteriert
            System.out.println(liste.get(i));               // und jeder Integer wird ausgegeben
        }
    }
}