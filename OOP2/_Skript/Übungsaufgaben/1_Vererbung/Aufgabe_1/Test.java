package Aufgabe_1;

public class Test {

	public static void main(String[] args) {
		
		Temperatur t1 = new Temperatur(10);
		System.out.println("Die Temperatur betr�gt: " +t1.getCelsius() + "�C");
		t1.setCelsius(-274);
		System.out.println("Die Temperatur betr�gt: " +t1.getCelsius() + "�C");
		
		KoerperTemperatur k1 = new KoerperTemperatur();
		System.out.println("Die Temperatur betr�gt: " +k1.getCelsius() + "�C");
		k1.setCelsius(48.3);
		System.out.println("Die Temperatur betr�gt: " +k1.getCelsius() + "�C");
		System.out.println("Die Temperatur betr�gt: " +k1.getFahrenheit() + "�F");
	}

}
  