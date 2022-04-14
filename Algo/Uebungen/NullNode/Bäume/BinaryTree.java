package NullNode.Bäume;

import java.util.*;

public class BinaryTree {

	/**
	 * Deklarieren der Variablen, die im Code verwendet werden.
	 * Die unteren sind als static final deklariert, da Sie nicht mehr ver�ndert werden d�rfen.
	 * Diese werden in einer Switch case Abfrage verwendet.
	 */
	private TreeNode head;
	private TreeNode nullNode;
	public static final int INORDER = 1;
	public static final int PREORDER = 2;
	public static final int POSTORDER = 3;
	public static final int LEVELORDER = 4;
	
	/**
	 * Konstuktor, der eine neue Node erstellt und die zwei Pointer auf null setzt.
	 */
	public BinaryTree() {
		head = new TreeNode(null);
		nullNode = new TreeNode(null);
		nullNode.setLeft(nullNode);
		nullNode.setRight(nullNode);
		head.setRight(nullNode);
	}
	
	/**
	 * Methode um eine neue Node einzuf�gen.
	 * @param c, dient als Varibale f�r compareTo, damit die keys verglichen werden k�nnen.
	 * @return es wird true ausgegeben.
	 */
	public boolean insert (Comparable c) {
		TreeNode parent = head, child = head.getRight(); // zwei neue Variablen.
		while (child != nullNode) { //Schleife, solange child nicht null ist
			parent = child;
			int cmp = child.compareKeyTo(c); //�bergabe am cmp, der Key von child und der neue Key werden verglichen
			if (cmp == 0) // wenn child gleich null dann ist es false, ansonsten wird die neue Node angelegt.
				return false;
			else if (cmp < 0)
				child = child.getRight ();
			else
				child = child.getLeft ();
		}
		TreeNode node = new TreeNode(c);
		node.setLeft(nullNode);
		node.setRight(nullNode);
		if (parent.compareKeyTo(c) < 0)
			parent.setRight (node);
		else
			parent.setLeft (node);
		return true;
	}
	
	/**
	 * Methode um einen Node/Wert im Baum zu suchen
	 * @param c wird zum vergleichen der keys verwendet
	 * @return Der Key der verlangten Node wird bei existenz ausgegeben.
	 */
	protected boolean find (Comparable c) {
		TreeNode m = recursiveFindNode(head.getRight(),c);
		if(m != null) 
			return true;
		else
			return false;
	}
	
	/**
	 * Die Node wird recursive gesucht. Das hei�t die Methode wird solange aufgerufen bis die Node gefunden wurde.
	 * @param n wird als Vegleichs Node erstellt
	 * @param c wird zum vergleichen der keys verwendet
	 * @return Ausgabe der gesuchten Node. Wenn nicht vorhanden wird null ausgegeben
	 */
	protected TreeNode recursiveFindNode (TreeNode n, Comparable c) {
			if (n != nullNode) {
				int cmp = n.compareKeyTo(c);
				if (cmp == 0)
					return n;
				else if (cmp > 0)
					return recursiveFindNode(n.getLeft (), c);
				else
					return recursiveFindNode(n.getRight (), c);
			}
			else
				return null;
			}
	
	/**
	 * Methode von findRekursive
	 * @return der Methode minValue und dem Key
	 */
	public Object findMinElementRekursiv () {
		return minValue(head.getLeft());
	}
	/**
	 * Methode f�r findMin
	 * @param min Speicheort f�r den key
	 * @return den key als Integer
	 */
	private Integer minValue(TreeNode min) {
		if(min.getLeft() == null) {
			System.out.println(min.getKey());
            return minValue(min.getLeft());
        }
        return (Integer) min.getKey();
	}

//	public Object findMinElementIterativ () {
//		
//	}
	
	/**
	 * Methode von findMax
	 * @return der Methode maxValue und dem Key
	 */
	public Object findMaxElement () {
		return maxValue(head.getRight());
	}
	/**
	 * Methode f�r findMax
	 * @param max Speicheort f�r den key
	 * @return den key als Integer
	 */
	private Integer maxValue(TreeNode max) {
		if(max.getRight() == null) {
            return maxValue(max.getRight());
        }
        return (Integer) max.getKey();
	}
	
	/**
	 * Um ein Element aus dem Baum zu entfernen
	 * @param c wird zum vergleichen der keys verwendet
	 * @return ausgabe eines boolschen Wert, ob das Element entfernt wurde.
	 */
	public boolean remove (Comparable c) {
		TreeNode parent = head, node = head.getRight(),
		child = null, tmp = null;
		
		// zu l�schenden Knoten suchen
		while (node != nullNode) {
			int cmp = node.compareKeyTo(c);
			if (cmp == 0) break;
			else {
				parent = node;
				node = (cmp < 0 ? node.getLeft() : node.getRight());
			}
		}	
		// Kein Knoten gefunden
		if (node == nullNode)
			return false;
		// Fall 1
		if (node.getLeft() == nullNode && node.getRight() == nullNode)
			child = nullNode;
		// Fall 2
		else if (node.getLeft() == nullNode)
			child = node.getRight();
		else if (node.getRight() == nullNode)
			child = node.getLeft();
		else { // Fall 3: minElement suchen
			child = node.getRight(); tmp = node;
			while (child.getLeft () != nullNode) {
			tmp = child;
			child = child.getLeft ();
			}
			child.setLeft(node.getLeft());
			if (tmp != node) {
			tmp.setLeft(child.getRight());
			child.setRight(tmp);
			}
			}
		if (parent.getLeft() == node)
			parent.setLeft(child);
			else
			parent.setRight(child);
			node = null;
		return true;
	}
	
	/**
	 * Methode travers, beinhaltet eine switch-case Abfrage, wie der Baum ausgegeben werden soll.
	 */
	public void traverse (int order) {
		switch (order) {
			case INORDER:
				printInorder (head.getRight());
				break;
			case PREORDER:
				printPreorder (head.getRight());
				break;
			case POSTORDER:
				printPostorder (head.getRight());
				break;
			case LEVELORDER:
				Deque deque = new ArrayDeque();
				deque.add(head.getRight());
				printLevelorder (deque);
				break;
			default:
		}
	}
	
	/**
	 * Es wird zuerst der linke Teilbaum, dann die Wurzel und <anschlie�end der rechte Teilbaum durchlaufen.
	 * @param n, Node um die Keys zu �bergeben und auszugeben
	 */
	private void printInorder (TreeNode n) {
		if (n != nullNode) {
			printInorder (n.getLeft ());
			System.out.println (n.getKey ());
			printInorder (n.getRight ());
		}
	}
	
	/**
	 * Es wird zuerst die Wurzel (W) betrachtet und anschlie�end wird zuerst der linke (L), dann der rechte (R) Teilbaum durchlaufen
	 * @param n, Node um die Keys zu �bergeben und auszugeben
	 */
	private void printPreorder (TreeNode n) {
		if (n != nullNode) {
			System.out.println (n.getKey());
			printPreorder (n.getLeft ());
			printPreorder (n.getRight ());
		}
	}
	
	/**
	 * Ausgabe erst der linken Seiten und dann der rechten Seite des Baumes
	 * @param n, Node um die Keys zu �bergeben und auszugeben
	 */
	private void printPostorder (TreeNode n) {
		if (n != nullNode) {
			printPostorder (n.getLeft ());
			printPostorder (n.getRight ());
			System.out.println (n.getKey ());
		}
	}
	
	/**
	 * Ausgabe nach der einzelnen Ebenen, von oben nach unten
	 * Es wird daf�r Deque verwendet, da es eine Unterklasse von Queue ist, kann es einfach importiert werden.
	 * Daher k�nnen auch remove(), add() und isEmpty verwendet werden
	 * @param q, Node um die Keys zu �bergeben und auszugeben
	 */
	private void printLevelorder (Deque q) {
		while (! q.isEmpty ()) {
			TreeNode n = (TreeNode) q.remove();
			if (n.getLeft () != nullNode) {
				q.add(n.getLeft ());
				System.out.println(n.getKey());
			}	
			if (n.getRight () != nullNode) {
				q.add(n.getRight ());
				System.out.println (n.getKey());
			}
		}
	}	
}
