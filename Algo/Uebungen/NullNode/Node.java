package NullNode;

class Node {
    private Object element;
    private Node next;

    /**
     * The constructor to create a node.
     * @param element Your data.
     * @param next A reference to the next node.
     */
    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    /**
     * This method returns the saved data object of the node.
     * @return The data object.
     */
    public Object getElement() {
        return element;
    }

    /**
     * This method returns the node, this node is referencing to.
     * @return The referenced node.
     */
    public Node getNext() {
        return next;
    }

    /**
     * This method sets the data value that should be saved in this node.
     * @param element The value that should be saved in this node.
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * This method sets the node, this node should reference.
     * @param next The node, that should be referenced.
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

class ExtendedNode {
    private Object element;
    private ExtendedNode next_succ;
    private ExtendedNode next_prev;

    /**
     * The constructor to create a ExtendedNode.
     * @param element Your data.
     * @param next_prev A reference to the previous node.
     * @param next_succ A reference to the next node.
     */
    public ExtendedNode(Object element, ExtendedNode next_prev, ExtendedNode next_succ) {
        this.element = element;
        this.next_succ = next_succ;
        this.next_prev = next_prev;
    }

    /**
     * This method returns the saved data object of the node.
     * @return The data object.
     */
    public Object getElement() {
        return element;
    }

    /**
     * This method returns the next node, this node is referencing to.
     * @return The referenced node.
     */
    public ExtendedNode getNext() {
        return next_succ;
    }

    /**
     * This method returns the previous node, this node is referencing to.
     * @return The referenced node.
     */
    public ExtendedNode getPrevious() {
        return next_prev;
    }

    /**
     * This method sets the data value that should be saved in this node.
     * @param element The value that should be saved in this node.
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * This method sets the next node, this node should reference.
     * @param next_succ The next node, that should be referenced.
     */
    public void setNext(ExtendedNode next_succ) {
        this.next_succ = next_succ;
    }

    /**
     * This method sets the previous node, this node should reference.
     * @param next_prev The previous node, that should be referenced.
     */
    public void setPrevious(ExtendedNode next_prev) {
        this.next_prev = next_prev;
    }
}