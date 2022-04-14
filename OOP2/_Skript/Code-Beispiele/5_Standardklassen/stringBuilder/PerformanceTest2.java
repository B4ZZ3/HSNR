package stringBuilder;

public class PerformanceTest2 {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("x");
    
    long a = System.currentTimeMillis();
    
    for (int i = 0; i < 400000; i++) {
      if (i % 10000 == 0) {
        System.out.println(i);
      }
      s.append("x");
    }
    
    long b = System.currentTimeMillis();
    
    System.out.println("Dauer: " + (b - a));
    System.out.println(s.length());
  }
}
