package Aufgabe_03;

import javax.swing.*;
import java.awt.*;

public class Fenster extends JFrame {

	JPanel p1 = new JPanel();
	JButton b1 = new JButton("Schließen");
	
	public Fenster() {
	
		p1.add(b1);
		
		this.setContentPane(p1);
		
		this.setTitle("Button Fenster schlie�en");
		this.setPreferredSize(new Dimension(300, 200));
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);

		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				System.exit(0);		
			}
		});	
	}

	public static void main(String[] args) {
		new Fenster();

	}
}
