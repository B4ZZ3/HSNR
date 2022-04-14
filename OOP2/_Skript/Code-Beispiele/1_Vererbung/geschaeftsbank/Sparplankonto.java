package geschaeftsbank;


public class Sparplankonto extends Geldanlage {
	
	int sparrate;

	/**
	 * @param guthabenZinssatz
	 * @param kontoInhaber
	 * @param kontoNr
	 * @param kontoStand
	 * @param laufzeit
	 * @param sparrate
	 */
	public Sparplankonto(double guthabenZinssatz, String kontoInhaber,
			String kontoNr, double kontoStand, int laufzeit, int sparrate) {
		super.setGuthabenZinssatz(guthabenZinssatz);
		super.setKontoInhaber(kontoInhaber);
		super.setKontoNr(kontoNr);
		super.setKontoStand(kontoStand);
		super.setLaufzeit(laufzeit);
		this.sparrate = sparrate;
	}

	public int getSparrate() {
		return sparrate;
	}

	public void setSparrate(int sparrate) {
		this.sparrate = sparrate;
	}

	@Override
	public String toString() {
		return "Sparplankonto [sparrate=" + sparrate + ", toString()="
				+ super.toString() + "]";
	}
	
}
