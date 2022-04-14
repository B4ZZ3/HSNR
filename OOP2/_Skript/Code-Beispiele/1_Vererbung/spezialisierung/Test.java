package spezialisierung;

public class Test {
	public static void main(String[] args) {
		Single single = new Single("Der Junge und das Meer", 10, 12);
		System.out.println("Single");
		System.out.println("Titel: " + single.getTitel());
		System.out.println("Spieldauer: " + single.getSpieldauer());
		System.out.println("Tracks: " + single.getAnzahlTracks());
		System.out.println();

		LangspielPlatte lp = new LangspielPlatte("Beethoven Klavierkonzert Nr. 5", 21, 19, 1, 2);
		System.out.println("Langspielplatte");
		System.out.println("Titel: " + lp.getTitel());
		System.out.println("Spieldauer: " + lp.getSpieldauer());
		System.out.println("Tracks: " + lp.getAnzahlTracks());
	}
}
