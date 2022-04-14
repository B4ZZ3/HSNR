package ressourcen;

public class ResourceManager {
    private int count;
    
    public ResourceManager(int initialCount) {
        count = initialCount;
    }
    
    public synchronized void acquire() throws InterruptedException {
        while (count == 0) {
            wait();
        }
        count--;
    }
    
    public synchronized void release() {
        count++;
        notifyAll();
    }
}
