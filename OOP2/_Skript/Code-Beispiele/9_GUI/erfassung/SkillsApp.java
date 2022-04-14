import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
// View + Controller-Anteile
public class SkillsApp extends JFrame {
	private static final String FILE_NAME = "skills.csv";

	private JTextField name;
	private JTextField vorname;
	private JRadioButton m;
	private JRadioButton w;
	private JComboBox<String> sprache;
	private JButton speichern;
	private SkillsStore skillsStore;

	public SkillsApp() throws IOException {
		initWidgets();
		widgetLayout();
		widgetInteraction();
		frameLayout();
	}

	private void initWidgets() {
		skillsStore = new SkillsStore();

		name = new JTextField(20);
		vorname = new JTextField(20);
		m = new JRadioButton("m", true);
		w = new JRadioButton("w");
		String[] liste = { "C++", "C#", "Java", "PHP", "VB.NET" };
		sprache = new JComboBox<>(liste);
		speichern = new JButton("Speichern");
	}

	private void widgetLayout() {
		Container c = getContentPane();
		c.add(new JLabel(" "), BorderLayout.NORTH);
		c.add(new JLabel(" "), BorderLayout.EAST);
		c.add(new JLabel(" "), BorderLayout.SOUTH);
//		c.add(new JLabel(" "), BorderLayout.WEST);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2, 10, 10));

//		ButtonGroup bg = new ButtonGroup();
//		bg.add(m);
//		bg.add(w);

		panel.add(new JLabel("Name", JLabel.RIGHT));
		panel.add(name);

		panel.add(new JLabel("Vorname", JLabel.RIGHT));
		panel.add(vorname);

		panel.add(new JLabel("Geschlecht", JLabel.RIGHT));
		JPanel rButtons = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		rButtons.add(m);
		rButtons.add(w);
		panel.add(rButtons);

		panel.add(new JLabel("Programmiersprache", JLabel.RIGHT));
		panel.add(sprache);

		panel.add(new JLabel(""));
		panel.add(speichern);

		c.add(panel, BorderLayout.CENTER);
	}

	private void widgetInteraction() {
		speichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nameWert = name.getText();
				String vornameWert = vorname.getText();

				if (nameWert.length() == 0) {
					JOptionPane.showMessageDialog(SkillsApp.this, "Name fehlt", "Fehler", JOptionPane.ERROR_MESSAGE);
					name.requestFocus();
					return;
				}

				if (vornameWert.length() == 0) {
					JOptionPane.showMessageDialog(SkillsApp.this, "Vorname fehlt", "Fehler", JOptionPane.ERROR_MESSAGE);
					vorname.requestFocus();
					return;
				}

				String geschlecht = m.isSelected() ? "m" : "w";
				Skill skill = new Skill(nameWert, vornameWert, geschlecht, (String) sprache.getSelectedItem());
				skillsStore.add(skill);

				name.setText("");
				vorname.setText("");
				m.setSelected(true);
				sprache.setSelectedIndex(0);
			}
		});

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				try {
					skillsStore.store(FILE_NAME);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(SkillsApp.this, e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	private void frameLayout() {
		this.setTitle("Skills");
		this.setPreferredSize(new Dimension(300, 250));
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) throws IOException {
		new SkillsApp();
	}
}
