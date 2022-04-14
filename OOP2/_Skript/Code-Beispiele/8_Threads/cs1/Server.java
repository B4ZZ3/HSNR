package cs1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(50000);
		System.out.println("Server gestartet");
		
		while (true) {
			Socket client = server.accept();
			handle(client);
		}
	}
	
	private static void handle(Socket client) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(
				client.getInputStream()));
		PrintWriter out = new PrintWriter(client.getOutputStream(), true);
		
		String input;
		while ((input = in.readLine()) != null) {
			out.println(input);
		}
		
		client.close();
	}
}
