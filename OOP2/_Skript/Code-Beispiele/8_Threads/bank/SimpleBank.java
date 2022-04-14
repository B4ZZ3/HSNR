package bank;

public class SimpleBank {
  private static int[] konten = {30, 50, 100};

  public synchronized void ueberweise(int von, int nach, int betrag) {
//  public synchronized void ueberweise(int von, int nach, int betrag) {
    int neuerBetrag;
    neuerBetrag = konten[von];
    neuerBetrag -= betrag;
    
    try {
      Thread.sleep((int) Math.random() * 1000);
    }
    catch(InterruptedException e) {
    }
    
    konten[von] = neuerBetrag;

    neuerBetrag = konten[nach];
    neuerBetrag += betrag;
    
    konten[nach] = neuerBetrag;
  }

  public void kontostand() {
    int sum = 0;
    for(int i = 0; i < konten.length; i++) {
        sum += konten[i];
        System.out.println("Konto " + i + ": " + konten[i]);
    }
    System.out.println("Summe: " + sum);
  }
}