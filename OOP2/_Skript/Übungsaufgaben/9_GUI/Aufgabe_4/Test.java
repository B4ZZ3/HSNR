package Aufgabe_04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;;

public class Test extends JFrame implements ActionListener{

	private JButton color;
	private JButton reset;
	private JLabel l1;
	private JPanel p2;
	private Color rgb;

	public Test() {
		super("Test");
		
		Container c1 = getContentPane();
		JPanel p1 = createPanel();
		
		c1.add(p1);
		
		setSize(800,820);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);		
	}
	
	private JPanel createPanel() {
		
		p2= new JPanel();
		
		for(int i = 0; i< 700; i+=100) {
			for(int n = 0; n< 700; n+=100) {
				l1 = new JLabel();
				l1.setOpaque(true);
				l1.setBackground(Color.white);
				l1.setPreferredSize(new Dimension(100, 100));
				setLocation(i,n);
				p2.add(l1);
			}
		}
		
		color = new JButton("color");
		color.addActionListener(this);
		reset = new JButton("reset");
		reset.addActionListener(this);
		
		p2.add(color);
		p2.add(reset);
		
		return p2;
	}

	public Color randomColor() {
		
		Random random = new Random();
			
		return new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		Object temp = evt.getSource();
		
		for(Component label : p2.getComponents()) {
			
			if(label instanceof JLabel) {
				JLabel l = (JLabel) label;
				if(temp == color) {
					l.setBackground(randomColor());
				}
				else if(temp == reset) {
					l.setBackground(Color.white);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Test();
	}
}
