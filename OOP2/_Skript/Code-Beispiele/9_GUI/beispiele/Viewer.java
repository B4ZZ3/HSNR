import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Viewer extends JFrame implements ActionListener {
	private JLabel label;
	private JButton button;
	private ImageIcon icon;

	public Viewer() {
		super("Viewer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		button = new JButton("öffnen");
		button.addActionListener(this);
		button.setBounds(0, 0, 294, 24);
		c.add(button);

		label = new JLabel(icon);
		JScrollPane scroll = new JScrollPane(label);
		scroll.setBounds(0, 30, 294, 340);
		c.add(scroll);

		setSize(300, 400);
		setLocation(100, 100);
		setResizable(false);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File("."));
		int selection = chooser.showOpenDialog(this);
		if (selection == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			ImageIcon icon = new ImageIcon(file.getPath());
			label.setIcon(icon);
		}
	}

	public static void main(String[] args) {
		new Viewer();
	}
}
