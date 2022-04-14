public class Artikel {
    private int artikelnummer;
    private double artikelpreis;

    public Artikel(){}

    public Artikel(int artikelnummer, double preis) {
        this.artikelnummer = artikelnummer;
        this.artikelpreis = preis;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int nummer) {
        this.artikelnummer = nummer;
    }

    public double getArtikelpreis() {
        return artikelpreis;
    }

    public void setArtikelpreis(double preis) {
        this.artikelpreis = preis;
    }
}