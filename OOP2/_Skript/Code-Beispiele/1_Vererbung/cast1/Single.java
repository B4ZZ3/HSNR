package cast1;

public class Single extends Schallplatte {
  public Single(String titel, int dauerA, int dauerB) {
    super(titel, dauerA, dauerB);
  }

  public int getAnzahlTracks() {
    return 2;
  }

  public void print() {
    System.out.println("*** Single ***");
    super.print();
    System.out.println("Tracks: " + getAnzahlTracks());
  }
}
