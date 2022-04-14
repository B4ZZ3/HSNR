package BinaryTree;

/** Represents a binary tree
 * @author Bjarne Christel
 * @version 1.0
 */

public class BinaryTree {
    TreeNode head;

    public static final int INORDER = 1;
    public static final int PREORDER = 2;
    public static final int POSTORDER = 3;
    public static final int LEVELORDER = 4;

    /** Creates a BinaryTree with an empty head element
    */
    public BinaryTree() {
        head = null;
    }

    //----------------------
    //Hinzufuegen & Loeschen
    //----------------------

    /** Inserts an element into the binary tree
     * @param c the Comparable element
     * @return true if it works
    */
    public boolean insert(Comparable c) {
        int data = (int) c;                 //Der Comprable-Typ c wird zu einem int gecastet um die Werte miteinander vergleichen zu können
        head = insertRecursive(head, data); //das head Element speichert den gesamten Baum-Aufbau durch die rekursive Aurufweise
        return true;
    }

    /** Inserts an element into the binary tree
     * @param head the first element to start the insert process
     * @param key the value for the node
     * @return the new TreeNode
    */
    private TreeNode insertRecursive(TreeNode head, int key) {
        //wenn der Baum noch leer ist...
        if(head == null) {
            TreeNode node = new TreeNode(key);  //.. wird eine neue TreeNode erzeugt 
            head = node;                        //und als neues head-Element gesetzt
            return head;                        //und das head-Element zurueck gegeben
        }
        //ist der Baum nicht leer wird er traversiert/durchlaufen
        if (key < (int)head.getKey())                               //Abfrage: ist das neue Element KLEINER als das untersuchte Knoten...
            head.setLeft(insertRecursive(head.getLeft(), key));     //... geht es in den LINKEN Teilbaum mit einem neuen rekursiven Aufruf und das Element wird als LINKER Nachfoger gesetzt
        else if (key > (int)head.getKey())                          //Abfrage: ist das neue Element GROESSER als der untersuchte Knoten...
            head.setRight(insertRecursive(head.getRight(), key));   //... geht es in den RECHTEN Teilbaum mit einem neuen rekursiven Aufruf und das Element wird als RECHTER Nachfolger gesetzt
        return head; 
    }

    /** Removes the element from the binarytree
     * @param c the element to remove from the binarytree
     * @return true if element is removed
    */
    public boolean remove(Comparable c) {
        int data = (int) c;
        head = removeRecursive(head, data); // Rekursive Funktion aufrufen
        return true;
    }

    /** Removes the element from the binarytree
     * @param head the node to start the removing process
     * @param key the value to be removed
     * @return the treenode that is removed
    */
    private TreeNode removeRecursive(TreeNode head, int key) {
        if (head == null)                                       //Wenn der Baum leer ist..
            return head;                                        //.. dann wird das leere Element zurueckgegeben
        
        //durch den gesamten Baum traversieren
        if (key < (int)head.getKey())                           //durch die linke Baum-Seite traversieren
            head.setLeft(removeRecursive(head.getLeft(), key)); 
        else if (key > (int) head.getKey())                     //durch die rechte Baum-Seite traversieren
            head.setRight(removeRecursive(head.getRight(), key)); 
        else  { 
            //wenn es nur noch ein Element gibt
            if (head.getLeft() == null) //entweder das linke Element ist leer...
                return head.getRight(); //dann wird das rechte Element zurueckgegeben
            else if (head.getRight() == null) //sonst ist das rechte Elment leer
                return head.getLeft(); //dann wird das linke Element zureuckgegeben
   
            //wenn es noch zwei Knoten gibt
            //den kleinsten Wert aus dem rechten Teilbaum nehmen    
            head.setKey(minRekursiv(head.getRight())); 
 
            //den Nachfolger löschen
            head.setRight(removeRecursive(head.getRight(), (int) head.getKey())); 
        } 
        return head; //das Element zurueckgeben
    }

    //-------------
    //Such-Methoden
    //-------------
    
    /** Searchs inside the binarytree for the given element
     * @param c the elment to search for
     * @return true if it is in the tree
    */
    public boolean find(Comparable c) {
        int data = (int) c;                 //Der Comprable-Typ c wird zu einem int gecastet

        TreeNode searchNode = findRecursive(head, data);   //Aufruf der tatsächlichen rekursiven Suchmethode 
                                                            //und Speicherung der TreeNode falls es sie im Baum gibt
        
        if (searchNode != null)      //Wenn im head Element etwas gespeichert ist...
            return true;            //.. dann ist das Elment gefunden worden und true wird zurueckgegeben                
        else
            return false;           //ansonsten gibt es das Element im Baum nicht
    }

    /** Searchs resursive inside the binarytree for the given element
     * @param head the node to begin the search with
     * @param key the element to search for
     * @return true if it is in the tree
    */
    private TreeNode findRecursive(TreeNode head, int key)  { 
        //ist der Baum leer oder der Start-Knoten hat den gesuchten Wert 
        if (head == null || (int) head.getKey() == key) 
            return head; 

        if ((int) head.getKey() > key) //Ist der gesuchte Wert kleiner als der momentane Knoten...
            return findRecursive(head.getLeft(), key); //.. dann wird im linken Teilbaum weitergesucht
        
        return findRecursive(head.getRight(), key); //sonst ist der Wert groesser und es wird im rechten Teilbaum gesucht
    } 

    /** Finds the min value of the binarytree
     * @return the smallest object of the binarytree
    */
    public Object findMinElementRekursiv() { 
        return minRekursiv(head);
    }

    /** Finds the min value of the binarytree recursive
     * @param head the node to begin the search with
     * @return the min int value
    */
    protected int minRekursiv(TreeNode head) {
        if (head.getLeft() == null)         //Ist kein linkes Element des Knoten vorhanden, haben wir das kleinste Element gefunden
            return (int) head.getKey();     //und der Wert wird zrueckgegeben    
        return minRekursiv(head.getLeft()); //sonst muss noch weiter nach dem kleinsten linken Element gesucht werden
    }
    
    /** Finds the min value of the binarytree iterative
     * @return the min int value
    */
    public Object findMinElementIterativ() {
        while(head.getLeft() != null) {     //solange es einen Nachfolger auf der linken Seite gibt
            head = head.getLeft();          //wird das naechste linke Element ausgewaehlt 
        }
        return head.getKey();               //und das letzte linke, also kleinste, Elment wird zurueck gegeben
    }
    
    /** Finds the max value of the binarytree recursive
     * @return the max value
    */
    public Object findMaxElement() {
        return maxRekursiv(head);
    }

    /** Finds the max value of the binarytree recursive
     * @param head the element to start the search with
     * @return the max int value
    */
    private int maxRekursiv(TreeNode head) {
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
    private void inOrderRecursive(TreeNode head) { 
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
    private void preOrderRecursive(TreeNode head) { 
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
    private void postOrderRecursive(TreeNode head) { 
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
    private void currentLevel(TreeNode head, int level)
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
    private int height(TreeNode head)
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