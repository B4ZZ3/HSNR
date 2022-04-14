package Aufgabe_1;

public class Utilities implements Anzeigbar{
	
	private static int counter = 0;
	
	public static void anzeige(Anzeigbar a) {
	
		counter++;		
	}

	public void zeige() {
			System.out.println(counter);
	}
}
