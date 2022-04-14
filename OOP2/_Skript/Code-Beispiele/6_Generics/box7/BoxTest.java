package box7;

public class BoxTest {

	public static void main(String[] args) {
		Box<Object> obox = new Box<>();
		obox.setValue("Hugo");
		
		Box<? super Number> box = obox; 
		Object obj = box.getValue(); 
		System.out.println(obj); 
		
		Box<Integer> ibox = new Box<>(); 
		ibox.setValue(4711); 
		System.out.println(ibox.getValue());

		Box<Number> nbox = new Box<>();
		ibox.copyTo(nbox);
		System.out.println(nbox.getValue());
		
		ibox.copyTo(obox);
		System.out.println(obox.getValue());	}
}
