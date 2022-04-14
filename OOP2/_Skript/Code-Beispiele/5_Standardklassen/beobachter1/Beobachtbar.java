package beobachter1;

public interface Beobachtbar {
	void anmelden(Beobachter beobachter);

	void abmelden(Beobachter beobachter);

	String gibZustand();
}
