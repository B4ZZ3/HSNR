package NullNode;

public class Test {
    public static void main(String[] args) throws ListEmptyException {
        System.out.println();
        System.out.println("Start of List test");
        System.out.println("====================");

        //List
        List a = new List();
        a.addFirst("Anfang1");
        a.addFirst("Anfang2");
        a.addFirst("Anfang3");
        a.addLast("Ende1");
        a.addLast("Ende2");
        a.addLast("Ende3");

        System.out.println(a.removeFirst());
        System.out.println(a.removeFirst());

        System.out.println();

        System.out.println(a.removeLast());
        System.out.println(a.removeLast());

        System.out.println();

        System.out.println(a.getFirst());
        System.out.println(a.getLast());

        System.out.println();

        System.out.println(a.removeLast());
        System.out.println(a.removeLast());

        System.out.println(a.isempty());


        System.out.println();
        System.out.println("Start of DList test");
        System.out.println("====================");

        //DList
        DList b = new DList();
        b.addFirst("Anfang1");
        b.addFirst("Anfang2");
        b.addFirst("Anfang3");
        b.addLast("Ende1");
        b.addLast("Ende2");
        b.addLast("Ende3");

        System.out.println(b.removeFirst());
        System.out.println(b.removeFirst());

        System.out.println();

        System.out.println(b.removeLast());
        System.out.println(b.removeLast());

        System.out.println();

        System.out.println(b.getFirst());
        System.out.println(b.getLast());

        System.out.println();

        System.out.println(b.removeFirst());
        System.out.println(b.removeLast());

        System.out.println(b.isempty());

        System.out.println();
        System.out.println("Start of Stack test");
        System.out.println("====================");

        //Stack
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isempty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println();
        System.out.println("Start of Queue test");
        System.out.println("====================");

        Queue queue = new Queue();
        queue.enter(1);
        queue.enter(2);
        queue.enter(3);

        System.out.println(queue.leave());
        System.out.println(queue.leave());
        System.out.println(queue.leave());

        System.out.println(queue.isempty());

        queue.enter(1);
        queue.enter(2);
        queue.enter(3);

        System.out.println(queue.leave());
        System.out.println(queue.leave());
        System.out.println(queue.leave());
    }
}
