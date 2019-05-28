package GUI.ch12;

import javax.swing.*;
import java.awt.*;

public class PaintJPanelEx extends JFrame {
	Container contentPane;

	PaintJPanelEx() {
		setTitle("JPanel paintComponent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(250, 200);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50); //50*50 크기
			g.drawRect(50, 50, 50, 50); 
			g.drawRect(90, 90, 50, 50); //90, 90 위치
		}
	}

	public static void main(String[] args) {
		new PaintJPanelEx();
	}
}
