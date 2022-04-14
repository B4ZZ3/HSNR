package liste;

public interface List {
  void insertLast(int val);
  int getFirst();
  void deleteFirst();    
  boolean isEmpty();         
  boolean search(int val);
}
