package cs2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyHandler extends Thread {
	private Socket client;

	public MyHandler(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		try {
			handle(client);
			client.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
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
	}
}
