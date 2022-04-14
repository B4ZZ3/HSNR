package cs2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws Exception {
		System.out.println(new Date());
		
		Socket socket = new Socket("localhost", 50000);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("> ");
			String line = scanner.nextLine();
			
			if (line.length() == 0) {
				scanner.close();
				socket.close();
				break;
			}
			
			out.println(line);
			System.out.println(in.readLine());
		}
	}
}
