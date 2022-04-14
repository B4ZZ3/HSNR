package version5;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				a.append(f.getText() + "\n");
				f.setText("");
				f.requestFocus();
			}
		});

		JScrollPane sp = new JScrollPane(a);

		p.add(l);
		p.add(f);
		p.add(sp);
		p.add(b);

		this.setContentPane(p);

		this.setTitle("Fenster v5");
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
