package Aufgabe_01;

import java.util.Scanner;

public class Schleife {
	
	public static void main(String[] args) {
		
		String input = "";
		String temp = "";
		
		Scanner sc = new Scanner(System.in);
	
		while(!input.equals(".")) {
		
			input = sc.nextLine();
			temp += input;	
			
		}
		System.out.println(temp);
	}

}
