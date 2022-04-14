package Aufgabe_03;

import java.io.*;
import java.util.Date;

public class LogFile {
		
	private BufferedWriter writer;
	private Date date = new Date();	

	public LogFile() {}

	public synchronized void writeLine(String msg) throws IOException {
	
		writer = new BufferedWriter(new FileWriter( "test.txt", true));//Daten werden nicht �berschreibe
			
		try {	
			writer.write(date + msg + "\n");
		}
		catch(Exception e) {}

		writer.close();
	}
}
