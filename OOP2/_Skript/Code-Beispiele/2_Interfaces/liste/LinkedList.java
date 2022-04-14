package liste;

public class LinkedList implements List {
  private ListElem first = null;
  private ListElem last = null;
  
  public LinkedList() { }

  public void insertLast(int val) {
    ListElem neu = new ListElem(val);
    if (!isEmpty()) {
      last.setNext(neu);  // hinten anhaengen
      last = neu;         // letzten merken
    }
    else {
      first = neu;
      last  = neu;
    }  
  }

  public int getFirst() {
    return first.getValue();
  }
 
  public void deleteFirst () {
    if (!isEmpty()) {
      first = first.getNext();
    }
  }

  public boolean isEmpty() {
    return first == null;
  }

  public boolean search(int val) {
    ListElem elem = first;
    
    while (elem != last) {
      if (elem.getValue() == val) {
        return true;
      }
      elem = elem.getNext();
    }
    
    if (elem.getValue() == val) {
      return true;
    }
    
    return false;
  }
}
