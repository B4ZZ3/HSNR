package box5;

public class BoxTest {

	public static void main(String[] args) {
		Box<String> sbox = new Box<>();
		sbox.setValue("Hugo Meier");
		print(sbox);

		Box<Integer> ibox = new Box<>(); 
		ibox.setValue(4711); 
		print(ibox);

		Box<?> box = ibox;
		box.setValue(null);
		print(box);
	}

	public static void print(Box<?> box) { 
		Object obj = box.getValue();
		if (obj == null)
			System.out.println("Box ist leer");
		else
			System.out.println("Inhalt: " + obj);
	}
}
