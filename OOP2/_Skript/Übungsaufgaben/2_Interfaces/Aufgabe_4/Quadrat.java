package Aufgabe_4;

public class Quadrat implements Comparable <Quadrat> {

	protected int seitenlaengen = 0;
	
	public Quadrat(int seitenlaengen) {
		this.seitenlaengen = seitenlaengen;
	}
	public String toString() {
		return "Quadrat mit Flaeche: " + (seitenlaengen * seitenlaengen);
	}
	
	public int getSeitenlaenge() {
		return seitenlaengen;
	}
	@Override
	public int compareTo(Quadrat o) {
		
		if(this.seitenlaengen > o.getSeitenlaenge()) {
			return 1;
		}		
		else if(this.seitenlaengen < o.getSeitenlaenge()) {
			return -1;
		}		
		else
			return 0;
	}
	
	
}




