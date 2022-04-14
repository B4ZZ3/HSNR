package Aufgabe_01;

public class HipHop_Runnable implements Runnable{

	public void run() {
		
		while(true) {
			
			System.out.println("Hip");
			
			try {
				Thread.sleep((long) (Math.random() + 1000));
			} catch (InterruptedException e) {
				
				
			}
			System.out.println("HOP");
			
			try {
				Thread.sleep((long) (Math.random() + 1000));
			} catch (InterruptedException e) {
				
				
			}
		}
		
	}
	
	public static void main(String[]args) {
		HipHop_Runnable t1 = new HipHop_Runnable();
		Thread thread = new Thread(t1);
		
		thread.start();
	}
	
}
