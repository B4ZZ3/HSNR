package NullNode;

public class List {
    private Node head;

    /**
     *  The simple constructur to create a List object.
     */
    public List() {
        head = new Node(null, null);
    }

    /**
     * This method shows if the list has elements.
     * @return Boolean if the list has elements.
     */
    public boolean isempty() {
        if (head.getNext() == null) return true;
        return false;
    }

    /**
     * This method adds a data object at the first spot of the list.
     * @param data The data object that should be add.
     */
    public void addFirst(Object data) {
        if (isempty()) {
            head.setNext(new Node(data, null));
            return;
        }
        Node n = new Node(data, head.getNext());
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
        head.setNext(head.getNext().getNext());
        return obj;
    }

    /**
     * This method adds a data object at the end of the list.
     * @param data The data that should be added.
     */
    public void addLast(Object data) {
        Node nextNode = head;
        while (nextNode.getNext() != null) {
            nextNode = nextNode.getNext();
        }
        Node n = new Node(data, null);
        nextNode.setNext(n);
    }

    /**
     * This method returns the last value of the list.
     * @return The data object at the end of the list.
     * @throws ListEmptyException Exception if the queue has no elements that can be returned.
     */
    public Object getLast() throws ListEmptyException {
        if (isempty()) throw new ListEmptyException();

        Node nextNode = head;
        while (nextNode.getNext() != null)
            nextNode = nextNode.getNext();
        return nextNode.getElement();
    }

    /**
     * This method removes and returns the last value of the list.
     * @return The last data object of the list.
     * @throws ListEmptyException Exception if the queue has no elements that can be returned.
     */
    public Object removeLast() throws ListEmptyException {
        if (isempty()) throw new ListEmptyException();

        Node nextNode = head;
        while (nextNode.getNext().getNext() != null) {
            nextNode = nextNode.getNext();
        }
        Object temp = nextNode.getNext().getElement();
        nextNode.setNext(null);
        return temp;
    }
}

class ListEmptyException extends Exception {
    /**
     * The constructor to create this exception object.
     */
    public ListEmptyException() {
    }

    /**
     * The constructor to create this exception object with a message.
     * @param message The text that should be received if you call getMessage().
     */
    public ListEmptyException(String message) {
        super(message);
    }
}