package NullNode;

public class DList {
    private ExtendedNode head;
    private ExtendedNode tail;

    /**
     * The simple constructur to create a DList object.
     */
    public DList() {
        head = new ExtendedNode(null, null,null);
        tail = new ExtendedNode(null, null,null);
        head.setNext(tail);
        tail.setPrevious(head);
    }

    /**
     * This method shows if the list has elements.
     * @return Boolean if the list has elements.
     */
    public boolean isempty() {
        if (head.getNext() == tail) return true;
        return false;
    }

    /**
     * This method adds a data object at the first spot of the list.
     * @param data The data object that should be add.
     */
    public void addFirst(Object data) {
        if (isempty()) {
            head.setNext(new ExtendedNode(data, head,tail));
            tail.setPrevious(head.getNext());
            return;
        }
        ExtendedNode n = new ExtendedNode(data, head,head.getNext());
        head.getNext().setPrevious(n);
        head.setNext(n);
    }

    /**
     * This method returns the first data object of the list.
     * @return The data object at the first place.
     * @throws ListEmptyException Exception if the list has no elements that can be returned.
     */
    public Object getFirst() throws ListEmptyException {
        if (isempty()) throw new ListEmptyException();
        return head.getNext().getElement();
    }

    /**
     * This method removes and returns the last value of the list.
     * @return The last data object of the list.
     * @throws ListEmptyException Exception if the queue has no elements that can be returned.
     */
    public Object removeFirst() throws ListEmptyException {
        if (isempty()) throw new ListEmptyException();
        Object obj = head.getNext().getElement();
        ExtendedNode nextNewNode = head.getNext().getNext();
        nextNewNode.setPrevious(head);
        head.setNext(nextNewNode);
        return obj;
    }

    /**
     * This method adds a data object at the end of the list.
     * @param data The data that should be added.
     */
    public void addLast(Object data) {
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
     *
     * @return
     * @throws ListEmptyException Exception if the queue has no elements that can be returned.
     */
    public Object getLast() throws ListEmptyException {
        if (isempty()) throw new ListEmptyException();
        return tail.getPrevious().getElement();
    }

    /**
     * This method removes and returns the last value of the list.
     * @return The last data object of the list.
     * @throws ListEmptyException Exception if the queue has no elements that can be returned.
     */
    public Object removeLast() throws ListEmptyException {
        if (isempty()) throw new ListEmptyException();
        ExtendedNode newPreNode = tail.getPrevious().getPrevious();
        Object temp = tail.getPrevious().getElement();
        newPreNode.setNext(tail);
        tail.setPrevious(newPreNode);
        return temp;
    }
}