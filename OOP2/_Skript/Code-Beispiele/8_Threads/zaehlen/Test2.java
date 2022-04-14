package zaehlen;

public class Test2 extends Thread {
  private static int count;
  private static Object lock = new Object();

  public void run() {
    for (int i = 0; i < 100000000; i++) {
      synchronized (lock) {
        count++;
      }
    }
  }

  public static void main(String[] args) {
    Test2 t1 = new Test2();
    Test2 t2 = new Test2();
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
