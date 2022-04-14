public abstract class Spieler {
    
    private String rufname;

    // Zusätzliche Getter/Setter-Methoden um den Rufnamen des Spielers zu setzen
    public void setRufname(String rufname) {
        this.rufname = rufname;
    } 

    public String getRufname() {
        return rufname;
    }

    //Abstrakte Methode trainieren 
    public abstract void trainieren();
}
