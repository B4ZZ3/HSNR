/** Represents a single linked List
 * @author Bjarne Christel
 * @version 1.0
*/

public class List {
    Node head;

    /** Creates an empty single linked List.
    */

    public List() {
        head = null;
    }

    /** Inserts an object at the start of the list
     * @param obj the object for the list.
    */

    public void addFirst(Object obj){
        if(!isEmpty()) {
            Node temp = head;
            head = new Node(obj, temp);
        }
        else {
            head = new Node(obj);
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
        return first;
    }

    /** Inserts an object at the end of the list
     * @param obj the object for the list.
    */

    public void addLast(Object obj) {
        if(!isEmpty()) {
            Node last = head;
            while (last.getNext() != null)
                last = last.getNext();
            
            Node k = new Node(obj, null);
            last.setNext(k);
        }
        else {
            head = new Node(obj);
        }
    }

    /** Returns the last object of the list
     * @return the last object of the list.
     * @throws Exception
    */

    public Object getLast() throws Exception {
        if (isEmpty())
            throw new Exception("List is emtpy!");
        
        Node last = head;
        while (last.getNext() != null)
            last = last.getNext();

        return last.getElement();
    }

    /** Removes the last object of the list
     * @return the removed last object of the list.
     * @throws Exception
    */

    public Object removeLast() throws Exception {
        if (isEmpty()) 
            throw new Exception("List is emtpy!");
        
        Node penultimate = head;

        //das vorletzte Element aus der Liste nehmen
        while (penultimate.getNext().getNext() != null) 
            penultimate = penultimate.getNext();

        //das letzte Element speichern in obj
        Object last = penultimate.getNext().getElement();
        //den Pointer des vorletzten Elements auf null setzten
        penultimate.setNext(null);

        return last;
    }

    /** Checks if the list is empty
     * @return true if list is empty/ false if objects are in the list 
    */

    public boolean isEmpty() {
        return head == null;
    }

}