package box7;

public class Box<T> {
	private T value;

	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public void copyTo(Box<? super T> other) { 
		other.setValue(value); 
	}
}
