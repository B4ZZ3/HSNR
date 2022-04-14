package Aufgabe_1;

public class Temperatur {
	
	protected double celsius;
	
	
	public Temperatur() {
		
	}
	
	public Temperatur(double celsius) {
		setCelsius(celsius);
	}

	public void setCelsius(double celsius) {
		if(celsius >= -273.15){
			this.celsius = celsius;
		}
		else {
			System.out.println("Der Wert muss über -273,15°C liegen.");
		}					
	}
	
	public double getCelsius() {
		return celsius;
	}
}
