package GUI.ch09;
import java.awt.*;

import javax.swing.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(null);

		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(300, 50);
		la.setSize(200, 20);
		c.add(la);

		int s = 0;
		for (int i = 1; i <= 19; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setSize(50, 20);
			if (i >= 11) {
				s += 2;
				b.setLocation(-(i-s * 15), (i-s) * 15);
			} else {
				b.setLocation(i * 15, i * 15);
			}			
			c.add(b);
		}

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}

}
