package BinaryTree;

public class AVLBinaryTree {
    AVLNode head;

    public static final int INORDER = 1;
    public static final int PREORDER = 2;
    public static final int POSTORDER = 3;
    public static final int LEVELORDER = 4;

    /** Creates an empty AVLTree
    */
    public AVLBinaryTree() {
        head = null;
    }

    //----------------
    //Einfuege-Methode
    //----------------

    /** Inserts a avlnode
     * @param c the value for the new avlnode
     * @return true if it works
    */
    public boolean insert(Comparable c) {
        int data = (int) c;
        head = insertRecursive(head, data);
        return true;
    }

    /** Inserts the given avlnode
     * @param head the avlnode to start the insert process from
     * @param key the value of the new avlnode
     * @return the new avlnode
    */
    private AVLNode insertRecursive(AVLNode head, int key) {
        if (head == null) { //ist der Baum leer wird der neue Knoten gesetzt
            AVLNode node = new AVLNode(key);
            head = node;
            return head;
        } else if ((int) head.getKey() > key) { //ist der neue Wert kleiner, dann gehts in den linken subtree
            head.setLeft(insertRecursive(head.getLeft(), key));
        } else if ((int) head.getKey() < key) { //ist der neue Wert groesser, dann gehts in den rechten subtree
            head.setRight(insertRecursive(head.getRight(), key));
        } else {
            System.err.println("Die Zahl ist bereits vorhanden!");
            return null;
        }
        return rebalance(head); //alles nicht der Fall, dann muss rebalanced werden
    }

    /** Gets the balance of a avlnode
     * @param head the node to start the rebalance from
     * @return the rebalanced node
    */
    private AVLNode rebalance(AVLNode head) {
        updateBalance(head); //sets den maximalen Wert der Subtrees
        int balance = getBalance(head); //schaut ob der baum links oder rechts lastig ist
        if (balance > 1) { //wenn es links lastig ist
            if (balance(head.getRight().getRight()) > balance(head.getRight().getLeft())) { //wenn der rechte subtree eine höhere balance hat als der linke subtree
                head = rotateLeft(head);
            } else {
                head.setRight(rotateRight(head.getRight()));    //oder eine rechts-...
                head = rotateLeft(head);                        //..-links rotation
            }
        } else if (balance < -1) { //wenn er rechts lastig ist
            if (balance(head.getLeft().getLeft()) > balance(head.getLeft().getRight())) //wenn der linke subtree eine höhere balance hat als der rechts subtree
                head = rotateRight(head);   //macht eine einfache rechts Rotation
            else {
                head.setLeft(rotateLeft(head.getLeft()));   //oder eine links-...
                head = rotateRight(head);                   //..-rechts roation
            }
        }
        return head;
    }

    /** Gets the balance of a avlnode
     * @param head the node to get the balance from
     * @return the balance value
    */
    private int balance(AVLNode head) {
        return head == null ? -1 : head.getBalance();
    }

    /** Updates the balance of a avlnode
     * @param head the node update the balance from
    */
    private void updateBalance(AVLNode head) {
        head.setBalance(1 + Math.max(balance(head.getLeft()), balance(head.getRight()))); //setzt den maximalen Wert der beiden Subtrees als balance
    }

    /** Returns the balance of a avlnode
     * @param head the node to get the balance from
     * @return the balance value
    */
    private int getBalance(AVLNode head) {
        return (head == null) ? 0 : balance(head.getRight()) - balance(head.getLeft()); //schaut ob der baum rechts oder linkslastig ist
    }

    //------------------
    //Rotations-Methoden
    //------------------

    /** Does a left rotation inside the avltree
     * @param n the node to rotate to the left
     * @return avlnode with rotated sub nodes
    */
    private AVLNode rotateLeft (AVLNode n) {
        AVLNode temp1 = n.getRight();
        AVLNode temp2 = temp1.getLeft();
        temp1.setLeft(n);
        n.setRight(temp2);
        updateBalance(n);
        updateBalance(temp1);
        System.out.println("Links-Rotation");
        return temp1;
    }

    /** Does a right rotation inside the avltree
     * @param n the node to rotate to the right
     * @return avlnode with rotated sub nodes
    */
    private AVLNode rotateRight (AVLNode n) {
        AVLNode temp1 = n.getLeft();
        AVLNode temp2 = temp1.getRight();
        temp1.setRight(n);
        n.setLeft(temp2);
        updateBalance(n);
        updateBalance(temp1);
        System.out.println("Rechts-Rotation");
        return temp1;
    }

    //-------------
    //Such-Methoden
    //-------------

    /** Searchs inside the avltree for the given element
     * @param c the elment to search for
     * @return true if it is in the tree
    */
    public boolean find(Comparable c) {
        int data = (int) c;                 //Der Comprable-Typ c wird zu einem int gecastet

        AVLNode searchNode = findRecursive(head, data);   //Aufruf der tatsächlichen rekursiven Suchmethode 
                                                            //und Speicherung der AVLNode falls es sie im Baum gibt
        
        if (searchNode!= null)      //Wenn im head Element etwas gespeichert ist...
            return true;            //.. dann ist das Elment gefunden worden und true wird zurueckgegeben                
        else
            return false;           //ansonsten gibt es das Element im Baum nicht
    }

    /** Searchs resursive inside the avltree for the given element
     * @param head the node to begin the search with
     * @param key the element to search for
     * @return true if it is in the tree
    */
    private AVLNode findRecursive(AVLNode head, int key)  { 
        //ist der Baum leer oder der Start-Knoten hat den gesuchten Wert 
        if (head == null || (int) head.getKey() == key) 
            return head; 

        if ((int) head.getKey() > key) //Ist der gesuchte Wert kleiner als der momentane Knoten...
            return findRecursive(head.getLeft(), key); //.. dann wird im linken Teilbaum weitergesucht
        
        return findRecursive(head.getRight(), key); //sonst ist der Wert groesser und es wird im rechten Teilbaum gesucht
    } 

    /** Finds the min value of the avltree
     * @return the smallest object of the avltree
    */
    public Object findMinElementRekursiv() { 
        return minRekursiv(head);
    }

    /** Finds the min value of the avltree recursive
     * @param head the node to begin the search with
     * @return the min int value
    */
    private int minRekursiv(AVLNode head) {
        if (head.getLeft() == null)         //Ist kein linkes Element des Knoten vorhanden, haben wir das kleinste Element gefunden
            return (int) head.getKey();     //und der Wert wird zrueckgegeben    
        return minRekursiv(head.getLeft()); //sonst muss noch weiter nach dem kleinsten linken Element gesucht werden
    }
    
    /** Finds the min value of the avltree iterative
     * @return the min int value
    */
    public Object findMinElementIterativ() {
        while(head.getLeft() != null) {     //solange es einen Nachfolger auf der linken Seite gibt
            head = head.getLeft();          //wird das naechste linke Element ausgewaehlt 
        }
        return head.getKey();               //und das letzte linke, also kleinste, Elment wird zurueck gegeben
    }
    
    /** Finds the max value of the avltree recursive
     * @return the max value
    */
    public Object findMaxElement() {
        return maxRekursiv(head);
    }

    /** Finds the max value of the avltree recursive
     * @param head the element to start the search with
     * @return the max int value
    */
    private int maxRekursiv(AVLNode head) {
        if (head.getRight() == null)            //Wenn es kein weiteres Elemet auf der rechten Seite gibt
            return (int) head.getKey();         //dann ist dass das groesste Elment 
        return maxRekursiv(head.getRight());    //sonst muss man noch weiter suchen durch einen neuen rekursiven Aufruf
    }

    //-------------
    //Traversierung
    //-------------

    /** Traverse through the binarytree with four different methods
     * @param order which method used to traverse through
    */
    public void traverse (int order) {
        switch (order) {
            case INORDER:
                System.out.println("InOrder Traversierung");
                inOrder();
                break;
            case PREORDER:
                System.out.println("PreOrder Traversierung");
                preOrder();
                break;
            case POSTORDER:
                System.out.println("PostOrder Traversierung");
                postOrder();
                break;
            case LEVELORDER:
                System.out.println("LevelOrder Traversierung");
                levelOrder();
                break;
            default:
                break;
        }
    }

    /** Starts the inOrdner traverse methods
    */
    private void inOrder() { 
        inOrderRecursive(head); 
    } 
    
    /** Does the inOrder traverse
     * @param head the node to start with
    */
    private void inOrderRecursive(AVLNode head) { 
        if (head != null) { 
            inOrderRecursive(head.getLeft()); 
            System.out.print(head.getKey() + " "); 
            inOrderRecursive(head.getRight()); 
        } 
    } 

    /** Starts the preOrder traverse methods
    */
    private void preOrder() {
        preOrderRecursive(head);
    }

    /** Does the preOrder traverse
     * @param head the node to start with
    */
    private void preOrderRecursive(AVLNode head) { 
        if (head != null) { 
            System.out.print(head.getKey() + " ");
            preOrderRecursive(head.getLeft()); 
            preOrderRecursive(head.getRight()); 
        } 
    }

    /** Starts the postOrdner traverse methods
    */
    private void postOrder() {
        postOrderRecursive(head);
    }

    /** Does the postOrder traverse
     * @param head the node to start with
    */
    private void postOrderRecursive(AVLNode head) { 
        if (head != null) { 
            postOrderRecursive(head.getLeft()); 
            postOrderRecursive(head.getRight()); 
            System.out.print(head.getKey() + " ");
        } 
    }

    /** Starts the levelOrdner traverse methods
    */
    private void levelOrder() {
        int height = height(head);
        for (int i = 1; i <= height; i++)
            currentLevel(head, i);
    }

    /** Prints the current level of the binarytree
     * @param head the node to start with
     * @param level the level of the binarytree to print
    */
    private void currentLevel(AVLNode head, int level)
    {
        if (head == null)
            return;
        if (level == 1)
            System.out.print(head.getKey() + " ");
        else if (level > 1) {
            currentLevel(head.getLeft(), level - 1);
            currentLevel(head.getRight(), level - 1);
        }
    }

    /** Gets the depth of the binarytree
     * @param head the node to start with
     * @return the height of the binarytree
    */
    private int height(AVLNode head)
    {
        if (head == null)
            return 0;
        else {
            int lheight = height(head.getLeft());
            int rheight = height(head.getRight());
 
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
}
