package box2;

public class BoxTest {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.setValue("Hugo Meier");

		Box<Integer> box2 = new Box<>();
		box2.setValue(4711);

		System.out.println(box1.getValue().length()); 
		System.out.println(box2.getValue() + 1);
		
//		box1.setValue(4711);
	}

}
