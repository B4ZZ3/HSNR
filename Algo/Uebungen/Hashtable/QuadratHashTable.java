package Hashtable;

public class QuadratHashTable implements Hashing {

    Object[] table; // Feld mit Listen
    final int MOD = 7;
    int quadrat = 1;

    public QuadratHashTable() {
        table = new Object[MOD];
    }

    public void add(Object o) throws HashTableOverflowException {
        // Feldindex über Hashwert bestimmen
        int idx = (Integer) o % MOD;
        boolean hasPosition = false;

        if(table[idx] == null) {
            table[idx] = o;
        }
        else {
            try {
                if(isEmpty())
                    throw new HashTableOverflowException("LISTE IST VOLL: " + o + " kann nicht eingefügt werden");
                
                //Quadrat Position berechnen
                while(!hasPosition) {
                    int pos = (quadrat * quadrat) + idx;
                    quadrat++;

                    if(pos > MOD) {
                        pos = (pos - (MOD - 1)) % MOD;
                    }

                    if(table[pos] == null) {
                        table[pos] = o;
                        hasPosition = true;
                    }
                }
                
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    private boolean isEmpty() {
        int empty = 0;
        for (int x = 0; x < table.length; x++) {
            if (table[x] != null) {
                empty++;
            }
        }
        return (empty == table.length - 1);  
    }

    public boolean contains(Object o) {
        // Feldindex über Hashwert bestimmen
        int idx = (Integer) o % MOD;

        if(table[idx].equals(o)) {
            return true;
        }

        return false;
    }

    public void printTable() {
        for (int i = 0; i < MOD; i++) {
            System.out.print(i + ".Eintrag: ");

            if(table[i] != null) {
                System.out.println(table[i] + " ");
            }
            else
                System.out.println("Leer!");
        }
    }

    public static void main (String[] args) {
        QuadratHashTable tbl = new QuadratHashTable();

        tbl.add(18);
        tbl.add(18);
        tbl.add(18);
        tbl.add(18);
        tbl.add(18);

        //System.out.println ("18: " + tbl.contains(18));
        // System.out.println ("69: " + tbl.contains(69));

        tbl.printTable();
    }
    
}
