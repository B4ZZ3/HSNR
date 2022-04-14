package NullNode;

public class Stack {
    private Node head;

    /**
     * The constructor to create a stack object
     */
    public Stack() {
        head = new Node(null, null);;
    }

    /**
     * This method shows if the stack has elements.
     * @return Boolean if the stack has elements.
     */
    public boolean isempty() {
        if (head.getNext() == null) return true;
        return false;
    }

    /**
     * This method adds data at the top of the stack.
     * @param data The data that should be added.
     */
    public void push(Object data) {
        if(isempty()) {
            head.setNext(new Node(data, null));
            return;
        }

        Node nextNode = head;
        while (nextNode.getNext() != null) {
            nextNode = nextNode.getNext();
        }
        Node n = new Node(data, null);
        nextNode.setNext(n);
    }

    /**
     * This method removes and returns the value, that was added lastly.
     * @return The last added data object.
     * @throws ListEmptyException Exception if the queue has no elements that can be returned.
     */
    public Object pop() throws ListEmptyException {
        if(isempty()) {
            return null;
        }
        Node nextNode = head;
        while (nextNode.getNext().getNext() != null) {
            nextNode = nextNode.getNext();
        }
        Object temp = nextNode.getNext().getElement();
        nextNode.setNext(null);

        return temp;
    }
}
