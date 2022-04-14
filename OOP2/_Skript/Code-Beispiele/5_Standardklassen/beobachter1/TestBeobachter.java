package beobachter1;

public class TestBeobachter {
	public static void main(String[] args) {
		Newsletter newsletter = new Newsletter();
		Abonnent andreas = new Abonnent("Andreas");
		Abonnent birgit = new Abonnent("Birgit");

		newsletter.anmelden(andreas);
		newsletter.anmelden(birgit);
		newsletter.aendereNachricht("Neuigkeit 1");
		System.out.println();

		newsletter.abmelden(andreas);
		newsletter.aendereNachricht("Neuigkeit 2");

		newsletter.abmelden(birgit);
		newsletter.aendereNachricht("Neuigkeit 3");
	}
}
