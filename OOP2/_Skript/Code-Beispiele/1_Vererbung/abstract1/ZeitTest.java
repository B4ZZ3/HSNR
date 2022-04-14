package abstract1;

public class ZeitTest {
  public static void main(String[] args) {
    Zeit z;

    z = new Tage(3);
    System.out.println(z.getSekunden());

    z = new StundenMinuten(8, 30);
    System.out.println(z.getSekunden());
  }
}
