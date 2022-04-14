package fibonacci;

import java.util.Hashtable;
import java.util.Map;

public class FibonacciCached extends Fibonacci {
    @SuppressWarnings("rawtypes")
	private Map cache = new Hashtable();

    @SuppressWarnings("unchecked")
	public long fib(int n) {
        Long result = (Long) cache.get(n);
        if(result == null) {
            result = super.fib(n);
            cache.put(n, result);
        }
        return result;
    }
}
