package geschaeftsbank;


public class Girokonto extends Konto {

	int kreditlimit;
	double ueberziehungszins;


	/**
	 * @param kreditlimit
	 * @param ueberziehungszins
	 */
	public Girokonto(double guthabenZinssatz, String kontoInhaber, String kontoNr,
			double kontoStand, int kreditlimit, double ueberziehungszins) {
		super.setGuthabenZinssatz(guthabenZinssatz);
		super.setKontoInhaber(kontoInhaber);
		super.setKontoNr(kontoNr);
		super.setKontoStand(kontoStand);
		this.kreditlimit = kreditlimit;
		this.ueberziehungszins = ueberziehungszins;
	}

	public int getKreditlimit() {
		return kreditlimit;
	}
	public void setKreditlimit(int kreditlimit) {
		this.kreditlimit = kreditlimit;
	}
	public double getUeberziehungszins() {
		return ueberziehungszins;
	}
	public void setUeberziehungszins(double ueberziehungszins) {
		this.ueberziehungszins = ueberziehungszins;
	}

	@Override
	public String toString() {
		return "Girokonto [kreditlimit=" + kreditlimit + ", ueberziehungszins="
				+ ueberziehungszins + ", toString()=" + super.toString() + "]";
	}
	
}
