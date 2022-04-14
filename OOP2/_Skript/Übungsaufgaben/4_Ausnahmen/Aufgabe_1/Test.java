package Aufgabe_1;

public class Test {

	public static void main(String[] args) throws MonatAusnahme {
		
		Monat m1 = new Monat(3);
		System.out.println(m1.getMonatsname());
		
		Monat m2 = new Monat(14);
		System.out.println(m2.getMonatsname());
	}

}
