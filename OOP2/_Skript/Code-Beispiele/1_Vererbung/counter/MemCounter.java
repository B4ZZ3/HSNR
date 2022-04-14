package counter;

public class MemCounter extends Counter {
  private int memory;
  
  public void mark() {
    memory = count;
  }
  
  public void recall() {
    count = memory;
  }
}
