package fibonacci;

/*
    Fibonacci-Funktion:
    f(0) = 1
    f(1) = 1
    f(n) = f(n-1) + f(n-2) für n > 1
 */

public class Fibonacci {
	public long fib(int n) {
		if (n <= 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
}
