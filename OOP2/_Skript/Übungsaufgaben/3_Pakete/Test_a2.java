import buchungen.Transaktion;
import waehrung.Betrag;

public class Test_a2 {

	public static void main(String[] args) { 
		
		Betrag b1 = new Betrag(5000, 300);
		System.out.println(b1.toString());
		
		
		Transaktion t1 = new Transaktion(b1);
		t1.ueberweise();
	}
}
