package polymorphie;

public class Konto {
	protected int kontonummer;
	protected double saldo;

	public Konto() {
	}

	public Konto(int kontonummer, double saldo) {
		this.kontonummer = kontonummer;
		this.saldo = saldo;
	}

	public void info() {
		System.out.println(kontonummer + " " + saldo);
	}
}