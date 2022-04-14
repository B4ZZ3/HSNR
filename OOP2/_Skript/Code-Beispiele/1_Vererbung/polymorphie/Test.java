package polymorphie;

public class Test {
  public static void main(String[] args) {
    Konto[] kto = new Konto[8];

    for (int i = 0; i < 8; i++) {
      double z = Math.random();

      if (z < 0.5) {
        kto[i] = new Girokonto(i, i * 100., 1000.);
      } else {
        kto[i] = new Sparkonto(i, i * 100., 3.5);
      }
    }

    for (int i = 0; i < 8; i++) {
      kto[i].info();
    }
  }
}
