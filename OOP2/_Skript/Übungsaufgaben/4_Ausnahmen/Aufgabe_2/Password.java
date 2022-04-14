package Aufgabe_2;

import java.util.Scanner;

public class Password {
	
	public int anz;
	private String password;
	Scanner sc= new Scanner(System.in);
	
	public void input() {
		
		if (anz==0)
			System.out.println("Bitte geben Sie ihr Passwort ein:");
		else
			System.out.println("Bitte geben Sie ihr Passwort erneut ein:" 
		+ "\nSie haben noch "+(3-anz) + " Versuch(e)!!!");
		
		password = sc.nextLine();
		anz++;
		
		try {
			try {
				if (!password.equals("elgar"))
					throw new PasswordException();
				start();
				}
			catch (PasswordException e) {
				if (anz == 3) 
					throw e;
					
				input();
				}
			}
		catch (PasswordException e) {
			System.out.println("Login gescheitert");
		}
	}
	
	public void start() {
		System.out.println("Login erfolgreich");
	}
}
