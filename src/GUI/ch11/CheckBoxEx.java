package GUI.ch11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CheckBoxEx extends JFrame {
	Container contentPane;

	CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon("img/003-cherry.png");
		ImageIcon selectedCherryIcon = new ImageIcon("img/cherrycheck.png");

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);

		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);

		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}
}
