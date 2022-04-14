public class Vertex implements Comparable<Vertex> {

    public double minDistance = 9999; //"unendlicher" Wert wenn der Knoten noch nicht überprüft wurde
    public Edge[] adjacencies; //Nachbar-Knoten
    public Vertex previous;
    public String name;

    /** Creates a node of the graph
     * @param name The name of the node
    */

    public Vertex(String name) {
        this.name = name;
    }

    /** Adds the adjacencies to the node
     * @param Edge[] an array of the adjacencies
    */
    public void addAdjacencies (Edge[] adjacencies) {
        this.adjacencies = adjacencies;
    }

    /** Compare the distance of this node an the given node
     * @param int 1 if greater/ -1 if smaller
    */
    @Override
    public int compareTo(Vertex vertex) {
        return Double.compare(this.minDistance, vertex.minDistance);
    }
}
