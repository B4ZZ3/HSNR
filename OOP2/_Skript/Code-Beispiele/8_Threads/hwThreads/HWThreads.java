package hwThreads;

public class HWThreads {
	public static void main(String[] args) {
		int nr = Runtime.getRuntime().availableProcessors();
		System.out.println("Anzahl der Prozessoren/Rechenkerne: " + nr);

	}
}