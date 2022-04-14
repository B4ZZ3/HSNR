package Aufgabe_02;

public class Box<T> implements Markierbar<T>{
	private T value;

	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}


	public void setMarke(T m) {
		
	}

	public T getMarke() {

		return null;
	}
}
