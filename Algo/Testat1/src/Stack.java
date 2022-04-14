/** Represents a Stack
 * @author Bjarne Christel
 * @version 1.0
*/

public class Stack extends List {
    List stack;

    /** Creates an empty Stack based on a single linked List.
    */

    Stack() {
        stack = new List();
    }

    /** Pushes an object on top of the stack
     * @param obj the object for the stack.
    */

    public void push(Object obj) {
        stack.addFirst(obj);
    }

    /** Removes the object from top of the stack
     * @return returns the top object.
    */

    public Object pop() {
        try {
            return stack.removeFirst();
        } catch (Exception e) {
            System.out.println("Der Stack ist leer!");
            return null;
        }
    }

    /** Checks if the stack is empty
     * @return true if stack is empty/ false if objects are in the stack 
    */

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
