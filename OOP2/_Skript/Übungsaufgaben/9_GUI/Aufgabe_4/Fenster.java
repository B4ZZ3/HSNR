package Aufgabe_04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Fenster extends JFrame implements ActionListener{
	
	private JButton color;
	private JButton reset;
	private JLabel l1;
	private JLabel l2;
	
	public Fenster() {
		super("Fenster");
		
		Container c1 = getContentPane();
		JPanel p1 = createPanel();
		
		c1.add(p1);
		
		setSize(700,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	private JPanel createPanel() {
		
		JPanel p2 = new JPanel();
		
		l1 = new JLabel();
		l1.setOpaque(true);
		l1.setBackground(Color.white);
		l1.setPreferredSize(new Dimension(100, 100));
		setLocation(100,100);
		
		l2 = new JLabel();
		l2.setOpaque(true);
		l2.setBackground(Color.white);
		l2.setPreferredSize(new Dimension(100, 100));
		setLocation(100,100);
		
		color = new JButton("color");
		color.addActionListener(this);
		reset = new JButton("reset");
		reset.addActionListener(this);
		
		p2.add(l1);
		p2.add(l2);
		p2.add(color);
		p2.add(reset);
		
		return p2;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		Object temp = evt.getSource();
		Random random = new Random();
		
		float r = random.nextFloat();
		float g = random.nextFloat();
		float b = random.nextFloat();
		
		Color rgb = new Color(r,g,b);

		
		if (temp == color) {
			l1.setBackground(rgb);
			l2.setBackground(rgb);	
		}
		else if (temp == reset) {
			l1.setBackground(Color.white);
			l2.setBackground(Color.white);
		}	
	}
	
	public static void main(String[] args) {
		new Fenster();
	}
}
