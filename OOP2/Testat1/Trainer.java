public class Trainer {

    private String club;

    private Spieler[] spieler = new Spieler[4]; //Spieler-Array um dem Trainer Spieler zu ordnen zu können; Länge 4 für 4 Spieler
    private int arrayCounter = 0;               //Counter um die Array-Position zu speichern an der ein Spieler hinzugefügt werden soll

    // Zusätzliche Getter/Setter-Methoden um den Club-Namen des Trainers zu setzen
    public void setClub(String club) {
        this.club = club;
    } 

    public String getClub() {
        return club;
    }

    // Zusätzliche Methode um Spieler ins Array zu packen und so dem Trainer zu zuweisen
    public void addSpieler(Spieler s) {
        spieler[arrayCounter] = s;
        arrayCounter++;
    }

    //Methode die den Trainer die Spieler trainieren lässt (vorgegeben in der Aufgabenstellung)
    public void trainieren () {
        for (Spieler s : spieler) { //Es wird durch das Array itteriert...
            s.trainieren();         //... und jeder darin befindliche Spieler trainiert durch den Methoden-Aufruf
        }  
    }
}