package Simplex;

public class SimplexNoSolutionException extends Exception{
    public SimplexNoSolutionException() {
        super("Es kann keine Loesung gefunden werden");
    }
}
