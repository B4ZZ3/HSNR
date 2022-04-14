package lottozahlen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottozahlen {

	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> lottozahlen = new HashSet<>();
		do {
			lottozahlen.add(1 + random.nextInt(49));
		} while (lottozahlen.size() < 6);
		Object[] lotto = lottozahlen.toArray();
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
}
