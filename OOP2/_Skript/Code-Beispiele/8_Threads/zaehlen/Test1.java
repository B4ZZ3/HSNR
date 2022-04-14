package zaehlen;

public class Test1 extends Thread {
  private static int count;

  public void run() {
    for (int i = 0; i < 100000000; i++) {
      count++;	// "lesen - erhöhen - schreiben" ist nicht atomar 
    }
  }

  public static void main(String[] args) {
    Test1 t1 = new Test1();
    Test1 t2 = new Test1();
    t1.start();
    t2.start();
    
    try {
      t1.join();
      t2.join();
    }
    catch (InterruptedException e) { }
    
    System.out.println(count);
  }
}
