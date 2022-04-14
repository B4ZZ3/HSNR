package pipe;

public class Writer extends Thread {
	private Pipe pipe;
	private boolean running = true;

	public Writer (Pipe p)	{
		pipe = p;
	}

	public void run() {
		int i = 0;
		for (i=0; i < 1000; i++ )
			pipe.write (i);
		pipe.write (-1);
	}

	public void beenden() {
		running = false;
	}
}
