package interface3;

public class ErzeugerB implements Erzeuger {
	public Produkt erzeugeProdukt() {
		return new ProduktB();
	}
}
