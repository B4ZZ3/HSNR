package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FrameTest extends JFrame {
	public FrameTest() {
		super("Einfaches Fenster");

		Container c = getContentPane();
		c.setBackground(Color.yellow);

		setSize(400, 200);
		setLocation(100, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
			}

			@Override
			public void windowIconified(WindowEvent e) {
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeactivated");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
			}

			@Override
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated");
			}
		});

//		addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent arg0) {
//				System.out.println("windowClosing");
//				System.exit(0);
//			}
//		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameTest();
	}
}
