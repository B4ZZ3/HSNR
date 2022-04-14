package Aufgabe_02;


public class Konto{

	private int kontonummer;
	private double saldo;
	
	public Konto() {}
	
	public Konto(int kontonummer, double saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;	
	}
	
	public int getKontonummer() {
		return kontonummer;
	}
	public void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
//	public String toString() {
//		return "Kontonummer: " +kontonummer+ " Kontostand: " +saldo +"\n";
//	}

	
}
