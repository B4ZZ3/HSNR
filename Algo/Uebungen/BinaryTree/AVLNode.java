package BinaryTree;

/** Represents a AVLNode for a binary tree
 * @author Bjarne Christel
 * @version 1.0
 */
public class AVLNode implements PrintableNode {
    private Object key;
    private AVLNode left;
    private AVLNode right;
    private int balance;

    /** Creates a AVLNode with some data and empty links
    */
    public AVLNode (Object e) {
        this.key = e;
        this.left = null;
        this.right = null;
        this.balance = 0;
    }

    /** Returns the left AVLNode of this one
     * @return the left AVLNode
    */
    public AVLNode getLeft () {
        return this.left;
    }

    /** Returns the right AVLNode of this one
     * @return the right AVLNode
    */
    public AVLNode getRight () {
        return this.right;
    }

    /** Returns the data of this AVLNode
     * @return the data
    */
    public Object getKey () {
        return this.key;
    }

    /** Returns the balance of this AVLNode
     * @return the balance
    */
    public int getBalance () {
        return this.balance;
    }
    
    /** Sets the left AVLNode of this one
     * @param n the left AVLNode
    */
    public void setLeft (AVLNode n) {
        this.left = n;
    }

    /** Sets the right AVLNode of this one
     * @param n the right AVLNode
    */
    public void setRight (AVLNode n) {
        this.right = n;
    }

    /** Sets the key of the node
     * @param key the data
    */
    public void setKey(Object key) {
        this.key = key;
    }

    /** Sets the balance of the node
     * @param b the balance
    */
    public void setBalance (int b) {
        this.balance = b;
    }

    @Override
    public String getText() {
        return this.getKey().toString();
    }
}
