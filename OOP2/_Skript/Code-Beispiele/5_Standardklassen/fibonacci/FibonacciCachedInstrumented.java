package fibonacci;

public class FibonacciCachedInstrumented extends FibonacciCached { 
    private long calls;
    private final long startMillis = System.currentTimeMillis();

    public long fib(int n) {
        calls++;
        return super.fib(n);
    }

    public String toString() {
        return "millis = " + (System.currentTimeMillis() - startMillis) + ", calls = " + calls;
    }

    public static void main(String[] args) {
    	int anzahl = 30;
        for(int n = 0; n < anzahl; n++) {
            Fibonacci fibonacci = new FibonacciCachedInstrumented();
            System.out.println("fib(" + n + ") = " + fibonacci.fib(n) + ", " + fibonacci);
        }
    }
}
