package interface3;

public class Test {
	public static void main(String[] args) {
		Erzeuger erzeuger;
		Produkt produkt;

		erzeuger = new ErzeugerA();
		produkt = erzeuger.erzeugeProdukt();
		produkt.print();
		produkt.process();

		erzeuger = new ErzeugerB();
		produkt = erzeuger.erzeugeProdukt();
		produkt.print();
		produkt.process();

	}
}
