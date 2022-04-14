package box3;

public class Konto implements Comparable<Konto> {
	private int id;
	private int saldo;

	public Konto(int id, int saldo) {
		this.id = id;
		this.saldo = saldo;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void setSaldo(int saldo) { 
		this.saldo = saldo;
	}
	
	public int compareTo(Konto k) { 
		if (id == k.id)
			return 0;
		if (id < k.id)
			return -1;
		return 1;
	}
}
