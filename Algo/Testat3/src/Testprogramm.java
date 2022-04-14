import java.util.List;

public class Testprogramm {
    
    public static void main(String[] args) {

        // Instanziierung der Vertexe
        Vertex mg = new Vertex("Moenchengladbach");
        Vertex hs = new Vertex("Heinsberg");
        Vertex erk = new Vertex("Erkelenz");
        Vertex vie = new Vertex("Viersen");
        Vertex d = new Vertex("Duesseldorf");
        Vertex kr = new Vertex("Krefeld");

        // Erstellung der Adjazenten
        Edge[] mgAdjacencies = {new Edge(vie, 10), new Edge(hs, 33), new Edge(erk, 17), new Edge(d, 30)};
        mg.addAdjacencies(mgAdjacencies);

        Edge[] hsAdjacencies = {new Edge(vie, 38), new Edge(mg, 33), new Edge(erk, 17)};
        hs.addAdjacencies(hsAdjacencies);

        Edge[] vieAdjacencies = {new Edge(hs, 38), new Edge(mg, 10), new Edge(d, 31), new Edge(kr, 21)};
        vie.addAdjacencies(vieAdjacencies);

        Edge[] krAdjacencies = {new Edge(vie, 21), new Edge(d, 28)};
        kr.addAdjacencies(krAdjacencies);

        Edge[] dAdjacencies = {new Edge(vie, 31), new Edge(mg, 30), new Edge(erk, 46), new Edge(kr, 28)};
        d.addAdjacencies(dAdjacencies);

        Edge[] erkAdjacencies = {new Edge(hs, 17), new Edge(mg, 17), new Edge(d, 46)};
        erk.addAdjacencies(erkAdjacencies);

        // Berechnung der Pfade computePaths(source)
        Dijkstra.computePaths(mg);
        Dijkstra.computePaths(hs);
        Dijkstra.computePaths(vie);
        Dijkstra.computePaths(kr);
        Dijkstra.computePaths(d);
        Dijkstra.computePaths(erk);

        // Ausgabe des kuerzesten Pfads für jedes Ziel unter Zuhilfenahme der
        // Methode getShortestPathTo(target)

        //Ausgabe Heinsberg
        List<Vertex> pathHs = Dijkstra.getShortestPathTo(hs);

        System.out.println("Der kuerzeste Weg nach Heinsberg: ");
        for(int i = 0; i < pathHs.size(); i++) {
            System.out.println(i+1 +". Station: " +pathHs.get(i).name);
        }

        // //Ausgabe Viersen
        // List<Vertex> pathVie = Dijkstra.getShortestPathTo(vie);

        // System.out.println("Der kuerzeste Weg nach Viersen: ");
        // for(int i = 0; i < pathVie.size(); i++) {
        //     System.out.println(i+1 +". Station: " +pathVie.get(i).name);
        // }

        // //Ausgabe Krefeld
        // List<Vertex> pathKre = Dijkstra.getShortestPathTo(kr);

        // System.out.println("Der kuerzeste Weg nach Krefeld: ");
        // for(int i = 0; i < pathKre.size(); i++) {
        //     System.out.println(i+1 +". Station: " +pathKre.get(i).name);
        // }

        // //Ausgabe Duesseldorf
        // List<Vertex> pathD = Dijkstra.getShortestPathTo(d);

        // System.out.println("Der kuerzeste Weg nach Duesseldorf: ");
        // for(int i = 0; i < pathD.size(); i++) {
        //     System.out.println(i+1 +". Station: " +pathD.get(i).name);
        // }

        // //Ausgabe Erkelenz
        // List<Vertex> pathErk = Dijkstra.getShortestPathTo(erk);

        // System.out.println("Der kuerzeste Weg nach Erkelenz: ");
        // for(int i = 0; i < pathErk.size(); i++) {
        //     System.out.println(i+1 +". Station: " +pathErk.get(i).name);
        // }
    }
}
