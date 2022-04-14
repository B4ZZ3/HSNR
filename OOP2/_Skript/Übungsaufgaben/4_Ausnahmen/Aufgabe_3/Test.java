package Aufgabe_3;

public class Test {

	public static void main(String[] args) throws OutOfRangeException{
		
		Person p1 = new Person(23);
		System.out.println(p1.getAlter());

		Person p2 = new Person(200);
		System.out.println(p1.getAlter());
	}

}
