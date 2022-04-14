package Aufgabe_02;

public class Paar<T,U> implements Markierbar<String>{
	
	protected T valueT;
	protected U valueU;
	
	public Paar(T valueT, U valueU) {
		this.valueT = valueT;
		this.valueU = valueU;
	}

	public T getValueT() {
		return valueT;
	}

	public void setValueT(T valueT) {
		this.valueT = valueT;
	}

	public U getValueU() {
		return valueU;
	}

	public void setValueU(U valueU) {
		this.valueU = valueU;
	}

	public String getMarke() {
		
		return null;
	}
		
	public void setMarke(String m) {
		
	}

	

	
	
	
	
	
	
	
	
	
	

}
