package cast1;

public class Test3 {
  public static void main(String[] args) {
    Schallplatte platte = new Schallplatte("Der Junge und das Meer",
        10, 12);

    // Fehler zur Laufzeit!!!
    int tracks = ((Single) platte).getAnzahlTracks();
    System.out.println(tracks);
  }
}
