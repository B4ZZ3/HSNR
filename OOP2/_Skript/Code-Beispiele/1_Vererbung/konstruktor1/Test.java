package konstruktor1;

public class Test {
	public static void main(String[] args) {
		Single single = new Single("Der Junge und das Meer", 10, 12);
		single.print();
		System.out.println();

		LangspielPlatte lp = new LangspielPlatte(
				"Beethoven Klavierkonzert Nr. 5", 21, 19, 1, 2);
		lp.print();
		System.out.println();

		CompactDisc cd = new CompactDisc("Jonas Kaufmann: Romantic Arias", 66,
				13);
		cd.print();
	}
}
