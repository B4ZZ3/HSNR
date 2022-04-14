package box8;

public class BoxTest {

	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.setValue(1000);

		Box<Integer> box2 = new Box<>();
		box2.setValue(2000);
		
		System.out.println("Box1: " + box1.getValue());
		System.out.println("Box2: " + box2.getValue());
		System.out.println();
		
		Utils.<Integer>exchange(box1, box2);
		System.out.println("Box1: " + box1.getValue());
		System.out.println("Box2: " + box2.getValue());
		System.out.println();
		
		Utils.exchange(box1, box2);
		System.out.println("Box1: " + box1.getValue());
		System.out.println("Box2: " + box2.getValue());
	}
}
