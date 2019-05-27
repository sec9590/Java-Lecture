package GUI.ch11;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ButtonImageEx  extends JFrame {
	Container contentPane;

	ButtonImageEx() {
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("img/phone.png");
		ImageIcon rolloverIcon = new ImageIcon("img/phone(3).png");
		ImageIcon pressedIcon = new ImageIcon("img/phone(2).png");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonImageEx();
	}

}
