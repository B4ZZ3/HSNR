
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ampel extends JFrame implements ActionListener {
	private JButton red;
	private JButton yellow;
	private JButton green;
	private JLabel label;

	public Ampel() {
		super("Ampel");

		Container c = getContentPane();
		JPanel panel = createPanel();
		c.add(panel);

		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private JPanel createPanel() {
		JPanel p = new JPanel();

		label = new JLabel();
		label.setOpaque(true);
		label.setBackground(Color.white);
		label.setPreferredSize(new Dimension(350, 100));
		setLocation(100, 100);

		red = new JButton("rot");
		red.addActionListener(this);
		yellow = new JButton("gelb");
		yellow.addActionListener(this);
		green = new JButton("grün");
		green.addActionListener(this);

		p.add(label);
		p.add(red);
		p.add(yellow);
		p.add(green);

		return p;
	}

	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == red)
			label.setBackground(Color.red);
		else if (obj == yellow)
			label.setBackground(Color.yellow);
		else if (obj == green)
			label.setBackground(Color.green);
	}

	public static void main(String[] args) {
		new Ampel();
	}
}
