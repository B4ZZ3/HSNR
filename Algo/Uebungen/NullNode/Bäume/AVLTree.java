package NullNode.Bäume;

import java.util.*;

public class AVLTree {

	/**
	 * Deklarieren der Variablen, die im Code verwendet werden.
	 * Die unteren sind als static final deklariert, da Sie nicht mehr ver�ndert werden d�rfen.
	 * Diese werden in einer Switch case Abfrage verwendet.
	 */
	private AVLNode head;
	private AVLNode nullNode;
	private boolean rebalance;
	
	public static final int INORDER = 1;
	public static final int PREORDER = 2;
	public static final int POSTORDER = 3;
	public static final int LEVELORDER = 4;

	/**
	 * Konstuktor, der eine neue Node erstellt und die zwei Pointer auf null setzt.
	 */
	public AVLTree() {
		head = new AVLNode(null);
		nullNode = new AVLNode(null);
		nullNode.setLeft(nullNode);
		nullNode.setRight(nullNode);
		head.setRight(nullNode);
		head.setBalance(0);
	}
		
	/**
	 * Methode um eine neue Node einzuf�gen.
	 * @param n, Node zum vergleichen und speichern der keys
	 * @param k, dient als Varibale f�r compareTo, damit die keys verglichen werden k�nnen.
	 * @return es wird true ausgegeben
	 */
	public AVLNode insertNode (AVLNode n, Comparable k) { 
		AVLNode tmp;
		if (n.compareKeyTo(k) != 0)
			return n;
		else if (n.compareKeyTo(k) < 0) {
		// weiter nach rechts gehen
		if (n.getRight () != nullNode) {
		// rechts einf�gen
		n.setRight (insertNode(n.getRight (), k));
		if (n != head && rebalance)
			// Ausgleichen notwendig
			switch (n.getBalance ()) {
			case 1:
				if (n.getRight ().getBalance () == 1) {
					// Rotation nach links
					tmp = rotateLeft (n);
					tmp.getLeft ().setBalance (0);
				}
				else {// doppelte Rotation rechts-links
					int b = n.getRight ().getLeft ().getBalance ();
					n.setRight (rotateRight (n.getRight ()));
					tmp = rotateLeft (n);
				tmp.getRight().setBalance ((b == -1) ? 1 : 0);
				tmp.getLeft().setBalance ((b == 1) ? -1 : 0);
				}
				tmp.setBalance (0);
				rebalance = false;
			return tmp;
			case 0:
				n.setBalance (1);
				return n;
			case -1:
				n.setBalance (0);
				rebalance = false;
				return n;
			} // of switch
			else return n;
		} // of if
		else {
			AVLNode newNode = new AVLNode(k);
			newNode.setLeft(nullNode);
			newNode.setRight(nullNode);
			n.setRight (newNode);
			n.setBalance (n.getBalance () + 1);
			rebalance = (n.getBalance () >= 1);
			return n;
		}
	} // of if
		else { // links einfuegen (analog)
			
			}
			return null;
			}

	/**
	 * Methode um eine neue Node einzuf�gen, Aufruf von insertNode
	 * @param k, vergleichs Node f�r Comparable
	 */
	public void insert( Comparable k) {
		insertNode(head, k);
	}
	
	/**
	 * Methode, wenn die balance nicht eingehalten wird von rechts nach links
	 * @param n, Node zum �bergeben der keys
	 * @return ausgabe des derzeitigen keys
	 */
	private AVLNode rotateLeft (AVLNode n) {
		AVLNode current = n.getRight ();
		n.setRight (n.getRight ().getLeft ());
		current.setLeft (n);
		return current;
	}
	/**
	 * Methode, wenn die balance nicht eingehalten wird von rechts nach links
	 * @param n, Node zum �bergeben der keys
	 * @return ausgabe des derzeitigen keys
	 */
	private AVLNode rotateRight (AVLNode n) {
		AVLNode current = n.getLeft ();
		n.setLeft (n.getLeft ().getRight ());
		current.setRight (n);
		return current;
	}
	
	/**
	 * Methode um einen Node/Wert im Baum zu suchen
	 * @param k wird zum vergleichen der keys verwendet
	 * @return Der Key der verlangten Node wird bei existenz ausgegeben.
	 */
	public AVLNode find (Comparable k) {
		AVLNode n = head;
		while (n != nullNode) {
			int cmp = n.compareKeyTo(k);
			if(cmp ==0)
				return n;
			else
				n = (cmp < 0 ? n.getLeft () : n.getRight ());
		}
		return null;
	}	
	
	public Object findMinElementRekursiv () {
		return minValue(head.getLeft());
	}
	/**
	 * Methode f�r findMin
	 * @param min Speicheort f�r den key
	 * @return den key als Integer
	 */
	private Integer minValue(AVLNode min) {
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
	private Integer maxValue(AVLNode max) {
		if(max.getRight() == null) {
            return maxValue(max.getRight());
        }
        return (Integer) max.getKey();
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
	 * Ausabe in absteigener Reihenfolge der keys
	 * @param n, Node um die Keys zu �bergeben und auszugeben
	 */
	private void printInorder (AVLNode n) {
		if (n != nullNode) {
			printInorder (n.getLeft ());
			System.out.println (n.toString());
			printInorder (n.getRight ());
		}
	}
	/**
	 * Es wird zuerst die Wurzel (W) betrachtet und anschlie�end wird zuerst der linke (L), dann der rechte (R) Teilbaum durchlaufen
	 * @param n, Node um die Keys zu �bergeben und auszugeben
	 */
	private void printPreorder (AVLNode n) {
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
	private void printPostorder (AVLNode n) {
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
			AVLNode n = (AVLNode) q.remove();
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
