package Aufgabe_03;

public class ZahlenPaar<T extends Number,U extends Number> extends Paar<T,U>{

	public ZahlenPaar(Object valueT, Object valueU) {
		super();
		
	}
	
	public double summe() {
		
		return this.valueT.doubleValue() + this.valueU.doubleValue();
	}
	
	
}
