public class TickerTest extends Ticker {
	
	public static void main(String[] args) {
		
		Ticker test = new Ticker(1, 59, 999); 	//Neues Objekt "test" vom Typ Ticker initialisieren 
		
		test.anzeigen();						//Zeit ausgeben lassen
		
		test.tick();							//Ein Tick hochz�hlen
		
		test.anzeigen();						//Zeit ausgeben lassen um �nderung zu sehen
		
		test.stelle(3, 24, 543);				//Zeit manuell einstellen
		
		test.anzeigen();						//Zeit ausgeben lassen um �nderung zu sehen
	}
}
