import java.util.List;

public class Testprogramm_3 {
    
    public static void main(String[] args) {
        
        // Instanziierung der Vertexe
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        // Erstellung der Adjazenten
        Edge[] aAdjacencies = {new Edge(b, 4), new Edge(c, 5)};
        a.addAdjacencies(aAdjacencies);

        Edge[] bAdjacencies = {new Edge(c, 2), new Edge(e, 1)};
        b.addAdjacencies(bAdjacencies);

        Edge[] cAdjacencies = {new Edge(d, 2)};
        c.addAdjacencies(cAdjacencies);

        Edge[] dAdjacencies = {new Edge(f, 6)};
        d.addAdjacencies(dAdjacencies);

        Edge[] eAdjacencies = {new Edge(d, 1), new Edge(f, 5)};
        e.addAdjacencies(eAdjacencies);

        Edge[] fAdjancies = {};
        f.addAdjacencies(fAdjancies);

        // Berechnung der Pfade computePaths(source)
        Dijkstra.computePaths(a);
        Dijkstra.computePaths(b);
        Dijkstra.computePaths(c);
        Dijkstra.computePaths(d);
        Dijkstra.computePaths(e);
        Dijkstra.computePaths(f);

        // Ausgabe des kuerzesten Pfads zu allen Knoten
        // Methode getShortestPathTo(target)

        // //Ausgabe Pfad B
        // List<Vertex> pathB = Dijkstra.getShortestPathTo(b);

        // System.out.println("Der kuerzeste Weg zu B: ");
        // for(int i = 0; i < pathB.size(); i++) {
        //     System.out.println(i+1 +". Station: " +pathB.get(i).name);
        // }

        // //Ausgabe Pfad C
        // List<Vertex> pathC = Dijkstra.getShortestPathTo(c);

        // System.out.println("Der kuerzeste Weg zu C: ");
        // for(int i = 0; i < pathC.size(); i++) {
        //     System.out.println(i+1 +". Station: " +pathC.get(i).name);
        // }

        // //Ausgabe Pfad D
        // List<Vertex> pathD = Dijkstra.getShortestPathTo(d);

        // System.out.println("Der kuerzeste Weg zu D: ");
        // for(int i = 0; i < pathD.size(); i++) {
        //     System.out.println(i+1 +". Station: " +pathD.get(i).name);
        // }

        // //Ausgabe Pfad E
        // List<Vertex> pathE = Dijkstra.getShortestPathTo(e);

        // System.out.println("Der kuerzeste Weg zu E: ");
        // for(int i = 0; i < pathE.size(); i++) {
        //     System.out.println(i+1 +". Station: " +pathE.get(i).name);
        // }

        //Ausgabe Pfad F
        List<Vertex> pathF = Dijkstra.getShortestPathTo(f);

        System.out.println("Der kuerzeste Weg zu F: ");
        for(int i = 0; i < pathF.size(); i++) {
            System.out.println(i+1 +". Station: " +pathF.get(i).name);
        }
    }
}