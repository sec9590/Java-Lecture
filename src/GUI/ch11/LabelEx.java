package GUI.ch11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LabelEx  extends JFrame {
	Container contentPane;

	LabelEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("사랑합니다.");
		ImageIcon beauty = new ImageIcon("img/like.png");
		System.out.println();
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("img/phone.png");
		JLabel label = new JLabel("보고싶으면 전화하세요", normalIcon, SwingConstants.CENTER);

		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);

		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx();
	}

}
