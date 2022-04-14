public class TestList {
    
    public static void main(String[] args) throws Exception {
        //Leere Liste erstellen
        List liste = new List();

        //2 Knoten an den Anfang hängen, 1 Knoten ans Ende
        liste.addFirst("Test1");
        liste.addLast("Test2");
        liste.addFirst("Test3");

        //Ausgabe der Liste
        System.out.println(toString(liste));

        //Den erste Knoten entfernen
        liste.removeLast();

        //Ausgabe der Liste
        System.out.println(toString(liste));
    }

    public static String toString(List liste) {
		String output = "";
 
        //Schauen ob in der Liste überhaupt ein Element ist
		if (liste.head != null) {
			Node currentNode = liste.head;
            //Durch die gesamte Liste durchgehen, bis kein Elemente vorhanden ist
			while (currentNode != null) {
                //Elemente zu einem String zusammen packen
				output += "[" + currentNode.getElement().toString() + "]";
				currentNode = currentNode.getNext();
			}
 
		}
		return output;
	}
}
