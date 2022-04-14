package polymorphie;

public class Sparkonto extends Konto {
  private double zinssatz;

  public Sparkonto(int kontonummer, double saldo, double zinssatz) {
    super(kontonummer, saldo);
    this.zinssatz = zinssatz;
  }

  public void info() {
    System.out.println("SPARKONTO");
    System.out.println("Kontonummer: " + kontonummer);
    System.out.println("Saldo: " + saldo);
    System.out.println("Zinssatz: " + zinssatz);
    System.out.println();
  }
}
