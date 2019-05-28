package GUI.ch12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class GraphicsAndMouseDraggingFrame extends JFrame {
	Container contentPane;
	GraphicsAndMouseDraggingFrame() {
		setTitle("마우스 드래그 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(400, 450);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("img/sketchbook.png");
		Image image = imageIcon.getImage();
		int ovalX = 100;
		int ovalY = 100;
		
		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					ovalX = e.getX();
					ovalY = e.getY();
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);			
			g.drawImage(image, 0,0, this.getWidth(), this.getHeight(), this);
			g.setColor(new Color(199, 157, 253));
			g.fillOval(ovalX, ovalY, 20, 20);
		}
	}

	public static void main(String [] args) {
		new GraphicsAndMouseDraggingFrame();
	}
}