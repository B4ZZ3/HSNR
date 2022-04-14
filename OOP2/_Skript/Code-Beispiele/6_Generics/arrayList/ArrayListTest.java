package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Anton");
		list.add("Emil");
		list.add("Fritz");
		list.add("Hugo");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println();
		list.add(3, "Gustav");
		list.remove(0);
		for (String s : list) {
			System.out.println(s);
		}
	}

}
