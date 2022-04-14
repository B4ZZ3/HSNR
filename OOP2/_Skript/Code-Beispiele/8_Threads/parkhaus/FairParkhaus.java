package parkhaus;

// Test: java FairParkhaus 1000/1000 1000/1000 1000/1000

import java.util.List;
import java.util.Vector;

public class FairParkhaus implements Parkhaus {
  private int capacity = 1;
  private int autos = 0;
  @SuppressWarnings("rawtypes")
private List queue = new Vector();

  @SuppressWarnings("unchecked")
public synchronized void enter(Auto auto) throws InterruptedException {
    queue.add(auto);
    System.out.println(auto + " reiht sich ein");
    while (autos == capacity || auto != queue.get(0))
      wait();
    System.out.println(auto + " faehrt ein");
    queue.remove(0);
    autos++;
  }

  public synchronized void leave(Auto auto) {
    System.out.println(auto + " faehrt aus");
    autos--;
    notifyAll();
  }

  public static void main(String[] args) {
    Parkhaus parkhaus = new FairParkhaus();
    for(int i = 0; i< args.length; i++) {
        String[] words = args[i].split("/");
        int anfahrt = Integer.parseInt(words[0]);
        int parkzeit = Integer.parseInt(words[1]);
        new Auto(parkhaus, anfahrt, parkzeit).start();
    }
  }
}
