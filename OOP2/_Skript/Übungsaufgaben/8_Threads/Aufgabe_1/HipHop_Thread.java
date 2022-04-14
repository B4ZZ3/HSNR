package Aufgabe_01;

public class HipHop_Thread extends Thread{

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
		HipHop_Thread t1 = new HipHop_Thread();
		
		t1.start();
	}
	
}
