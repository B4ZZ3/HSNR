package interface2;

public class Obstlager {
  private Obst[] lager = {new Orange(), new Birne(), new Apfel()};
  
  public void print() {
    for (int i = 0; i < lager.length; i++) {
      System.out.println(lager[i].getName() + " " + lager[i].getFarbe());
    }
  }
   
  public static void main(String [] args) {
    Obstlager obstlager = new Obstlager();
    obstlager.print();
  }
}
