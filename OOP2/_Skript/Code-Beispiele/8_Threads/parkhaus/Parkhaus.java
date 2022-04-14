package parkhaus;

public interface Parkhaus {
	void enter(Auto auto) throws InterruptedException;

	void leave(Auto auto);
}
