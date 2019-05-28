package GUI.ch12;

import javax.swing.*;
import java.awt.*;

public class ImageDrawPracticeFrame extends JFrame {
	Container contentPane;
	ImageDrawPracticeFrame() {
		setTitle("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300, 450);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("img/soccer-player.png");
		Image image = imageIcon.getImage();
		public MyPanel() {
			setLayout(new FlowLayout());
			add(new JButton("HELLO"));
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);			
			g.drawImage(image, 0,0, this.getWidth(), this.getHeight(), this);
		}
	}

	public static void main(String [] args) {
		new ImageDrawPracticeFrame();
	}
}