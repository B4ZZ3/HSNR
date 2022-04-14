package Simplex;

public class SimplexFinishedException extends Exception{
    public SimplexFinishedException() {
        super("Der Simplex wurde bereits geloest");
    }
}
