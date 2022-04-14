package NullNode.Bäume;

public class AVLNode {

	int balance;	// -1, 0, oder 1
	Object key;
	AVLNode left = null;
	AVLNode right = null;
	
	public AVLNode (Object e) { 
		key = e;
		balance = 0;
	}
	public int compareKeyTo(Comparable k) {
		return (key == null ? -1 : ((Comparable)key).compareTo(k));
	}
	public AVLNode getLeft () { 
		return left;
	}
	public AVLNode getRight () {
		return right;
	}
	public Object getKey () {
		return key;
	}
	public void setLeft (AVLNode n) { 
		left = n;
	}
	public void setRight (AVLNode n) {
		right = n;
	}
	public int getBalance () {
		return balance;
	}
	public void setBalance (int b) { 
		balance = b;
	}
}
