package Aufgabe_3;

public class HiWi implements StudHilfskraft{
	
	private String name;
	private double gehalt;
	private int matNr;
	private int dauer;
	
	//Konstruktor hinzugefügt
	public HiWi() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGehalt() {
		return gehalt;
	}
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}
	public int getMatrNr() {
		return matNr;
	}
	public void setMatrNr(int matNr) {
		this.matNr = matNr;
	}
	public int getDauer() {
		return dauer;
	}
	public void setDauer(int dauer) {
		this.dauer = dauer;
	}
	public String toString() {
		return "Name: " +name+ "\nGehalt: " +gehalt+ " €" + "\nMatrikelnummer: " +matNr+ "\nDauer: " +dauer+ ". Semster";
	}
	
}
