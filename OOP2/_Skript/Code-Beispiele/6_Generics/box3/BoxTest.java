package box3;

public class BoxTest {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<>();
		ibox.setValue(4711);

		Box<Double> dbox = new Box<>();
		dbox.setValue(123.45);

		System.out.println(ibox.getValue()); 
		System.out.println(dbox.getValue());

		// Folgende Anweisungen führen zu Übersetzungsfehlern:
		// Box<String> sbox = new Box<>(); 
		// Box<Object> sbox = new Box<>();

		NewBox<Konto> box1 = new NewBox<>(); 
		box1.setValue(new Konto(4711, 10000));

		NewBox<Konto> box2 = new NewBox<>();
		box2.setValue(new Konto(4712, 20000));
		
		System.out.println(box1.getValue().compareTo(box2.getValue()));
	}

}
