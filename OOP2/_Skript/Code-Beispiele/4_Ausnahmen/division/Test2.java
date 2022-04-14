package division;

public class Test2 {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println(a / b);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Parameter fehlt");
    }
    catch (NumberFormatException e) {
      System.out.println("Bitte ganze Zahlen eingeben");
    }
    catch (ArithmeticException e) {
      System.out.println("Autsch! Division durch 0.");
    }
  }
}
