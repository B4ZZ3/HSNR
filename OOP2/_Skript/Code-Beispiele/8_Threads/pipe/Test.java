package pipe;

import java.io.*;

public class Test
{
	public static void main (String args[]) throws IOException, InterruptedException
	{
		Pipe pipe = new Pipe();

		Writer writerThread = new Writer (pipe);
		Reader readerThread = new Reader (pipe);

		readerThread.start();
		writerThread.start();

		writerThread.join();
		System.out.println ("Schreibender Thread ist beendet!");
		readerThread.join();
		System.out.println ("Lesender Thread ist beendet!");
	}
}
