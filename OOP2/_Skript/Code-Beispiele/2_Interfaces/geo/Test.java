package geo;

public class Test {
  public static void main(String[] args) {
    Rechteck r = new Rechteck(10.5, 4.799);
    Kreis k = new Kreis(4.0049);
    
    System.out.println(r.getFlaeche());
    System.out.println(k.getFlaeche());
    System.out.println(GeoVergleich.vergleiche(r, k));
  }
}
