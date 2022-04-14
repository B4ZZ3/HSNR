package Aufgabe_6;

import java.util.Hashtable;
import java.util.Map;

public class HofstadterCache extends Hofstadter{

	private Map cache = new Hashtable();

    @SuppressWarnings("unchecked")
	public int h(int n) {
        Integer result = (Integer) cache.get(n);
        if(result == null) {
            result = super.h(n);
            cache.put(n, result);
        }
        return result;
    }
	
}
