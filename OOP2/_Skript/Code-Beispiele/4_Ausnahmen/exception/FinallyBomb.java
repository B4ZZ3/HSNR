package exception;

public class FinallyBomb {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);

		try {
			if (i == 2)
				return;
			if (i == 3)
				throw new NullPointerException();
			if (i == 4)
				throw new RuntimeException();
		} catch (NullPointerException e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

		System.out.println("done");
	}
}
