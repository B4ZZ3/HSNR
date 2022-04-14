package Aufgabe_02;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Schleife_StringBuilder {
	
	public static void main(String[] args) {

		String input = "";
		String temp = "";
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
	
		while(!input.equals(".")) {	
			input = sc.nextLine();
			sb.append(input);	
		}
		System.out.println(sb);
	}

}


