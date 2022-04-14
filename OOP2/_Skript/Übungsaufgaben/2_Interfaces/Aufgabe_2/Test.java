package Aufgabe_2;

public class Test {
	
	private Figur[] array = { new Kreis(), new Rechteck()};

	public void print() {
		for(int i = 0; i < array.length; i++) {
			array[i].zeichne();
			System.out.println(array[i].getFlaeche());
		}
	}

	
	public static void main(String[] args) {
		Test f1 = new Test();
		f1.print();


	}

}
