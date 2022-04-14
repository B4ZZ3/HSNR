package Aufgabe_4;

import java.util.Arrays;


public class QuadratSortApp {

	
	public static void main(String[] args) {
		
		Quadrat[] einArray = {new Quadrat(23), new Quadrat(10), new Quadrat(12)};
		
		System.out.println(Arrays.toString(einArray));
		
		//sortieren
		Arrays.sort(einArray);
			
		//ausgeben
		for (int i=0; i<einArray.length; i++) {
			System.out.println(einArray[i]);
		}
	}
	
}
