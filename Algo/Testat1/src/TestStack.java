public class TestStack {
    
    public static void main(String[] args) throws Exception {
        //Leeren Stack erstellen
        Stack stack = new Stack();

        //2 Knoten auf den Stapel "legen"
        stack.push("Test1");
        stack.push("Test2");
        stack.push("Test3");

        //Den obersten Knoten vom Stapel "runternehmen"
        System.out.println(stack.pop());
    }
}
