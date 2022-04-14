/** Represents an edge between the nodes
 * @author Bjarne Christel
 * @version 1.0
 */

public class Edge {

    public Vertex target;
    public double weight;
    

    /** Creates an edge between two nodes with a specific distance
     * @param vertex The node at the other end of the connection
     * @param weight The distance of this connection
    */

    public Edge(Vertex target, double weight) {
        this.target = target;
        this.weight = weight;
    }
}
