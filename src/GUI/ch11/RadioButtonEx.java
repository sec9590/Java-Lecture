package GUI.ch11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RadioButtonEx extends JFrame {
	Container contentPane;

	RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		ImageIcon cherryIcon = new ImageIcon("img/003-cherry.png");
		ImageIcon selectedCherryIcon = new ImageIcon("img/cherrycheck.png");

		ButtonGroup g = new ButtonGroup();
		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리");
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		g.add(apple);
		g.add(pear);
		g.add(cherry);

		contentPane.add(apple);
		contentPane.add(pear);
		contentPane.add(cherry);

		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RadioButtonEx();
	}
}
