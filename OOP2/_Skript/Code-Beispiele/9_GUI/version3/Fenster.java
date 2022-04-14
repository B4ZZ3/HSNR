package version3;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Fenster extends JFrame {
	public Fenster() {
		JPanel p = new JPanel();

		JLabel l = new JLabel("Eingabe");
		JTextField f = new JTextField(20);
		JTextArea a = new JTextArea(5, 25);
		JButton b = new JButton("OK");

		b.addActionListener(new ButtonListener(f, a));

		p.add(l);
		p.add(f);
		p.add(a);
		p.add(b);

		this.setContentPane(p);

		this.setTitle("Fenster v3");
		this.setPreferredSize(new Dimension(300, 200));
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Fenster();
	}
}
