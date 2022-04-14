package version1;

import java.awt.Dimension;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Fenster extends JFrame {
	public Fenster() {
		this.setTitle("Fenster v1");
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
