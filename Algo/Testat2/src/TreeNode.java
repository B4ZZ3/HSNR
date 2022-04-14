/** Represents a TreeNode for a binary tree
 * @author Bjarne Christel
 * @version 1.0
 */
public class TreeNode {
    private Object key;
    private TreeNode left;
    private TreeNode right;

    /** Creates a TreeNode with some data and empty links
    */
    public TreeNode (Object e) {
        this.key = e;
        this.left = null;
        this.right = null;
    }

    /** Returns the left TreeNode of this one
     * @return the left TreeNode
    */
    public TreeNode getLeft () {
        return this.left;
    }

    /** Returns the right TreeNode of this one
     * @return the right TreeNode
    */
    public TreeNode getRight () {
        return this.right;
    }

    /** Returns the data of this TreeNode
     * @return the data
    */
    public Object getKey () {
        return this.key;
    }
    
    /** Sets the left TreeNode of this one
     * @param n the left TreeNode
    */
    public void setLeft (TreeNode n) {
        this.left = n;
    }

    /** Sets the right TreeNode of this one
     * @param n the right TreeNode
    */
    public void setRight (TreeNode n) {
        this.right = n;
    }

    /** Sets the key of the node
     * @param key the data
    */
    public void setKey(Object key) {
        this.key = key;
    }
}