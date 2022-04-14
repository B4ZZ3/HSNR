import java.util.*;

public class WortBuch <T extends CharSequence, U extends CharSequence> {
    
    Map<T, U> wortBuch = new HashMap<T, U>();

    public void add(T de, U en) {
        wortBuch.put(de, en);
    }

    public void print() {
        for (T de: wortBuch.keySet()) {
            String key = de.toString();
            String value = wortBuch.get(de).toString();
            System.out.println("DE: " + key + " - EN: " + value);
        }
    }

    public void translateDE(String wordDE) {
        for (T de: wortBuch.keySet()) {
            String value = wortBuch.get(de).toString();
            if(wordDE.equals(de.toString()))
                System.out.println("Die Übersetzung lautet: " + value);
        }
    }

    public void sort() {
        Object[] words = wortBuch.keySet().toArray();
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
    }
}
