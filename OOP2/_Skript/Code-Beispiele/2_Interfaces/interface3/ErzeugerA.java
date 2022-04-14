package interface3;

public class ErzeugerA implements Erzeuger {
	public Produkt erzeugeProdukt() {
		return new ProduktA();
	}
}
