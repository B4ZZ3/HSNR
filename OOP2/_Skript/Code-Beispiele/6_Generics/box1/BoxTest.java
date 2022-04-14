package box1;

public class BoxTest {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.setValue("Hugo Meier");

		Box box2 = new Box();
		box2.setValue(4711); // Autoboxing
		
		System.out.println(((String) box1.getValue()).length()); 
		System.out.println((Integer) box2.getValue() + 1);
	
//		box1.setValue(1234);
//		System.out.println((Integer) box1.getValue());
		
	}

}
