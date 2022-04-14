package box6;

public class Box<T> {
	private T value;

	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public void copyFrom(Box<? extends T> other) { 
		value = other.getValue(); 
	}
}
