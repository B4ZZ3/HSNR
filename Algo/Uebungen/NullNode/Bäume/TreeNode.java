package NullNode.Bäume;

import java.util.Queue;

public class TreeNode {

	/**
	 * deklarieren der Variablen
	 */
	Object key;
	TreeNode left = null;
	TreeNode right = null;
	
	/**
	 * Konstruktor
	 * @param k1 = key
	 */
	public TreeNode (Object k1) {
		this.key = k1;
	}
		
	/**
	 * Methode um die keys zu vergleichen
	 * @param c
	 * @return ob der key gleich ist
	 */
	public int compareKeyTo(Comparable c) {
		return (key == null ? -1 : ((Comparable)key).compareTo(c));
	}

	/**
	 * Get- und Set- Methoden f�r den Key, left und right
	 * @return
	 */
	public Object getKey () {
		return key;
	}
	
	public TreeNode getLeft () {
		return left;
	}
	
	public TreeNode getRight () {
		return right;
	}

	public void setLeft (TreeNode n) {
		left = n;
	}
	
	public void setRight (TreeNode n) {
		right = n;
	}	
}
