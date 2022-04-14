package Aufgabe_03;

import java.io.IOException;

public class Test extends Thread {
	LogFile f1;
	public static int i=0;
	
	public Test(LogFile f1) {
		this.f1=f1;
	}
	
	public void run() {
		try {
			while(i<10) {// 5 Eintraege pro Thread
				f1.writeLine(" hey");
				i++;

				try {
					Thread.sleep((long)(Math.random()*1000+1));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		LogFile f2 = new LogFile();

		Test t1 = new Test(f2);
		Test t2 = new Test(f2);

		t1.start();
		t2.start();
	}
	

}