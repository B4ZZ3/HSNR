package bank;

public class SimpleBankDemo {
  public static void main(String[] args) throws InterruptedException {
    Angestellter a1, a2, a3;
    SimpleBank b = new SimpleBank();

    System.out.println("Vorher:");
    b.kontostand();

    a1 = new Angestellter(b, 0, 1, 20);
    a2 = new Angestellter(b, 1, 2, 20);
    a3 = new Angestellter(b, 2, 0, 20);

    a1.start();
    a2.start();
    a3.start();
    
    a1.join();
    a2.join();
    a3.join();
    
    System.out.println();
    System.out.println("Nachher:");
    b.kontostand();
  }
}