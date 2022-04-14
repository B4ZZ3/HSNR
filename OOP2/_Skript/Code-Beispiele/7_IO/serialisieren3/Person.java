package serialisieren3;

public class Person implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
