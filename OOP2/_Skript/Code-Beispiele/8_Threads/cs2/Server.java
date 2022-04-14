package cs2;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(50000);
		System.out.println("Server gestartet");
		
		while (true) {
			Socket client = server.accept();
			Thread t = new MyHandler(client);
			t.start();
			System.out.println("Name = " + t.getName());
			System.out.println("Id = " + t.getId());
			System.out.println("Priorität = " + t.getPriority());
			System.out.println("Zustand = " + t.getState());
		}
	}
}
