package Aufgabe_6;

import java.util.*;

public class HofstadterMain {
	
	public static void main(String... args) {
		
		Hofstadter hofstadter = new Hofstadter();
		
		//int upto = Integer.parseInt(args[0]);
		int upto;
		
		Scanner scan = new Scanner(System.in);
		upto = scan.nextInt();
		
		for (int n = 1; n <= upto; n++)
			System.out.println("q(" + n + ") = " + hofstadter.h(n));
	}
}
