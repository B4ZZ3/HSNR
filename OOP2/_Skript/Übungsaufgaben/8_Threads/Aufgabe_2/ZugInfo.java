package Aufgabe_02;

public class ZugInfo {
	
	public int platz;
	
	public synchronized int nochFrei() {
		int n = platz;
		// Hier werden DB-Zugriffe simuliert.
		
		try {
		Thread.sleep(100);
		}
		catch (InterruptedException e) { }
		return platz = n + 1;
	}
}
