package GUI.ch12;

import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {
	Container contentPane;
	GraphicsDrawImageEx1() {
		setTitle("drawImage 사용  예제 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 450);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("img/soccer-player.png");
		Image image = imageIcon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 20,20, this);			
		}
	}

	public static void main(String [] args) {
		new GraphicsDrawImageEx1();
	}
}