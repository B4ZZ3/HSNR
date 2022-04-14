package NullNode;

public class Queue {
    private ExtendedNode head;
    private ExtendedNode tail;

    /**
     * The simple constructor to create a Queue object.
     */
    public Queue() {
        head = new ExtendedNode(null, null,tail);
        tail = new ExtendedNode(null, head,null);
    }

    /**
     * This method shows if the queue has elements.
     * @return Boolean if the queue has elements.
     */
    public boolean isempty() {
        if (head.getNext() == tail) return true;
        return false;
    }

    /**
     * This method adds a element into the queue.
     * @param data The data object you want to add to the queue.
     */
    public void enter(Object data) {
        if (isempty()) {
            head.setNext(new ExtendedNode(data, head,tail));
            tail.setPrevious(head.getNext());
            return;
        }
        ExtendedNode newNode = new ExtendedNode(data,tail.getPrevious(),tail);
        tail.getPrevious().setNext(newNode);
        tail.setPrevious(newNode);
    }

    /**
     * This method returns the data object that is on slot one of the queue.
     * @return The data object that is on the first place in the queue.
     * @throws ListEmptyException Exception if the queue has no elements that can be returned.
     */
    public Object leave() throws ListEmptyException {
        if (isempty()) throw new ListEmptyException();
        Object obj = head.getNext().getElement();
        head.setNext(head.getNext().getNext());
        return obj;
    }
}
