package Aufgabe_05;

import java.util.*;

public class MailAdressen {
	
	public static void main(String[] args) {
		
		//Map<key, value>
		var map = new Hashtable<String, String>(); //HashMap erlaubt null Werte, Hashtable nicht
		
		map.put("Tobias Piepers", "tobias.piepers@stud.hn.de");
		map.put("Bjarne Christel", "bjarne.christel@stud.hn.de");
		
		//map.put("Max Mustermann", null);
		
		System.out.println(map.get("Tobias Piepers"));
		System.out.println(map.get("Bjarne Christel"));
		
		//System.out.println(map.get("Max Mustermann"));
	}
}