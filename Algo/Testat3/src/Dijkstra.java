import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/** Represents the class to calculate the Dijkstra algorithm
 * @author Bjarne Christel
 * @version 1.0
 */

public class Dijkstra {

	/** Calculates the paths of the passed node from the graph
     * @param source the passed node from the graph
    */

	public static void computePaths(Vertex source) {
		source.minDistance = 0.;
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
		vertexQueue.add(source);
		while (!vertexQueue.isEmpty()) {
			Vertex u = vertexQueue.poll();
			// Visit each edge exiting u
			for (Edge e : u.adjacencies) {
				Vertex v = e.target;
				double weight = e.weight;
				double distanceThroughU = u.minDistance + weight;
				if (distanceThroughU < v.minDistance) {
					vertexQueue.remove(v);
					v.minDistance = distanceThroughU;
					v.previous = u;
					vertexQueue.add(v);
				}
			}
		}
	}

	/** Calculates the shortest paths to the passed node
     * @param target the node for the shortest path
	 * @return List with all the nodes on the shortest path
    */

	public static List<Vertex> getShortestPathTo(Vertex target) {
		List<Vertex> path = new ArrayList<Vertex>();
		Vertex step = target;

        // check if a path exists
        if (step.previous == null) {
            return null;
        }
        path.add(step);
		
		//As long their is a path
        while (step.previous != null) {
            step = step.previous;
            path.add(step);
        }

        // Put it into the correct order
        Collections.reverse(path);
		return path;
	}
}
