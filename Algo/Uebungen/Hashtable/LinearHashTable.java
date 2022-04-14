package Hashtable;

public class LinearHashTable implements Hashing {
    Object[] table; // Feld mit Listen
    final int MOD = 7;

    public LinearHashTable() {
        table = new Object[MOD];
    }

    public void add(Object o) throws HashTableOverflowException {
        // Feldindex über Hashwert bestimmen
        int idx = (Integer) o % MOD;

        if(table[idx] == null) {
            table[idx] = o;
        }
        else {
            try {
                if(!isEmpty())
                    throw new HashTableOverflowException("LISTE IST VOLL: " + o + " kann nicht eingefügt werden");
                
                for(int i = idx + 1; i < MOD; i++) {
                    if(table[i] == null) {
                        table[i] = o;
                        break;
                    }
                }

                for(int i = 0; i <= idx; i++) {
                    if(table[i] == null) {
                        table[i] = o;
                        break;
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
        LinearHashTable tbl = new LinearHashTable();

        tbl.add(89);
        tbl.add(18);
        tbl.add(49);
        tbl.add(58);
        tbl.add(69);
        tbl.add(10);
        tbl.add(10);

        System.out.println ("18: " + tbl.contains(18));
        System.out.println ("69: " + tbl.contains(69));

        tbl.printTable();
    }
    
}
