package bank;

public class Angestellter extends Thread {
  private SimpleBank bank;
  private int von, nach, betrag;

  public Angestellter(SimpleBank bank, int von, int nach, int betrag) {
    this.bank = bank;
    this.von = von;
    this.nach = nach;
    this.betrag = betrag;
  }

  public void run() {
    bank.ueberweise(von, nach, betrag);
  }
}