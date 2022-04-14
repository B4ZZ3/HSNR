package version4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener {
	private JTextField field;
	private JTextArea area;

	public ButtonListener(JTextField field, JTextArea area) {
		this.field = field;
		this.area = area;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		area.append(field.getText() + "\n");
		field.setText("");
		field.requestFocus();
	}
}
