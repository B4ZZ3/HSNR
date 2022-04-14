package geschaeftsbank;

public class Konto {
	private double guthabenZinssatz;
	private String kontoInhaber;
	private String kontoNr;
	private double kontoStand;

//	/**
//	 * @param guthabenZinssatz
//	 * @param kontoInhaber
//	 * @param kontoNr
//	 * @param kontoStand
//	 */
//	public Konto(double guthabenZinssatz, String kontoInhaber, String kontoNr,
//			double kontoStand) {
//		this.guthabenZinssatz = guthabenZinssatz;
//		this.kontoInhaber = kontoInhaber;
//		this.kontoNr = kontoNr;
//		this.kontoStand = kontoStand;
//	}

	public double getGuthabenZinssatz() {
		return guthabenZinssatz;
	}

	public void setGuthabenZinssatz(double guthabenZinssatz) {
		this.guthabenZinssatz = guthabenZinssatz;
	}

	public String getKontoInhaber() {
		return kontoInhaber;
	}

	public void setKontoInhaber(String kontoInhaber) {
		this.kontoInhaber = kontoInhaber;
	}

	public String getKontoNr() {
		return kontoNr;
	}

	public void setKontoNr(String kontoNr) {
		this.kontoNr = kontoNr;
	}

	public double getKontoStand() {
		return kontoStand;
	}

	public void setKontoStand(double kontoStand) {
		this.kontoStand = kontoStand;
	}

	@Override
	public String toString() {
		return "Konto [guthabenZinssatz=" + guthabenZinssatz
				+ ", kontoInhaber=" + kontoInhaber + ", kontoNr=" + kontoNr
				+ ", kontoStand=" + kontoStand + "]";
	}

}
