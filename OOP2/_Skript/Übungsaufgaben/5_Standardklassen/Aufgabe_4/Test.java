package Aufgabe_04;

public class Test {

	public static void main(String[] args) {
		
		Artikel a1 = new Artikel(123, 2);
		Artikel a2 = new Artikel(456, 5);
		Artikel a3 = new Artikel(789, 12);
		
		Artikelliste l1 = new Artikelliste();
		
		l1.add(a1);
		l1.add(a2);
		l1.add(a3);
		
		l1.gibListeAus();
		System.out.println("-------------------------------------");
		l1.erhoehePreise(0);
		l1.gibListeAus();
		
		
	}
}