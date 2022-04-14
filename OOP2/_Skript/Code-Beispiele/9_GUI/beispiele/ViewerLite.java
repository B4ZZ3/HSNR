
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ViewerLite extends JFrame implements ActionListener {
	private JLabel label;
	private JTextField field;
	private ImageIcon icon;

	public ViewerLite() {
		super("ViewerLite");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		field = new JTextField();
		field.addActionListener(this);
		field.setBounds(0, 0, 294, 24);
		c.add(field);

		label = new JLabel(icon);

		JScrollPane scroll = new JScrollPane(label);
		scroll.setBounds(0, 30, 294, 340);
		c.add(scroll);

		setSize(300, 400);
		setLocation(100, 100);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		icon = new ImageIcon(field.getText());
		label.setIcon(icon);
	}

	public static void main(String[] args) {
		new ViewerLite();
	}
}
