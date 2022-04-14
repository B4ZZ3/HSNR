package NullNode.Bäume;

public class TestAVLTree {

	public static void main(String [] args) {
		
		 int a1[] = {35, 28, 52, 7, 19, 65, 59, 44};
		
		AVLTree b1 = new AVLTree();

		for(int i = 0; i < a1.length; i++) {	
			b1.insert(a1[i]);
		}
		
		b1.find(7);
		
//		System.out.println("Inorder");
//		b1.traverse(1);
//		System.out.println("========");
//		System.out.println("Preorder");
//		b1.traverse(2);
//		System.out.println("=========");
//		System.out.println("Postorder");
//		b1.traverse(3);
//		System.out.println("==========");
//		System.out.println("Levelorder");
//		b1.traverse(4);
	}
}
