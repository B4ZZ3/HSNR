package cast1;

public class Test1 {
  public static void main(String[] args) {
    Single single = new Single("Der Junge und das Meer", 10, 12);
    Schallplatte platte = single;

    // oder kurz:
    //Schallplatte platte = new Single("Der Junge und das Meer", 10, 12);
    
    platte.print();
    System.out.println();
  }
}
