package serialisieren2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserialisieren {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(
				"bestellung.dat"));
		Bestellung b = (Bestellung) in.readObject();
		in.close();
		
		print(b);
	}
	
	@SuppressWarnings("rawtypes")
	private static void print(Bestellung b) {
		System.out.println(b);
		List positionen = b.getPositionen();
		int size = positionen.size();
		for (int i = 0; i < size; i++) {
			System.out.println(positionen.get(i));
		}
	}
}
