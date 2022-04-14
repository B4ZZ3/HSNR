package fibonacci;

public class FibonacciTraced extends Fibonacci { 
    // Overriding
    public long fib(int n) {
        System.out.println("fib(" + n + ") called");
        long result = super.fib(n);
        System.out.println("fib(" + n + ") returns " + result);
        return result;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new FibonacciTraced();
        int n = 30;
        System.out.println("fib(" + n + ") = " + fibonacci.fib(n));
    }
}
