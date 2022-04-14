package layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FlowLayoutTest extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	public FlowLayoutTest() {
		super("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(button1);
		c.add(button2);
		c.add(button3);
		c.add(button4);
		c.add(button5);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
