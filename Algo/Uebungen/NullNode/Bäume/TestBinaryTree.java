package NullNode.Bäume;

public class TestBinaryTree {

	public static void main(String [] args) {
		
		int a1[] = {35, 28, 52, 7, 19, 65, 59, 44};
		
		BinaryTree b1 = new BinaryTree();

		for(int i = 0; i < a1.length; i++) {	
			b1.insert(a1[i]);
		}
		
		
		System.out.println("Inorder");
		b1.traverse(1);
		System.out.println("========");
		System.out.println("Preorder");
		b1.traverse(2);
		System.out.println("=========");
		System.out.println("Postorder");
		b1.traverse(3);
		System.out.println("==========");
		System.out.println("Levelorder");
		b1.traverse(4);
		
		//Es wurd true ausgegeben, wenn der Wert vorhanden ist.
		System.out.println(b1.find(7));
//		b1.remove(35);
//		b1.traverse(1);
		
		//Min und Max kann angeblich nicht gefunden werden, da er nicht durch den Baum gehen kann
		// Deshalb wird ein Fehler ausgegeben.
		//Habe es leider nicht mehr hinbekommen, wo mein Fehler liegt.
//		System.out.println(b1.findMinElementRekursiv());
//		System.out.println(b1.findMaxElement());
	}
	
 	
}
