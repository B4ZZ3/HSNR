/** Represents a Queue
 * @author Bjarne Christel
 * @version 1.0
*/

public class Queue extends DList {
    
    DList queue;

    /** Creates an empty Queue based on a double linked List.
    */

    Queue() {
        queue = new DList();
    }

    /** Enters an object in the queue
     * @param obj the object for the queue.
    */

    public void enter(Object obj) {
        queue.addFirst(obj);
    }

    /** Removes the oldest object from the queue
     * @return returns the oldest object.
    */

    public Object leave() {
        try {
            return queue.removeLast();
        } catch (Exception e) {
            System.out.println("Die Queue ist leer!");
            return null;
        }
    }

    /** Checks if the queue is empty
     * @return true if queue is empty/ false if objects are in the queue 
    */

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
