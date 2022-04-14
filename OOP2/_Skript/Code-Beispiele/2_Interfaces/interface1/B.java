package interface1;

public class B extends A implements X, Y {
  // irgendwas
  
  public void doSomething() {
    System.out.println("something");
    System.out.println(X_VALUE);
    System.out.println(Y_VALUE);
    System.out.println(Y.ABC); // reference to ABC is ambiguous
  }
  
  public void doAnything() {
    System.out.println("anything");
    System.out.println(X_VALUE);
    System.out.println(Y_VALUE);
  }

  public static void main(String[] args) {
    B b = new B();
    b.doSomething();
    b.doAnything();
  }
}
