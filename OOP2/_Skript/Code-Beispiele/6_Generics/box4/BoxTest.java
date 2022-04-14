package box4;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box(); // Warnung: Box is a raw type. References to generic type Box<T> should be parameterized
		box.setValue("Hugo"); // Warnung: Box is a raw type. References to generic type Box<T> should be parameterized
		System.out.println(box.getValue()); 

		Box<Integer> ibox = new Box<>();
		ibox.setValue(5000);
		System.out.println(ibox.getValue());
		
		box = ibox;
		System.out.println(box.getValue()); 

//		ibox.setValue("Emil"); Compiler Fehler
		box.setValue("Emil"); // Warnung: Type safety: The method setValue(Object) belongs to the raw type Box. References to generic type Box<T> should be parameterized
		System.out.println(box.getValue()); 

	}

}
