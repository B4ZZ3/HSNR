package ressourcen;

public class Test {
  public static void main(String[] args) {
    // Test mit 0, 1, 2, 3
    int count = 3;
    ResourceManager rm = new ResourceManager(count);
    Worker worker1 = new Worker("Worker 1:", rm);
    Worker worker2 = new Worker("Worker 2:", rm);
    Worker worker3 = new Worker("Worker 3:", rm);
    worker1.start();
    worker2.start();
    worker3.start();
  }
}
