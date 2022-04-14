public class TestQueue {
    public static void main(String[] args) throws Exception {
        //Leere Queue erstellen
        Queue queue = new Queue();

        //Beide Knoten in die Queue packen
        queue.enter("Test1");
        queue.enter("Test2");

        //Den ältesten Knoten entfernen
        System.out.println(queue.leave());
    }
}
