package BinaryTree;

public class AVLTreeTest {
    public static void main(String[] args) {
        AVLBinaryTree tree = new AVLBinaryTree();

        int input[] = {35, 28, 52, 7, 19, 65, 59, 44};
        for(int i = 0; i < input.length; i++) {
            tree.insert(input[i]);
        }

        // System.out.println("\n");
        // tree.traverse(1);
        // System.out.println("\n");

        // System.out.println("Die Zahl 35 ist im Baum?: " + tree.find(35));
        // System.out.println("\n");

        // System.out.println("Die kleinste Zahl im Baum ist?: " + tree.findMinElementRekursiv());
        // System.out.println("Die grosste Zahl im Baum ist?: " + tree.findMaxElement());

        //Alle Traversierungen (zum testen auskommentieren)
        // tree.traverse(1); //PreOrder
        // System.out.println("\n");
        // tree.traverse(2); //InOrder
        // System.out.println("\n");
        // tree.traverse(3); //PostOrder
        // System.out.println("\n");
        // tree.traverse(4); //LevelOrder

        //TreePrinter
        TreePrinter.print(tree.head);
    }
}
