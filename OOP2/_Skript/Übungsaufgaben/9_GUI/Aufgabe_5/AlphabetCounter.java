import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlphabetCounter extends JFrame {
    private JLabel label;
    private JPanel panelTop;
    private JPanel panelBottom;
    private JButton buttonLeft;
    private JButton buttonRight;

    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public AlphabetCounter() {
        frameLayout();
        initLayout();
        actionListener();
    }

    public void initLayout() {
        Container container = getContentPane();
        container.setLayout(new GridLayout(2, 1));

        panelTop = new JPanel();
        panelBottom = new JPanel();

        label = new JLabel("a");
        label.setFont(new Font("Monospaced", Font.BOLD, 48));
        panelTop.add(label);

        buttonLeft = new JButton("<<<");
        buttonRight = new JButton(">>>");

        panelBottom.add(buttonLeft);
        panelBottom.add(buttonRight);

        container.add(panelTop);
        container.add(panelBottom);
    }

    public void actionListener() {
        buttonLeft.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int position = 0;
                for(int i = 0; i < alphabet.length; i++) {
                    if(label.getText().toString().equals(String.valueOf(alphabet[i]))) {
                        position = i;
                    }
                }
                if(position == 0)
                    position = 26;

                label.setText(String.valueOf(alphabet[position-1]));
            }
        });

        buttonRight.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                int position = 0;
                for(int i = 0; i < alphabet.length; i++) {
                    if(label.getText().toString().equals(String.valueOf(alphabet[i]))) {
                        position = i;
                    }
                }
                if(position == 25)
                    position = -1;
                    
                label.setText(String.valueOf(alphabet[position+1]));
            }
        });
    }

    private void frameLayout() {
		this.setTitle("Alphabet");
		this.setSize(300, 200);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

    public static void main(String[] args) {
		new AlphabetCounter();
	}

}
