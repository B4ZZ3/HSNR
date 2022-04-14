package konstruktion;

public class Test1 extends Thread {
  public void run() {
    int i = 0;

    while (true) {
    	System.out.println(++i);
//    	Thread t = Thread.currentThread();
//    	System.out.println("Name = " + t.getName());
//    	System.out.println("Id = " + t.getId());
//    	System.out.println("Priorität = " + t.getPriority());
//    	System.out.println("Zustand = " + t.getState());

      // Thread wird für mindestens 1000 Millisekunden angehalten
      try {
        Thread.sleep(1000);
      }
      catch (InterruptedException e) { }
    }
  }
  
  public static void main(String[] args) {
    Test1 t = new Test1();

    t.start();

    while (true) {
      // Thread wird für mindestens 5000 Millisekunden angehalten
      try {
        Thread.sleep(5000);
      }
      catch (InterruptedException e) { }

      System.out.println("Hallo");
//      System.out.println("Name = " + t.getName());
//      System.out.println("Id = " + t.getId());
//      System.out.println("Priorität = " + t.getPriority());
//      System.out.println("Zustand = " + t.getState());

    }
  }
}
