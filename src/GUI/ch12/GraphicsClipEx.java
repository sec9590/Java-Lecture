package GUI.ch12;
import javax.swing.*;
import java.awt.*;

public class GraphicsClipEx extends JFrame {
	Container contentPane;
	GraphicsClipEx() {
		setTitle("클리핑 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		MyPanel panel = new MyPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		ImageIcon icon = new ImageIcon("img/soccer-player.png");
		Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(50, 20, 150, 150);
			g.drawImage(img, getWidth(), getHeight(), this);
			g.setColor(Color.BLUE);
			g.setFont(new Font("SanSerif", Font.ITALIC, 40));
			g.drawString("Go Gator!!", 10, 150);
		}
	}

	public static void main(String [] args) {
		new GraphicsClipEx();
	}
} 
