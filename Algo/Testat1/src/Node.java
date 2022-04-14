/** Represents a Node for the list
 * @author Bjarne Christel
 * @version 1.0
*/

public class Node {
    Object element;
    Node next;
    Node prev;

    /** Creates a node.
     * @param obj the object that is stored inside the node
    */

    public Node(Object obj) {
        element = obj;
        next = null;
        prev = null;
    }

    /** Creates a node.
     * @param obj the object that is stored inside the node
     * @param next the next node after this one
    */

    public Node(Object obj, Node next) {
        element = obj;
        this.next = next;
    }

    /** Creates a node.
     * @param obj the object that is stored inside the node
     * @param next the next node after this one
     * @param prev the previous node in front of this one
    */

    public Node(Object obj, Node next, Node prev) {
        element = obj;
        this.next = next;
        this.prev = prev;
    }

    /** Returns the next a node.
     * @return the next node
    */

    public Node getNext() {
        return next;
    }

    /** Sets the next Node.
     * @param next the next node
    */

    public void setNext(Node next) {
        this.next = next;
    }

    /** Returns the previous a node.
     * @return the previous node
    */

    public Node getPrevious() {
        return prev;
    }

    /** Sets the previous Node.
     * @param prev the previous node
    */

    public void setPrevious(Node prev) {
        this.prev = prev;
    }

    /** returns the data from the node.
     * @return returns the data
    */

    public Object getElement() {
        return element;
    }
}