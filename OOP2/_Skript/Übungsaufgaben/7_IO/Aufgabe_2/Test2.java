package Aufgabe_02;

import java.io.*;

public class Test2 {

	public static void main(String[] args) throws Exception{

		DataInputStream in = new DataInputStream(new FileInputStream("konten.txt"));
	
		    try {
		        while (true) {
		    		System.out.println("Kontonummer: "+in.readInt());
		    		System.out.println("Saldo: " +in.readDouble());
		        }
		    } catch (EOFException e) {
		        System.out.println("All data were read");
		    }
				
		in.close();
		
	}
}
