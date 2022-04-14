public class Test {
    
    //Test-Methode um die Funktionalitäten zu testen
    public static void main(String[] args) {

        //Neues Objekt vom Typ "Trainer" wird erstellt
        Trainer trainer = new Trainer();

        //Neue Objekte vom Typ "Feldpsieler" werden erstellt
        Feldspieler spieler1 = new Feldspieler();
        Feldspieler spieler2 = new Feldspieler();
        Feldspieler spieler3 = new Feldspieler();

        //Neues Objekt vom Typ "Torwart" wird erstellt
        Torwart torwart = new Torwart();

        //Spieler werden dem Trainer zugeordnet
        trainer.addSpieler(spieler1);
        trainer.addSpieler(spieler2);
        trainer.addSpieler(spieler3);

        trainer.addSpieler(torwart);

        //Trainer lässt die Spieler trainieren
        trainer.trainieren();   //In der Konsole werden die Aktivitäten der Spieler ausgegeben



        //Erweiterte Funktionalitäten - Zusatzaufgabe in der Aufgabenstellung
        trainer.setClub("Borussia Mönchengladbach");    //Trainer einen Club zu ordnen
        System.out.println("Der Club des Trainers: " + trainer.getClub());  //Ausgabe des Clubnamens

        spieler1.setRufname("Hans");    //Rufname des Spielers setzen
        System.out.println("Der Name des Spielers: " + spieler1.getRufname());  //Ausgabe des Namens
    }
}
