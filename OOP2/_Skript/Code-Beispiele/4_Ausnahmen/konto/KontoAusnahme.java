package konto;

public class KontoAusnahme extends Exception {
  public KontoAusnahme() { }

  public KontoAusnahme(String message) {
    super(message);
  }
}
