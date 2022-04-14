package Aufgabe_2;

public class Test {

	public static void main(String[] args) {

		System.out.println("----------------------------------");
		
		Angestellter a1 = new Angestellter("Mustermann", "Max", 2000);
		a1.befoerdere(4);
		//a1.zeigeDaten();
		a1.addZulage(300);
		a1.erhoeheGehalt(400);
		a1.zeigeDaten();
		
		System.out.println("----------------------------------");
		
		Lehrling l1 = new Lehrling("Piepers", "Tobias", 500);
		l1.setPruefung(5);
		l1.zeigeDaten();
	
	}
}
