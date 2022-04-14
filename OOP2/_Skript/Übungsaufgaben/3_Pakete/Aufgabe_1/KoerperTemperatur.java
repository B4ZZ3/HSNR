package Aufgabe_1;


public class KoerperTemperatur extends Temperatur{
	

	public KoerperTemperatur() {
		super(36.5);

	}
	public void setCelsius(double celsius){
		if(celsius >= 25 & celsius <= 43){
			this.celsius = celsius;
		}
		else {
			System.out.println("Bitte geben Sie einen Wert zwischen 25 und 43 ein!");
		}
	}	
	public double getFahrenheit(){
		return (celsius * 9/5)+32; 
	}
	
}
