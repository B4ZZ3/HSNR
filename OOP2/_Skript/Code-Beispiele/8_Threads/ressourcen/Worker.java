package ressourcen;

public class Worker extends Thread {
	private String name;
	private ResourceManager rm;

	public Worker(String name, ResourceManager rm) {
		this.name = name;
		this.rm = rm;
	}

	public void run() {
		try {
			System.out.println(name + " waiting ...");
			rm.acquire();
			System.out.println(name + " acquired");
			Thread.sleep(1000);
			rm.release();
			System.out.println(name + " released");
		} catch (InterruptedException e) {
		}
	}
}
