public class Ticker {
	private int min = 0;
	private int sek = 0;
	private int tsdSek = 0;
	
	public Ticker() { 											//1. leerer Konstruktor
		
	}
	
	public Ticker(int minute, int sekunde, int tausendstel) { 	//2. Konstruktor mit den drei Argumenten
		this.min = minute;
		this.sek = sekunde;										//Zuweisung der Argumente
		this.tsdSek = tausendstel;
	}
	
	public void stelle(int min, int sek, int tsdSek) { 			//Funktion stelle
		this.min = min;											//Zuweisung der Werte wie im Konstruktor
		this.sek = sek;
		this.tsdSek = tsdSek;
	}
	
	public void tick() {										//Funktion tick
		
		if(this.tsdSek == 999) {								//�berpr�fung ob tsdSek bei 999 angekommen sind
			this.tsdSek = 0;									//Wenn ja, dann tsdSek auf 0 resetten
			this.sek++;											//und Sekunden um 1 erh�hen
			
			if(this.sek == 60) {								//Dann noch �berpr�fen ob sek bei 60 angekommen ist
				this.sek = 0;									//Wenn ja dann sek auf 0 resetten
				this.min++;										//und Minuten um 1 erh�hren
			}
		}
		else {													//Falls das alle nicht der Fall sein sollte
			this.tsdSek++;										//dann einfach tsdSek um 1 erh�hen
		}
	}
	
	public void anzeigen() {
		System.out.println("Die Zeit betr�gt: " + this.min + " Min " + this.sek + " Sek " + this.tsdSek + " tsdSek");
	}
}