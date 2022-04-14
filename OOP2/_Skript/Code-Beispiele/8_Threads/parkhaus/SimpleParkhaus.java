package parkhaus;

// Test: java SimpleParkhaus 1000/1000 1000/1000 1000/1000

public class SimpleParkhaus implements Parkhaus {
    private int capacity = 1;
    private int autos = 0;

    public synchronized void enter(Auto auto) throws InterruptedException {
        while (autos == capacity)       
            wait();                 
        System.out.println(auto + " faehrt ein");
        autos++;
    }

    public synchronized void leave(Auto auto) {
        System.out.println(auto + " faehrt aus");
        autos--;
        notify();                   
    }

    public static void main(String[] args) {
        Parkhaus parkhaus = new SimpleParkhaus();
        for(int i = 0; i< args.length; i++) {
            String[] words = args[i].split("/");
            int anfahrt = Integer.parseInt(words[0]);
            int parkzeit = Integer.parseInt(words[1]);
            new Auto(parkhaus, anfahrt, parkzeit).start();
        }
    }
}
