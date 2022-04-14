package Sortierung;

public class Sortierungen {

    private static void swap(int array[], int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
    
    static void insertionSort (int[] array) {
        for(int i = 1; i < array.length; i++) {
            int marker = i;
            int temp = array[i];

            // für alle Elemente links vom Marker-Feld
            while (marker > 0 && array[marker - 1] > temp){
                // verschiebe alle größeren Element nach hinten
                array[marker] = array[marker - 1];
                marker--;
            }

            // setze temp auf das freie Feld
            array[marker] = temp;
        }
    }

    static void selectionSort (int[] array) {
        int marker = array.length - 1;

        while (marker >= 0) {
            // bestimme größtes Element
            int max = 0;

            for(int i = 1; i <= marker; i++)
                if(array[i] > array[max])
                    max = i;
            
                // tausche array[marker] mit diesem Element
                swap(array, marker, max);
                marker--;
        }
    }

    static void bubbleSort (int[] array) {
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Elemente vertauschen
                    swap (array, i, i + 1);
                    swapped = true;
                }
            }
            // solange Vertauschung auftritt
        } while (swapped);
    }


    static void mergeSort (int[] array) {
        msort (array, 0, array.length - 1);
    }

    static void msort (int[] array, int le, int ri) {
        int i, j, k;
        int[] b = new int[array.length];

        if (ri > le) {
            // zu sortierendes Feld teilen -> Split
            int mid = (ri + le) / 2;
            msort (array, le, mid);
            msort (array, mid + 1, ri);
            
            // Hilfsfeld aufbauen
            for (k = le; k <= mid; k++)
                b[k] = array[k];
            for (k = mid; k < ri; k++)
                b[ri + mid - k] = array[k + 1];

            // Ergebnisse mischen über Hilfsfeld b -> Merge
            i = le; j = ri;

            for (k = le; k <= ri; k++)
                if (b[i] < b[j])
                    array[k] = b[i++];
                else
                    array[k] = b[j--];
        }
    }

    static void quickSort (int[] array) {
        qsort (array, 0, array.length - 1);
    }

    static void qsort (int[] array, int le, int ri) {
        int lo = le, hi = ri;
        
        if (hi > lo) {
            // Pivotelement bestimmen
            int mid = array[(lo + hi) / 2];
        
        while (lo <= hi) {
            // Erstes Element suchen, das größer oder gleich dem
            // Pivotelement ist, beginnend vom linken Index
            while (lo < ri && array[lo] < mid) 
                ++lo;
            // Element suchen, das kleiner oder gleich dem
            // Pivotelement ist, beginnend vom rechten Index
            while (hi > le && array[hi] > mid) 
                --hi;
            // Wenn Indexe nicht gekreuzt -> Inhalte vertauschen
            if (lo <= hi) {
                swap(array, lo, hi);
                ++lo;
                --hi;
            }
        }

        // Linke Partition sortieren
        if (le < hi) 
            qsort (array, le, hi);
        // Rechte Partition sortieren
        if (lo < ri) 
            qsort( array, lo, ri);
        }
    }

    static void bucketSort (int[] array) {
        int[] fertig = new int[array.length];
        int[] buckets = new int[100]; // 100 Buckets
        int i, j, k=0; // Laufvariablen

        for (i=0; i < 100; i++) 
            buckets[i] = 0; // alle Buckets = 0
        
        for (i=0; i < array.length; i++) // für jedes Element
            buckets[array[i]]++; // zuständiges Bucket erhöhen
        
        for (i=0; i < 100; i++) // für jedes Bucket
            for (j=0; j < buckets[i]; j++) // gemäß Zählerstand
                fertig[k++] = i; // sein Zeichen übernehmen

        for (i=0; i < array.length; i++)
            array[i] = fertig [i]; // falls notwendig: umkopieren
    }
}
