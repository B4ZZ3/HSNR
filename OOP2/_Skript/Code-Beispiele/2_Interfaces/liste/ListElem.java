package liste;

public class ListElem {
  private int value;
  private ListElem next;     
  
  public ListElem(int val) {
    value = val;
    next = null;
  }
 
  public ListElem getNext() {
    return next;
  }
 
  public void setNext(ListElem next) {
    this.next = next;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int val) {
    this.value = val;
  }
}
