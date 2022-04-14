package layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BorderLayoutTest extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	public BorderLayoutTest() {
		super("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		c.add(button1, BorderLayout.NORTH);
		c.add(button2, BorderLayout.WEST);
		c.add(button3, BorderLayout.EAST);
		c.add(button4, BorderLayout.CENTER);
		c.add(button5, BorderLayout.SOUTH);

		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutTest();
	}
}
