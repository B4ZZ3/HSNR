package Aufgabe_02;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Fenster extends JFrame{

	public Fenster() {
		this.setTitle("WindowEvent");
		this.setPreferredSize(new Dimension(300, 200));
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	
		addWindowListener(new WindowListener() {
			
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				System.exit(0);
			}
			
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated");
			}
			
			public void windowClosed(WindowEvent e) {
				System.out.println("windowsClosed");
			}
			
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated");
			}
			
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified");
			}
	
			public void windowIconified(WindowEvent e) {
				System.out.println("windowsIconified");
			}

			public void windowOpened(WindowEvent e) {
				System.out.println("windowOpened");
			}	
		});	
	}
	
	public static void main(String[] args) {
		new Fenster();
	}
}