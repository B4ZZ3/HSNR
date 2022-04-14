package geschaeftsbank;

public class Geldanlage extends Konto {
	
	int laufzeit;

//	/**
//	 * @param guthabenZinssatz
//	 * @param kontoInhaber
//	 * @param kontoNr
//	 * @param kontoStand
//	 * @param laufzeit
//	 */
//	public Geldanlage(double guthabenZinssatz, String kontoInhaber,
//			String kontoNr, double kontoStand, int laufzeit) {
//		super();
//		this.laufzeit = laufzeit;
//	}

	public int getLaufzeit() {
		return laufzeit;
	}

	public void setLaufzeit(int laufzeit) {
		this.laufzeit = laufzeit;
	}

	@Override
	public String toString() {
		return "Geldanlage [laufzeit=" + laufzeit + ", toString()="
				+ super.toString() + "]";
	}
	
}
