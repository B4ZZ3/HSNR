package system;

/*
  java -cp bin Umlenkung > out.txt
  java -cp bin Umlenkung > out.txt 2> err.txt
  java -cp bin Umlenkung < ein.txt
  java -cp bin Umlenkung < ein.txt > out.txt 2> err.txt
 */

import java.util.Scanner;

public class Umlenkung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				String value = sc.nextLine();
				if (value.equals("q")) {
					sc.close();
					break;
				}
				int z = Integer.parseInt(value);
				System.out.println(z + "\t" + Math.sqrt(z));
			} catch (NumberFormatException e) {
				System.err.println(e);
			}
		}
	}
}