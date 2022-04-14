package cast1;

public class Test2 {
	public static void main(String[] args) {
		Schallplatte platte = new Single("Der Junge und das Meer", 10, 12);

//		Fehler beim Compilieren:
//		int tracks = platte.getAnzahlTracks();

		int tracks = ((Single) platte).getAnzahlTracks();
		System.out.println(tracks);
	}
}