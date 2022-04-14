package Simplex;

import java.text.DecimalFormat;

public class Simplex {
    private static int m; // Anzahl der Ungleichungen
    private static int n; // Anzahl der Strukturvariablen
    private static int [] bv, nbv;

    // Schlupfvariable = -1, Strukturvariable = 0 .. n-1
    private static double[][] a; // Koeffizienten
    private static DecimalFormat df = new DecimalFormat("####0.00");
    private java.util.Random random;

    public Simplex(int m, int n) {
        super();
        Simplex.n = n;
        Simplex.m = m;

        bv = new int[m];
        nbv = new int[n];
        a = new double[m + 1][n + 1];
        random = new java.util.Random();
    }

    public double solve(double [] x) throws SimplexNoSolutionException {
        // zu Beginn: Schlupfvariable sind Basisvariable

        for (int i = 0; i < m; i++) 
            bv[i] = -1;
        // und Strukturvariable sind Nicht-Basisvariable
        for(int j = 0; j < n; j++)
            nbv[j] = j;
        
        synchronized(a) {
            try {
                while (true) {
                    // Pivot-Spalte bestimmen
                    int s = pivotColumn();
                    // Pivot-Zeile bestimmen
                    int r = pivotRow(s);
                    // Koeffizienten umrechnen
                    calcCoefficients(r, s);
                    // r-te BV tauscht mit s-ter NBV
                    swapVariables(r, s);

                    for (int i = 0; i <= m; i++) {
                        for (int j = 0; j <= n; j++) {
                            System.out.print(df.format(a[i][j]) + "\t|");
                        }

                        System.out.println();
                    }
                    
                    System.out.println();
                }
            }
            catch(SimplexFinishedException e) {

            }

            // Suche die Strukturvariablen und kopiere
            // die Werte (in der 0-ten Spalte) in den
            // Vektor x
            int i = 0;
            while (i < m) {
                int j = bv[i];
                if (j >= 0) 
                    x[j] = a[++i][0];
                else 
                    i++;
            }

            return a[0][0];
        }
    }

    private int pivotColumn() throws SimplexFinishedException {
        double min = a[0][1];
        int s = 1;

        for (int j = 2; j <= n; j++) {
            if (a[0][j] < min) {
                min = a[0][j]; 
                s = j; 
            }
        }

        // Wenn alle a[0][j] nicht-negativ sind, ist
        // die Loesung gefunden
        if (min >= 0.0) 
            throw new SimplexFinishedException();
        
        return s;
    }

    private int pivotRow(int s) throws SimplexNoSolutionException {
        double min = 0.0;
        int n = 0;
        int [] r = new int[m];

        for (int i = 1; i <= m; i++) {
            double q = a[i][0] / a[i][s];

            if (q > 0.0) {
                if (n == 0 || q < min) {
                    min = q; 
                    n = 1; 
                    r[0] = i;
                }
                else if (q == min) 
                    r[n++] = i;
            }
        }
        // primale Entartung, keine Loesung
        if (n == 0) 
            throw new SimplexNoSolutionException();
        // Normalfall
        if (n == 1) 
            return r[0];
        // primale Entartung: mehrere Moeglichkeiten,
        // zufaellig waehlen
        int k = 0;
        do { 
            k = random.nextInt() % n;
        } while (k < 0);
        
        return r[k];
    }

    private void calcCoefficients(int r, int s) {
        // Pivotelement
        a[r][s] = 1.0 / a[r][s];
        // Pivotspalte
        for (int i = 0; i <= m; i++) {
            if (i != r) 
                a[i][s] *= (-a[r][s]);
        }
        // Pivotzeile
        for (int j = 0; j <= n; j++) {
            if (j != s) 
                a[r][j] *= a[r][s];
        }
        // andere Elemente
        for (int i = 0; i <= m; i++)
            for (int j = 0; j <= n; j++) {
                if (i != r && j != s)
                    a[i][j] += (a[i][s] * a[r][j] / a[r][s]);
            }
    }

    private void swapVariables(int r, int s) {
        // r-te BV tauscht mit s-ter NBV
        r--;
        s--;

        int k = bv[r];
        bv[r] = nbv[s];
        nbv[s] = k;
    }

    public static void main(String args[]) {
        Simplex s;
        double[] x;
        s = new Simplex(3, 6);
        a[0][0] = 0;
        a[0][1] = -10;
        a[0][2] = -15;
        a[0][3] = -10;
        a[0][4] = -20;
        a[0][5] = -10;
        a[0][6] = -15;
        a[1][0] = 300;
        a[1][1] = 20;
        a[1][2] = 10;
        a[1][3] = 40;
        a[1][4] = 0;
        a[1][5] = 20;
        a[1][6] = 0;
        a[2][0] = 280;
        a[2][1] = 0;
        a[2][2] = 20;
        a[2][3] = 20;
        a[2][4] = 20;
        a[2][5] = 10;
        a[2][6] = 20;
        a[3][0] = 400;
        a[3][1] = 10;
        a[3][2] = 0;
        a[3][3] = 0;
        a[3][4] = 40;
        a[3][5] = 0;
        a[3][6] = 20;

        System.out.println("M: "+ Integer.toString(m));
        System.out.println("N: "+ Integer.toString(n));
        System.out.println();
        
        //Ausgabe Tableau
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(df.format(a[i][j]) + "\t|");
            }
            System.out.println();
        }
        System.out.println();

        x = new double[n];
        
        try {
            double max;
            max = s.solve(x);
            System.out.println("ZMAX = " + df.format(max)); //Maximalwert wird ausgegeben
            for (int j = 0; j < n; j++) {
                System.out.println("x[" + (j + 1) + "]" + df.format(x[j]));//Werte für x[n] werden ausgegeben.
            }
        }
        catch(Throwable e) { 
            System.out.println(e); 
        }
    }
}