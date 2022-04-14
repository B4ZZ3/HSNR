package geschaeftsbank;


public class TestGeschaeftsbank {

	public static void main(String[] args) {
//		Konto a1 = new Konto(0.5, "Hugo Maier", "111111", 1000.);
//		System.out.println(a1);
		Girokonto a2 = new Girokonto(0.0, "Fritz Müller", "222222", 2000., 500, 0.1);
		System.out.println(a2);
		Sparplankonto a3 = new Sparplankonto(3.0, "Otto Schmidt", "333333", 3000., 10, 100);
		System.out.println(a3);
		Termingeldkonto a4 = new Termingeldkonto(5.0, "Heinz Bäcker", "444444", 50000., 2, 10000.);
		System.out.println(a4);
		System.out.println("Guthabenzinssatz des Termingeldkontos: "+a4.getGuthabenZinssatz());
	}

}
