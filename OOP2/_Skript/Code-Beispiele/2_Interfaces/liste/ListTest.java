package liste;

public class ListTest {
  public static void main(String[] args) {
    System.out.println("LinkedList");
    List liste = new LinkedList();

    for (int i = 0; i < 5; i++) {
      liste.insertLast(i);
    }
    
    System.out.println(liste.search(3));
    System.out.println(liste.getFirst());
    liste.deleteFirst();
    System.out.println(liste.getFirst());
    System.out.println();
    
    System.out.println("ArrayList");
    liste = new ArrayList();
    
    for (int i = 0; i < 5; i++) {
      liste.insertLast(i);
    }

    System.out.println(liste.search(3));
    System.out.println(liste.getFirst());
    liste.deleteFirst();
    System.out.println(liste.getFirst());
  }
}
