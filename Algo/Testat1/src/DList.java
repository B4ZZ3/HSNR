/** Represents a double linked List
 * @author Bjarne Christel
 * @version 1.0
*/

public class DList {
    Node head;
    Node tail;

    /** Creates an empty double linked List.
    */

    public DList() {
        head = null;
        tail = null;
    }

    /** Inserts an object at the start of the list
     * @param obj the object for the list.
    */

    public void addFirst(Object obj){
        if(!isEmpty()) {
            Node temp = head;
            head = new Node(obj, temp, null);
            head.getNext().setPrevious(head);
        }
        else {
            head = new Node(obj);
            tail = head;
        }
    }

    /** Returns the first object of the list
     * @return the first object of the list.
     * @throws Exception
    */

    public Object getFirst() throws Exception{
        if (isEmpty())
            throw new Exception("List is emtpy!");
        return head.getElement();
    }

    /** Removes the first object of the list
     * @return the removed first object of the list.
     * @throws Exception
    */

    public Object removeFirst() throws Exception {
        if (isEmpty())
            throw new Exception("List is emtpy!");
        
        Object first = head.getElement();
        head = head.getNext();
        head.setPrevious(null);
        return first;
    }

    /** Inserts an object at the end of the list
     * @param obj the object for the list.
    */

    public void addLast(Object obj) {
        if(!isEmpty()) {
            Node temp = tail;
            tail = new Node(obj, null, temp);
            tail.getPrevious().setNext(tail);
        }
        else {
            tail = new Node(obj);
            head = tail;
        }
    }

    /** Returns the last object of the list
     * @return the last object of the list.
     * @throws Exception
    */

    public Object getLast() throws Exception {
        if (isEmpty())
            throw new Exception("List is emtpy!");

        return tail.getElement();
    }

    /** Removes the last object of the list
     * @return the removed last object of the list.
     * @throws Exception
    */

    public Object removeLast() throws Exception {
        if (isEmpty())
            throw new Exception("List is emtpy!");
        
        Object last = tail.getElement();
        tail = tail.getPrevious();
        tail.setNext(null);
        return last;
    }

    /** Checks if the list is empty
     * @return true if list is empty/ false if objects are in the list 
    */

    public boolean isEmpty() {
        return head == null && tail == null;
    }

}
