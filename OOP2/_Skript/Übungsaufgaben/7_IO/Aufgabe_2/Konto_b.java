import java.io.*;

public class Konto implements Serializable {

    private String path = "Desktop/";

    private int kontonummer;
    private double saldo;

    private Konto tempKonto;

    public Konto() {}

    public Konto(int kontonummer, double saldo) {
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public Konto(String fileName) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(path + fileName));

            tempKonto = (Konto) in.readObject();
            in.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Kontonummer: " + tempKonto.kontonummer + "\nKonto-Saldo: " + tempKonto.saldo);
    }

    //Getter & Setter
    public int getKontonummer() {
        return this.kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //seriazable the Vector data
    public void serializable() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path + "daten.dat"));
            out.writeObject(this);

            out.flush();
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Konto konto1 = new Konto(1234, 12345.00);

        konto1.serializable();

        Konto konto2 = new Konto("daten.dat");
    }
    
}
