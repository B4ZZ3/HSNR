package box6;

public class BoxTest {

	public static void main(String[] args) {
		Box<Integer> ibox = new Box<>(); 
		ibox.setValue(4711); 

		Box<? extends Number> box = ibox;
		Number n = box.getValue();
		System.out.println("n:" + n);

		box.setValue(null); // Nur die Zuweisung von null ist erlaubt
//		box.setValue(4711); // Wildcard-Typ: Es ist kein schreibender Zugriff erlaubt
		
		Box<Number> nbox = new Box<>();
		ibox.setValue(5000); 
		nbox.copyFrom(ibox); 
		System.out.println("ibox:" + ibox.getValue()); 
		System.out.println("nbox:" + nbox.getValue()); 
		
		Box<Double> dbox = new Box<>();
		dbox.setValue(123.45);
		nbox.copyFrom(dbox); 
		System.out.println("dbox:" + dbox.getValue());
		System.out.println("nbox:" + nbox.getValue());
	}
}
