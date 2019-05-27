package GUI.ch11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ComboActionEx extends JFrame {
	Container contentPane;
	String [] fruits = {"apple", "pear", "cherry", "banana"};
	ImageIcon [] images = {
			new ImageIcon("img/001-apple.png"), new ImageIcon("img/002-pear.png"), new ImageIcon("img/003-cherry.png"),
		new ImageIcon("img/banana.png") };
	JLabel imgLabel = new JLabel(images[0]);

	ComboActionEx() {
		setTitle("리스트 만들기  예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String [] args) {
		new ComboActionEx();
	}
}
