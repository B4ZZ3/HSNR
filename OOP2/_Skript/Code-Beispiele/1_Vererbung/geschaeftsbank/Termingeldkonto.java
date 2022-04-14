package geschaeftsbank;


public class Termingeldkonto extends Geldanlage {
	
	double mindestbetrag;

	/**
	 * @param guthabenZinssatz
	 * @param kontoInhaber
	 * @param kontoNr
	 * @param kontoStand
	 * @param laufzeit
	 * @param mindestbetrag
	 */
	public Termingeldkonto(double guthabenZinssatz, String kontoInhaber,
			String kontoNr, double kontoStand, int laufzeit,
			double mindestbetrag) {
		super.setGuthabenZinssatz(guthabenZinssatz);
		super.setKontoInhaber(kontoInhaber);
		super.setKontoNr(kontoNr);
		super.setKontoStand(kontoStand);
		super.setLaufzeit(laufzeit);
		this.mindestbetrag = mindestbetrag;
	}

	public double getMindestbetrag() {
		return mindestbetrag;
	}

	public void setMindestbetrag(double mindestbetrag) {
		this.mindestbetrag = mindestbetrag;
	}

	@Override
	public String toString() {
		return "Termingeldkonto [mindestbetrag=" + mindestbetrag
				+ ", toString()=" + super.toString() + "]";
	}
	
}
