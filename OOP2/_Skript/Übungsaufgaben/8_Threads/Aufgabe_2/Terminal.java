package Aufgabe_02;

public class Terminal extends Thread{
	
	public String terminal;
	public ZugInfo db;

	public Terminal(String terminal, ZugInfo db) {
		this.terminal = terminal;
		this.db = db;
	}
	
	public void run() {
		for( int i = 0; i<100; i++) {
			System.out.println(db.nochFrei() + " " +terminal);
		}
	}
	
	
	public static void main(String[] args) {
		
		ZugInfo db = new ZugInfo();
		// Starten von Threads
		Terminal t1 = new Terminal("Terminal 1", db);
		Terminal t2 = new Terminal("Terminal 2", db);
		t1.start();
		t2.start();
		

	}

}
