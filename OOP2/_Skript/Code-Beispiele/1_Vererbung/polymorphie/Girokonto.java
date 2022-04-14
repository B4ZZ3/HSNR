package polymorphie;

public class Girokonto extends Konto {
  private double kreditLimit;

  public Girokonto(int kontonummer, double saldo, double kreditLimit) {
    super(kontonummer, saldo);
    this.kreditLimit = kreditLimit;
  }

  public void info() {
    System.out.println("GIROKONTO");
    System.out.println("Kontonummer: " + kontonummer);
    System.out.println("Saldo: " + saldo);
    System.out.println("Kreditlimit: " + kreditLimit);
    System.out.println();
  }
}
