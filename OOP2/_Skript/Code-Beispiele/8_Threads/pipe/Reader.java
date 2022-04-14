package pipe;

public class Reader extends Thread
{
	private Pipe pipe;

	public Reader (Pipe p)
	{
		pipe = p;
	}

	public void run()
	{
		while (pipe.read() != -1)
			;
	}

}
