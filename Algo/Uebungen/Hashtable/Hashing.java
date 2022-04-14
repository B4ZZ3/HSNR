package Hashtable;

public interface Hashing {
    public void add (Object o) throws HashTableOverflowException;
    public boolean contains (Object o);
    public void printTable();
}