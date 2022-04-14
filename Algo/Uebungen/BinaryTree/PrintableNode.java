package BinaryTree;

/** The interface to print the tree in the console
 * @author Bjarne Christel
 * @version 1.0
 */
public interface PrintableNode {
    PrintableNode getLeft();
    PrintableNode getRight();
    String getText();
}
