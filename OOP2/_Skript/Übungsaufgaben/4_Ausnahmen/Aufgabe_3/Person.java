package Aufgabe_3;

public class Person {
	
	public int alter;
	
	public Person (int alter) throws OutOfRangeException{
		if(alter >= 0 & alter <=150) {
			this.alter = alter;
		}
		else {
			throw new OutOfRangeException("Das Alter muss zwischen 0 und 150 liegen!");
		}
	}
	
	public String getAlter() {
		return "Die Person ist " +alter+ " Jahre alt.";
	}
	
	
	
	
}
