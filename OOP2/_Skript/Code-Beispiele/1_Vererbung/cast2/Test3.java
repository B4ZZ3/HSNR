package cast2;

public class Test3 {
  public static void main(String[] args) {
    A a = new A();
    a.x();
    a.y();
    ((B) a).z();
  }
}