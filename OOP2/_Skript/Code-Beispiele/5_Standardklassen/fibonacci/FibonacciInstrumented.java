package fibonacci;

public class FibonacciInstrumented extends Fibonacci { 
    private long calls;
    private final long startMillis = System.currentTimeMillis();

    // Overriding
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
            Fibonacci fibonacci = new FibonacciInstrumented();
            System.out.println("fib(" + n + ") = " + fibonacci.fib(n) + ", " + fibonacci);
        }
    }
}
