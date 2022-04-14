import java.util.Scanner;

public class VolumenRechner {

	public static void main(String[] args) {
		//Kegel Variablen
		double kegelRadius = 4.3;
		double kegelHoehe = 6.2;
		
		//Quader Variablen
		double quaderSeiteA = 5.2;
		double quaderSeiteB = 3.4;
		double quaderHoehe = 6.2;
		
		//Volumen-Berechnung Kegel
		//double volumenKegel = (1/3) * (Math.PI * (kegelRadius * kegelRadius)) * kegelHoehe;
		double volumenKegel = (double)1 / 3 * (Math.PI * (kegelRadius * kegelRadius)) * kegelHoehe ;
		double volumenKegelGerundet = Math.round(volumenKegel * 100.0) / 100.0;
		
		//Volumen-Berechnung Quader
		double volumenQuader = quaderSeiteA * quaderSeiteB * quaderHoehe;
		double volumenQuaderGerundet = Math.round(volumenQuader * 100.0) / 100.0;
		
		//Ausgabe der Ergebnisse
		System.out.println("Volumen des Kegels (cm^3): " + volumenKegelGerundet);
		System.out.println("Volumen des Quaders (cm^3): " + volumenQuaderGerundet);
		
		//�berpr�fung welches Volumen gr��er ist
		if(volumenKegelGerundet > volumenQuaderGerundet) {
			System.out.println("Das Kegel-Volumen ist gr��er!");
		}
		else if(volumenKegelGerundet == volumenQuaderGerundet) {
			System.out.println("Das Volumen ist gleich gro�!");
		}
		else {
			System.out.println("Das Quader-Volumen ist gr��er!");
		}
	}

}