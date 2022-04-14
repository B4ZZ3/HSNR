package Liste;

public class Test {
    public static void main(String[] args) {
        Data d1 = new Data(1, "Test1");
        Data d2 = new Data(2, "Test2");
        Data d3 = new Data(3, "Test3");
        Data d4 = new Data(4, "Test4");

        Liste l1 = new Liste();

        l1.appendFirst(d1);
        l1.appendEnd(d2);
        l1.appendFirst(d3);

        System.out.println(toString(l1));

        l1.delete(1);

        System.out.println(toString(l1));

        l1.change(2, d4);

        System.out.println(toString(l1));
    }

    public static String toString(Liste liste) {
		String output = "";

		if (liste.first != null) {
			Data currentNode = liste.first;
			while (currentNode != null) {
				output += "[" + currentNode.getValue() + "]";
				currentNode = currentNode.getNext();
			}
		}
		return output;
	}
}
