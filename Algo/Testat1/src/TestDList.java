public class TestDList {
        
    public static void main(String[] args) throws Exception {
        //Leere doppelt verlinkte Liste erstellen
        DList liste = new DList();

        //2 Knoten an den Anfang hängen, 1 Knoten ans Ende
        liste.addFirst("Test1");
        liste.addLast("Test2");
        liste.addFirst("Test3");

        //Ausgabe der Liste
        System.out.println(toString(liste));

        //Den ersten Knoten entfernen
        liste.removeFirst();

        //Ausgabe der Liste
        System.out.println(toString(liste));
    }

    public static String toString(DList liste) {
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
