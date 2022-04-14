import java.awt.Dimension;
import javax.swing.*;

@SuppressWarnings("serial")
public class Fenster extends JFrame{
	
	public Fenster() throws Exception {
		
		this.setTitle("Sichtbar nicht Sichtbar");
		this.setPreferredSize(new Dimension(300, 200));
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack(); 
		
		while(true) {
			this.setVisible(true);
			Thread.sleep((int) Math.random() + 500);
			this.setVisible(false);
			Thread.sleep((int) Math.random()+ 500);
		}
	}
	public static void main(String[] args) throws Exception {
		new Fenster();
	}
}