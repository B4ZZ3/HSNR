package Hashtable;

import java.util.*;

public class LinkedHashTable implements Hashing {
    LinkedList[] table; // Feld mit Listen
    final int MOD = 7; //Modulo Variable

    public LinkedHashTable () {
    // Feld aufbauen
        table = new LinkedList[MOD];
    }

    public void add (Object o) throws HashTableOverflowException{
        // Feldindex über Hashwert bestimmen
        int idx = (Integer) o % MOD;

        if (table[idx] == null) // noch keine Liste vorhanden
            table[idx] = new LinkedList();
        
        // an Liste anhängen
        table[idx].addLast(o);
    }

    public void remove (Object o) {
        int idx = (Integer) o % MOD;

        try {
            table[idx].remove(o);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean contains (Object o) {
        // Feldindex über Hashwert bestimmen
        int idx = (Integer) o % MOD;
        
        if (table[idx] != null) {
            // Liste gefunden
            Iterator it = table[idx].iterator();

            while (it.hasNext()) {// sequenzielle Suche
                Object obj = it.next();

                if (obj.equals(o))
                    return true;
            }
        }
        return false;
    }

    public void printTable() {
        for (int i = 0; i < MOD; i++) {
            System.out.print(i + ".Eintrag: ");

            if (table[i] != null) {
                Iterator it = table[i].iterator();
                
                while (it.hasNext ()) {
                    Object obj = it.next();
                    System.out.print (obj + " ");
                }
                
                System.out.println();
            }
            else
                System.out.println("Leer!");
        }
    }

    public static void main (String[] args) {
        LinkedHashTable tbl = new LinkedHashTable();

        tbl.add(89);
        tbl.add(18);
        tbl.add(49);
        tbl.add(58);
        tbl.add(69);
        tbl.add(10);

        System.out.println ("18: " + tbl.contains(18));
        System.out.println ("69: " + tbl.contains(69));

        tbl.printTable();
        System.out.println();
        
        tbl.remove(10);

        tbl.printTable();
    }
}
